package mx.uv.Inventario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.Inventario.Modelo.Folio;
import mx.uv.Inventario.Modelo.Inventario;
import mx.uv.Inventario.Modelo.Item;
import mx.uv.Inventario.ORM.IFolio;
import mx.uv.Inventario.ORM.IInventario;
import mx.uv.Inventario.ORM.IItem;
import mx.uv.t4is.inventario.ConsultarFolioRequest;
import mx.uv.t4is.inventario.ConsultarFolioResponse;
import mx.uv.t4is.inventario.GenerarFolioRequest;
import mx.uv.t4is.inventario.GenerarFolioResponse;
import mx.uv.t4is.inventario.ConsultarFolioResponse.Producto;
import mx.uv.t4is.inventario.GenerarFolioResponse.Folios;

@Endpoint
public class InventarioEndPoint {

    @Autowired
    private IInventario iInventario;
    @Autowired
    private IItem iItem;
    @Autowired
    private IFolio iFolio;

    private final List<Item> ordenesDeCompra = new ArrayList<>();
    private final List<Item> factura = new ArrayList<>();

    public InventarioEndPoint() {
        initializeItems();
    }

    private void initializeItems() {
        ordenesDeCompra.add(new Item("Auriculares Inalámbricos", 1, 59.99));
        ordenesDeCompra.add(new Item("Laptop Gaming", 2, 1200.00));
        ordenesDeCompra.add(new Item("Smartphone", 3, 699.99));
        ordenesDeCompra.add(new Item("Mochila para Laptop", 4, 39.99));
        ordenesDeCompra.add(new Item("Reloj Inteligente", 5, 149.99));

        factura.addAll(ordenesDeCompra);
    }

    @PayloadRoot(namespace = "t4is.uv.mx/inventario", localPart = "GenerarFolioRequest")
    @ResponsePayload
    public GenerarFolioResponse generarFolio(@RequestPayload GenerarFolioRequest request) {
        GenerarFolioResponse response = new GenerarFolioResponse();

        try {
            Inventario inventario = crearInventario(request);
            iInventario.save(inventario);
            if (ordenesDeCompra.size() == factura.size() && compararListas(ordenesDeCompra, factura)) {
                List<Item> itemsGuardados = guardarItems(inventario, ordenesDeCompra);
                generarFolios(response, itemsGuardados);
            } else {
                System.out.println("Las listas no son iguales.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return response;
    }


    @PayloadRoot(namespace = "t4is.uv.mx/inventario", localPart = "ConsultarFolioRequest")
    @ResponsePayload
    public ConsultarFolioResponse consultarFolio(@RequestPayload ConsultarFolioRequest request) {
        ConsultarFolioResponse response = new ConsultarFolioResponse();
        String folio = request.getFolio();
        try{
            Folio folioEncontrado = iFolio.findByFolio(folio);
            if(folioEncontrado != null){
                Item item = iItem.findById(folioEncontrado.getIdItem());
                Producto producto = new Producto();
                Inventario inventario = iInventario.findById(item.getIdInventario());
                
                producto.setNombre(item.getNombre());
                producto.setPrecioUnitario(item.getPrecio());
                producto.setDependencia(inventario.getDependencia());
                response.setProducto(producto);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return response;
    }

    private Inventario crearInventario(GenerarFolioRequest request) {
        Inventario inventario = new Inventario();
        inventario.setId(UUID.randomUUID().toString());
        inventario.setDependencia(request.getDependencia());
        inventario.setNumFactura(request.getUUID());
        inventario.setNumOrden(request.getOrdenDeCompra());
        return inventario;
    }

    private boolean compararListas(List<Item> lista1, List<Item> lista2) {
        Map<String, Item> mapa1 = convertirListaAMapa(lista1);
        Map<String, Item> mapa2 = convertirListaAMapa(lista2);

        return mapa1.equals(mapa2);
    }

    private Map<String, Item> convertirListaAMapa(List<Item> lista) {
        Map<String, Item> mapa = new HashMap<>();
        for (Item item : lista) {
            String clave = item.getNombre() + "_" + item.getCantidad() + "_" + item.getPrecio();
            mapa.put(clave, item);
        }
        return mapa;
    }

    private List<Item> guardarItems(Inventario inventario, List<Item> items) {
        List<Item> itemsGuardados = new ArrayList<>();
        for (Item item : items) {
            Item nuevoItem = new Item();
            nuevoItem.setId(UUID.randomUUID().toString());
            nuevoItem.setNombre(item.getNombre());
            nuevoItem.setCantidad(item.getCantidad());
            nuevoItem.setPrecio(item.getPrecio());
            nuevoItem.setIdInventario(inventario.getId());
            iItem.save(nuevoItem);
            itemsGuardados.add(nuevoItem);
        }
        return itemsGuardados;
    }

    private void generarFolios(GenerarFolioResponse response, List<Item> items) {
        for (Item item : items) {
            Folio folio = null;
            for (int i = 0; i < item.getCantidad(); i++) {
                Folios folioResponse = new Folios();
                folioResponse.setFolio(UUID.randomUUID().toString());
                folioResponse.setItem(item.getNombre());
                response.getFolios().add(folioResponse);
                folio = new Folio(folioResponse.getFolio(), item.getId(), UUID.randomUUID().toString());
                iFolio.save(folio);
            }
        }
    }
}

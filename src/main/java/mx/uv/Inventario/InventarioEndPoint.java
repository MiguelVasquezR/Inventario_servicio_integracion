package mx.uv.Inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.Inventario.BD.Compra;
import mx.uv.Inventario.BD.ICompra;
import mx.uv.Inventario.BD.IProducto;
import mx.uv.Inventario.BD.Producto;
import mx.uv.Inventario.Factura.FacturaCliente;
import mx.uv.t4is.inventario.GenerarFolioRequest;
import mx.uv.t4is.inventario.GenerarFolioResponse;
import mx.uv.t4is.inventario.ObtenerFoliosRequest;
import mx.uv.t4is.inventario.ObtenerFoliosResponse;
import mx.uv.t4is.inventario.ValidarFolioRequest;
import mx.uv.t4is.inventario.ValidarFolioResponse;
import mx.uv.t4is.inventario.GenerarFolioResponse.Productos;
import xx.mx.uv.consumo.wsdl.RecuperarFacturaResponse;

@Endpoint
public class InventarioEndPoint {

    @Autowired
    private FacturaCliente cliente;

    @Autowired
    private ICompra compraRepository;

    @Autowired
    private IProducto productoRepository;

    @PayloadRoot(namespace = "t4is.uv.mx/inventario", localPart = "GenerarFolioRequest")
    @ResponsePayload
    public GenerarFolioResponse generarFolio(@RequestPayload GenerarFolioRequest request) {
        GenerarFolioResponse response = new GenerarFolioResponse();
        RecuperarFacturaResponse facturaResponse = cliente.consultarFactura(request.getUUIDFactura()); // Tenemos la
                                                                                                       // factura del
                                                                                                       // servicio

        List<GenerarFolioRequest.Orden.Productos.Producto> listaProductosOrden = request.getOrden().getProductos()
                .getProducto();
        List<RecuperarFacturaResponse.Productos.Producto> listaProductoFactura = facturaResponse.getProductos()
                .getProducto();

        boolean iguales = compararListar(listaProductosOrden, listaProductoFactura);

        Compra compra = new Compra();
        compra.setId(UUID.randomUUID().toString());
        compra.setNumFactura(facturaResponse.getUUID());
        compra.setNumOrden(request.getOrden().getNumOrden());
        compraRepository.save(compra);

        Productos productosResponse = new Productos();
        Productos.Producto productoResponse;
        Producto productoBD;
        for (RecuperarFacturaResponse.Productos.Producto producto : listaProductoFactura) {
            productoBD = new Producto();
            for (int i = 0; i < producto.getCantidad(); i++) {
                productoResponse = new Productos.Producto();
                productoResponse.setNombre(producto.getNombre());
                productoResponse.setFolio(UUID.randomUUID().toString());

                productoBD.setId(UUID.randomUUID().toString());
                productoBD.setNombre(producto.getNombre());
                productoBD.setCantidad(producto.getCantidad());
                productoBD.setPrecioUnitario(producto.getPrecioUnitario());
                productoBD.setFolio(String.valueOf(UUID.randomUUID().hashCode()));
                productoBD.setIdCompra(request.getOrden().getNumOrden());
                productoRepository.save(productoBD);

                productosResponse.getProducto().add(productoResponse);
            }
        }

        if (iguales) {
            response.setMensaje("Los folios han sido creados");
        } else {
            response.setMensaje("Los productos de la orden no coinciden con los de la factura");
        }

        return response;
    }

    private static boolean compararListar(List<GenerarFolioRequest.Orden.Productos.Producto> listaProductosOrden,
            List<RecuperarFacturaResponse.Productos.Producto> listaProductoFactura) {
        boolean iguales = true;
        if (listaProductoFactura.size() != listaProductosOrden.size()) {
            return false;
        }
        for (int i = 0; i < listaProductosOrden.size(); i++) {
            GenerarFolioRequest.Orden.Productos.Producto orden = listaProductosOrden.get(i);
            RecuperarFacturaResponse.Productos.Producto factura = listaProductoFactura.get(i);
            if (!orden.getNombre().equals(factura.getNombre()) && orden.getCantidad() != factura.getCantidad()
                    && orden.getPrecioUnitario() != factura.getPrecioUnitario()) {
                iguales = false;
                break;
            }
        }
        return iguales;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/inventario", localPart = "ObtenerFoliosRequest")
    @ResponsePayload
    public ObtenerFoliosResponse obtenerFolio(@RequestPayload ObtenerFoliosRequest request) {
        ObtenerFoliosResponse response = new ObtenerFoliosResponse();
        ObtenerFoliosResponse.Productos productosResponse = new ObtenerFoliosResponse.Productos();
        response.setProductos(productosResponse);

        String numOrden = request.getNumOrden();
        Compra compra = compraRepository.findByNumOrden(numOrden);

        if (compra == null) {
            return response;
        }

        List<Producto> productos = productoRepository.findByIdCompra(compra.getNumOrden());
        if (productos != null) {
            for (Producto producto : productos) {
                ObtenerFoliosResponse.Productos.Producto productoResponse = new ObtenerFoliosResponse.Productos.Producto();
                productoResponse.setNombre(producto.getNombre());
                productoResponse.setFolio(producto.getFolio());
                productosResponse.getProducto().add(productoResponse);
            }
        }

        return response;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/inventario", localPart = "ValidarFolioRequest")
    @ResponsePayload
    public ValidarFolioResponse validarFolio(@RequestPayload ValidarFolioRequest request){
        ValidarFolioResponse response = new ValidarFolioResponse();

        String folio = request.getFolio();
        Producto producto = productoRepository.findByFolio(folio);

        if(producto != null){
            response.setMensaje("El folio es válido, pertecene a " + producto.getNombre());
        }else{
            response.setMensaje("El folio no es válido");
        }

        return response;
    }

}

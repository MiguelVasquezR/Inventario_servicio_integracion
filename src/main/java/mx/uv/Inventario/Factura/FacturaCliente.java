package mx.uv.Inventario.Factura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import xx.mx.uv.consumo.wsdl.RecuperarFacturaRequest;
import xx.mx.uv.consumo.wsdl.RecuperarFacturaResponse;

public class FacturaCliente extends WebServiceGatewaySupport {

    @Autowired
    private Jaxb2Marshaller marshallerFactura; // Asegúrate de tener esta dependencia inyectada correctamente

    public RecuperarFacturaResponse consultarFactura(String idFactura) {
        RecuperarFacturaRequest request = new RecuperarFacturaRequest();
        request.setUUID(idFactura);
        return (RecuperarFacturaResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request, new SoapActionCallback("https://facturas-production.up.railway.app/ws/facturas"));
    }
}

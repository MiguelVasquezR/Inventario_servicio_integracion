package mx.uv.Inventario;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xx.mx.uv.consumo.wsdl.ConsultarFacturaRequest;
import xx.mx.uv.consumo.wsdl.ConsultarFacturaResponse;


public class FacturaCliente extends WebServiceGatewaySupport {

    public ConsultarFacturaResponse consultarFactura(String numeroFactura) {
        ConsultarFacturaRequest request = new ConsultarFacturaRequest();
        request.setNumFactura(numeroFactura);
        ConsultarFacturaResponse response = (ConsultarFacturaResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://serviciofactura-production.up.railway.app/ws/factura", request,
                        new SoapActionCallback(""));
        return response;
    }
}


package xx.mx.uv.consumo.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "FacturaService", targetNamespace = "t4is.uv.mx/factura", wsdlLocation = "file:/Users/vasquez/Desktop/servicios/Inventario/src/main/resources/factura.wsdl")
public class FacturaService
    extends Service
{

    private final static URL FACTURASERVICE_WSDL_LOCATION;
    private final static WebServiceException FACTURASERVICE_EXCEPTION;
    private final static QName FACTURASERVICE_QNAME = new QName("t4is.uv.mx/factura", "FacturaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/vasquez/Desktop/servicios/Inventario/src/main/resources/factura.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FACTURASERVICE_WSDL_LOCATION = url;
        FACTURASERVICE_EXCEPTION = e;
    }

    public FacturaService() {
        super(__getWsdlLocation(), FACTURASERVICE_QNAME);
    }

    public FacturaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FACTURASERVICE_QNAME, features);
    }

    public FacturaService(URL wsdlLocation) {
        super(wsdlLocation, FACTURASERVICE_QNAME);
    }

    public FacturaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FACTURASERVICE_QNAME, features);
    }

    public FacturaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FacturaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FacturaPortType
     */
    @WebEndpoint(name = "FacturaPort")
    public FacturaPortType getFacturaPort() {
        return super.getPort(new QName("t4is.uv.mx/factura", "FacturaPort"), FacturaPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FacturaPortType
     */
    @WebEndpoint(name = "FacturaPort")
    public FacturaPortType getFacturaPort(WebServiceFeature... features) {
        return super.getPort(new QName("t4is.uv.mx/factura", "FacturaPort"), FacturaPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FACTURASERVICE_EXCEPTION!= null) {
            throw FACTURASERVICE_EXCEPTION;
        }
        return FACTURASERVICE_WSDL_LOCATION;
    }

}

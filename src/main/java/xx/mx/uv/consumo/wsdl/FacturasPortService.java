
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
@WebServiceClient(name = "facturasPortService", targetNamespace = "t4is.uv.mx/facturas", wsdlLocation = "https://facturas-production.up.railway.app/ws/facturas.wsdl")
public class FacturasPortService
    extends Service
{

    private final static URL FACTURASPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException FACTURASPORTSERVICE_EXCEPTION;
    private final static QName FACTURASPORTSERVICE_QNAME = new QName("t4is.uv.mx/facturas", "facturasPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://facturas-production.up.railway.app/ws/facturas.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FACTURASPORTSERVICE_WSDL_LOCATION = url;
        FACTURASPORTSERVICE_EXCEPTION = e;
    }

    public FacturasPortService() {
        super(__getWsdlLocation(), FACTURASPORTSERVICE_QNAME);
    }

    public FacturasPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FACTURASPORTSERVICE_QNAME, features);
    }

    public FacturasPortService(URL wsdlLocation) {
        super(wsdlLocation, FACTURASPORTSERVICE_QNAME);
    }

    public FacturasPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FACTURASPORTSERVICE_QNAME, features);
    }

    public FacturasPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FacturasPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FacturasPort
     */
    @WebEndpoint(name = "facturasPortSoap11")
    public FacturasPort getFacturasPortSoap11() {
        return super.getPort(new QName("t4is.uv.mx/facturas", "facturasPortSoap11"), FacturasPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FacturasPort
     */
    @WebEndpoint(name = "facturasPortSoap11")
    public FacturasPort getFacturasPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("t4is.uv.mx/facturas", "facturasPortSoap11"), FacturasPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FACTURASPORTSERVICE_EXCEPTION!= null) {
            throw FACTURASPORTSERVICE_EXCEPTION;
        }
        return FACTURASPORTSERVICE_WSDL_LOCATION;
    }

}

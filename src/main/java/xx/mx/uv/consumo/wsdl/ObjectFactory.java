
package xx.mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xx.mx.uv.consumo.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xx.mx.uv.consumo.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearFacturaRequest }
     * 
     */
    public CrearFacturaRequest createCrearFacturaRequest() {
        return new CrearFacturaRequest();
    }

    /**
     * Create an instance of {@link ReceptorType }
     * 
     */
    public ReceptorType createReceptorType() {
        return new ReceptorType();
    }

    /**
     * Create an instance of {@link EmisorType }
     * 
     */
    public EmisorType createEmisorType() {
        return new EmisorType();
    }

    /**
     * Create an instance of {@link ProductoType }
     * 
     */
    public ProductoType createProductoType() {
        return new ProductoType();
    }

    /**
     * Create an instance of {@link CrearFacturaResponse }
     * 
     */
    public CrearFacturaResponse createCrearFacturaResponse() {
        return new CrearFacturaResponse();
    }

    /**
     * Create an instance of {@link ConsultarFacturaRequest }
     * 
     */
    public ConsultarFacturaRequest createConsultarFacturaRequest() {
        return new ConsultarFacturaRequest();
    }

    /**
     * Create an instance of {@link ConsultarFacturaResponse }
     * 
     */
    public ConsultarFacturaResponse createConsultarFacturaResponse() {
        return new ConsultarFacturaResponse();
    }

    /**
     * Create an instance of {@link DetalleProductoType }
     * 
     */
    public DetalleProductoType createDetalleProductoType() {
        return new DetalleProductoType();
    }

}


package xx.mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Receptor" type="{t4is.uv.mx/factura}ReceptorType"/&gt;
 *         &lt;element name="Emisor" type="{t4is.uv.mx/factura}EmisorType"/&gt;
 *         &lt;element name="Productos" type="{t4is.uv.mx/factura}ProductoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "receptor",
    "emisor",
    "productos"
})
@XmlRootElement(name = "CrearFacturaRequest")
public class CrearFacturaRequest {

    @XmlElement(name = "Receptor", required = true)
    protected ReceptorType receptor;
    @XmlElement(name = "Emisor", required = true)
    protected EmisorType emisor;
    @XmlElement(name = "Productos", required = true)
    protected ProductoType productos;

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorType }
     *     
     */
    public ReceptorType getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorType }
     *     
     */
    public void setReceptor(ReceptorType value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link EmisorType }
     *     
     */
    public EmisorType getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorType }
     *     
     */
    public void setEmisor(EmisorType value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad productos.
     * 
     * @return
     *     possible object is
     *     {@link ProductoType }
     *     
     */
    public ProductoType getProductos() {
        return productos;
    }

    /**
     * Define el valor de la propiedad productos.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoType }
     *     
     */
    public void setProductos(ProductoType value) {
        this.productos = value;
    }

}

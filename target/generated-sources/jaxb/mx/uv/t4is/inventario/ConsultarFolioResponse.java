//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.30 a las 11:48:19 AM CST 
//


package mx.uv.t4is.inventario;

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
 *         &lt;element name="Producto"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PrecioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "producto"
})
@XmlRootElement(name = "ConsultarFolioResponse")
public class ConsultarFolioResponse {

    @XmlElement(name = "Producto", required = true)
    protected ConsultarFolioResponse.Producto producto;

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarFolioResponse.Producto }
     *     
     */
    public ConsultarFolioResponse.Producto getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarFolioResponse.Producto }
     *     
     */
    public void setProducto(ConsultarFolioResponse.Producto value) {
        this.producto = value;
    }


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
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Dependencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PrecioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "nombre",
        "dependencia",
        "precioUnitario"
    })
    public static class Producto {

        @XmlElement(name = "Nombre", required = true)
        protected String nombre;
        @XmlElement(name = "Dependencia", required = true)
        protected String dependencia;
        @XmlElement(name = "PrecioUnitario")
        protected double precioUnitario;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad dependencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDependencia() {
            return dependencia;
        }

        /**
         * Define el valor de la propiedad dependencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDependencia(String value) {
            this.dependencia = value;
        }

        /**
         * Obtiene el valor de la propiedad precioUnitario.
         * 
         */
        public double getPrecioUnitario() {
            return precioUnitario;
        }

        /**
         * Define el valor de la propiedad precioUnitario.
         * 
         */
        public void setPrecioUnitario(double value) {
            this.precioUnitario = value;
        }

    }

}

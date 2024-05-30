//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.30 a las 11:48:19 AM CST 
//


package mx.uv.t4is.inventario;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Folios" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "folios"
})
@XmlRootElement(name = "GenerarFolioResponse")
public class GenerarFolioResponse {

    @XmlElement(name = "Folios", required = true)
    protected List<GenerarFolioResponse.Folios> folios;

    /**
     * Gets the value of the folios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the folios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenerarFolioResponse.Folios }
     * 
     * 
     */
    public List<GenerarFolioResponse.Folios> getFolios() {
        if (folios == null) {
            folios = new ArrayList<GenerarFolioResponse.Folios>();
        }
        return this.folios;
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
     *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "folio",
        "item"
    })
    public static class Folios {

        @XmlElement(name = "Folio", required = true)
        protected String folio;
        @XmlElement(name = "Item", required = true)
        protected String item;

        /**
         * Obtiene el valor de la propiedad folio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFolio() {
            return folio;
        }

        /**
         * Define el valor de la propiedad folio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFolio(String value) {
            this.folio = value;
        }

        /**
         * Obtiene el valor de la propiedad item.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItem() {
            return item;
        }

        /**
         * Define el valor de la propiedad item.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItem(String value) {
            this.item = value;
        }

    }

}

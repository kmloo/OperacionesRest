
package co.com.ws.cliente.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametro1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="parametro2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resta", propOrder = {
    "parametro1",
    "parametro2"
})
@XmlRootElement
public class Resta {

    protected Double parametro1;
    protected Double parametro2;

    /**
     * Obtiene el valor de la propiedad parametro1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParametro1() {
        return parametro1;
    }

    /**
     * Define el valor de la propiedad parametro1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParametro1(Double value) {
        this.parametro1 = value;
    }

    /**
     * Obtiene el valor de la propiedad parametro2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParametro2() {
        return parametro2;
    }

    /**
     * Define el valor de la propiedad parametro2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParametro2(Double value) {
        this.parametro2 = value;
    }

}

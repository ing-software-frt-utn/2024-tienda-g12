//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.02.05 a las 08:40:28 PM ART 
//


package ingSoftware.laTienda.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="SolicitarAutorizacionResult" type="{http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data}Autorizacion" minOccurs="0"/&gt;
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
    "solicitarAutorizacionResult"
})
@XmlRootElement(name = "SolicitarAutorizacionResponse", namespace = "http://ISTP1.Service.Contracts.Service")
public class SolicitarAutorizacionResponse {

    @XmlElementRef(name = "SolicitarAutorizacionResult", namespace = "http://ISTP1.Service.Contracts.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<Autorizacion> solicitarAutorizacionResult;

    /**
     * Obtiene el valor de la propiedad solicitarAutorizacionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Autorizacion }{@code >}
     *     
     */
    public JAXBElement<Autorizacion> getSolicitarAutorizacionResult() {
        return solicitarAutorizacionResult;
    }

    /**
     * Define el valor de la propiedad solicitarAutorizacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Autorizacion }{@code >}
     *     
     */
    public void setSolicitarAutorizacionResult(JAXBElement<Autorizacion> value) {
        this.solicitarAutorizacionResult = value;
    }

}

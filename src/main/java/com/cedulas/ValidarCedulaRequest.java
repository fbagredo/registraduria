//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.03.16 a las 07:56:31 PM COT 
//


package com.cedulas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCedula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoId",
    "numCedula"
})
@XmlRootElement(name = "validarCedulaRequest")
public class ValidarCedulaRequest {

    @XmlElement(required = true)
    protected String tipoId;
    @XmlElement(required = true)
    protected String numCedula;

    /**
     * Obtiene el valor de la propiedad tipoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoId() {
        return tipoId;
    }

    /**
     * Define el valor de la propiedad tipoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoId(String value) {
        this.tipoId = value;
    }

    /**
     * Obtiene el valor de la propiedad numCedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCedula() {
        return numCedula;
    }

    /**
     * Define el valor de la propiedad numCedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCedula(String value) {
        this.numCedula = value;
    }

}

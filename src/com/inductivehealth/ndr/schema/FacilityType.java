//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.16 at 08:28:31 PM WAT 
//


package com.inductivehealth.ndr.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacilityName" type="{}StringType"/>
 *         &lt;element name="FacilityID" type="{}StringType"/>
 *         &lt;element name="FacilityTypeCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{}CodeType">
 *               &lt;enumeration value="IP"/>
 *               &lt;enumeration value="FAC"/>
 *               &lt;enumeration value="LGA"/>
 *               &lt;enumeration value="SGA"/>
 *               &lt;enumeration value="FGA"/>
 *               &lt;enumeration value="OTH"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityType", propOrder = {
    "facilityName",
    "facilityID",
    "facilityTypeCode"
})
public class FacilityType {

    @XmlElement(name = "FacilityName", required = true)
    protected String facilityName;
    @XmlElement(name = "FacilityID", required = true)
    protected String facilityID;
    @XmlElement(name = "FacilityTypeCode", required = true)
    protected String facilityTypeCode;

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    /**
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

    /**
     * Gets the value of the facilityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityTypeCode() {
        return facilityTypeCode;
    }

    /**
     * Sets the value of the facilityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityTypeCode(String value) {
        this.facilityTypeCode = value;
    }

}

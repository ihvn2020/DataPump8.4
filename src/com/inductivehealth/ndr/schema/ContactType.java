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
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactRelationshipType" type="{}CodeType"/>
 *         &lt;element name="ContactName" type="{}NameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "contactRelationshipType",
    "contactName"
})
public class ContactType {

    @XmlElement(name = "ContactRelationshipType", required = true)
    protected String contactRelationshipType;
    @XmlElement(name = "ContactName", required = true)
    protected NameType contactName;

    /**
     * Gets the value of the contactRelationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRelationshipType() {
        return contactRelationshipType;
    }

    /**
     * Sets the value of the contactRelationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRelationshipType(String value) {
        this.contactRelationshipType = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setContactName(NameType value) {
        this.contactName = value;
    }

}

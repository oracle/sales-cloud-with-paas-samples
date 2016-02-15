
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesAccountResourceAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesAccountResourceAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResourceId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesAccountResourceAccess", propOrder = {
    "salesAccountId",
    "resourceId",
    "partyName",
    "userGUID"
})
public class SalesAccountResourceAccess {

    @XmlElementRef(name = "SalesAccountId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> salesAccountId;
    @XmlElementRef(name = "ResourceId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> resourceId;
    @XmlElementRef(name = "PartyName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName;
    @XmlElementRef(name = "UserGUID", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> userGUID;

    /**
     * Gets the value of the salesAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesAccountId() {
        return salesAccountId;
    }

    /**
     * Sets the value of the salesAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesAccountId(JAXBElement<Long> value) {
        this.salesAccountId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setResourceId(JAXBElement<BigDecimal> value) {
        this.resourceId = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyName(JAXBElement<String> value) {
        this.partyName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserGUID() {
        return userGUID;
    }

    /**
     * Sets the value of the userGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserGUID(JAXBElement<String> value) {
        this.userGUID = ((JAXBElement<String> ) value);
    }

}

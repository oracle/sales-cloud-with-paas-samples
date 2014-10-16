
package com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationParty" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}OrganizationParty"/>
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
    "organizationParty"
})
@XmlRootElement(name = "createOrganizationPartyAsync")
public class CreateOrganizationPartyAsync {

    @XmlElement(required = true)
    protected OrganizationParty organizationParty;

    /**
     * Gets the value of the organizationParty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationParty }
     *     
     */
    public OrganizationParty getOrganizationParty() {
        return organizationParty;
    }

    /**
     * Sets the value of the organizationParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationParty }
     *     
     */
    public void setOrganizationParty(OrganizationParty value) {
        this.organizationParty = value;
    }

}

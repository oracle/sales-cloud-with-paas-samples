
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

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
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="partyUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "partyId",
    "partyUsage"
})
@XmlRootElement(name = "createPartyUsageAsync")
public class CreatePartyUsageAsync {

    protected long partyId;
    @XmlElement(required = true)
    protected String partyUsage;

    /**
     * Gets the value of the partyId property.
     * 
     */
    public long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     */
    public void setPartyId(long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUsage() {
        return partyUsage;
    }

    /**
     * Sets the value of the partyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUsage(String value) {
        this.partyUsage = value;
    }

}

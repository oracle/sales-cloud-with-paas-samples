
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesParty;


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
 *         &lt;element name="salesParty" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesParty"/>
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
    "salesParty"
})
@XmlRootElement(name = "createSalesPartyAsync")
public class CreateSalesPartyAsync {

    @XmlElement(required = true)
    protected SalesParty salesParty;

    /**
     * Gets the value of the salesParty property.
     * 
     * @return
     *     possible object is
     *     {@link SalesParty }
     *     
     */
    public SalesParty getSalesParty() {
        return salesParty;
    }

    /**
     * Sets the value of the salesParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesParty }
     *     
     */
    public void setSalesParty(SalesParty value) {
        this.salesParty = value;
    }

}

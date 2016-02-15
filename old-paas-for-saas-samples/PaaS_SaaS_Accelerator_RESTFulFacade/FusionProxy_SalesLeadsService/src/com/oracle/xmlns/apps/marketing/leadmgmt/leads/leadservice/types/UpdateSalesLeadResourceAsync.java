
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.MklLeadResources;


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
 *         &lt;element name="salesLeadResource" type="{http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/}MklLeadResources"/>
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
    "salesLeadResource"
})
@XmlRootElement(name = "updateSalesLeadResourceAsync")
public class UpdateSalesLeadResourceAsync {

    @XmlElement(required = true)
    protected MklLeadResources salesLeadResource;

    /**
     * Gets the value of the salesLeadResource property.
     * 
     * @return
     *     possible object is
     *     {@link MklLeadResources }
     *     
     */
    public MklLeadResources getSalesLeadResource() {
        return salesLeadResource;
    }

    /**
     * Sets the value of the salesLeadResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MklLeadResources }
     *     
     */
    public void setSalesLeadResource(MklLeadResources value) {
        this.salesLeadResource = value;
    }

}

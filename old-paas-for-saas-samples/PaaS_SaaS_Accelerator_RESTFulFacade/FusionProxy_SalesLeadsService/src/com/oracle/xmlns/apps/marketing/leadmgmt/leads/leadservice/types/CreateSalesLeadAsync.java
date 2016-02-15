
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice.MklLead;


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
 *         &lt;element name="salesLead" type="{http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/}MklLead"/>
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
    "salesLead"
})
@XmlRootElement(name = "createSalesLeadAsync")
public class CreateSalesLeadAsync {

    @XmlElement(required = true)
    protected MklLead salesLead;

    /**
     * Gets the value of the salesLead property.
     * 
     * @return
     *     possible object is
     *     {@link MklLead }
     *     
     */
    public MklLead getSalesLead() {
        return salesLead;
    }

    /**
     * Sets the value of the salesLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MklLead }
     *     
     */
    public void setSalesLead(MklLead value) {
        this.salesLead = value;
    }

}

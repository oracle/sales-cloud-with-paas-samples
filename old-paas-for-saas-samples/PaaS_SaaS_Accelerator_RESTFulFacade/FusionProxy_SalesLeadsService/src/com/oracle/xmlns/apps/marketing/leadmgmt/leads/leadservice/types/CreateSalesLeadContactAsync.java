
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.MklLeadTcMembers;


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
 *         &lt;element name="salesLeadContact" type="{http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/}MklLeadTcMembers"/>
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
    "salesLeadContact"
})
@XmlRootElement(name = "createSalesLeadContactAsync")
public class CreateSalesLeadContactAsync {

    @XmlElement(required = true)
    protected MklLeadTcMembers salesLeadContact;

    /**
     * Gets the value of the salesLeadContact property.
     * 
     * @return
     *     possible object is
     *     {@link MklLeadTcMembers }
     *     
     */
    public MklLeadTcMembers getSalesLeadContact() {
        return salesLeadContact;
    }

    /**
     * Sets the value of the salesLeadContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link MklLeadTcMembers }
     *     
     */
    public void setSalesLeadContact(MklLeadTcMembers value) {
        this.salesLeadContact = value;
    }

}

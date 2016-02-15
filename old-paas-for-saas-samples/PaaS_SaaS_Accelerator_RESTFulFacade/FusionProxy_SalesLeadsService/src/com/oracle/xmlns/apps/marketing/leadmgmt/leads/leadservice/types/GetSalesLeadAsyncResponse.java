
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
 *         &lt;element name="result" type="{http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/}MklLead"/>
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
    "result"
})
@XmlRootElement(name = "getSalesLeadAsyncResponse")
public class GetSalesLeadAsyncResponse {

    @XmlElement(required = true)
    protected MklLead result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link MklLead }
     *     
     */
    public MklLead getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link MklLead }
     *     
     */
    public void setResult(MklLead value) {
        this.result = value;
    }

}

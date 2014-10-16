
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="leadResourceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "leadResourceId"
})
@XmlRootElement(name = "getSalesLeadResourceAsync")
public class GetSalesLeadResourceAsync {

    protected long leadResourceId;

    /**
     * Gets the value of the leadResourceId property.
     * 
     */
    public long getLeadResourceId() {
        return leadResourceId;
    }

    /**
     * Sets the value of the leadResourceId property.
     * 
     */
    public void setLeadResourceId(long value) {
        this.leadResourceId = value;
    }

}

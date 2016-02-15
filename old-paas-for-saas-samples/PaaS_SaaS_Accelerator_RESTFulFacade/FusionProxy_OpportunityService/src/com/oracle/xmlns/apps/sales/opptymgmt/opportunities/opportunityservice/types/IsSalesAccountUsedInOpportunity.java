
package com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.types;

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
 *         &lt;element name="salesAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "salesAccountId"
})
@XmlRootElement(name = "isSalesAccountUsedInOpportunity")
public class IsSalesAccountUsedInOpportunity {

    protected long salesAccountId;

    /**
     * Gets the value of the salesAccountId property.
     * 
     */
    public long getSalesAccountId() {
        return salesAccountId;
    }

    /**
     * Sets the value of the salesAccountId property.
     * 
     */
    public void setSalesAccountId(long value) {
        this.salesAccountId = value;
    }

}

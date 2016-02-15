
package com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated;

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
 *         &lt;element name="opportunityRevenueVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}Revenue"/>
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
    "opportunityRevenueVO"
})
@XmlRootElement(name = "deleteOpportunityRevenueAsync")
public class DeleteOpportunityRevenueAsync {

    @XmlElement(required = true)
    protected Revenue opportunityRevenueVO;

    /**
     * Gets the value of the opportunityRevenueVO property.
     * 
     * @return
     *     possible object is
     *     {@link Revenue }
     *     
     */
    public Revenue getOpportunityRevenueVO() {
        return opportunityRevenueVO;
    }

    /**
     * Sets the value of the opportunityRevenueVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revenue }
     *     
     */
    public void setOpportunityRevenueVO(Revenue value) {
        this.opportunityRevenueVO = value;
    }

}

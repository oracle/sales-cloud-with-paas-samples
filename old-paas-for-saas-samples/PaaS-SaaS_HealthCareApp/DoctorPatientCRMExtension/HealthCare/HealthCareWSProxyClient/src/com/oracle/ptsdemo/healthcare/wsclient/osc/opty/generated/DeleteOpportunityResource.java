
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
 *         &lt;element name="opportunityResourceVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResource"/>
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
    "opportunityResourceVO"
})
@XmlRootElement(name = "deleteOpportunityResource")
public class DeleteOpportunityResource {

    @XmlElement(required = true)
    protected OpportunityResource opportunityResourceVO;

    /**
     * Gets the value of the opportunityResourceVO property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityResource }
     *     
     */
    public OpportunityResource getOpportunityResourceVO() {
        return opportunityResourceVO;
    }

    /**
     * Sets the value of the opportunityResourceVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityResource }
     *     
     */
    public void setOpportunityResourceVO(OpportunityResource value) {
        this.opportunityResourceVO = value;
    }

}

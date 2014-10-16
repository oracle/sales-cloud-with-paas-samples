
package com.oracle.pts.opp.wsclient.generated;

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
 *         &lt;element name="opportunityResponseVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResponse"/>
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
    "opportunityResponseVO"
})
@XmlRootElement(name = "deleteOpportunityMktResponse")
public class DeleteOpportunityMktResponse {

    @XmlElement(required = true)
    protected OpportunityResponse opportunityResponseVO;

    /**
     * Gets the value of the opportunityResponseVO property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityResponse }
     *     
     */
    public OpportunityResponse getOpportunityResponseVO() {
        return opportunityResponseVO;
    }

    /**
     * Sets the value of the opportunityResponseVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityResponse }
     *     
     */
    public void setOpportunityResponseVO(OpportunityResponse value) {
        this.opportunityResponseVO = value;
    }

}

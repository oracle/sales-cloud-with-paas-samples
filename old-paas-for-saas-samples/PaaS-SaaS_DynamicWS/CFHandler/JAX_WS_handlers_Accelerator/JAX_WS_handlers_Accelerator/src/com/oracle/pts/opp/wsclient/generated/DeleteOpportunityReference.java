
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
 *         &lt;element name="opportunityReferenceVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityReference"/>
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
    "opportunityReferenceVO"
})
@XmlRootElement(name = "deleteOpportunityReference")
public class DeleteOpportunityReference {

    @XmlElement(required = true)
    protected OpportunityReference opportunityReferenceVO;

    /**
     * Gets the value of the opportunityReferenceVO property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityReference }
     *     
     */
    public OpportunityReference getOpportunityReferenceVO() {
        return opportunityReferenceVO;
    }

    /**
     * Sets the value of the opportunityReferenceVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityReference }
     *     
     */
    public void setOpportunityReferenceVO(OpportunityReference value) {
        this.opportunityReferenceVO = value;
    }

}

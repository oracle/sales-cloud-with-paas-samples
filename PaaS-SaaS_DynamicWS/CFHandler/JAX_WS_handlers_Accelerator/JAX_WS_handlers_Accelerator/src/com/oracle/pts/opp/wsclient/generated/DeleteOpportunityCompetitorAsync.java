
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
 *         &lt;element name="opportunityCompetitorVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityCompetitor"/>
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
    "opportunityCompetitorVO"
})
@XmlRootElement(name = "deleteOpportunityCompetitorAsync")
public class DeleteOpportunityCompetitorAsync {

    @XmlElement(required = true)
    protected OpportunityCompetitor opportunityCompetitorVO;

    /**
     * Gets the value of the opportunityCompetitorVO property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityCompetitor }
     *     
     */
    public OpportunityCompetitor getOpportunityCompetitorVO() {
        return opportunityCompetitorVO;
    }

    /**
     * Sets the value of the opportunityCompetitorVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityCompetitor }
     *     
     */
    public void setOpportunityCompetitorVO(OpportunityCompetitor value) {
        this.opportunityCompetitorVO = value;
    }

}


package com.oracle.ptsdemo.oscproxyclient.types;

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
 *         &lt;element name="opportunityContactVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityContact"/>
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
    "opportunityContactVO"
})
@XmlRootElement(name = "deleteOpportunityContactAsync")
public class DeleteOpportunityContactAsync {

    @XmlElement(required = true)
    protected OpportunityContact opportunityContactVO;

    /**
     * Gets the value of the opportunityContactVO property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityContact }
     *     
     */
    public OpportunityContact getOpportunityContactVO() {
        return opportunityContactVO;
    }

    /**
     * Sets the value of the opportunityContactVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityContact }
     *     
     */
    public void setOpportunityContactVO(OpportunityContact value) {
        this.opportunityContactVO = value;
    }

}

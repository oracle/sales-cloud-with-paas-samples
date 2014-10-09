
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
 *         &lt;element name="opportunitySourceVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunitySource"/>
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
    "opportunitySourceVO"
})
@XmlRootElement(name = "deleteOpportunitySourceAsync")
public class DeleteOpportunitySourceAsync {

    @XmlElement(required = true)
    protected OpportunitySource opportunitySourceVO;

    /**
     * Gets the value of the opportunitySourceVO property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySource }
     *     
     */
    public OpportunitySource getOpportunitySourceVO() {
        return opportunitySourceVO;
    }

    /**
     * Sets the value of the opportunitySourceVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySource }
     *     
     */
    public void setOpportunitySourceVO(OpportunitySource value) {
        this.opportunitySourceVO = value;
    }

}

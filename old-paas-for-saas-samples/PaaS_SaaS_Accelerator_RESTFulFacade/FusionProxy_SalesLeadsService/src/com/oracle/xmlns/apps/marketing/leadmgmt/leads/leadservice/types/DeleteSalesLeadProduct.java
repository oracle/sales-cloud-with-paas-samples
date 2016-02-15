
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.MklProdAssoc;


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
 *         &lt;element name="salesLeadProduct" type="{http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/}MklProdAssoc"/>
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
    "salesLeadProduct"
})
@XmlRootElement(name = "deleteSalesLeadProduct")
public class DeleteSalesLeadProduct {

    @XmlElement(required = true)
    protected MklProdAssoc salesLeadProduct;

    /**
     * Gets the value of the salesLeadProduct property.
     * 
     * @return
     *     possible object is
     *     {@link MklProdAssoc }
     *     
     */
    public MklProdAssoc getSalesLeadProduct() {
        return salesLeadProduct;
    }

    /**
     * Sets the value of the salesLeadProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MklProdAssoc }
     *     
     */
    public void setSalesLeadProduct(MklProdAssoc value) {
        this.salesLeadProduct = value;
    }

}

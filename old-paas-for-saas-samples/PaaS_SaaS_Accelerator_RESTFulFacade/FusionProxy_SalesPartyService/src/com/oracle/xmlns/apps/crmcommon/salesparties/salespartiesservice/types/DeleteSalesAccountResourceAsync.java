
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesAccountResource;


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
 *         &lt;element name="salesAccountResource" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountResource"/>
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
    "salesAccountResource"
})
@XmlRootElement(name = "deleteSalesAccountResourceAsync")
public class DeleteSalesAccountResourceAsync {

    @XmlElement(required = true)
    protected SalesAccountResource salesAccountResource;

    /**
     * Gets the value of the salesAccountResource property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAccountResource }
     *     
     */
    public SalesAccountResource getSalesAccountResource() {
        return salesAccountResource;
    }

    /**
     * Sets the value of the salesAccountResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAccountResource }
     *     
     */
    public void setSalesAccountResource(SalesAccountResource value) {
        this.salesAccountResource = value;
    }

}

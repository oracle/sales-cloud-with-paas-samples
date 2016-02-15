
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesAccount;


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
 *         &lt;element name="salesAccount" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccount"/>
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
    "salesAccount"
})
@XmlRootElement(name = "mergeSalesAccountAsync")
public class MergeSalesAccountAsync {

    @XmlElement(required = true)
    protected SalesAccount salesAccount;

    /**
     * Gets the value of the salesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAccount }
     *     
     */
    public SalesAccount getSalesAccount() {
        return salesAccount;
    }

    /**
     * Sets the value of the salesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAccount }
     *     
     */
    public void setSalesAccount(SalesAccount value) {
        this.salesAccount = value;
    }

}

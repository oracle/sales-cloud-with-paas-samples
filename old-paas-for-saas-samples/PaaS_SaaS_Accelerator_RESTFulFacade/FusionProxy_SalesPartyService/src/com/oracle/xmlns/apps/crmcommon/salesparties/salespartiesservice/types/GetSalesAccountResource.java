
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sAccountResourceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "sAccountResourceId"
})
@XmlRootElement(name = "getSalesAccountResource")
public class GetSalesAccountResource {

    protected long sAccountResourceId;

    /**
     * Gets the value of the sAccountResourceId property.
     * 
     */
    public long getSAccountResourceId() {
        return sAccountResourceId;
    }

    /**
     * Sets the value of the sAccountResourceId property.
     * 
     */
    public void setSAccountResourceId(long value) {
        this.sAccountResourceId = value;
    }

}

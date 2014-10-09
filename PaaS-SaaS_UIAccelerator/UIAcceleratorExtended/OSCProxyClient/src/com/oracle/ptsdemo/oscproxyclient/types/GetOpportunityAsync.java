
package com.oracle.ptsdemo.oscproxyclient.types;

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
 *         &lt;element name="optyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "optyId"
})
@XmlRootElement(name = "getOpportunityAsync")
public class GetOpportunityAsync {

    protected long optyId;

    /**
     * Gets the value of the optyId property.
     * 
     */
    public long getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     */
    public void setOptyId(long value) {
        this.optyId = value;
    }

}

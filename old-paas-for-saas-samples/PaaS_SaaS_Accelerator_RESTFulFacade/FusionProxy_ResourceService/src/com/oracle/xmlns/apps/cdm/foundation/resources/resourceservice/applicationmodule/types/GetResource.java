
package com.oracle.xmlns.apps.cdm.foundation.resources.resourceservice.applicationmodule.types;

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
 *         &lt;element name="resourceProfileId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "resourceProfileId"
})
@XmlRootElement(name = "getResource")
public class GetResource {

    protected long resourceProfileId;

    /**
     * Gets the value of the resourceProfileId property.
     * 
     */
    public long getResourceProfileId() {
        return resourceProfileId;
    }

    /**
     * Sets the value of the resourceProfileId property.
     * 
     */
    public void setResourceProfileId(long value) {
        this.resourceProfileId = value;
    }

}

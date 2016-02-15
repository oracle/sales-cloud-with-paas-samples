
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
 *         &lt;element name="resourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "resourcePartyId"
})
@XmlRootElement(name = "processResourceRoleProvisioningAsync")
public class ProcessResourceRoleProvisioningAsync {

    protected long resourcePartyId;

    /**
     * Gets the value of the resourcePartyId property.
     * 
     */
    public long getResourcePartyId() {
        return resourcePartyId;
    }

    /**
     * Sets the value of the resourcePartyId property.
     * 
     */
    public void setResourcePartyId(long value) {
        this.resourcePartyId = value;
    }

}

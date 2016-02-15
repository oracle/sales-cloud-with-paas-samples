
package com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.types;

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
 *         &lt;element name="interactionAssociationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "interactionAssociationId"
})
@XmlRootElement(name = "getInteractionAssociation")
public class GetInteractionAssociation {

    protected long interactionAssociationId;

    /**
     * Gets the value of the interactionAssociationId property.
     * 
     */
    public long getInteractionAssociationId() {
        return interactionAssociationId;
    }

    /**
     * Sets the value of the interactionAssociationId property.
     * 
     */
    public void setInteractionAssociationId(long value) {
        this.interactionAssociationId = value;
    }

}

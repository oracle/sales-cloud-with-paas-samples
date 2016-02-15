
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
 *         &lt;element name="interactionParticipantId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "interactionParticipantId"
})
@XmlRootElement(name = "getInteractionParticipantAsync")
public class GetInteractionParticipantAsync {

    protected long interactionParticipantId;

    /**
     * Gets the value of the interactionParticipantId property.
     * 
     */
    public long getInteractionParticipantId() {
        return interactionParticipantId;
    }

    /**
     * Sets the value of the interactionParticipantId property.
     * 
     */
    public void setInteractionParticipantId(long value) {
        this.interactionParticipantId = value;
    }

}

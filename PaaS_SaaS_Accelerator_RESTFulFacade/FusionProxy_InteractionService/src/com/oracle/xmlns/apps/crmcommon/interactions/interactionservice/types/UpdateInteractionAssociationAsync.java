
package com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.InteractionAssociation;


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
 *         &lt;element name="interactionAssociationWS" type="{http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/}InteractionAssociation"/>
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
    "interactionAssociationWS"
})
@XmlRootElement(name = "updateInteractionAssociationAsync")
public class UpdateInteractionAssociationAsync {

    @XmlElement(required = true)
    protected InteractionAssociation interactionAssociationWS;

    /**
     * Gets the value of the interactionAssociationWS property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionAssociation }
     *     
     */
    public InteractionAssociation getInteractionAssociationWS() {
        return interactionAssociationWS;
    }

    /**
     * Sets the value of the interactionAssociationWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionAssociation }
     *     
     */
    public void setInteractionAssociationWS(InteractionAssociation value) {
        this.interactionAssociationWS = value;
    }

}

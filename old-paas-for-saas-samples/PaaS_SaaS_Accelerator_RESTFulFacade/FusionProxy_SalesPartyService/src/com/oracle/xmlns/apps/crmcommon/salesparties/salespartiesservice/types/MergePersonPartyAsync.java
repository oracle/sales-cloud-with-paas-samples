
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.Person;


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
 *         &lt;element name="personParty" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}Person"/>
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
    "personParty"
})
@XmlRootElement(name = "mergePersonPartyAsync")
public class MergePersonPartyAsync {

    @XmlElement(required = true)
    protected Person personParty;

    /**
     * Gets the value of the personParty property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonParty() {
        return personParty;
    }

    /**
     * Sets the value of the personParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonParty(Person value) {
        this.personParty = value;
    }

}

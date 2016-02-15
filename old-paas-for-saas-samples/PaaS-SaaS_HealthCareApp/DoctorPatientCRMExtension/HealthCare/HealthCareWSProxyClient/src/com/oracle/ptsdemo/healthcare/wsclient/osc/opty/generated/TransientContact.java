
package com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransientContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransientContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransientContact", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", propOrder = {
    "activityContactId",
    "contactId",
    "activityId",
    "contactRelationshipId",
    "partyId",
    "partyName",
    "partyType",
    "personFirstName",
    "personMiddleName",
    "personLastName",
    "personTitle"
})
public class TransientContact {

    @XmlElementRef(name = "ActivityContactId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> activityContactId;
    @XmlElementRef(name = "ContactId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> contactId;
    @XmlElementRef(name = "ActivityId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> activityId;
    @XmlElementRef(name = "ContactRelationshipId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> contactRelationshipId;
    @XmlElementRef(name = "PartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> partyId;
    @XmlElementRef(name = "PartyName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName;
    @XmlElementRef(name = "PartyType", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyType;
    @XmlElementRef(name = "PersonFirstName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> personFirstName;
    @XmlElementRef(name = "PersonMiddleName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> personMiddleName;
    @XmlElementRef(name = "PersonLastName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> personLastName;
    @XmlElementRef(name = "PersonTitle", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> personTitle;

    /**
     * Gets the value of the activityContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getActivityContactId() {
        return activityContactId;
    }

    /**
     * Sets the value of the activityContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setActivityContactId(JAXBElement<Long> value) {
        this.activityContactId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContactId(JAXBElement<Long> value) {
        this.contactId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setActivityId(JAXBElement<Long> value) {
        this.activityId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the contactRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContactRelationshipId() {
        return contactRelationshipId;
    }

    /**
     * Sets the value of the contactRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContactRelationshipId(JAXBElement<Long> value) {
        this.contactRelationshipId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartyId(JAXBElement<Long> value) {
        this.partyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyName(JAXBElement<String> value) {
        this.partyName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyType(JAXBElement<String> value) {
        this.partyType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonFirstName(JAXBElement<String> value) {
        this.personFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonMiddleName() {
        return personMiddleName;
    }

    /**
     * Sets the value of the personMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonMiddleName(JAXBElement<String> value) {
        this.personMiddleName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonLastName() {
        return personLastName;
    }

    /**
     * Sets the value of the personLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonLastName(JAXBElement<String> value) {
        this.personLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonTitle() {
        return personTitle;
    }

    /**
     * Sets the value of the personTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonTitle(JAXBElement<String> value) {
        this.personTitle = ((JAXBElement<String> ) value);
    }

}

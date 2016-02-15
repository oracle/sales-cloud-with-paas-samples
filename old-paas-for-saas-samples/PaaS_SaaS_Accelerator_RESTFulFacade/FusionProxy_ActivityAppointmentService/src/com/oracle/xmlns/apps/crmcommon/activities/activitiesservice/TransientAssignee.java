
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransientAssignee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransientAssignee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityAssigneeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssigneeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssigneeRsrcOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShowTimeAsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppointmentResponseCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransientAssignee", propOrder = {
    "activityAssigneeId",
    "assigneeId",
    "activityId",
    "assigneeRsrcOrgId",
    "partyId",
    "showTimeAsCd",
    "appointmentResponseCd",
    "ownerFlag",
    "partyName"
})
public class TransientAssignee {

    @XmlElementRef(name = "ActivityAssigneeId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> activityAssigneeId;
    @XmlElementRef(name = "AssigneeId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> assigneeId;
    @XmlElementRef(name = "ActivityId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> activityId;
    @XmlElementRef(name = "AssigneeRsrcOrgId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> assigneeRsrcOrgId;
    @XmlElementRef(name = "PartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> partyId;
    @XmlElementRef(name = "ShowTimeAsCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> showTimeAsCd;
    @XmlElementRef(name = "AppointmentResponseCd", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> appointmentResponseCd;
    @XmlElementRef(name = "OwnerFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> ownerFlag;
    @XmlElementRef(name = "PartyName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName;

    /**
     * Gets the value of the activityAssigneeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getActivityAssigneeId() {
        return activityAssigneeId;
    }

    /**
     * Sets the value of the activityAssigneeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setActivityAssigneeId(JAXBElement<Long> value) {
        this.activityAssigneeId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the assigneeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAssigneeId() {
        return assigneeId;
    }

    /**
     * Sets the value of the assigneeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAssigneeId(JAXBElement<Long> value) {
        this.assigneeId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the assigneeRsrcOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAssigneeRsrcOrgId() {
        return assigneeRsrcOrgId;
    }

    /**
     * Sets the value of the assigneeRsrcOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAssigneeRsrcOrgId(JAXBElement<Long> value) {
        this.assigneeRsrcOrgId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the showTimeAsCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShowTimeAsCd() {
        return showTimeAsCd;
    }

    /**
     * Sets the value of the showTimeAsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShowTimeAsCd(JAXBElement<String> value) {
        this.showTimeAsCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the appointmentResponseCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppointmentResponseCd() {
        return appointmentResponseCd;
    }

    /**
     * Sets the value of the appointmentResponseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppointmentResponseCd(JAXBElement<String> value) {
        this.appointmentResponseCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOwnerFlag() {
        return ownerFlag;
    }

    /**
     * Sets the value of the ownerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOwnerFlag(JAXBElement<Boolean> value) {
        this.ownerFlag = ((JAXBElement<Boolean> ) value);
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

}

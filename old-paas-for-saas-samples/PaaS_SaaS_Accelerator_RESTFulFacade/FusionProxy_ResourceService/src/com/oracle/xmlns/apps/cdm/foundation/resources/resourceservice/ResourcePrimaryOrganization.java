
package com.oracle.xmlns.apps.cdm.foundation.resources.resourceservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResourcePrimaryOrganization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourcePrimaryOrganization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourcePrimaryOrgRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClassificationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePrimaryOrganization", propOrder = {
    "resourcePrimaryOrgRecId",
    "primaryOrgId",
    "classificationId",
    "classificationCode",
    "partyId",
    "deleteFlag",
    "lastUpdateDate",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "lastUpdateLogin",
    "objectVersionNumber"
})
public class ResourcePrimaryOrganization {

    @XmlElementRef(name = "ResourcePrimaryOrgRecId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<Long> resourcePrimaryOrgRecId;
    @XmlElementRef(name = "PrimaryOrgId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryOrgId;
    @XmlElementRef(name = "ClassificationId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<Long> classificationId;
    @XmlElementRef(name = "ClassificationCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<String> classificationCode;
    @XmlElementRef(name = "PartyId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<Long> partyId;
    @XmlElementRef(name = "DeleteFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> deleteFlag;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElementRef(name = "CreationDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "CreatedBy", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "ObjectVersionNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/", type = JAXBElement.class)
    protected JAXBElement<Integer> objectVersionNumber;

    /**
     * Gets the value of the resourcePrimaryOrgRecId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourcePrimaryOrgRecId() {
        return resourcePrimaryOrgRecId;
    }

    /**
     * Sets the value of the resourcePrimaryOrgRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourcePrimaryOrgRecId(JAXBElement<Long> value) {
        this.resourcePrimaryOrgRecId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryOrgId() {
        return primaryOrgId;
    }

    /**
     * Sets the value of the primaryOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryOrgId(JAXBElement<Long> value) {
        this.primaryOrgId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the classificationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getClassificationId() {
        return classificationId;
    }

    /**
     * Sets the value of the classificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setClassificationId(JAXBElement<Long> value) {
        this.classificationId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationCode(JAXBElement<String> value) {
        this.classificationCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleteFlag(JAXBElement<Boolean> value) {
        this.deleteFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdatedBy(JAXBElement<String> value) {
        this.lastUpdatedBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<String> value) {
        this.createdBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setObjectVersionNumber(JAXBElement<Integer> value) {
        this.objectVersionNumber = ((JAXBElement<Integer> ) value);
    }

}

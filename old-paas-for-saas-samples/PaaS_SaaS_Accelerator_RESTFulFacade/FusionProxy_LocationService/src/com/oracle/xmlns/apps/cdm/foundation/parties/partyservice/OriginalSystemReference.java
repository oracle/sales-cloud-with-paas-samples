
package com.oracle.xmlns.apps.cdm.foundation.parties.partyservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.cdm.foundation.parties.flex.sourcesystemref.SourceSystemRefInformation;


/**
 * <p>Java class for OriginalSystemReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalSystemReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrigSystemReferenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrigSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldOrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceSystemRefInformation" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/sourceSystemRef/}SourceSystemRefInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalSystemReference", propOrder = {
    "origSystemReferenceId",
    "origSystem",
    "origSystemReference",
    "ownerTableName",
    "ownerTableId",
    "status",
    "reasonCode",
    "oldOrigSystemReference",
    "startDateActive",
    "endDateActive",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "objectVersionNumber",
    "createdByModule",
    "partyId",
    "requestId",
    "sourceSystemRefInformation"
})
public class OriginalSystemReference {

    @XmlElement(name = "OrigSystemReferenceId")
    protected Long origSystemReferenceId;
    @XmlElement(name = "OrigSystem")
    protected String origSystem;
    @XmlElement(name = "OrigSystemReference")
    protected String origSystemReference;
    @XmlElement(name = "OwnerTableName")
    protected String ownerTableName;
    @XmlElement(name = "OwnerTableId")
    protected Long ownerTableId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "ReasonCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "OldOrigSystemReference", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> oldOrigSystemReference;
    @XmlElement(name = "StartDateActive")
    protected XMLGregorianCalendar startDateActive;
    @XmlElementRef(name = "EndDateActive", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDateActive;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElementRef(name = "PartyId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<Long> partyId;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElement(name = "SourceSystemRefInformation")
    protected SourceSystemRefInformation sourceSystemRefInformation;

    /**
     * Gets the value of the origSystemReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrigSystemReferenceId() {
        return origSystemReferenceId;
    }

    /**
     * Sets the value of the origSystemReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrigSystemReferenceId(Long value) {
        this.origSystemReferenceId = value;
    }

    /**
     * Gets the value of the origSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSystem() {
        return origSystem;
    }

    /**
     * Sets the value of the origSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSystem(String value) {
        this.origSystem = value;
    }

    /**
     * Gets the value of the origSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSystemReference() {
        return origSystemReference;
    }

    /**
     * Sets the value of the origSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSystemReference(String value) {
        this.origSystemReference = value;
    }

    /**
     * Gets the value of the ownerTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTableName() {
        return ownerTableName;
    }

    /**
     * Sets the value of the ownerTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTableName(String value) {
        this.ownerTableName = value;
    }

    /**
     * Gets the value of the ownerTableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerTableId() {
        return ownerTableId;
    }

    /**
     * Sets the value of the ownerTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerTableId(Long value) {
        this.ownerTableId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oldOrigSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldOrigSystemReference() {
        return oldOrigSystemReference;
    }

    /**
     * Sets the value of the oldOrigSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldOrigSystemReference(JAXBElement<String> value) {
        this.oldOrigSystemReference = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateActive() {
        return startDateActive;
    }

    /**
     * Sets the value of the startDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateActive(XMLGregorianCalendar value) {
        this.startDateActive = value;
    }

    /**
     * Gets the value of the endDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateActive() {
        return endDateActive;
    }

    /**
     * Sets the value of the endDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateActive = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the createdByModule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedByModule() {
        return createdByModule;
    }

    /**
     * Sets the value of the createdByModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedByModule(JAXBElement<String> value) {
        this.createdByModule = ((JAXBElement<String> ) value);
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
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<Long> value) {
        this.requestId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the sourceSystemRefInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SourceSystemRefInformation }
     *     
     */
    public SourceSystemRefInformation getSourceSystemRefInformation() {
        return sourceSystemRefInformation;
    }

    /**
     * Sets the value of the sourceSystemRefInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSystemRefInformation }
     *     
     */
    public void setSourceSystemRefInformation(SourceSystemRefInformation value) {
        this.sourceSystemRefInformation = value;
    }

}

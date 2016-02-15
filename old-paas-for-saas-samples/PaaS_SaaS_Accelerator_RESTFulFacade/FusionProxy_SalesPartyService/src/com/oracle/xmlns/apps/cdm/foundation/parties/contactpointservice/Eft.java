
package com.oracle.xmlns.apps.cdm.foundation.parties.contactpointservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.OriginalSystemReference;


/**
 * <p>Java class for Eft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eft">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactPointType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPointPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryByPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EFTTransmissionProgramId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EFTPrintingProgramId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EFTUserNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EFTSWIFTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverallPrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContactPreference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}ContactPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eft", propOrder = {
    "contactPointId",
    "contactPointType",
    "status",
    "ownerTableName",
    "ownerTableId",
    "primaryFlag",
    "origSystemReference",
    "lastUpdateDate",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "lastUpdateLogin",
    "requestId",
    "objectVersionNumber",
    "createdByModule",
    "contactPointPurpose",
    "primaryByPurpose",
    "startDate",
    "endDate",
    "relationshipId",
    "partyUsageCode",
    "origSystem",
    "eftTransmissionProgramId",
    "eftPrintingProgramId",
    "eftUserNumber",
    "eftswiftCode",
    "overallPrimaryFlag",
    "contactPreference",
    "originalSystemReference"
})
public class Eft {

    @XmlElement(name = "ContactPointId")
    protected Long contactPointId;
    @XmlElement(name = "ContactPointType", defaultValue = "EFT")
    protected String contactPointType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "OwnerTableName")
    protected String ownerTableName;
    @XmlElement(name = "OwnerTableId")
    protected Long ownerTableId;
    @XmlElement(name = "PrimaryFlag")
    protected Boolean primaryFlag;
    @XmlElementRef(name = "OrigSystemReference", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> origSystemReference;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElementRef(name = "ContactPointPurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> contactPointPurpose;
    @XmlElementRef(name = "PrimaryByPurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryByPurpose;
    @XmlElement(name = "StartDate")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "RelationshipId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Long> relationshipId;
    @XmlElementRef(name = "PartyUsageCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> partyUsageCode;
    @XmlElementRef(name = "OrigSystem", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> origSystem;
    @XmlElementRef(name = "EFTTransmissionProgramId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Long> eftTransmissionProgramId;
    @XmlElementRef(name = "EFTPrintingProgramId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<Long> eftPrintingProgramId;
    @XmlElementRef(name = "EFTUserNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> eftUserNumber;
    @XmlElementRef(name = "EFTSWIFTCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/", type = JAXBElement.class)
    protected JAXBElement<String> eftswiftCode;
    @XmlElement(name = "OverallPrimaryFlag")
    protected Boolean overallPrimaryFlag;
    @XmlElement(name = "ContactPreference")
    protected List<ContactPreference> contactPreference;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;

    /**
     * Gets the value of the contactPointId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPointId() {
        return contactPointId;
    }

    /**
     * Sets the value of the contactPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPointId(Long value) {
        this.contactPointId = value;
    }

    /**
     * Gets the value of the contactPointType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPointType() {
        return contactPointType;
    }

    /**
     * Sets the value of the contactPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPointType(String value) {
        this.contactPointType = value;
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
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryFlag(Boolean value) {
        this.primaryFlag = value;
    }

    /**
     * Gets the value of the origSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigSystemReference() {
        return origSystemReference;
    }

    /**
     * Sets the value of the origSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigSystemReference(JAXBElement<String> value) {
        this.origSystemReference = ((JAXBElement<String> ) value);
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
     * Gets the value of the contactPointPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactPointPurpose() {
        return contactPointPurpose;
    }

    /**
     * Sets the value of the contactPointPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactPointPurpose(JAXBElement<String> value) {
        this.contactPointPurpose = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryByPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryByPurpose() {
        return primaryByPurpose;
    }

    /**
     * Sets the value of the primaryByPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryByPurpose(JAXBElement<String> value) {
        this.primaryByPurpose = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the relationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRelationshipId() {
        return relationshipId;
    }

    /**
     * Sets the value of the relationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRelationshipId(JAXBElement<Long> value) {
        this.relationshipId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partyUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUsageCode() {
        return partyUsageCode;
    }

    /**
     * Sets the value of the partyUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUsageCode(JAXBElement<String> value) {
        this.partyUsageCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the origSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigSystem() {
        return origSystem;
    }

    /**
     * Sets the value of the origSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigSystem(JAXBElement<String> value) {
        this.origSystem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eftTransmissionProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEFTTransmissionProgramId() {
        return eftTransmissionProgramId;
    }

    /**
     * Sets the value of the eftTransmissionProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEFTTransmissionProgramId(JAXBElement<Long> value) {
        this.eftTransmissionProgramId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the eftPrintingProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEFTPrintingProgramId() {
        return eftPrintingProgramId;
    }

    /**
     * Sets the value of the eftPrintingProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEFTPrintingProgramId(JAXBElement<Long> value) {
        this.eftPrintingProgramId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the eftUserNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEFTUserNumber() {
        return eftUserNumber;
    }

    /**
     * Sets the value of the eftUserNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEFTUserNumber(JAXBElement<String> value) {
        this.eftUserNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eftswiftCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEFTSWIFTCode() {
        return eftswiftCode;
    }

    /**
     * Sets the value of the eftswiftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEFTSWIFTCode(JAXBElement<String> value) {
        this.eftswiftCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the overallPrimaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverallPrimaryFlag() {
        return overallPrimaryFlag;
    }

    /**
     * Sets the value of the overallPrimaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverallPrimaryFlag(Boolean value) {
        this.overallPrimaryFlag = value;
    }

    /**
     * Gets the value of the contactPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPreference }
     * 
     * 
     */
    public List<ContactPreference> getContactPreference() {
        if (contactPreference == null) {
            contactPreference = new ArrayList<ContactPreference>();
        }
        return this.contactPreference;
    }

    /**
     * Gets the value of the originalSystemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalSystemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalSystemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalSystemReference }
     * 
     * 
     */
    public List<OriginalSystemReference> getOriginalSystemReference() {
        if (originalSystemReference == null) {
            originalSystemReference = new ArrayList<OriginalSystemReference>();
        }
        return this.originalSystemReference;
    }

}

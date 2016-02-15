
package com.oracle.ptsdemo.healthcare.wsclient.osc.salesparty.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountDirectorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CpdrfLastUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerPillar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CpdrfVerSor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastAssignedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamedAccountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SalesAccountPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExistingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExistingFlgLastUpdDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="AttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssgnExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttachmentEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrganizationParty" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}OrganizationParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesAccount" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesAccountResource" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonParty" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}Person" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupParty" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/}Group" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesParty", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", propOrder = {
    "accountDirectorId",
    "cpdrfLastUpd",
    "cpdrfVerPillar",
    "cpdrfVerSor",
    "createdBy",
    "creationDate",
    "lastAssignedDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "namedAccountFlag",
    "objectVersionNumber",
    "salesAccountPartyId",
    "existingFlag",
    "existingFlgLastUpdDate",
    "userLastUpdateDate",
    "attributeCategory",
    "partyId",
    "objectVersionNumber1",
    "partyName",
    "partyNumber",
    "partyType",
    "status",
    "assgnExceptionFlag",
    "attachmentEntityName",
    "partyUniqueName",
    "salesAccountId",
    "organizationParty",
    "salesAccount",
    "salesAccountResource",
    "personParty",
    "groupParty"
})
public class SalesParty {

    @XmlElement(name = "AccountDirectorId")
    protected Long accountDirectorId;
    @XmlElementRef(name = "CpdrfLastUpd", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> cpdrfLastUpd;
    @XmlElementRef(name = "CpdrfVerPillar", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Integer> cpdrfVerPillar;
    @XmlElementRef(name = "CpdrfVerSor", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Integer> cpdrfVerSor;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "LastAssignedDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastAssignedDate;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdateLogin")
    protected String lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "NamedAccountFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> namedAccountFlag;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "SalesAccountPartyId")
    protected Long salesAccountPartyId;
    @XmlElementRef(name = "ExistingFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> existingFlag;
    @XmlElementRef(name = "ExistingFlgLastUpdDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> existingFlgLastUpdDate;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "AttributeCategory", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> attributeCategory;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "ObjectVersionNumber1")
    protected Integer objectVersionNumber1;
    @XmlElementRef(name = "PartyName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "AssgnExceptionFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> assgnExceptionFlag;
    @XmlElementRef(name = "AttachmentEntityName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> attachmentEntityName;
    @XmlElementRef(name = "PartyUniqueName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyUniqueName;
    @XmlElement(name = "SalesAccountId")
    protected Long salesAccountId;
    @XmlElement(name = "OrganizationParty")
    protected List<OrganizationParty> organizationParty;
    @XmlElement(name = "SalesAccount")
    protected List<SalesAccount> salesAccount;
    @XmlElement(name = "SalesAccountResource")
    protected List<SalesAccountResource> salesAccountResource;
    @XmlElement(name = "PersonParty")
    protected List<Person> personParty;
    @XmlElement(name = "GroupParty")
    protected Group groupParty;

    /**
     * Gets the value of the accountDirectorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountDirectorId() {
        return accountDirectorId;
    }

    /**
     * Sets the value of the accountDirectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountDirectorId(Long value) {
        this.accountDirectorId = value;
    }

    /**
     * Gets the value of the cpdrfLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpdrfLastUpd() {
        return cpdrfLastUpd;
    }

    /**
     * Sets the value of the cpdrfLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpdrfLastUpd(JAXBElement<String> value) {
        this.cpdrfLastUpd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cpdrfVerPillar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerPillar() {
        return cpdrfVerPillar;
    }

    /**
     * Sets the value of the cpdrfVerPillar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerPillar(JAXBElement<Integer> value) {
        this.cpdrfVerPillar = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the cpdrfVerSor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerSor() {
        return cpdrfVerSor;
    }

    /**
     * Sets the value of the cpdrfVerSor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerSor(JAXBElement<Integer> value) {
        this.cpdrfVerSor = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the lastAssignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignedDate() {
        return lastAssignedDate;
    }

    /**
     * Sets the value of the lastAssignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignedDate = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     *     {@link String }
     *     
     */
    public String getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateLogin(String value) {
        this.lastUpdateLogin = value;
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
     * Gets the value of the namedAccountFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNamedAccountFlag() {
        return namedAccountFlag;
    }

    /**
     * Sets the value of the namedAccountFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNamedAccountFlag(JAXBElement<Boolean> value) {
        this.namedAccountFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the salesAccountPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesAccountPartyId() {
        return salesAccountPartyId;
    }

    /**
     * Sets the value of the salesAccountPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesAccountPartyId(Long value) {
        this.salesAccountPartyId = value;
    }

    /**
     * Gets the value of the existingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExistingFlag() {
        return existingFlag;
    }

    /**
     * Sets the value of the existingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExistingFlag(JAXBElement<Boolean> value) {
        this.existingFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the existingFlgLastUpdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExistingFlgLastUpdDate() {
        return existingFlgLastUpdDate;
    }

    /**
     * Sets the value of the existingFlgLastUpdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExistingFlgLastUpdDate(JAXBElement<XMLGregorianCalendar> value) {
        this.existingFlgLastUpdDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the userLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUserLastUpdateDate() {
        return userLastUpdateDate;
    }

    /**
     * Sets the value of the userLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUserLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.userLastUpdateDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the attributeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeCategory() {
        return attributeCategory;
    }

    /**
     * Sets the value of the attributeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeCategory(JAXBElement<String> value) {
        this.attributeCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the objectVersionNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber1() {
        return objectVersionNumber1;
    }

    /**
     * Sets the value of the objectVersionNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber1(Integer value) {
        this.objectVersionNumber1 = value;
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
     * Gets the value of the partyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNumber() {
        return partyNumber;
    }

    /**
     * Sets the value of the partyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNumber(String value) {
        this.partyNumber = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
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
     * Gets the value of the assgnExceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAssgnExceptionFlag() {
        return assgnExceptionFlag;
    }

    /**
     * Sets the value of the assgnExceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAssgnExceptionFlag(JAXBElement<Boolean> value) {
        this.assgnExceptionFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the attachmentEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachmentEntityName() {
        return attachmentEntityName;
    }

    /**
     * Sets the value of the attachmentEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachmentEntityName(JAXBElement<String> value) {
        this.attachmentEntityName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUniqueName() {
        return partyUniqueName;
    }

    /**
     * Sets the value of the partyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUniqueName(JAXBElement<String> value) {
        this.partyUniqueName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesAccountId() {
        return salesAccountId;
    }

    /**
     * Sets the value of the salesAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesAccountId(Long value) {
        this.salesAccountId = value;
    }

    /**
     * Gets the value of the organizationParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationParty }
     * 
     * 
     */
    public List<OrganizationParty> getOrganizationParty() {
        if (organizationParty == null) {
            organizationParty = new ArrayList<OrganizationParty>();
        }
        return this.organizationParty;
    }

    /**
     * Gets the value of the salesAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAccount }
     * 
     * 
     */
    public List<SalesAccount> getSalesAccount() {
        if (salesAccount == null) {
            salesAccount = new ArrayList<SalesAccount>();
        }
        return this.salesAccount;
    }

    /**
     * Gets the value of the salesAccountResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAccountResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAccountResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAccountResource }
     * 
     * 
     */
    public List<SalesAccountResource> getSalesAccountResource() {
        if (salesAccountResource == null) {
            salesAccountResource = new ArrayList<SalesAccountResource>();
        }
        return this.salesAccountResource;
    }

    /**
     * Gets the value of the personParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getPersonParty() {
        if (personParty == null) {
            personParty = new ArrayList<Person>();
        }
        return this.personParty;
    }

    /**
     * Gets the value of the groupParty property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroupParty() {
        return groupParty;
    }

    /**
     * Sets the value of the groupParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroupParty(Group value) {
        this.groupParty = value;
    }

}

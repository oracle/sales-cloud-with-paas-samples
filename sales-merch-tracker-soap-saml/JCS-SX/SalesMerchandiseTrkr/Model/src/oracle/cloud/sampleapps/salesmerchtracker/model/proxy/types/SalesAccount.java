
package oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types;

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
 * <p>Java class for SalesAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountDirectorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CpdrfLastUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerPillar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CpdrfVerSor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExistingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExistingFlgLastUpdDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastAssignedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamedAccountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="AttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssgnExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeAssignmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViewApplicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClassCategory1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SellToPartySiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDateActive" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SalesAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserSalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UpdateRating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InternalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountResource" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesAccountTerritory" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountTerritory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationD" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}OrganizationProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonD" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}PersonProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesAccountContactPoints" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountContactPoints" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesAccountContacts" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountContacts" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationParty" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}OrganizationParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonParty" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}Person" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/}Group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Asset" type="{http://xmlns.oracle.com/apps/crmCommon/assetImport/publicModel/assetImportService/}Asset" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesAccount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", propOrder = {
    "accountDirectorId",
    "cpdrfLastUpd",
    "cpdrfVerPillar",
    "cpdrfVerSor",
    "createdBy",
    "creationDate",
    "existingFlag",
    "existingFlgLastUpdDate",
    "lastAssignedDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "namedAccountFlag",
    "objectVersionNumber",
    "partyId",
    "userLastUpdateDate",
    "attributeCategory",
    "assgnExceptionFlag",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "partyUniqueName",
    "codeAssignmentId",
    "status",
    "meaning",
    "classCategory",
    "classCode",
    "viewApplicationId",
    "classCategory1",
    "partyUniqueName1",
    "status1",
    "partyType",
    "partyName",
    "partyNumber",
    "salesAccountId",
    "sellToPartySiteId",
    "startDateActive",
    "endDateActive",
    "salesAccountName",
    "salesAccountNameSuffix",
    "salesAccountUniqueName",
    "salesAccountStatus",
    "rating",
    "userSalesAccountId",
    "updateRating",
    "internalStatus",
    "primaryFlag",
    "deleteCustomerKey",
    "salesAccountType",
    "salesAccountResource",
    "salesAccountTerritory",
    "organizationD",
    "personD",
    "salesAccountContactPoints",
    "salesAccountContacts",
    "organizationParty",
    "personParty",
    "group",
    "asset"
})
public class SalesAccount {

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
    @XmlElementRef(name = "ExistingFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> existingFlag;
    @XmlElementRef(name = "ExistingFlgLastUpdDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> existingFlgLastUpdDate;
    @XmlElementRef(name = "LastAssignedDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastAssignedDate;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "NamedAccountFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> namedAccountFlag;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "AttributeCategory", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> attributeCategory;
    @XmlElementRef(name = "AssgnExceptionFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> assgnExceptionFlag;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "PartyUniqueName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyUniqueName;
    @XmlElementRef(name = "CodeAssignmentId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> codeAssignmentId;
    @XmlElementRef(name = "Status", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "Meaning", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> meaning;
    @XmlElementRef(name = "ClassCategory", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> classCategory;
    @XmlElementRef(name = "ClassCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> classCode;
    @XmlElementRef(name = "ViewApplicationId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> viewApplicationId;
    @XmlElementRef(name = "ClassCategory1", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> classCategory1;
    @XmlElementRef(name = "PartyUniqueName1", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyUniqueName1;
    @XmlElement(name = "Status1")
    protected String status1;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElementRef(name = "PartyName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElement(name = "SalesAccountId")
    protected Long salesAccountId;
    @XmlElementRef(name = "SellToPartySiteId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> sellToPartySiteId;
    @XmlElementRef(name = "StartDateActive", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDateActive;
    @XmlElementRef(name = "EndDateActive", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDateActive;
    @XmlElementRef(name = "SalesAccountName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAccountName;
    @XmlElementRef(name = "SalesAccountNameSuffix", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAccountNameSuffix;
    @XmlElementRef(name = "SalesAccountUniqueName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAccountUniqueName;
    @XmlElementRef(name = "SalesAccountStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAccountStatus;
    @XmlElementRef(name = "Rating", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Integer> rating;
    @XmlElementRef(name = "UserSalesAccountId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> userSalesAccountId;
    @XmlElementRef(name = "UpdateRating", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Integer> updateRating;
    @XmlElementRef(name = "InternalStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> internalStatus;
    @XmlElementRef(name = "PrimaryFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> primaryFlag;
    @XmlElementRef(name = "DeleteCustomerKey", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> deleteCustomerKey;
    @XmlElementRef(name = "SalesAccountType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAccountType;
    @XmlElement(name = "SalesAccountResource")
    protected List<SalesAccountResource> salesAccountResource;
    @XmlElement(name = "SalesAccountTerritory")
    protected List<SalesAccountTerritory> salesAccountTerritory;
    @XmlElement(name = "OrganizationD")
    protected List<OrganizationProfile> organizationD;
    @XmlElement(name = "PersonD")
    protected List<PersonProfile> personD;
    @XmlElement(name = "SalesAccountContactPoints")
    protected List<SalesAccountContactPoints> salesAccountContactPoints;
    @XmlElement(name = "SalesAccountContacts")
    protected List<SalesAccountContacts> salesAccountContacts;
    @XmlElement(name = "OrganizationParty")
    protected List<OrganizationParty> organizationParty;
    @XmlElement(name = "PersonParty")
    protected List<Person> personParty;
    @XmlElement(name = "Group")
    protected List<Group> group;
    @XmlElement(name = "Asset")
    protected List<Asset> asset;

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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the codeAssignmentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodeAssignmentId() {
        return codeAssignmentId;
    }

    /**
     * Sets the value of the codeAssignmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodeAssignmentId(JAXBElement<Long> value) {
        this.codeAssignmentId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the meaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeaning() {
        return meaning;
    }

    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeaning(JAXBElement<String> value) {
        this.meaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the classCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassCategory() {
        return classCategory;
    }

    /**
     * Sets the value of the classCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassCategory(JAXBElement<String> value) {
        this.classCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassCode(JAXBElement<String> value) {
        this.classCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the viewApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getViewApplicationId() {
        return viewApplicationId;
    }

    /**
     * Sets the value of the viewApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setViewApplicationId(JAXBElement<Long> value) {
        this.viewApplicationId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the classCategory1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassCategory1() {
        return classCategory1;
    }

    /**
     * Sets the value of the classCategory1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassCategory1(JAXBElement<String> value) {
        this.classCategory1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyUniqueName1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUniqueName1() {
        return partyUniqueName1;
    }

    /**
     * Sets the value of the partyUniqueName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUniqueName1(JAXBElement<String> value) {
        this.partyUniqueName1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus1() {
        return status1;
    }

    /**
     * Sets the value of the status1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus1(String value) {
        this.status1 = value;
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
     * Gets the value of the sellToPartySiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSellToPartySiteId() {
        return sellToPartySiteId;
    }

    /**
     * Sets the value of the sellToPartySiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSellToPartySiteId(JAXBElement<Long> value) {
        this.sellToPartySiteId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the startDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateActive() {
        return startDateActive;
    }

    /**
     * Sets the value of the startDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateActive(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateActive = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the salesAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountName() {
        return salesAccountName;
    }

    /**
     * Sets the value of the salesAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountName(JAXBElement<String> value) {
        this.salesAccountName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAccountNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountNameSuffix() {
        return salesAccountNameSuffix;
    }

    /**
     * Sets the value of the salesAccountNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountNameSuffix(JAXBElement<String> value) {
        this.salesAccountNameSuffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAccountUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountUniqueName() {
        return salesAccountUniqueName;
    }

    /**
     * Sets the value of the salesAccountUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountUniqueName(JAXBElement<String> value) {
        this.salesAccountUniqueName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountStatus() {
        return salesAccountStatus;
    }

    /**
     * Sets the value of the salesAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountStatus(JAXBElement<String> value) {
        this.salesAccountStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRating(JAXBElement<Integer> value) {
        this.rating = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the userSalesAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUserSalesAccountId() {
        return userSalesAccountId;
    }

    /**
     * Sets the value of the userSalesAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUserSalesAccountId(JAXBElement<Long> value) {
        this.userSalesAccountId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the updateRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUpdateRating() {
        return updateRating;
    }

    /**
     * Sets the value of the updateRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUpdateRating(JAXBElement<Integer> value) {
        this.updateRating = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the internalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalStatus() {
        return internalStatus;
    }

    /**
     * Sets the value of the internalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalStatus(JAXBElement<String> value) {
        this.internalStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrimaryFlag(JAXBElement<Boolean> value) {
        this.primaryFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the deleteCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeleteCustomerKey() {
        return deleteCustomerKey;
    }

    /**
     * Sets the value of the deleteCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeleteCustomerKey(JAXBElement<String> value) {
        this.deleteCustomerKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountType() {
        return salesAccountType;
    }

    /**
     * Sets the value of the salesAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountType(JAXBElement<String> value) {
        this.salesAccountType = ((JAXBElement<String> ) value);
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
     * Gets the value of the salesAccountTerritory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAccountTerritory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAccountTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAccountTerritory }
     * 
     * 
     */
    public List<SalesAccountTerritory> getSalesAccountTerritory() {
        if (salesAccountTerritory == null) {
            salesAccountTerritory = new ArrayList<SalesAccountTerritory>();
        }
        return this.salesAccountTerritory;
    }

    /**
     * Gets the value of the organizationD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationProfile }
     * 
     * 
     */
    public List<OrganizationProfile> getOrganizationD() {
        if (organizationD == null) {
            organizationD = new ArrayList<OrganizationProfile>();
        }
        return this.organizationD;
    }

    /**
     * Gets the value of the personD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonProfile }
     * 
     * 
     */
    public List<PersonProfile> getPersonD() {
        if (personD == null) {
            personD = new ArrayList<PersonProfile>();
        }
        return this.personD;
    }

    /**
     * Gets the value of the salesAccountContactPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAccountContactPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAccountContactPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAccountContactPoints }
     * 
     * 
     */
    public List<SalesAccountContactPoints> getSalesAccountContactPoints() {
        if (salesAccountContactPoints == null) {
            salesAccountContactPoints = new ArrayList<SalesAccountContactPoints>();
        }
        return this.salesAccountContactPoints;
    }

    /**
     * Gets the value of the salesAccountContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAccountContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAccountContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAccountContacts }
     * 
     * 
     */
    public List<SalesAccountContacts> getSalesAccountContacts() {
        if (salesAccountContacts == null) {
            salesAccountContacts = new ArrayList<SalesAccountContacts>();
        }
        return this.salesAccountContacts;
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
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

    /**
     * Gets the value of the asset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asset }
     * 
     * 
     */
    public List<Asset> getAsset() {
        if (asset == null) {
            asset = new ArrayList<Asset>();
        }
        return this.asset;
    }

}

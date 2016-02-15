
package com.oracle.pts.salesparty.wsclient.generated;

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
 * <p>Java class for OrganizationContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContactPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonPreNameAdjunct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonPreviousLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonAcademicTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLastNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonSecondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLanguageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCertReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionMakerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JobTitleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceUseFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartySiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartySiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAffinityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAffinityComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesBuyingRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesInfluenceLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContactFormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFormattedMultilineAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationContactRole" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/}OrganizationContactRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrgContactInformation" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/}OrganizationContactInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationContact", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", propOrder = {
    "orgContactId",
    "partyRelationshipId",
    "contactPartyId",
    "personFirstName",
    "personLastName",
    "contactName",
    "personPreNameAdjunct",
    "personMiddleName",
    "personNameSuffix",
    "personPreviousLastName",
    "personAcademicTitle",
    "salutation",
    "personLastNamePrefix",
    "preferredName",
    "personSecondLastName",
    "personLanguageName",
    "personTitle",
    "personCertificationLevel",
    "personCertReasonCode",
    "customerPartyId",
    "customerUniqueName",
    "customerName",
    "customerPartyNumber",
    "formattedPhoneNumber",
    "emailAddress",
    "webUrl",
    "comments",
    "contactNumber",
    "departmentCode",
    "department",
    "jobTitle",
    "decisionMakerFlag",
    "jobTitleCode",
    "referenceUseFlag",
    "rank",
    "lastUpdateDate",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "lastUpdateLogin",
    "requestId",
    "partySiteId",
    "origSystemReference",
    "createdByModule",
    "objectVersionNumber",
    "partySiteName",
    "salesAffinityCode",
    "salesAffinityComments",
    "salesBuyingRoleCode",
    "salesInfluenceLevelCode",
    "formattedAddress",
    "preferredContactMethod",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "preferredContactFlag",
    "contactFormattedAddress",
    "contactFormattedMultilineAddress",
    "customerEmailAddress",
    "organizationContactRole",
    "originalSystemReference",
    "orgContactInformation"
})
public class OrganizationContact {

    @XmlElement(name = "OrgContactId")
    protected Long orgContactId;
    @XmlElement(name = "PartyRelationshipId")
    protected Long partyRelationshipId;
    @XmlElement(name = "ContactPartyId")
    protected Long contactPartyId;
    @XmlElementRef(name = "PersonFirstName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personFirstName;
    @XmlElementRef(name = "PersonLastName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personLastName;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElementRef(name = "PersonPreNameAdjunct", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personPreNameAdjunct;
    @XmlElementRef(name = "PersonMiddleName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personMiddleName;
    @XmlElementRef(name = "PersonNameSuffix", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personNameSuffix;
    @XmlElementRef(name = "PersonPreviousLastName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personPreviousLastName;
    @XmlElementRef(name = "PersonAcademicTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personAcademicTitle;
    @XmlElementRef(name = "Salutation", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> salutation;
    @XmlElementRef(name = "PersonLastNamePrefix", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personLastNamePrefix;
    @XmlElementRef(name = "PreferredName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredName;
    @XmlElementRef(name = "PersonSecondLastName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personSecondLastName;
    @XmlElementRef(name = "PersonLanguageName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personLanguageName;
    @XmlElementRef(name = "PersonTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personTitle;
    @XmlElementRef(name = "PersonCertificationLevel", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personCertificationLevel;
    @XmlElementRef(name = "PersonCertReasonCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> personCertReasonCode;
    @XmlElement(name = "CustomerPartyId")
    protected Long customerPartyId;
    @XmlElement(name = "CustomerUniqueName")
    protected String customerUniqueName;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "CustomerPartyNumber")
    protected String customerPartyNumber;
    @XmlElementRef(name = "FormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedPhoneNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "WebUrl")
    protected String webUrl;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "ContactNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> contactNumber;
    @XmlElementRef(name = "DepartmentCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> departmentCode;
    @XmlElementRef(name = "Department", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "JobTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> jobTitle;
    @XmlElementRef(name = "DecisionMakerFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> decisionMakerFlag;
    @XmlElementRef(name = "JobTitleCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> jobTitleCode;
    @XmlElementRef(name = "ReferenceUseFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> referenceUseFlag;
    @XmlElementRef(name = "Rank", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> rank;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "PartySiteId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<Long> partySiteId;
    @XmlElement(name = "OrigSystemReference")
    protected String origSystemReference;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "PartySiteName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> partySiteName;
    @XmlElementRef(name = "SalesAffinityCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAffinityCode;
    @XmlElementRef(name = "SalesAffinityComments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAffinityComments;
    @XmlElementRef(name = "SalesBuyingRoleCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> salesBuyingRoleCode;
    @XmlElementRef(name = "SalesInfluenceLevelCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> salesInfluenceLevelCode;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "PreferredContactFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> preferredContactFlag;
    @XmlElementRef(name = "ContactFormattedAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> contactFormattedAddress;
    @XmlElementRef(name = "ContactFormattedMultilineAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> contactFormattedMultilineAddress;
    @XmlElementRef(name = "CustomerEmailAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/", type = JAXBElement.class)
    protected JAXBElement<String> customerEmailAddress;
    @XmlElement(name = "OrganizationContactRole")
    protected List<OrganizationContactRole> organizationContactRole;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;
    @XmlElement(name = "OrgContactInformation")
    protected OrganizationContactInformation orgContactInformation;

    /**
     * Gets the value of the orgContactId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgContactId() {
        return orgContactId;
    }

    /**
     * Sets the value of the orgContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgContactId(Long value) {
        this.orgContactId = value;
    }

    /**
     * Gets the value of the partyRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyRelationshipId() {
        return partyRelationshipId;
    }

    /**
     * Sets the value of the partyRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyRelationshipId(Long value) {
        this.partyRelationshipId = value;
    }

    /**
     * Gets the value of the contactPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPartyId() {
        return contactPartyId;
    }

    /**
     * Sets the value of the contactPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPartyId(Long value) {
        this.contactPartyId = value;
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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the personPreNameAdjunct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonPreNameAdjunct() {
        return personPreNameAdjunct;
    }

    /**
     * Sets the value of the personPreNameAdjunct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonPreNameAdjunct(JAXBElement<String> value) {
        this.personPreNameAdjunct = ((JAXBElement<String> ) value);
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
     * Gets the value of the personNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonNameSuffix() {
        return personNameSuffix;
    }

    /**
     * Sets the value of the personNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonNameSuffix(JAXBElement<String> value) {
        this.personNameSuffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personPreviousLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonPreviousLastName() {
        return personPreviousLastName;
    }

    /**
     * Sets the value of the personPreviousLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonPreviousLastName(JAXBElement<String> value) {
        this.personPreviousLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personAcademicTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonAcademicTitle() {
        return personAcademicTitle;
    }

    /**
     * Sets the value of the personAcademicTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonAcademicTitle(JAXBElement<String> value) {
        this.personAcademicTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalutation(JAXBElement<String> value) {
        this.salutation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personLastNamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonLastNamePrefix() {
        return personLastNamePrefix;
    }

    /**
     * Sets the value of the personLastNamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonLastNamePrefix(JAXBElement<String> value) {
        this.personLastNamePrefix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferredName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredName() {
        return preferredName;
    }

    /**
     * Sets the value of the preferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredName(JAXBElement<String> value) {
        this.preferredName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personSecondLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonSecondLastName() {
        return personSecondLastName;
    }

    /**
     * Sets the value of the personSecondLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonSecondLastName(JAXBElement<String> value) {
        this.personSecondLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personLanguageName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonLanguageName() {
        return personLanguageName;
    }

    /**
     * Sets the value of the personLanguageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonLanguageName(JAXBElement<String> value) {
        this.personLanguageName = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the personCertificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonCertificationLevel() {
        return personCertificationLevel;
    }

    /**
     * Sets the value of the personCertificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonCertificationLevel(JAXBElement<String> value) {
        this.personCertificationLevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personCertReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonCertReasonCode() {
        return personCertReasonCode;
    }

    /**
     * Sets the value of the personCertReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonCertReasonCode(JAXBElement<String> value) {
        this.personCertReasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerPartyId() {
        return customerPartyId;
    }

    /**
     * Sets the value of the customerPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerPartyId(Long value) {
        this.customerPartyId = value;
    }

    /**
     * Gets the value of the customerUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUniqueName() {
        return customerUniqueName;
    }

    /**
     * Sets the value of the customerUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUniqueName(String value) {
        this.customerUniqueName = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPartyNumber() {
        return customerPartyNumber;
    }

    /**
     * Sets the value of the customerPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPartyNumber(String value) {
        this.customerPartyNumber = value;
    }

    /**
     * Gets the value of the formattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }

    /**
     * Sets the value of the formattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedPhoneNumber(JAXBElement<String> value) {
        this.formattedPhoneNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactNumber(JAXBElement<String> value) {
        this.contactNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentCode(JAXBElement<String> value) {
        this.departmentCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobTitle(JAXBElement<String> value) {
        this.jobTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the decisionMakerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDecisionMakerFlag() {
        return decisionMakerFlag;
    }

    /**
     * Sets the value of the decisionMakerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDecisionMakerFlag(JAXBElement<Boolean> value) {
        this.decisionMakerFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the jobTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobTitleCode() {
        return jobTitleCode;
    }

    /**
     * Sets the value of the jobTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobTitleCode(JAXBElement<String> value) {
        this.jobTitleCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the referenceUseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReferenceUseFlag() {
        return referenceUseFlag;
    }

    /**
     * Sets the value of the referenceUseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReferenceUseFlag(JAXBElement<Boolean> value) {
        this.referenceUseFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRank(JAXBElement<String> value) {
        this.rank = ((JAXBElement<String> ) value);
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
     * Gets the value of the partySiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartySiteId() {
        return partySiteId;
    }

    /**
     * Sets the value of the partySiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartySiteId(JAXBElement<Long> value) {
        this.partySiteId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the partySiteName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartySiteName() {
        return partySiteName;
    }

    /**
     * Sets the value of the partySiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartySiteName(JAXBElement<String> value) {
        this.partySiteName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAffinityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAffinityCode() {
        return salesAffinityCode;
    }

    /**
     * Sets the value of the salesAffinityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAffinityCode(JAXBElement<String> value) {
        this.salesAffinityCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAffinityComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAffinityComments() {
        return salesAffinityComments;
    }

    /**
     * Sets the value of the salesAffinityComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAffinityComments(JAXBElement<String> value) {
        this.salesAffinityComments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesBuyingRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesBuyingRoleCode() {
        return salesBuyingRoleCode;
    }

    /**
     * Sets the value of the salesBuyingRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesBuyingRoleCode(JAXBElement<String> value) {
        this.salesBuyingRoleCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesInfluenceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesInfluenceLevelCode() {
        return salesInfluenceLevelCode;
    }

    /**
     * Sets the value of the salesInfluenceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesInfluenceLevelCode(JAXBElement<String> value) {
        this.salesInfluenceLevelCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedAddress(JAXBElement<String> value) {
        this.formattedAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferredContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactMethod(JAXBElement<String> value) {
        this.preferredContactMethod = ((JAXBElement<String> ) value);
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
     * Gets the value of the preferredContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferredContactFlag() {
        return preferredContactFlag;
    }

    /**
     * Sets the value of the preferredContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferredContactFlag(JAXBElement<Boolean> value) {
        this.preferredContactFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the contactFormattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactFormattedAddress() {
        return contactFormattedAddress;
    }

    /**
     * Sets the value of the contactFormattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactFormattedAddress(JAXBElement<String> value) {
        this.contactFormattedAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactFormattedMultilineAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactFormattedMultilineAddress() {
        return contactFormattedMultilineAddress;
    }

    /**
     * Sets the value of the contactFormattedMultilineAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactFormattedMultilineAddress(JAXBElement<String> value) {
        this.contactFormattedMultilineAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    /**
     * Sets the value of the customerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerEmailAddress(JAXBElement<String> value) {
        this.customerEmailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organizationContactRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationContactRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationContactRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationContactRole }
     * 
     * 
     */
    public List<OrganizationContactRole> getOrganizationContactRole() {
        if (organizationContactRole == null) {
            organizationContactRole = new ArrayList<OrganizationContactRole>();
        }
        return this.organizationContactRole;
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

    /**
     * Gets the value of the orgContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationContactInformation }
     *     
     */
    public OrganizationContactInformation getOrgContactInformation() {
        return orgContactInformation;
    }

    /**
     * Sets the value of the orgContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationContactInformation }
     *     
     */
    public void setOrgContactInformation(OrganizationContactInformation value) {
        this.orgContactInformation = value;
    }

}

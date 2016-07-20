
package com.oracle.pts.salesparty.wsclient.generated;

import java.math.BigDecimal;
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
 * <p>Java class for OrganizationParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HQBranchIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumberC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JgzzFiscalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnalysisFy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearendMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentFiscalYearPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="NextFyPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="GSAIndicatorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MissionStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhonePurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneContactPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneLineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdenAddrLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryURLContactPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryEmailContactPointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IdenAddrPartySiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonSecondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredNameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TradingPartnerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CeoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalOrganizationName" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}AdditionalOrganizationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalPartyId" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}AdditionalPartyId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Certification" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}Certification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodeAssignment" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}CodeAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPreference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}ContactPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditRating" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}CreditRating" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Edi" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Edi" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Eft" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Eft" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmailDomain" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}EmailDomain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialProfile" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}FinancialProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialReport" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}FinancialReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstantMessaging" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}InstantMessaging" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationProfile" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}OrganizationProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyPreference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartyPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartySite" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartySite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyUsageAssignment" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartyUsageAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telex" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Telex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Web" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Web" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relationship" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/relationshipService/}Relationship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationParty", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", propOrder = {
    "partyNumber",
    "partyId",
    "partyType",
    "partyName",
    "lastUpdatedBy",
    "validatedFlag",
    "lastUpdateLogin",
    "creationDate",
    "requestId",
    "lastUpdateDate",
    "createdBy",
    "origSystemReference",
    "hqBranchIndicator",
    "dunsNumberC",
    "sicCode",
    "jgzzFiscalCode",
    "address1",
    "country",
    "address3",
    "groupType",
    "address2",
    "address4",
    "status",
    "city",
    "postalCode",
    "county",
    "yearEstablished",
    "province",
    "state",
    "url",
    "analysisFy",
    "sicCodeType",
    "emailAddress",
    "fiscalYearendMonth",
    "employeesTotal",
    "currentFiscalYearPotentialRevenueAmount",
    "nextFyPotentialRevenueAmount",
    "gsaIndicatorFlag",
    "categoryCode",
    "languageName",
    "missionStatement",
    "thirdPartyFlag",
    "homeCountry",
    "createdByModule",
    "objectVersionNumber",
    "certificationLevel",
    "certReasonCode",
    "primaryPhonePurpose",
    "primaryPhoneContactPointId",
    "primaryPhoneLineType",
    "primaryPhoneCountryCode",
    "primaryPhoneAreaCode",
    "primaryPhoneNumber",
    "preferredContactMethod",
    "primaryPhoneExtension",
    "idenAddrLocationId",
    "primaryURLContactPointId",
    "primaryEmailContactPointId",
    "idenAddrPartySiteId",
    "preferredName",
    "personSecondLastName",
    "preferredNameId",
    "tradingPartnerIdentifier",
    "preferredContactPersonId",
    "preferredFunctionalCurrency",
    "internalFlag",
    "comments",
    "ceoName",
    "principalName",
    "organizationSize",
    "partyUniqueName",
    "additionalOrganizationName",
    "additionalPartyId",
    "certification",
    "codeAssignment",
    "contactPreference",
    "creditRating",
    "edi",
    "eft",
    "emailDomain",
    "email",
    "financialProfile",
    "financialReport",
    "instantMessaging",
    "organizationProfile",
    "originalSystemReference",
    "partyPreference",
    "partySite",
    "partyUsageAssignment",
    "phone",
    "telex",
    "web",
    "relationship"
})
public class OrganizationParty {

    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "PartyType", defaultValue = "ORGANIZATION")
    protected String partyType;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "ValidatedFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> validatedFlag;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "OrigSystemReference")
    protected String origSystemReference;
    @XmlElementRef(name = "HQBranchIndicator", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> hqBranchIndicator;
    @XmlElementRef(name = "DUNSNumberC", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> dunsNumberC;
    @XmlElementRef(name = "SICCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> sicCode;
    @XmlElementRef(name = "JgzzFiscalCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> jgzzFiscalCode;
    @XmlElementRef(name = "Address1", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> address1;
    @XmlElementRef(name = "Country", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "Address3", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> address3;
    @XmlElementRef(name = "GroupType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> groupType;
    @XmlElementRef(name = "Address2", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> address2;
    @XmlElementRef(name = "Address4", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> address4;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "City", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "PostalCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "County", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "YearEstablished", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Integer> yearEstablished;
    @XmlElementRef(name = "Province", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> province;
    @XmlElementRef(name = "State", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "URL", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "AnalysisFy", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> analysisFy;
    @XmlElementRef(name = "SICCodeType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> sicCodeType;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "FiscalYearendMonth", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> fiscalYearendMonth;
    @XmlElementRef(name = "EmployeesTotal", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> employeesTotal;
    @XmlElementRef(name = "CurrentFiscalYearPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> currentFiscalYearPotentialRevenueAmount;
    @XmlElementRef(name = "NextFyPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> nextFyPotentialRevenueAmount;
    @XmlElementRef(name = "GSAIndicatorFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> gsaIndicatorFlag;
    @XmlElementRef(name = "CategoryCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> categoryCode;
    @XmlElementRef(name = "LanguageName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> languageName;
    @XmlElementRef(name = "MissionStatement", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> missionStatement;
    @XmlElementRef(name = "ThirdPartyFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> thirdPartyFlag;
    @XmlElementRef(name = "HomeCountry", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> homeCountry;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "CertificationLevel", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> certificationLevel;
    @XmlElementRef(name = "CertReasonCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> certReasonCode;
    @XmlElementRef(name = "PrimaryPhonePurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhonePurpose;
    @XmlElementRef(name = "PrimaryPhoneContactPointId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryPhoneContactPointId;
    @XmlElementRef(name = "PrimaryPhoneLineType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneLineType;
    @XmlElementRef(name = "PrimaryPhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneCountryCode;
    @XmlElementRef(name = "PrimaryPhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneAreaCode;
    @XmlElementRef(name = "PrimaryPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneNumber;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "PrimaryPhoneExtension", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneExtension;
    @XmlElementRef(name = "IdenAddrLocationId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> idenAddrLocationId;
    @XmlElementRef(name = "PrimaryURLContactPointId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryURLContactPointId;
    @XmlElementRef(name = "PrimaryEmailContactPointId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryEmailContactPointId;
    @XmlElementRef(name = "IdenAddrPartySiteId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> idenAddrPartySiteId;
    @XmlElementRef(name = "PreferredName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredName;
    @XmlElementRef(name = "PersonSecondLastName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> personSecondLastName;
    @XmlElementRef(name = "PreferredNameId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> preferredNameId;
    @XmlElementRef(name = "TradingPartnerIdentifier", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> tradingPartnerIdentifier;
    @XmlElementRef(name = "PreferredContactPersonId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Long> preferredContactPersonId;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "InternalFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> internalFlag;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "CeoName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> ceoName;
    @XmlElementRef(name = "PrincipalName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> principalName;
    @XmlElementRef(name = "OrganizationSize", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class)
    protected JAXBElement<String> organizationSize;
    @XmlElement(name = "PartyUniqueName")
    protected String partyUniqueName;
    @XmlElement(name = "AdditionalOrganizationName")
    protected List<AdditionalOrganizationName> additionalOrganizationName;
    @XmlElement(name = "AdditionalPartyId")
    protected List<AdditionalPartyId> additionalPartyId;
    @XmlElement(name = "Certification")
    protected List<Certification> certification;
    @XmlElement(name = "CodeAssignment")
    protected List<CodeAssignment> codeAssignment;
    @XmlElement(name = "ContactPreference")
    protected List<ContactPreference> contactPreference;
    @XmlElement(name = "CreditRating")
    protected List<CreditRating> creditRating;
    @XmlElement(name = "Edi")
    protected List<Edi> edi;
    @XmlElement(name = "Eft")
    protected List<Eft> eft;
    @XmlElement(name = "EmailDomain")
    protected List<EmailDomain> emailDomain;
    @XmlElement(name = "Email")
    protected List<Email> email;
    @XmlElement(name = "FinancialProfile")
    protected List<FinancialProfile> financialProfile;
    @XmlElement(name = "FinancialReport")
    protected List<FinancialReport> financialReport;
    @XmlElement(name = "InstantMessaging")
    protected List<InstantMessaging> instantMessaging;
    @XmlElement(name = "OrganizationProfile")
    protected List<OrganizationProfile> organizationProfile;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;
    @XmlElement(name = "PartyPreference")
    protected List<PartyPreference> partyPreference;
    @XmlElement(name = "PartySite")
    protected List<PartySite> partySite;
    @XmlElement(name = "PartyUsageAssignment")
    protected List<PartyUsageAssignment> partyUsageAssignment;
    @XmlElement(name = "Phone")
    protected List<Phone> phone;
    @XmlElement(name = "Telex")
    protected List<Telex> telex;
    @XmlElement(name = "Web")
    protected List<Web> web;
    @XmlElement(name = "Relationship")
    protected List<Relationship> relationship;

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
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
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
     * Gets the value of the validatedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getValidatedFlag() {
        return validatedFlag;
    }

    /**
     * Sets the value of the validatedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setValidatedFlag(JAXBElement<Boolean> value) {
        this.validatedFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the hqBranchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHQBranchIndicator() {
        return hqBranchIndicator;
    }

    /**
     * Sets the value of the hqBranchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHQBranchIndicator(JAXBElement<String> value) {
        this.hqBranchIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dunsNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumberC() {
        return dunsNumberC;
    }

    /**
     * Sets the value of the dunsNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumberC(JAXBElement<String> value) {
        this.dunsNumberC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sicCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSICCode() {
        return sicCode;
    }

    /**
     * Sets the value of the sicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSICCode(JAXBElement<String> value) {
        this.sicCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jgzzFiscalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJgzzFiscalCode() {
        return jgzzFiscalCode;
    }

    /**
     * Sets the value of the jgzzFiscalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJgzzFiscalCode(JAXBElement<String> value) {
        this.jgzzFiscalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress1(JAXBElement<String> value) {
        this.address1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress3(JAXBElement<String> value) {
        this.address3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupType(JAXBElement<String> value) {
        this.groupType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress2(JAXBElement<String> value) {
        this.address2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress4(JAXBElement<String> value) {
        this.address4 = ((JAXBElement<String> ) value);
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
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the yearEstablished property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYearEstablished() {
        return yearEstablished;
    }

    /**
     * Sets the value of the yearEstablished property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYearEstablished(JAXBElement<Integer> value) {
        this.yearEstablished = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvince(JAXBElement<String> value) {
        this.province = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the analysisFy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnalysisFy() {
        return analysisFy;
    }

    /**
     * Sets the value of the analysisFy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnalysisFy(JAXBElement<String> value) {
        this.analysisFy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sicCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSICCodeType() {
        return sicCodeType;
    }

    /**
     * Sets the value of the sicCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSICCodeType(JAXBElement<String> value) {
        this.sicCodeType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalYearendMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalYearendMonth() {
        return fiscalYearendMonth;
    }

    /**
     * Sets the value of the fiscalYearendMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalYearendMonth(JAXBElement<String> value) {
        this.fiscalYearendMonth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employeesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEmployeesTotal() {
        return employeesTotal;
    }

    /**
     * Sets the value of the employeesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEmployeesTotal(JAXBElement<BigDecimal> value) {
        this.employeesTotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the currentFiscalYearPotentialRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCurrentFiscalYearPotentialRevenueAmount() {
        return currentFiscalYearPotentialRevenueAmount;
    }

    /**
     * Sets the value of the currentFiscalYearPotentialRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCurrentFiscalYearPotentialRevenueAmount(JAXBElement<AmountType> value) {
        this.currentFiscalYearPotentialRevenueAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the nextFyPotentialRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getNextFyPotentialRevenueAmount() {
        return nextFyPotentialRevenueAmount;
    }

    /**
     * Sets the value of the nextFyPotentialRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setNextFyPotentialRevenueAmount(JAXBElement<AmountType> value) {
        this.nextFyPotentialRevenueAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the gsaIndicatorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGSAIndicatorFlag() {
        return gsaIndicatorFlag;
    }

    /**
     * Sets the value of the gsaIndicatorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGSAIndicatorFlag(JAXBElement<Boolean> value) {
        this.gsaIndicatorFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryCode(JAXBElement<String> value) {
        this.categoryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the languageName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguageName(JAXBElement<String> value) {
        this.languageName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the missionStatement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMissionStatement() {
        return missionStatement;
    }

    /**
     * Sets the value of the missionStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMissionStatement(JAXBElement<String> value) {
        this.missionStatement = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the thirdPartyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getThirdPartyFlag() {
        return thirdPartyFlag;
    }

    /**
     * Sets the value of the thirdPartyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setThirdPartyFlag(JAXBElement<Boolean> value) {
        this.thirdPartyFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the homeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomeCountry() {
        return homeCountry;
    }

    /**
     * Sets the value of the homeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomeCountry(JAXBElement<String> value) {
        this.homeCountry = ((JAXBElement<String> ) value);
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
     * Gets the value of the certificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificationLevel() {
        return certificationLevel;
    }

    /**
     * Sets the value of the certificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificationLevel(JAXBElement<String> value) {
        this.certificationLevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the certReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertReasonCode() {
        return certReasonCode;
    }

    /**
     * Sets the value of the certReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertReasonCode(JAXBElement<String> value) {
        this.certReasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPhonePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhonePurpose() {
        return primaryPhonePurpose;
    }

    /**
     * Sets the value of the primaryPhonePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhonePurpose(JAXBElement<String> value) {
        this.primaryPhonePurpose = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPhoneContactPointId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryPhoneContactPointId() {
        return primaryPhoneContactPointId;
    }

    /**
     * Sets the value of the primaryPhoneContactPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryPhoneContactPointId(JAXBElement<Long> value) {
        this.primaryPhoneContactPointId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryPhoneLineType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneLineType() {
        return primaryPhoneLineType;
    }

    /**
     * Sets the value of the primaryPhoneLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneLineType(JAXBElement<String> value) {
        this.primaryPhoneLineType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPhoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneCountryCode() {
        return primaryPhoneCountryCode;
    }

    /**
     * Sets the value of the primaryPhoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneCountryCode(JAXBElement<String> value) {
        this.primaryPhoneCountryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPhoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneAreaCode() {
        return primaryPhoneAreaCode;
    }

    /**
     * Sets the value of the primaryPhoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneAreaCode(JAXBElement<String> value) {
        this.primaryPhoneAreaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * Sets the value of the primaryPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneNumber(JAXBElement<String> value) {
        this.primaryPhoneNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the primaryPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneExtension() {
        return primaryPhoneExtension;
    }

    /**
     * Sets the value of the primaryPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneExtension(JAXBElement<String> value) {
        this.primaryPhoneExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idenAddrLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdenAddrLocationId() {
        return idenAddrLocationId;
    }

    /**
     * Sets the value of the idenAddrLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdenAddrLocationId(JAXBElement<Long> value) {
        this.idenAddrLocationId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryURLContactPointId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryURLContactPointId() {
        return primaryURLContactPointId;
    }

    /**
     * Sets the value of the primaryURLContactPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryURLContactPointId(JAXBElement<Long> value) {
        this.primaryURLContactPointId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryEmailContactPointId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryEmailContactPointId() {
        return primaryEmailContactPointId;
    }

    /**
     * Sets the value of the primaryEmailContactPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryEmailContactPointId(JAXBElement<Long> value) {
        this.primaryEmailContactPointId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the idenAddrPartySiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdenAddrPartySiteId() {
        return idenAddrPartySiteId;
    }

    /**
     * Sets the value of the idenAddrPartySiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdenAddrPartySiteId(JAXBElement<Long> value) {
        this.idenAddrPartySiteId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the preferredNameId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPreferredNameId() {
        return preferredNameId;
    }

    /**
     * Sets the value of the preferredNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPreferredNameId(JAXBElement<Long> value) {
        this.preferredNameId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the tradingPartnerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradingPartnerIdentifier() {
        return tradingPartnerIdentifier;
    }

    /**
     * Sets the value of the tradingPartnerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradingPartnerIdentifier(JAXBElement<String> value) {
        this.tradingPartnerIdentifier = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferredContactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPreferredContactPersonId() {
        return preferredContactPersonId;
    }

    /**
     * Sets the value of the preferredContactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPreferredContactPersonId(JAXBElement<Long> value) {
        this.preferredContactPersonId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the preferredFunctionalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredFunctionalCurrency() {
        return preferredFunctionalCurrency;
    }

    /**
     * Sets the value of the preferredFunctionalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredFunctionalCurrency(JAXBElement<String> value) {
        this.preferredFunctionalCurrency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInternalFlag() {
        return internalFlag;
    }

    /**
     * Sets the value of the internalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInternalFlag(JAXBElement<Boolean> value) {
        this.internalFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the ceoName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCeoName() {
        return ceoName;
    }

    /**
     * Sets the value of the ceoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCeoName(JAXBElement<String> value) {
        this.ceoName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalName(JAXBElement<String> value) {
        this.principalName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organizationSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationSize() {
        return organizationSize;
    }

    /**
     * Sets the value of the organizationSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationSize(JAXBElement<String> value) {
        this.organizationSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUniqueName() {
        return partyUniqueName;
    }

    /**
     * Sets the value of the partyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUniqueName(String value) {
        this.partyUniqueName = value;
    }

    /**
     * Gets the value of the additionalOrganizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalOrganizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalOrganizationName }
     * 
     * 
     */
    public List<AdditionalOrganizationName> getAdditionalOrganizationName() {
        if (additionalOrganizationName == null) {
            additionalOrganizationName = new ArrayList<AdditionalOrganizationName>();
        }
        return this.additionalOrganizationName;
    }

    /**
     * Gets the value of the additionalPartyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPartyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPartyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalPartyId }
     * 
     * 
     */
    public List<AdditionalPartyId> getAdditionalPartyId() {
        if (additionalPartyId == null) {
            additionalPartyId = new ArrayList<AdditionalPartyId>();
        }
        return this.additionalPartyId;
    }

    /**
     * Gets the value of the certification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Certification }
     * 
     * 
     */
    public List<Certification> getCertification() {
        if (certification == null) {
            certification = new ArrayList<Certification>();
        }
        return this.certification;
    }

    /**
     * Gets the value of the codeAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeAssignment }
     * 
     * 
     */
    public List<CodeAssignment> getCodeAssignment() {
        if (codeAssignment == null) {
            codeAssignment = new ArrayList<CodeAssignment>();
        }
        return this.codeAssignment;
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
     * Gets the value of the creditRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditRating }
     * 
     * 
     */
    public List<CreditRating> getCreditRating() {
        if (creditRating == null) {
            creditRating = new ArrayList<CreditRating>();
        }
        return this.creditRating;
    }

    /**
     * Gets the value of the edi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Edi }
     * 
     * 
     */
    public List<Edi> getEdi() {
        if (edi == null) {
            edi = new ArrayList<Edi>();
        }
        return this.edi;
    }

    /**
     * Gets the value of the eft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Eft }
     * 
     * 
     */
    public List<Eft> getEft() {
        if (eft == null) {
            eft = new ArrayList<Eft>();
        }
        return this.eft;
    }

    /**
     * Gets the value of the emailDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailDomain }
     * 
     * 
     */
    public List<EmailDomain> getEmailDomain() {
        if (emailDomain == null) {
            emailDomain = new ArrayList<EmailDomain>();
        }
        return this.emailDomain;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the financialProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialProfile }
     * 
     * 
     */
    public List<FinancialProfile> getFinancialProfile() {
        if (financialProfile == null) {
            financialProfile = new ArrayList<FinancialProfile>();
        }
        return this.financialProfile;
    }

    /**
     * Gets the value of the financialReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialReport }
     * 
     * 
     */
    public List<FinancialReport> getFinancialReport() {
        if (financialReport == null) {
            financialReport = new ArrayList<FinancialReport>();
        }
        return this.financialReport;
    }

    /**
     * Gets the value of the instantMessaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantMessaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantMessaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstantMessaging }
     * 
     * 
     */
    public List<InstantMessaging> getInstantMessaging() {
        if (instantMessaging == null) {
            instantMessaging = new ArrayList<InstantMessaging>();
        }
        return this.instantMessaging;
    }

    /**
     * Gets the value of the organizationProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationProfile }
     * 
     * 
     */
    public List<OrganizationProfile> getOrganizationProfile() {
        if (organizationProfile == null) {
            organizationProfile = new ArrayList<OrganizationProfile>();
        }
        return this.organizationProfile;
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
     * Gets the value of the partyPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyPreference }
     * 
     * 
     */
    public List<PartyPreference> getPartyPreference() {
        if (partyPreference == null) {
            partyPreference = new ArrayList<PartyPreference>();
        }
        return this.partyPreference;
    }

    /**
     * Gets the value of the partySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartySite }
     * 
     * 
     */
    public List<PartySite> getPartySite() {
        if (partySite == null) {
            partySite = new ArrayList<PartySite>();
        }
        return this.partySite;
    }

    /**
     * Gets the value of the partyUsageAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyUsageAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyUsageAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyUsageAssignment }
     * 
     * 
     */
    public List<PartyUsageAssignment> getPartyUsageAssignment() {
        if (partyUsageAssignment == null) {
            partyUsageAssignment = new ArrayList<PartyUsageAssignment>();
        }
        return this.partyUsageAssignment;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<Phone>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the telex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telex }
     * 
     * 
     */
    public List<Telex> getTelex() {
        if (telex == null) {
            telex = new ArrayList<Telex>();
        }
        return this.telex;
    }

    /**
     * Gets the value of the web property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the web property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Web }
     * 
     * 
     */
    public List<Web> getWeb() {
        if (web == null) {
            web = new ArrayList<Web>();
        }
        return this.web;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Relationship }
     * 
     * 
     */
    public List<Relationship> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<Relationship>();
        }
        return this.relationship;
    }

}

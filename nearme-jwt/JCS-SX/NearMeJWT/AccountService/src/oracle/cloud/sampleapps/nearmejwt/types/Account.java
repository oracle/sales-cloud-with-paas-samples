/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */

package oracle.cloud.sampleapps.nearmejwt.types;

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
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactSourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistingCustomerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExistingCustomerFlagLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NamedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastAssignmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastAssignmentDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="AssignmentExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesProfileStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ParentAccountPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAccountSourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ControlYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="YearIncorporated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StockSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearendMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentFiscalYearPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnalysisFiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextFiscalYearPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPaymentAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxpayerIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSCreditRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomesticUltimateDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateDUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEOTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicPrivateOwnershipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmallBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WomanOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneralServicesAdministrationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinorityOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorityOwnedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RentOrOwnIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LaborSurplusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HQBranchIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentOrSubsidiaryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisadvantageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressEstimation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressMinimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesEstimatedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesMinimumIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MissionStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporationClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrowthStrategyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongressionalDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotConfuseWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalActivityCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalBusinessIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalBusinessIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiebelLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessReport" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCloudStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastEnrichmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PartyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/}PrimaryAddress" minOccurs="0"/>
 *         &lt;element name="SalesTeamMember" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/}SalesTeamMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_CreditHealthScore_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_TimeWSTest_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_TestWS_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationDEO_CreditHealthScoreText_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", propOrder = {
    "partyId",
    "partyNumber",
    "sourceSystem",
    "sourceSystemReferenceValue",
    "organizationName",
    "uniqueNameSuffix",
    "partyUniqueName",
    "type",
    "ownerPartyId",
    "ownerPartyNumber",
    "ownerEmailAddress",
    "ownerName",
    "primaryContactPartyId",
    "primaryContactPartyNumber",
    "primaryContactSourceSystem",
    "primaryContactSourceSystemReferenceValue",
    "primaryContactName",
    "primaryContactEmail",
    "primaryContactPhone",
    "existingCustomerFlag",
    "existingCustomerFlagLastUpdateDate",
    "namedFlag",
    "lastAssignmentDate",
    "lastAssignmentDateTime",
    "assignmentExceptionFlag",
    "salesProfileStatus",
    "industryCodeType",
    "industryCode",
    "parentAccountPartyId",
    "parentAccountPartyNumber",
    "parentAccountSourceSystem",
    "parentAccountSourceSystemReferenceValue",
    "yearEstablished",
    "controlYear",
    "yearIncorporated",
    "stockSymbol",
    "fiscalYearendMonth",
    "currentFiscalYearPotentialRevenueAmount",
    "preferredFunctionalCurrency",
    "analysisFiscalYear",
    "nextFiscalYearPotentialRevenueAmount",
    "totalPaymentAmount",
    "taxpayerIdentificationNumber",
    "certificationLevel",
    "certificationReasonCode",
    "dunsNumber",
    "dunsCreditRating",
    "parentDUNSNumber",
    "domesticUltimateDUNSNumber",
    "globalUltimateDUNSNumber",
    "ceoName",
    "ceoTitle",
    "publicPrivateOwnershipFlag",
    "importIndicator",
    "exportIndicator",
    "smallBusinessIndicator",
    "womanOwnedIndicator",
    "generalServicesAdministrationFlag",
    "minorityOwnedIndicator",
    "minorityOwnedType",
    "rentOrOwnIndicator",
    "laborSurplusIndicator",
    "outOfBusinessIndicator",
    "hqBranchIndicator",
    "parentOrSubsidiaryIndicator",
    "disadvantageIndicator",
    "employeesAtPrimaryAddress",
    "employeesAtPrimaryAddressEstimation",
    "employeesAtPrimaryAddressMinimum",
    "employeesAtPrimaryAddressText",
    "employeesTotal",
    "totalEmployeesEstimatedIndicator",
    "totalEmployeesIndicator",
    "totalEmployeesMinimumIndicator",
    "totalEmployeesText",
    "organizationSize",
    "organizationType",
    "principalTitle",
    "principalName",
    "legalStatus",
    "businessScope",
    "registrationType",
    "missionStatement",
    "corporationClass",
    "growthStrategyDescription",
    "congressionalDistrictCode",
    "lineOfBusiness",
    "homeCountry",
    "doNotConfuseWith",
    "localActivityCode",
    "localActivityCodeType",
    "localBusinessIdentifier",
    "localBusinessIdentifierType",
    "siebelLocation",
    "comments",
    "businessReport",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "dataCloudStatus",
    "lastEnrichmentDate",
    "partyStatus",
    "createdByModule",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "preferredContactMethod",
    "phoneCountryCode",
    "phoneAreaCode",
    "phoneNumber",
    "phoneExtension",
    "formattedPhoneNumber",
    "faxCountryCode",
    "faxAreaCode",
    "faxNumber",
    "faxExtension",
    "formattedFaxNumber",
    "emailFormat",
    "emailAddress",
    "url",
    "recordSet",
    "primaryAddress",
    "salesTeamMember",
    "note",
    "organizationDEOCreditHealthScoreC",
    "organizationDEOTimeWSTestC",
    "organizationDEOTestWSC",
    "organizationDEOCreditHealthScoreTextC"
})
public class Account {

    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElementRef(name = "SourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystem;
    @XmlElementRef(name = "SourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemReferenceValue;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElementRef(name = "UniqueNameSuffix", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> uniqueNameSuffix;
    @XmlElement(name = "PartyUniqueName")
    protected String partyUniqueName;
    @XmlElementRef(name = "Type", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "OwnerPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerPartyId;
    @XmlElement(name = "OwnerPartyNumber")
    protected String ownerPartyNumber;
    @XmlElementRef(name = "OwnerEmailAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerEmailAddress;
    @XmlElement(name = "OwnerName")
    protected String ownerName;
    @XmlElementRef(name = "PrimaryContactPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryContactPartyId;
    @XmlElementRef(name = "PrimaryContactPartyNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactPartyNumber;
    @XmlElementRef(name = "PrimaryContactSourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactSourceSystem;
    @XmlElementRef(name = "PrimaryContactSourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactSourceSystemReferenceValue;
    @XmlElementRef(name = "PrimaryContactName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactName;
    @XmlElementRef(name = "PrimaryContactEmail", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactEmail;
    @XmlElementRef(name = "PrimaryContactPhone", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactPhone;
    @XmlElementRef(name = "ExistingCustomerFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> existingCustomerFlag;
    @XmlElementRef(name = "ExistingCustomerFlagLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> existingCustomerFlagLastUpdateDate;
    @XmlElementRef(name = "NamedFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> namedFlag;
    @XmlElementRef(name = "LastAssignmentDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastAssignmentDate;
    @XmlElementRef(name = "LastAssignmentDateTime", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastAssignmentDateTime;
    @XmlElementRef(name = "AssignmentExceptionFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> assignmentExceptionFlag;
    @XmlElementRef(name = "SalesProfileStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> salesProfileStatus;
    @XmlElementRef(name = "IndustryCodeType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> industryCodeType;
    @XmlElementRef(name = "IndustryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> industryCode;
    @XmlElementRef(name = "ParentAccountPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Long> parentAccountPartyId;
    @XmlElementRef(name = "ParentAccountPartyNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> parentAccountPartyNumber;
    @XmlElementRef(name = "ParentAccountSourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> parentAccountSourceSystem;
    @XmlElementRef(name = "ParentAccountSourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> parentAccountSourceSystemReferenceValue;
    @XmlElementRef(name = "YearEstablished", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Integer> yearEstablished;
    @XmlElementRef(name = "ControlYear", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> controlYear;
    @XmlElementRef(name = "YearIncorporated", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Integer> yearIncorporated;
    @XmlElementRef(name = "StockSymbol", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> stockSymbol;
    @XmlElementRef(name = "FiscalYearendMonth", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> fiscalYearendMonth;
    @XmlElementRef(name = "CurrentFiscalYearPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> currentFiscalYearPotentialRevenueAmount;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "AnalysisFiscalYear", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> analysisFiscalYear;
    @XmlElementRef(name = "NextFiscalYearPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> nextFiscalYearPotentialRevenueAmount;
    @XmlElementRef(name = "TotalPaymentAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> totalPaymentAmount;
    @XmlElementRef(name = "TaxpayerIdentificationNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> taxpayerIdentificationNumber;
    @XmlElementRef(name = "CertificationLevel", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> certificationLevel;
    @XmlElementRef(name = "CertificationReasonCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> certificationReasonCode;
    @XmlElementRef(name = "DUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> dunsNumber;
    @XmlElementRef(name = "DUNSCreditRating", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> dunsCreditRating;
    @XmlElementRef(name = "ParentDUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> parentDUNSNumber;
    @XmlElementRef(name = "DomesticUltimateDUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> domesticUltimateDUNSNumber;
    @XmlElementRef(name = "GlobalUltimateDUNSNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> globalUltimateDUNSNumber;
    @XmlElementRef(name = "CEOName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> ceoName;
    @XmlElementRef(name = "CEOTitle", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> ceoTitle;
    @XmlElementRef(name = "PublicPrivateOwnershipFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> publicPrivateOwnershipFlag;
    @XmlElementRef(name = "ImportIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> importIndicator;
    @XmlElementRef(name = "ExportIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> exportIndicator;
    @XmlElementRef(name = "SmallBusinessIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> smallBusinessIndicator;
    @XmlElementRef(name = "WomanOwnedIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> womanOwnedIndicator;
    @XmlElementRef(name = "GeneralServicesAdministrationFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> generalServicesAdministrationFlag;
    @XmlElementRef(name = "MinorityOwnedIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> minorityOwnedIndicator;
    @XmlElementRef(name = "MinorityOwnedType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> minorityOwnedType;
    @XmlElementRef(name = "RentOrOwnIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> rentOrOwnIndicator;
    @XmlElementRef(name = "LaborSurplusIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> laborSurplusIndicator;
    @XmlElementRef(name = "OutOfBusinessIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> outOfBusinessIndicator;
    @XmlElementRef(name = "HQBranchIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> hqBranchIndicator;
    @XmlElementRef(name = "ParentOrSubsidiaryIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> parentOrSubsidiaryIndicator;
    @XmlElementRef(name = "DisadvantageIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> disadvantageIndicator;
    @XmlElementRef(name = "EmployeesAtPrimaryAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> employeesAtPrimaryAddress;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressEstimation", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> employeesAtPrimaryAddressEstimation;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressMinimum", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> employeesAtPrimaryAddressMinimum;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressText", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> employeesAtPrimaryAddressText;
    @XmlElementRef(name = "EmployeesTotal", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> employeesTotal;
    @XmlElementRef(name = "TotalEmployeesEstimatedIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> totalEmployeesEstimatedIndicator;
    @XmlElementRef(name = "TotalEmployeesIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> totalEmployeesIndicator;
    @XmlElementRef(name = "TotalEmployeesMinimumIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> totalEmployeesMinimumIndicator;
    @XmlElementRef(name = "TotalEmployeesText", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> totalEmployeesText;
    @XmlElementRef(name = "OrganizationSize", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> organizationSize;
    @XmlElementRef(name = "OrganizationType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> organizationType;
    @XmlElementRef(name = "PrincipalTitle", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> principalTitle;
    @XmlElementRef(name = "PrincipalName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> principalName;
    @XmlElementRef(name = "LegalStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> legalStatus;
    @XmlElementRef(name = "BusinessScope", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> businessScope;
    @XmlElementRef(name = "RegistrationType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> registrationType;
    @XmlElementRef(name = "MissionStatement", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> missionStatement;
    @XmlElementRef(name = "CorporationClass", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> corporationClass;
    @XmlElementRef(name = "GrowthStrategyDescription", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> growthStrategyDescription;
    @XmlElementRef(name = "CongressionalDistrictCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> congressionalDistrictCode;
    @XmlElementRef(name = "LineOfBusiness", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> lineOfBusiness;
    @XmlElementRef(name = "HomeCountry", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> homeCountry;
    @XmlElementRef(name = "DoNotConfuseWith", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> doNotConfuseWith;
    @XmlElementRef(name = "LocalActivityCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> localActivityCode;
    @XmlElementRef(name = "LocalActivityCodeType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> localActivityCodeType;
    @XmlElementRef(name = "LocalBusinessIdentifier", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> localBusinessIdentifier;
    @XmlElementRef(name = "LocalBusinessIdentifierType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> localBusinessIdentifierType;
    @XmlElementRef(name = "SiebelLocation", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> siebelLocation;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "BusinessReport", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<byte[]> businessReport;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "DataCloudStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> dataCloudStatus;
    @XmlElementRef(name = "LastEnrichmentDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastEnrichmentDate;
    @XmlElement(name = "PartyStatus")
    protected String partyStatus;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "PhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> phoneCountryCode;
    @XmlElementRef(name = "PhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> phoneAreaCode;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "PhoneExtension", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> phoneExtension;
    @XmlElementRef(name = "FormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedPhoneNumber;
    @XmlElementRef(name = "FaxCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> faxCountryCode;
    @XmlElementRef(name = "FaxAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> faxAreaCode;
    @XmlElementRef(name = "FaxNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> faxNumber;
    @XmlElementRef(name = "FaxExtension", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> faxExtension;
    @XmlElementRef(name = "FormattedFaxNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedFaxNumber;
    @XmlElementRef(name = "EmailFormat", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> emailFormat;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElementRef(name = "RecordSet", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> recordSet;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddress primaryAddress;
    @XmlElement(name = "SalesTeamMember")
    protected List<SalesTeamMember> salesTeamMember;
    @XmlElement(name = "Note")
    protected List<Note> note;
    @XmlElementRef(name = "OrganizationDEO_CreditHealthScore_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> organizationDEOCreditHealthScoreC;
    @XmlElementRef(name = "OrganizationDEO_TimeWSTest_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<byte[]> organizationDEOTimeWSTestC;
    @XmlElementRef(name = "OrganizationDEO_TestWS_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> organizationDEOTestWSC;
    @XmlElementRef(name = "OrganizationDEO_CreditHealthScoreText_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", type = JAXBElement.class)
    protected JAXBElement<String> organizationDEOCreditHealthScoreTextC;

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
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystem(JAXBElement<String> value) {
        this.sourceSystem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sourceSystemReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemReferenceValue() {
        return sourceSystemReferenceValue;
    }

    /**
     * Sets the value of the sourceSystemReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemReferenceValue(JAXBElement<String> value) {
        this.sourceSystemReferenceValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the uniqueNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueNameSuffix() {
        return uniqueNameSuffix;
    }

    /**
     * Sets the value of the uniqueNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueNameSuffix(JAXBElement<String> value) {
        this.uniqueNameSuffix = ((JAXBElement<String> ) value);
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerPartyId() {
        return ownerPartyId;
    }

    /**
     * Sets the value of the ownerPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerPartyId(JAXBElement<Long> value) {
        this.ownerPartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the ownerPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPartyNumber() {
        return ownerPartyNumber;
    }

    /**
     * Sets the value of the ownerPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPartyNumber(String value) {
        this.ownerPartyNumber = value;
    }

    /**
     * Gets the value of the ownerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    /**
     * Sets the value of the ownerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerEmailAddress(JAXBElement<String> value) {
        this.ownerEmailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the primaryContactPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryContactPartyId() {
        return primaryContactPartyId;
    }

    /**
     * Sets the value of the primaryContactPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryContactPartyId(JAXBElement<Long> value) {
        this.primaryContactPartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryContactPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPartyNumber() {
        return primaryContactPartyNumber;
    }

    /**
     * Sets the value of the primaryContactPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPartyNumber(JAXBElement<String> value) {
        this.primaryContactPartyNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactSourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactSourceSystem() {
        return primaryContactSourceSystem;
    }

    /**
     * Sets the value of the primaryContactSourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactSourceSystem(JAXBElement<String> value) {
        this.primaryContactSourceSystem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactSourceSystemReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactSourceSystemReferenceValue() {
        return primaryContactSourceSystemReferenceValue;
    }

    /**
     * Sets the value of the primaryContactSourceSystemReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactSourceSystemReferenceValue(JAXBElement<String> value) {
        this.primaryContactSourceSystemReferenceValue = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactName() {
        return primaryContactName;
    }

    /**
     * Sets the value of the primaryContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactName(JAXBElement<String> value) {
        this.primaryContactName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactEmail() {
        return primaryContactEmail;
    }

    /**
     * Sets the value of the primaryContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactEmail(JAXBElement<String> value) {
        this.primaryContactEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPhone() {
        return primaryContactPhone;
    }

    /**
     * Sets the value of the primaryContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPhone(JAXBElement<String> value) {
        this.primaryContactPhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the existingCustomerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExistingCustomerFlag() {
        return existingCustomerFlag;
    }

    /**
     * Sets the value of the existingCustomerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExistingCustomerFlag(JAXBElement<Boolean> value) {
        this.existingCustomerFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the existingCustomerFlagLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExistingCustomerFlagLastUpdateDate() {
        return existingCustomerFlagLastUpdateDate;
    }

    /**
     * Sets the value of the existingCustomerFlagLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExistingCustomerFlagLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.existingCustomerFlagLastUpdateDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the namedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNamedFlag() {
        return namedFlag;
    }

    /**
     * Sets the value of the namedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNamedFlag(JAXBElement<Boolean> value) {
        this.namedFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the lastAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignmentDate() {
        return lastAssignmentDate;
    }

    /**
     * Sets the value of the lastAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignmentDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the lastAssignmentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignmentDateTime() {
        return lastAssignmentDateTime;
    }

    /**
     * Sets the value of the lastAssignmentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignmentDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignmentDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the assignmentExceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAssignmentExceptionFlag() {
        return assignmentExceptionFlag;
    }

    /**
     * Sets the value of the assignmentExceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAssignmentExceptionFlag(JAXBElement<Boolean> value) {
        this.assignmentExceptionFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the salesProfileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesProfileStatus() {
        return salesProfileStatus;
    }

    /**
     * Sets the value of the salesProfileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesProfileStatus(JAXBElement<String> value) {
        this.salesProfileStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the industryCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndustryCodeType() {
        return industryCodeType;
    }

    /**
     * Sets the value of the industryCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndustryCodeType(JAXBElement<String> value) {
        this.industryCodeType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndustryCode(JAXBElement<String> value) {
        this.industryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parentAccountPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentAccountPartyId() {
        return parentAccountPartyId;
    }

    /**
     * Sets the value of the parentAccountPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentAccountPartyId(JAXBElement<Long> value) {
        this.parentAccountPartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the parentAccountPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentAccountPartyNumber() {
        return parentAccountPartyNumber;
    }

    /**
     * Sets the value of the parentAccountPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentAccountPartyNumber(JAXBElement<String> value) {
        this.parentAccountPartyNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parentAccountSourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentAccountSourceSystem() {
        return parentAccountSourceSystem;
    }

    /**
     * Sets the value of the parentAccountSourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentAccountSourceSystem(JAXBElement<String> value) {
        this.parentAccountSourceSystem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parentAccountSourceSystemReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentAccountSourceSystemReferenceValue() {
        return parentAccountSourceSystemReferenceValue;
    }

    /**
     * Sets the value of the parentAccountSourceSystemReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentAccountSourceSystemReferenceValue(JAXBElement<String> value) {
        this.parentAccountSourceSystemReferenceValue = ((JAXBElement<String> ) value);
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
     * Gets the value of the controlYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getControlYear() {
        return controlYear;
    }

    /**
     * Sets the value of the controlYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setControlYear(JAXBElement<BigDecimal> value) {
        this.controlYear = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the yearIncorporated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYearIncorporated() {
        return yearIncorporated;
    }

    /**
     * Sets the value of the yearIncorporated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYearIncorporated(JAXBElement<Integer> value) {
        this.yearIncorporated = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the stockSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Sets the value of the stockSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStockSymbol(JAXBElement<String> value) {
        this.stockSymbol = ((JAXBElement<String> ) value);
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
     * Gets the value of the analysisFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnalysisFiscalYear() {
        return analysisFiscalYear;
    }

    /**
     * Sets the value of the analysisFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnalysisFiscalYear(JAXBElement<String> value) {
        this.analysisFiscalYear = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nextFiscalYearPotentialRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getNextFiscalYearPotentialRevenueAmount() {
        return nextFiscalYearPotentialRevenueAmount;
    }

    /**
     * Sets the value of the nextFiscalYearPotentialRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setNextFiscalYearPotentialRevenueAmount(JAXBElement<AmountType> value) {
        this.nextFiscalYearPotentialRevenueAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalPaymentAmount(JAXBElement<AmountType> value) {
        this.totalPaymentAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the taxpayerIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    /**
     * Sets the value of the taxpayerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxpayerIdentificationNumber(JAXBElement<String> value) {
        this.taxpayerIdentificationNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the certificationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificationReasonCode() {
        return certificationReasonCode;
    }

    /**
     * Sets the value of the certificationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificationReasonCode(JAXBElement<String> value) {
        this.certificationReasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumber(JAXBElement<String> value) {
        this.dunsNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dunsCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSCreditRating() {
        return dunsCreditRating;
    }

    /**
     * Sets the value of the dunsCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSCreditRating(JAXBElement<String> value) {
        this.dunsCreditRating = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parentDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentDUNSNumber() {
        return parentDUNSNumber;
    }

    /**
     * Sets the value of the parentDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentDUNSNumber(JAXBElement<String> value) {
        this.parentDUNSNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the domesticUltimateDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomesticUltimateDUNSNumber() {
        return domesticUltimateDUNSNumber;
    }

    /**
     * Sets the value of the domesticUltimateDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomesticUltimateDUNSNumber(JAXBElement<String> value) {
        this.domesticUltimateDUNSNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the globalUltimateDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalUltimateDUNSNumber() {
        return globalUltimateDUNSNumber;
    }

    /**
     * Sets the value of the globalUltimateDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalUltimateDUNSNumber(JAXBElement<String> value) {
        this.globalUltimateDUNSNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ceoName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEOName() {
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
    public void setCEOName(JAXBElement<String> value) {
        this.ceoName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ceoTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEOTitle() {
        return ceoTitle;
    }

    /**
     * Sets the value of the ceoTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEOTitle(JAXBElement<String> value) {
        this.ceoTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the publicPrivateOwnershipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPublicPrivateOwnershipFlag() {
        return publicPrivateOwnershipFlag;
    }

    /**
     * Sets the value of the publicPrivateOwnershipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPublicPrivateOwnershipFlag(JAXBElement<Boolean> value) {
        this.publicPrivateOwnershipFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the importIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportIndicator() {
        return importIndicator;
    }

    /**
     * Sets the value of the importIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportIndicator(JAXBElement<String> value) {
        this.importIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportIndicator() {
        return exportIndicator;
    }

    /**
     * Sets the value of the exportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportIndicator(JAXBElement<String> value) {
        this.exportIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the smallBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmallBusinessIndicator() {
        return smallBusinessIndicator;
    }

    /**
     * Sets the value of the smallBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmallBusinessIndicator(JAXBElement<String> value) {
        this.smallBusinessIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the womanOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWomanOwnedIndicator() {
        return womanOwnedIndicator;
    }

    /**
     * Sets the value of the womanOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWomanOwnedIndicator(JAXBElement<String> value) {
        this.womanOwnedIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the generalServicesAdministrationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGeneralServicesAdministrationFlag() {
        return generalServicesAdministrationFlag;
    }

    /**
     * Sets the value of the generalServicesAdministrationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGeneralServicesAdministrationFlag(JAXBElement<Boolean> value) {
        this.generalServicesAdministrationFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the minorityOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinorityOwnedIndicator() {
        return minorityOwnedIndicator;
    }

    /**
     * Sets the value of the minorityOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinorityOwnedIndicator(JAXBElement<String> value) {
        this.minorityOwnedIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the minorityOwnedType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinorityOwnedType() {
        return minorityOwnedType;
    }

    /**
     * Sets the value of the minorityOwnedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinorityOwnedType(JAXBElement<String> value) {
        this.minorityOwnedType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rentOrOwnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRentOrOwnIndicator() {
        return rentOrOwnIndicator;
    }

    /**
     * Sets the value of the rentOrOwnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRentOrOwnIndicator(JAXBElement<String> value) {
        this.rentOrOwnIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the laborSurplusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLaborSurplusIndicator() {
        return laborSurplusIndicator;
    }

    /**
     * Sets the value of the laborSurplusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLaborSurplusIndicator(JAXBElement<String> value) {
        this.laborSurplusIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the outOfBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutOfBusinessIndicator() {
        return outOfBusinessIndicator;
    }

    /**
     * Sets the value of the outOfBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutOfBusinessIndicator(JAXBElement<String> value) {
        this.outOfBusinessIndicator = ((JAXBElement<String> ) value);
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
     * Gets the value of the parentOrSubsidiaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentOrSubsidiaryIndicator() {
        return parentOrSubsidiaryIndicator;
    }

    /**
     * Sets the value of the parentOrSubsidiaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentOrSubsidiaryIndicator(JAXBElement<String> value) {
        this.parentOrSubsidiaryIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the disadvantageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisadvantageIndicator() {
        return disadvantageIndicator;
    }

    /**
     * Sets the value of the disadvantageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisadvantageIndicator(JAXBElement<String> value) {
        this.disadvantageIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employeesAtPrimaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddress() {
        return employeesAtPrimaryAddress;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddress(JAXBElement<String> value) {
        this.employeesAtPrimaryAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employeesAtPrimaryAddressEstimation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressEstimation() {
        return employeesAtPrimaryAddressEstimation;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddressEstimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressEstimation(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressEstimation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employeesAtPrimaryAddressMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressMinimum() {
        return employeesAtPrimaryAddressMinimum;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddressMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressMinimum(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressMinimum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the employeesAtPrimaryAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressText() {
        return employeesAtPrimaryAddressText;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressText(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressText = ((JAXBElement<String> ) value);
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
     * Gets the value of the totalEmployeesEstimatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesEstimatedIndicator() {
        return totalEmployeesEstimatedIndicator;
    }

    /**
     * Sets the value of the totalEmployeesEstimatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesEstimatedIndicator(JAXBElement<String> value) {
        this.totalEmployeesEstimatedIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totalEmployeesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesIndicator() {
        return totalEmployeesIndicator;
    }

    /**
     * Sets the value of the totalEmployeesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesIndicator(JAXBElement<String> value) {
        this.totalEmployeesIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totalEmployeesMinimumIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesMinimumIndicator() {
        return totalEmployeesMinimumIndicator;
    }

    /**
     * Sets the value of the totalEmployeesMinimumIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesMinimumIndicator(JAXBElement<String> value) {
        this.totalEmployeesMinimumIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totalEmployeesText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesText() {
        return totalEmployeesText;
    }

    /**
     * Sets the value of the totalEmployeesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesText(JAXBElement<String> value) {
        this.totalEmployeesText = ((JAXBElement<String> ) value);
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
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationType(JAXBElement<String> value) {
        this.organizationType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the principalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalTitle() {
        return principalTitle;
    }

    /**
     * Sets the value of the principalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalTitle(JAXBElement<String> value) {
        this.principalTitle = ((JAXBElement<String> ) value);
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
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalStatus(JAXBElement<String> value) {
        this.legalStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the businessScope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessScope() {
        return businessScope;
    }

    /**
     * Sets the value of the businessScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessScope(JAXBElement<String> value) {
        this.businessScope = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationType(JAXBElement<String> value) {
        this.registrationType = ((JAXBElement<String> ) value);
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
     * Gets the value of the corporationClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporationClass() {
        return corporationClass;
    }

    /**
     * Sets the value of the corporationClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporationClass(JAXBElement<String> value) {
        this.corporationClass = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the growthStrategyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrowthStrategyDescription() {
        return growthStrategyDescription;
    }

    /**
     * Sets the value of the growthStrategyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrowthStrategyDescription(JAXBElement<String> value) {
        this.growthStrategyDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the congressionalDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCongressionalDistrictCode() {
        return congressionalDistrictCode;
    }

    /**
     * Sets the value of the congressionalDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCongressionalDistrictCode(JAXBElement<String> value) {
        this.congressionalDistrictCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineOfBusiness(JAXBElement<String> value) {
        this.lineOfBusiness = ((JAXBElement<String> ) value);
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
     * Gets the value of the doNotConfuseWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotConfuseWith() {
        return doNotConfuseWith;
    }

    /**
     * Sets the value of the doNotConfuseWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotConfuseWith(JAXBElement<String> value) {
        this.doNotConfuseWith = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the localActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalActivityCode() {
        return localActivityCode;
    }

    /**
     * Sets the value of the localActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalActivityCode(JAXBElement<String> value) {
        this.localActivityCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the localActivityCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalActivityCodeType() {
        return localActivityCodeType;
    }

    /**
     * Sets the value of the localActivityCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalActivityCodeType(JAXBElement<String> value) {
        this.localActivityCodeType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the localBusinessIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalBusinessIdentifier() {
        return localBusinessIdentifier;
    }

    /**
     * Sets the value of the localBusinessIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalBusinessIdentifier(JAXBElement<String> value) {
        this.localBusinessIdentifier = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the localBusinessIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalBusinessIdentifierType() {
        return localBusinessIdentifierType;
    }

    /**
     * Sets the value of the localBusinessIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalBusinessIdentifierType(JAXBElement<String> value) {
        this.localBusinessIdentifierType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the siebelLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiebelLocation() {
        return siebelLocation;
    }

    /**
     * Sets the value of the siebelLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiebelLocation(JAXBElement<String> value) {
        this.siebelLocation = ((JAXBElement<String> ) value);
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
     * Gets the value of the businessReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBusinessReport() {
        return businessReport;
    }

    /**
     * Sets the value of the businessReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBusinessReport(JAXBElement<byte[]> value) {
        this.businessReport = ((JAXBElement<byte[]> ) value);
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
     * Gets the value of the dataCloudStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCloudStatus() {
        return dataCloudStatus;
    }

    /**
     * Sets the value of the dataCloudStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCloudStatus(JAXBElement<String> value) {
        this.dataCloudStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastEnrichmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastEnrichmentDate() {
        return lastEnrichmentDate;
    }

    /**
     * Sets the value of the lastEnrichmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastEnrichmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastEnrichmentDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the partyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyStatus() {
        return partyStatus;
    }

    /**
     * Sets the value of the partyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyStatus(String value) {
        this.partyStatus = value;
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
     * Gets the value of the phoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * Sets the value of the phoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneCountryCode(JAXBElement<String> value) {
        this.phoneCountryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneAreaCode() {
        return phoneAreaCode;
    }

    /**
     * Sets the value of the phoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneAreaCode(JAXBElement<String> value) {
        this.phoneAreaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneExtension(JAXBElement<String> value) {
        this.phoneExtension = ((JAXBElement<String> ) value);
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
     * Gets the value of the faxCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxCountryCode() {
        return faxCountryCode;
    }

    /**
     * Sets the value of the faxCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxCountryCode(JAXBElement<String> value) {
        this.faxCountryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxAreaCode() {
        return faxAreaCode;
    }

    /**
     * Sets the value of the faxAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxAreaCode(JAXBElement<String> value) {
        this.faxAreaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxExtension() {
        return faxExtension;
    }

    /**
     * Sets the value of the faxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxExtension(JAXBElement<String> value) {
        this.faxExtension = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the formattedFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedFaxNumber() {
        return formattedFaxNumber;
    }

    /**
     * Sets the value of the formattedFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedFaxNumber(JAXBElement<String> value) {
        this.formattedFaxNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailFormat() {
        return emailFormat;
    }

    /**
     * Sets the value of the emailFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailFormat(JAXBElement<String> value) {
        this.emailFormat = ((JAXBElement<String> ) value);
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the recordSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordSet() {
        return recordSet;
    }

    /**
     * Sets the value of the recordSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordSet(JAXBElement<String> value) {
        this.recordSet = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddress }
     *     
     */
    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddress }
     *     
     */
    public void setPrimaryAddress(PrimaryAddress value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the salesTeamMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTeamMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTeamMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesTeamMember }
     * 
     * 
     */
    public List<SalesTeamMember> getSalesTeamMember() {
        if (salesTeamMember == null) {
            salesTeamMember = new ArrayList<SalesTeamMember>();
        }
        return this.salesTeamMember;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the organizationDEOCreditHealthScoreC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrganizationDEOCreditHealthScoreC() {
        return organizationDEOCreditHealthScoreC;
    }

    /**
     * Sets the value of the organizationDEOCreditHealthScoreC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrganizationDEOCreditHealthScoreC(JAXBElement<BigDecimal> value) {
        this.organizationDEOCreditHealthScoreC = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the organizationDEOTimeWSTestC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getOrganizationDEOTimeWSTestC() {
        return organizationDEOTimeWSTestC;
    }

    /**
     * Sets the value of the organizationDEOTimeWSTestC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setOrganizationDEOTimeWSTestC(JAXBElement<byte[]> value) {
        this.organizationDEOTimeWSTestC = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the organizationDEOTestWSC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOTestWSC() {
        return organizationDEOTestWSC;
    }

    /**
     * Sets the value of the organizationDEOTestWSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOTestWSC(JAXBElement<String> value) {
        this.organizationDEOTestWSC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organizationDEOCreditHealthScoreTextC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationDEOCreditHealthScoreTextC() {
        return organizationDEOCreditHealthScoreTextC;
    }

    /**
     * Sets the value of the organizationDEOCreditHealthScoreTextC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationDEOCreditHealthScoreTextC(JAXBElement<String> value) {
        this.organizationDEOCreditHealthScoreTextC = ((JAXBElement<String> ) value);
    }

}

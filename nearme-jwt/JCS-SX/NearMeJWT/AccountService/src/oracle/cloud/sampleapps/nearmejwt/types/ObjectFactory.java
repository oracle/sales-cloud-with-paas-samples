/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */

package oracle.cloud.sampleapps.nearmejwt.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oracle.cloud.sampleapps.nearmejwt.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", "Fault");
    private final static QName _SalesTeamMember_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "salesTeamMember");
    private final static QName _NoteDFF_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "noteDFF");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _Note_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "note");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _AccountResult_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "accountResult");
    private final static QName _ProcessData_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processData");
    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _FindControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findControl");
    private final static QName _Account_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "account");
    private final static QName _ProcessControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processControl");
    private final static QName _PrimaryAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "primaryAddress");
    private final static QName _SalesTeamMemberEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "EndDateActive");
    private final static QName _SalesTeamMemberUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "UserLastUpdateDate");
    private final static QName _SalesTeamMemberResourcePartyNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ResourcePartyNumber");
    private final static QName _SalesTeamMemberAssignmentTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AssignmentTypeCode");
    private final static QName _SalesTeamMemberResourceId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ResourceId");
    private final static QName _SalesTeamMemberLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "LastUpdateLogin");
    private final static QName _SalesTeamMemberStartDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "StartDateActive");
    private final static QName _SalesTeamMemberMemberFunctionCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "MemberFunctionCode");
    private final static QName _SalesTeamMemberResourceEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ResourceEmailAddress");
    private final static QName _NoteNoteAttributeUid2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid2");
    private final static QName _NoteNoteAttributeUid3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid3");
    private final static QName _NoteNoteAttributeUid4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid4");
    private final static QName _NoteNoteAttributeUid5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid5");
    private final static QName _NoteNoteAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeCategory");
    private final static QName _NoteContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "ContactRelationshipId");
    private final static QName _NoteNoteAttributeUid1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid1");
    private final static QName _NoteCreatorPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CreatorPartyId");
    private final static QName _NoteCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CurcyConvRateType");
    private final static QName _NoteCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CurrencyCode");
    private final static QName _NoteCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CorpCurrencyCode");
    private final static QName _PrimaryAddressHouseType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "HouseType");
    private final static QName _PrimaryAddressAddressLinesPhonetic_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLinesPhonetic");
    private final static QName _PrimaryAddressComments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Comments");
    private final static QName _PrimaryAddressDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Description");
    private final static QName _PrimaryAddressAddressElementAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute4");
    private final static QName _PrimaryAddressAddressElementAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute5");
    private final static QName _PrimaryAddressDateValidated_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "DateValidated");
    private final static QName _PrimaryAddressCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "CurrencyCode");
    private final static QName _PrimaryAddressProvince_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Province");
    private final static QName _PrimaryAddressFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "FormattedAddress");
    private final static QName _PrimaryAddressCity_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "City");
    private final static QName _PrimaryAddressMailstop_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Mailstop");
    private final static QName _PrimaryAddressCounty_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "County");
    private final static QName _PrimaryAddressPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "PostalCode");
    private final static QName _PrimaryAddressSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "SourceSystemReferenceValue");
    private final static QName _PrimaryAddressState_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "State");
    private final static QName _PrimaryAddressAddressLine4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine4");
    private final static QName _PrimaryAddressLongitude_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Longitude");
    private final static QName _PrimaryAddressCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "CorpCurrencyCode");
    private final static QName _PrimaryAddressAddressLine1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine1");
    private final static QName _PrimaryAddressPostalPlus4Code_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "PostalPlus4Code");
    private final static QName _PrimaryAddressFormattedMultiLineAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "FormattedMultiLineAddress");
    private final static QName _PrimaryAddressLocationDirections_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "LocationDirections");
    private final static QName _PrimaryAddressAddressLine3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine3");
    private final static QName _PrimaryAddressSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "SourceSystem");
    private final static QName _PrimaryAddressAddressLine2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine2");
    private final static QName _PrimaryAddressBuilding_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Building");
    private final static QName _PrimaryAddressDeleteFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "DeleteFlag");
    private final static QName _PrimaryAddressFloorNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "FloorNumber");
    private final static QName _PrimaryAddressValidationStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ValidationStatusCode");
    private final static QName _PrimaryAddressCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "CurcyConvRateType");
    private final static QName _PrimaryAddressLatitude_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Latitude");
    private final static QName _PrimaryAddressValidatedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ValidatedFlag");
    private final static QName _PrimaryAddressAddressElementAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute1");
    private final static QName _PrimaryAddressAddressElementAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute3");
    private final static QName _PrimaryAddressAddressElementAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute2");
    private final static QName _NoteDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "_FLEX_NumOfSegments");
    private final static QName _NoteDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "__FLEX_Context");
    private final static QName _AccountOwnerEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OwnerEmailAddress");
    private final static QName _AccountSiebelLocation_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "SiebelLocation");
    private final static QName _AccountEmailFormat_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "EmailFormat");
    private final static QName _AccountCEOName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CEOName");
    private final static QName _AccountLocalActivityCodeType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LocalActivityCodeType");
    private final static QName _AccountEmployeesAtPrimaryAddressMinimum_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "EmployeesAtPrimaryAddressMinimum");
    private final static QName _AccountDUNSNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "DUNSNumber");
    private final static QName _AccountComments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "Comments");
    private final static QName _AccountLocalBusinessIdentifierType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LocalBusinessIdentifierType");
    private final static QName _AccountFaxAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "FaxAreaCode");
    private final static QName _AccountLastAssignmentDateTime_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LastAssignmentDateTime");
    private final static QName _AccountMinorityOwnedIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "MinorityOwnedIndicator");
    private final static QName _AccountGrowthStrategyDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "GrowthStrategyDescription");
    private final static QName _AccountLastAssignmentDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LastAssignmentDate");
    private final static QName _AccountCorporationClass_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CorporationClass");
    private final static QName _AccountIndustryCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "IndustryCode");
    private final static QName _AccountAnalysisFiscalYear_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "AnalysisFiscalYear");
    private final static QName _AccountParentOrSubsidiaryIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ParentOrSubsidiaryIndicator");
    private final static QName _AccountPhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PhoneCountryCode");
    private final static QName _AccountFaxExtension_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "FaxExtension");
    private final static QName _AccountPhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PhoneAreaCode");
    private final static QName _AccountEmployeesAtPrimaryAddressText_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "EmployeesAtPrimaryAddressText");
    private final static QName _AccountDomesticUltimateDUNSNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "DomesticUltimateDUNSNumber");
    private final static QName _AccountYearEstablished_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "YearEstablished");
    private final static QName _AccountType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "Type");
    private final static QName _AccountTotalEmployeesIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "TotalEmployeesIndicator");
    private final static QName _AccountOrganizationDEOCreditHealthScoreTextC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OrganizationDEO_CreditHealthScoreText_c");
    private final static QName _AccountOwnerPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OwnerPartyId");
    private final static QName _AccountFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "FormattedPhoneNumber");
    private final static QName _AccountRecordSet_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "RecordSet");
    private final static QName _AccountAssignmentExceptionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "AssignmentExceptionFlag");
    private final static QName _AccountHQBranchIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "HQBranchIndicator");
    private final static QName _AccountTotalEmployeesMinimumIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "TotalEmployeesMinimumIndicator");
    private final static QName _AccountDisadvantageIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "DisadvantageIndicator");
    private final static QName _AccountPrimaryContactEmail_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrimaryContactEmail");
    private final static QName _AccountGeneralServicesAdministrationFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "GeneralServicesAdministrationFlag");
    private final static QName _AccountLocalBusinessIdentifier_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LocalBusinessIdentifier");
    private final static QName _AccountPhoneExtension_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PhoneExtension");
    private final static QName _AccountStockSymbol_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "StockSymbol");
    private final static QName _AccountWomanOwnedIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "WomanOwnedIndicator");
    private final static QName _AccountLineOfBusiness_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LineOfBusiness");
    private final static QName _AccountCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CurrencyCode");
    private final static QName _AccountTotalEmployeesEstimatedIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "TotalEmployeesEstimatedIndicator");
    private final static QName _AccountSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "SourceSystemReferenceValue");
    private final static QName _AccountNextFiscalYearPotentialRevenueAmount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "NextFiscalYearPotentialRevenueAmount");
    private final static QName _AccountFiscalYearendMonth_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "FiscalYearendMonth");
    private final static QName _AccountSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "SourceSystem");
    private final static QName _AccountFaxCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "FaxCountryCode");
    private final static QName _AccountExportIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ExportIndicator");
    private final static QName _AccountPublicPrivateOwnershipFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PublicPrivateOwnershipFlag");
    private final static QName _AccountYearIncorporated_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "YearIncorporated");
    private final static QName _AccountPrincipalName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrincipalName");
    private final static QName _AccountPrincipalTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrincipalTitle");
    private final static QName _AccountImportIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ImportIndicator");
    private final static QName _AccountMinorityOwnedType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "MinorityOwnedType");
    private final static QName _AccountMissionStatement_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "MissionStatement");
    private final static QName _AccountPreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PreferredFunctionalCurrency");
    private final static QName _AccountOrganizationDEOTimeWSTestC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OrganizationDEO_TimeWSTest_c");
    private final static QName _AccountGlobalUltimateDUNSNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "GlobalUltimateDUNSNumber");
    private final static QName _AccountOrganizationDEOTestWSC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OrganizationDEO_TestWS_c");
    private final static QName _AccountCertificationReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CertificationReasonCode");
    private final static QName _AccountFormattedFaxNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "FormattedFaxNumber");
    private final static QName _AccountEmployeesAtPrimaryAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "EmployeesAtPrimaryAddress");
    private final static QName _AccountRegistrationType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "RegistrationType");
    private final static QName _AccountCurrentFiscalYearPotentialRevenueAmount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CurrentFiscalYearPotentialRevenueAmount");
    private final static QName _AccountCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CurcyConvRateType");
    private final static QName _AccountExistingCustomerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ExistingCustomerFlag");
    private final static QName _AccountOrganizationSize_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OrganizationSize");
    private final static QName _AccountOutOfBusinessIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OutOfBusinessIndicator");
    private final static QName _AccountRentOrOwnIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "RentOrOwnIndicator");
    private final static QName _AccountHomeCountry_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "HomeCountry");
    private final static QName _AccountIndustryCodeType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "IndustryCodeType");
    private final static QName _AccountCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CreatedByModule");
    private final static QName _AccountPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PhoneNumber");
    private final static QName _AccountParentAccountPartyNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ParentAccountPartyNumber");
    private final static QName _AccountLaborSurplusIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LaborSurplusIndicator");
    private final static QName _AccountPrimaryContactPhone_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrimaryContactPhone");
    private final static QName _AccountPrimaryContactSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrimaryContactSourceSystem");
    private final static QName _AccountLegalStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LegalStatus");
    private final static QName _AccountDoNotConfuseWith_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "DoNotConfuseWith");
    private final static QName _AccountBusinessReport_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "BusinessReport");
    private final static QName _AccountNamedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "NamedFlag");
    private final static QName _AccountBusinessScope_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "BusinessScope");
    private final static QName _AccountPrimaryContactPartyNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrimaryContactPartyNumber");
    private final static QName _AccountControlYear_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ControlYear");
    private final static QName _AccountCertificationLevel_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CertificationLevel");
    private final static QName _AccountPrimaryContactPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrimaryContactPartyId");
    private final static QName _AccountPrimaryContactSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrimaryContactSourceSystemReferenceValue");
    private final static QName _AccountTaxpayerIdentificationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "TaxpayerIdentificationNumber");
    private final static QName _AccountTotalPaymentAmount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "TotalPaymentAmount");
    private final static QName _AccountParentAccountSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ParentAccountSourceSystem");
    private final static QName _AccountFaxNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "FaxNumber");
    private final static QName _AccountPrimaryContactName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PrimaryContactName");
    private final static QName _AccountCEOTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CEOTitle");
    private final static QName _AccountEmployeesTotal_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "EmployeesTotal");
    private final static QName _AccountOrganizationDEOCreditHealthScoreC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OrganizationDEO_CreditHealthScore_c");
    private final static QName _AccountSmallBusinessIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "SmallBusinessIndicator");
    private final static QName _AccountLastEnrichmentDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LastEnrichmentDate");
    private final static QName _AccountDUNSCreditRating_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "DUNSCreditRating");
    private final static QName _AccountUniqueNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "UniqueNameSuffix");
    private final static QName _AccountLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LastUpdateLogin");
    private final static QName _AccountPreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "PreferredContactMethod");
    private final static QName _AccountLocalActivityCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "LocalActivityCode");
    private final static QName _AccountEmployeesAtPrimaryAddressEstimation_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "EmployeesAtPrimaryAddressEstimation");
    private final static QName _AccountExistingCustomerFlagLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ExistingCustomerFlagLastUpdateDate");
    private final static QName _AccountCongressionalDistrictCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CongressionalDistrictCode");
    private final static QName _AccountDataCloudStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "DataCloudStatus");
    private final static QName _AccountSalesProfileStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "SalesProfileStatus");
    private final static QName _AccountOrganizationType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "OrganizationType");
    private final static QName _AccountParentAccountPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ParentAccountPartyId");
    private final static QName _AccountParentDUNSNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ParentDUNSNumber");
    private final static QName _AccountParentAccountSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "ParentAccountSourceSystemReferenceValue");
    private final static QName _AccountCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "CorpCurrencyCode");
    private final static QName _AccountTotalEmployeesText_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", "TotalEmployeesText");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.cloud.sampleapps.nearmejwt.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link GetAccountAsync }
     * 
     */
    public GetAccountAsync createGetAccountAsync() {
        return new GetAccountAsync();
    }

    /**
     * Create an instance of {@link FindAccount }
     * 
     */
    public FindAccount createFindAccount() {
        return new FindAccount();
    }

    /**
     * Create an instance of {@link FindCriteria }
     * 
     */
    public FindCriteria createFindCriteria() {
        return new FindCriteria();
    }

    /**
     * Create an instance of {@link FindControl }
     * 
     */
    public FindControl createFindControl() {
        return new FindControl();
    }

    /**
     * Create an instance of {@link ProcessCSAccountResponse }
     * 
     */
    public ProcessCSAccountResponse createProcessCSAccountResponse() {
        return new ProcessCSAccountResponse();
    }

    /**
     * Create an instance of {@link ProcessData }
     * 
     */
    public ProcessData createProcessData() {
        return new ProcessData();
    }

    /**
     * Create an instance of {@link UpdateAccountAsyncResponse }
     * 
     */
    public UpdateAccountAsyncResponse createUpdateAccountAsyncResponse() {
        return new UpdateAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link DataObjectResult }
     * 
     */
    public DataObjectResult createDataObjectResult() {
        return new DataObjectResult();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsync }
     * 
     */
    public GetServiceLastUpdateTimeAsync createGetServiceLastUpdateTimeAsync() {
        return new GetServiceLastUpdateTimeAsync();
    }

    /**
     * Create an instance of {@link ProcessAccount }
     * 
     */
    public ProcessAccount createProcessAccount() {
        return new ProcessAccount();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link MethodResult }
     * 
     */
    public MethodResult createMethodResult() {
        return new MethodResult();
    }

    /**
     * Create an instance of {@link FindAccountAsyncResponse }
     * 
     */
    public FindAccountAsyncResponse createFindAccountAsyncResponse() {
        return new FindAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link GetEntityListAsyncResponse }
     * 
     */
    public GetEntityListAsyncResponse createGetEntityListAsyncResponse() {
        return new GetEntityListAsyncResponse();
    }

    /**
     * Create an instance of {@link ServiceViewInfo }
     * 
     */
    public ServiceViewInfo createServiceViewInfo() {
        return new ServiceViewInfo();
    }

    /**
     * Create an instance of {@link FindAccountAsync }
     * 
     */
    public FindAccountAsync createFindAccountAsync() {
        return new FindAccountAsync();
    }

    /**
     * Create an instance of {@link FindAccountResponse }
     * 
     */
    public FindAccountResponse createFindAccountResponse() {
        return new FindAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHints }
     * 
     */
    public GetDfltObjAttrHints createGetDfltObjAttrHints() {
        return new GetDfltObjAttrHints();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsyncResponse }
     * 
     */
    public GetDfltObjAttrHintsAsyncResponse createGetDfltObjAttrHintsAsyncResponse() {
        return new GetDfltObjAttrHintsAsyncResponse();
    }

    /**
     * Create an instance of {@link ObjAttrHints }
     * 
     */
    public ObjAttrHints createObjAttrHints() {
        return new ObjAttrHints();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link MergeAccountResponse }
     * 
     */
    public MergeAccountResponse createMergeAccountResponse() {
        return new MergeAccountResponse();
    }

    /**
     * Create an instance of {@link GetEntityListAsync }
     * 
     */
    public GetEntityListAsync createGetEntityListAsync() {
        return new GetEntityListAsync();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link CreateAccountAsyncResponse }
     * 
     */
    public CreateAccountAsyncResponse createCreateAccountAsyncResponse() {
        return new CreateAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteAccountAsync }
     * 
     */
    public DeleteAccountAsync createDeleteAccountAsync() {
        return new DeleteAccountAsync();
    }

    /**
     * Create an instance of {@link GetAccountAsyncResponse }
     * 
     */
    public GetAccountAsyncResponse createGetAccountAsyncResponse() {
        return new GetAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link MergeAccountAsyncResponse }
     * 
     */
    public MergeAccountAsyncResponse createMergeAccountAsyncResponse() {
        return new MergeAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteAccount }
     * 
     */
    public DeleteAccount createDeleteAccount() {
        return new DeleteAccount();
    }

    /**
     * Create an instance of {@link ProcessAccountAsync }
     * 
     */
    public ProcessAccountAsync createProcessAccountAsync() {
        return new ProcessAccountAsync();
    }

    /**
     * Create an instance of {@link MergeAccountAsync }
     * 
     */
    public MergeAccountAsync createMergeAccountAsync() {
        return new MergeAccountAsync();
    }

    /**
     * Create an instance of {@link UpdateAccountAsync }
     * 
     */
    public UpdateAccountAsync createUpdateAccountAsync() {
        return new UpdateAccountAsync();
    }

    /**
     * Create an instance of {@link ProcessCSAccountAsyncResponse }
     * 
     */
    public ProcessCSAccountAsyncResponse createProcessCSAccountAsyncResponse() {
        return new ProcessCSAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link GetEntityList }
     * 
     */
    public GetEntityList createGetEntityList() {
        return new GetEntityList();
    }

    /**
     * Create an instance of {@link ProcessAccountResponse }
     * 
     */
    public ProcessAccountResponse createProcessAccountResponse() {
        return new ProcessAccountResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsync }
     * 
     */
    public GetDfltObjAttrHintsAsync createGetDfltObjAttrHintsAsync() {
        return new GetDfltObjAttrHintsAsync();
    }

    /**
     * Create an instance of {@link CreateAccountAsync }
     * 
     */
    public CreateAccountAsync createCreateAccountAsync() {
        return new CreateAccountAsync();
    }

    /**
     * Create an instance of {@link UpdateAccount }
     * 
     */
    public UpdateAccount createUpdateAccount() {
        return new UpdateAccount();
    }

    /**
     * Create an instance of {@link ProcessAccountAsyncResponse }
     * 
     */
    public ProcessAccountAsyncResponse createProcessAccountAsyncResponse() {
        return new ProcessAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link GetEntityListResponse }
     * 
     */
    public GetEntityListResponse createGetEntityListResponse() {
        return new GetEntityListResponse();
    }

    /**
     * Create an instance of {@link ProcessCSAccountAsync }
     * 
     */
    public ProcessCSAccountAsync createProcessCSAccountAsync() {
        return new ProcessCSAccountAsync();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsyncResponse }
     * 
     */
    public GetServiceLastUpdateTimeAsyncResponse createGetServiceLastUpdateTimeAsyncResponse() {
        return new GetServiceLastUpdateTimeAsyncResponse();
    }

    /**
     * Create an instance of {@link MergeAccount }
     * 
     */
    public MergeAccount createMergeAccount() {
        return new MergeAccount();
    }

    /**
     * Create an instance of {@link DeleteAccountAsyncResponse }
     * 
     */
    public DeleteAccountAsyncResponse createDeleteAccountAsyncResponse() {
        return new DeleteAccountAsyncResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsResponse }
     * 
     */
    public GetDfltObjAttrHintsResponse createGetDfltObjAttrHintsResponse() {
        return new GetDfltObjAttrHintsResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeResponse }
     * 
     */
    public GetServiceLastUpdateTimeResponse createGetServiceLastUpdateTimeResponse() {
        return new GetServiceLastUpdateTimeResponse();
    }

    /**
     * Create an instance of {@link ProcessCSAccount }
     * 
     */
    public ProcessCSAccount createProcessCSAccount() {
        return new ProcessCSAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTime }
     * 
     */
    public GetServiceLastUpdateTime createGetServiceLastUpdateTime() {
        return new GetServiceLastUpdateTime();
    }

    /**
     * Create an instance of {@link ChildFindCriteria }
     * 
     */
    public ChildFindCriteria createChildFindCriteria() {
        return new ChildFindCriteria();
    }

    /**
     * Create an instance of {@link BigDecimalResult }
     * 
     */
    public BigDecimalResult createBigDecimalResult() {
        return new BigDecimalResult();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link SortAttribute }
     * 
     */
    public SortAttribute createSortAttribute() {
        return new SortAttribute();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link TimeResult }
     * 
     */
    public TimeResult createTimeResult() {
        return new TimeResult();
    }

    /**
     * Create an instance of {@link DateResult }
     * 
     */
    public DateResult createDateResult() {
        return new DateResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaRow }
     * 
     */
    public ViewCriteriaRow createViewCriteriaRow() {
        return new ViewCriteriaRow();
    }

    /**
     * Create an instance of {@link BytesResult }
     * 
     */
    public BytesResult createBytesResult() {
        return new BytesResult();
    }

    /**
     * Create an instance of {@link CtrlHint }
     * 
     */
    public CtrlHint createCtrlHint() {
        return new CtrlHint();
    }

    /**
     * Create an instance of {@link DoubleResult }
     * 
     */
    public DoubleResult createDoubleResult() {
        return new DoubleResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaItem }
     * 
     */
    public ViewCriteriaItem createViewCriteriaItem() {
        return new ViewCriteriaItem();
    }

    /**
     * Create an instance of {@link ShortResult }
     * 
     */
    public ShortResult createShortResult() {
        return new ShortResult();
    }

    /**
     * Create an instance of {@link BigIntegerResult }
     * 
     */
    public BigIntegerResult createBigIntegerResult() {
        return new BigIntegerResult();
    }

    /**
     * Create an instance of {@link DataHandlerResult }
     * 
     */
    public DataHandlerResult createDataHandlerResult() {
        return new DataHandlerResult();
    }

    /**
     * Create an instance of {@link IntegerResult }
     * 
     */
    public IntegerResult createIntegerResult() {
        return new IntegerResult();
    }

    /**
     * Create an instance of {@link FloatResult }
     * 
     */
    public FloatResult createFloatResult() {
        return new FloatResult();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link ByteResult }
     * 
     */
    public ByteResult createByteResult() {
        return new ByteResult();
    }

    /**
     * Create an instance of {@link LongResult }
     * 
     */
    public LongResult createLongResult() {
        return new LongResult();
    }

    /**
     * Create an instance of {@link AttrCtrlHints }
     * 
     */
    public AttrCtrlHints createAttrCtrlHints() {
        return new AttrCtrlHints();
    }

    /**
     * Create an instance of {@link ViewCriteria }
     * 
     */
    public ViewCriteria createViewCriteria() {
        return new ViewCriteria();
    }

    /**
     * Create an instance of {@link TimestampResult }
     * 
     */
    public TimestampResult createTimestampResult() {
        return new TimestampResult();
    }

    /**
     * Create an instance of {@link ServiceErrorMessage }
     * 
     */
    public ServiceErrorMessage createServiceErrorMessage() {
        return new ServiceErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceMessage }
     * 
     */
    public ServiceMessage createServiceMessage() {
        return new ServiceMessage();
    }

    /**
     * Create an instance of {@link ServiceDMLErrorMessage }
     * 
     */
    public ServiceDMLErrorMessage createServiceDMLErrorMessage() {
        return new ServiceDMLErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceRowValErrorMessage }
     * 
     */
    public ServiceRowValErrorMessage createServiceRowValErrorMessage() {
        return new ServiceRowValErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceAttrValErrorMessage }
     * 
     */
    public ServiceAttrValErrorMessage createServiceAttrValErrorMessage() {
        return new ServiceAttrValErrorMessage();
    }

    /**
     * Create an instance of {@link JavaInfo }
     * 
     */
    public JavaInfo createJavaInfo() {
        return new JavaInfo();
    }

    /**
     * Create an instance of {@link DataGraphType }
     * 
     */
    public DataGraphType createDataGraphType() {
        return new DataGraphType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Types }
     * 
     */
    public Types createTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link XSDType }
     * 
     */
    public XSDType createXSDType() {
        return new XSDType();
    }

    /**
     * Create an instance of {@link ChangeSummaryType }
     * 
     */
    public ChangeSummaryType createChangeSummaryType() {
        return new ChangeSummaryType();
    }

    /**
     * Create an instance of {@link XMLInfo }
     * 
     */
    public XMLInfo createXMLInfo() {
        return new XMLInfo();
    }

    /**
     * Create an instance of {@link AccountResult }
     * 
     */
    public AccountResult createAccountResult() {
        return new AccountResult();
    }

    /**
     * Create an instance of {@link SalesTeamMember }
     * 
     */
    public SalesTeamMember createSalesTeamMember() {
        return new SalesTeamMember();
    }

    /**
     * Create an instance of {@link PrimaryAddress }
     * 
     */
    public PrimaryAddress createPrimaryAddress() {
        return new PrimaryAddress();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link NoteDFF }
     * 
     */
    public NoteDFF createNoteDFF() {
        return new NoteDFF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesTeamMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "salesTeamMember")
    public JAXBElement<SalesTeamMember> createSalesTeamMember(SalesTeamMember value) {
        return new JAXBElement<SalesTeamMember>(_SalesTeamMember_QNAME, SalesTeamMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "noteDFF")
    public JAXBElement<NoteDFF> createNoteDFF(NoteDFF value) {
        return new JAXBElement<NoteDFF>(_NoteDFF_QNAME, NoteDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Types }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "types")
    public JAXBElement<Types> createTypes(Types value) {
        return new JAXBElement<Types>(_Types_QNAME, Types.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "dataObject")
    public JAXBElement<Object> createDataObject(Object value) {
        return new JAXBElement<Object>(_DataObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/errors/", name = "ServiceErrorMessage")
    public JAXBElement<ServiceErrorMessage> createServiceErrorMessage(ServiceErrorMessage value) {
        return new JAXBElement<ServiceErrorMessage>(_ServiceErrorMessage_QNAME, ServiceErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "datagraph")
    public JAXBElement<DataGraphType> createDatagraph(DataGraphType value) {
        return new JAXBElement<DataGraphType>(_Datagraph_QNAME, DataGraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "accountResult")
    public JAXBElement<AccountResult> createAccountResult(AccountResult value) {
        return new JAXBElement<AccountResult>(_AccountResult_QNAME, AccountResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processData")
    public JAXBElement<ProcessData> createProcessData(ProcessData value) {
        return new JAXBElement<ProcessData>(_ProcessData_QNAME, ProcessData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findCriteria")
    public JAXBElement<FindCriteria> createFindCriteria(FindCriteria value) {
        return new JAXBElement<FindCriteria>(_FindCriteria_QNAME, FindCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findControl")
    public JAXBElement<FindControl> createFindControl(FindControl value) {
        return new JAXBElement<FindControl>(_FindControl_QNAME, FindControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processControl")
    public JAXBElement<ProcessControl> createProcessControl(ProcessControl value) {
        return new JAXBElement<ProcessControl>(_ProcessControl_QNAME, ProcessControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "primaryAddress")
    public JAXBElement<PrimaryAddress> createPrimaryAddress(PrimaryAddress value) {
        return new JAXBElement<PrimaryAddress>(_PrimaryAddress_QNAME, PrimaryAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "EndDateActive", scope = SalesTeamMember.class)
    public JAXBElement<XMLGregorianCalendar> createSalesTeamMemberEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesTeamMemberEndDateActive_QNAME, XMLGregorianCalendar.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "UserLastUpdateDate", scope = SalesTeamMember.class)
    public JAXBElement<XMLGregorianCalendar> createSalesTeamMemberUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesTeamMemberUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ResourcePartyNumber", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberResourcePartyNumber(String value) {
        return new JAXBElement<String>(_SalesTeamMemberResourcePartyNumber_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AssignmentTypeCode", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberAssignmentTypeCode(String value) {
        return new JAXBElement<String>(_SalesTeamMemberAssignmentTypeCode_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ResourceId", scope = SalesTeamMember.class)
    public JAXBElement<Long> createSalesTeamMemberResourceId(Long value) {
        return new JAXBElement<Long>(_SalesTeamMemberResourceId_QNAME, Long.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "LastUpdateLogin", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesTeamMemberLastUpdateLogin_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "StartDateActive", scope = SalesTeamMember.class)
    public JAXBElement<XMLGregorianCalendar> createSalesTeamMemberStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesTeamMemberStartDateActive_QNAME, XMLGregorianCalendar.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "MemberFunctionCode", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberMemberFunctionCode(String value) {
        return new JAXBElement<String>(_SalesTeamMemberMemberFunctionCode_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ResourceEmailAddress", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberResourceEmailAddress(String value) {
        return new JAXBElement<String>(_SalesTeamMemberResourceEmailAddress_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid2", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid2(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid2_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid3", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid3(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid3_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid4", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid4(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid4_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid5", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid5(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid5_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeCategory", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeCategory(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeCategory_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "ContactRelationshipId", scope = Note.class)
    public JAXBElement<Long> createNoteContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_NoteContactRelationshipId_QNAME, Long.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid1", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid1(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid1_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CreatorPartyId", scope = Note.class)
    public JAXBElement<Long> createNoteCreatorPartyId(Long value) {
        return new JAXBElement<Long>(_NoteCreatorPartyId_QNAME, Long.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CurcyConvRateType", scope = Note.class)
    public JAXBElement<String> createNoteCurcyConvRateType(String value) {
        return new JAXBElement<String>(_NoteCurcyConvRateType_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CurrencyCode", scope = Note.class)
    public JAXBElement<String> createNoteCurrencyCode(String value) {
        return new JAXBElement<String>(_NoteCurrencyCode_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CorpCurrencyCode", scope = Note.class)
    public JAXBElement<String> createNoteCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_NoteCorpCurrencyCode_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "HouseType", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressHouseType(String value) {
        return new JAXBElement<String>(_PrimaryAddressHouseType_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLinesPhonetic", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLinesPhonetic(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLinesPhonetic_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Comments", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressComments(String value) {
        return new JAXBElement<String>(_PrimaryAddressComments_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Description", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressDescription(String value) {
        return new JAXBElement<String>(_PrimaryAddressDescription_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute4", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute4(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute4_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "LastUpdateLogin", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesTeamMemberLastUpdateLogin_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute5", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute5(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute5_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "DateValidated", scope = PrimaryAddress.class)
    public JAXBElement<XMLGregorianCalendar> createPrimaryAddressDateValidated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrimaryAddressDateValidated_QNAME, XMLGregorianCalendar.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "CurrencyCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCurrencyCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressCurrencyCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Province", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressProvince(String value) {
        return new JAXBElement<String>(_PrimaryAddressProvince_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "FormattedAddress", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressFormattedAddress(String value) {
        return new JAXBElement<String>(_PrimaryAddressFormattedAddress_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "City", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCity(String value) {
        return new JAXBElement<String>(_PrimaryAddressCity_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Mailstop", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressMailstop(String value) {
        return new JAXBElement<String>(_PrimaryAddressMailstop_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "County", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCounty(String value) {
        return new JAXBElement<String>(_PrimaryAddressCounty_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "PostalCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressPostalCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressPostalCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "SourceSystemReferenceValue", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_PrimaryAddressSourceSystemReferenceValue_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "State", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressState(String value) {
        return new JAXBElement<String>(_PrimaryAddressState_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine4", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine4(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine4_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Longitude", scope = PrimaryAddress.class)
    public JAXBElement<BigDecimal> createPrimaryAddressLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrimaryAddressLongitude_QNAME, BigDecimal.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "CorpCurrencyCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressCorpCurrencyCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine1", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine1(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine1_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "PostalPlus4Code", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressPostalPlus4Code(String value) {
        return new JAXBElement<String>(_PrimaryAddressPostalPlus4Code_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "FormattedMultiLineAddress", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressFormattedMultiLineAddress(String value) {
        return new JAXBElement<String>(_PrimaryAddressFormattedMultiLineAddress_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "LocationDirections", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressLocationDirections(String value) {
        return new JAXBElement<String>(_PrimaryAddressLocationDirections_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine3", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine3(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine3_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "SourceSystem", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressSourceSystem(String value) {
        return new JAXBElement<String>(_PrimaryAddressSourceSystem_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine2", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine2(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine2_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Building", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressBuilding(String value) {
        return new JAXBElement<String>(_PrimaryAddressBuilding_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "DeleteFlag", scope = PrimaryAddress.class)
    public JAXBElement<Boolean> createPrimaryAddressDeleteFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PrimaryAddressDeleteFlag_QNAME, Boolean.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "FloorNumber", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressFloorNumber(String value) {
        return new JAXBElement<String>(_PrimaryAddressFloorNumber_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ValidationStatusCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressValidationStatusCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressValidationStatusCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "CurcyConvRateType", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PrimaryAddressCurcyConvRateType_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Latitude", scope = PrimaryAddress.class)
    public JAXBElement<BigDecimal> createPrimaryAddressLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrimaryAddressLatitude_QNAME, BigDecimal.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ValidatedFlag", scope = PrimaryAddress.class)
    public JAXBElement<Boolean> createPrimaryAddressValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PrimaryAddressValidatedFlag_QNAME, Boolean.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute1", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute1(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute1_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute3", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute3(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute3_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute2", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute2(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute2_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "_FLEX_NumOfSegments", scope = NoteDFF.class)
    public JAXBElement<Integer> createNoteDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_NoteDFFFLEXNumOfSegments_QNAME, Integer.class, NoteDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "__FLEX_Context", scope = NoteDFF.class)
    public JAXBElement<String> createNoteDFFFLEXContext(String value) {
        return new JAXBElement<String>(_NoteDFFFLEXContext_QNAME, String.class, NoteDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OwnerEmailAddress", scope = Account.class)
    public JAXBElement<String> createAccountOwnerEmailAddress(String value) {
        return new JAXBElement<String>(_AccountOwnerEmailAddress_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "SiebelLocation", scope = Account.class)
    public JAXBElement<String> createAccountSiebelLocation(String value) {
        return new JAXBElement<String>(_AccountSiebelLocation_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "EmailFormat", scope = Account.class)
    public JAXBElement<String> createAccountEmailFormat(String value) {
        return new JAXBElement<String>(_AccountEmailFormat_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CEOName", scope = Account.class)
    public JAXBElement<String> createAccountCEOName(String value) {
        return new JAXBElement<String>(_AccountCEOName_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LocalActivityCodeType", scope = Account.class)
    public JAXBElement<String> createAccountLocalActivityCodeType(String value) {
        return new JAXBElement<String>(_AccountLocalActivityCodeType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "EmployeesAtPrimaryAddressMinimum", scope = Account.class)
    public JAXBElement<String> createAccountEmployeesAtPrimaryAddressMinimum(String value) {
        return new JAXBElement<String>(_AccountEmployeesAtPrimaryAddressMinimum_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "DUNSNumber", scope = Account.class)
    public JAXBElement<String> createAccountDUNSNumber(String value) {
        return new JAXBElement<String>(_AccountDUNSNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "Comments", scope = Account.class)
    public JAXBElement<String> createAccountComments(String value) {
        return new JAXBElement<String>(_AccountComments_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LocalBusinessIdentifierType", scope = Account.class)
    public JAXBElement<String> createAccountLocalBusinessIdentifierType(String value) {
        return new JAXBElement<String>(_AccountLocalBusinessIdentifierType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "FaxAreaCode", scope = Account.class)
    public JAXBElement<String> createAccountFaxAreaCode(String value) {
        return new JAXBElement<String>(_AccountFaxAreaCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LastAssignmentDateTime", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountLastAssignmentDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountLastAssignmentDateTime_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "MinorityOwnedIndicator", scope = Account.class)
    public JAXBElement<String> createAccountMinorityOwnedIndicator(String value) {
        return new JAXBElement<String>(_AccountMinorityOwnedIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "GrowthStrategyDescription", scope = Account.class)
    public JAXBElement<String> createAccountGrowthStrategyDescription(String value) {
        return new JAXBElement<String>(_AccountGrowthStrategyDescription_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LastAssignmentDate", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountLastAssignmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountLastAssignmentDate_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CorporationClass", scope = Account.class)
    public JAXBElement<String> createAccountCorporationClass(String value) {
        return new JAXBElement<String>(_AccountCorporationClass_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "IndustryCode", scope = Account.class)
    public JAXBElement<String> createAccountIndustryCode(String value) {
        return new JAXBElement<String>(_AccountIndustryCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "AnalysisFiscalYear", scope = Account.class)
    public JAXBElement<String> createAccountAnalysisFiscalYear(String value) {
        return new JAXBElement<String>(_AccountAnalysisFiscalYear_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ParentOrSubsidiaryIndicator", scope = Account.class)
    public JAXBElement<String> createAccountParentOrSubsidiaryIndicator(String value) {
        return new JAXBElement<String>(_AccountParentOrSubsidiaryIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PhoneCountryCode", scope = Account.class)
    public JAXBElement<String> createAccountPhoneCountryCode(String value) {
        return new JAXBElement<String>(_AccountPhoneCountryCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "FaxExtension", scope = Account.class)
    public JAXBElement<String> createAccountFaxExtension(String value) {
        return new JAXBElement<String>(_AccountFaxExtension_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PhoneAreaCode", scope = Account.class)
    public JAXBElement<String> createAccountPhoneAreaCode(String value) {
        return new JAXBElement<String>(_AccountPhoneAreaCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "EmployeesAtPrimaryAddressText", scope = Account.class)
    public JAXBElement<String> createAccountEmployeesAtPrimaryAddressText(String value) {
        return new JAXBElement<String>(_AccountEmployeesAtPrimaryAddressText_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "DomesticUltimateDUNSNumber", scope = Account.class)
    public JAXBElement<String> createAccountDomesticUltimateDUNSNumber(String value) {
        return new JAXBElement<String>(_AccountDomesticUltimateDUNSNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "YearEstablished", scope = Account.class)
    public JAXBElement<Integer> createAccountYearEstablished(Integer value) {
        return new JAXBElement<Integer>(_AccountYearEstablished_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "Type", scope = Account.class)
    public JAXBElement<String> createAccountType(String value) {
        return new JAXBElement<String>(_AccountType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "TotalEmployeesIndicator", scope = Account.class)
    public JAXBElement<String> createAccountTotalEmployeesIndicator(String value) {
        return new JAXBElement<String>(_AccountTotalEmployeesIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OrganizationDEO_CreditHealthScoreText_c", scope = Account.class)
    public JAXBElement<String> createAccountOrganizationDEOCreditHealthScoreTextC(String value) {
        return new JAXBElement<String>(_AccountOrganizationDEOCreditHealthScoreTextC_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OwnerPartyId", scope = Account.class)
    public JAXBElement<Long> createAccountOwnerPartyId(Long value) {
        return new JAXBElement<Long>(_AccountOwnerPartyId_QNAME, Long.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "FormattedPhoneNumber", scope = Account.class)
    public JAXBElement<String> createAccountFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_AccountFormattedPhoneNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "RecordSet", scope = Account.class)
    public JAXBElement<String> createAccountRecordSet(String value) {
        return new JAXBElement<String>(_AccountRecordSet_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "AssignmentExceptionFlag", scope = Account.class)
    public JAXBElement<Boolean> createAccountAssignmentExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountAssignmentExceptionFlag_QNAME, Boolean.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "HQBranchIndicator", scope = Account.class)
    public JAXBElement<String> createAccountHQBranchIndicator(String value) {
        return new JAXBElement<String>(_AccountHQBranchIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "TotalEmployeesMinimumIndicator", scope = Account.class)
    public JAXBElement<String> createAccountTotalEmployeesMinimumIndicator(String value) {
        return new JAXBElement<String>(_AccountTotalEmployeesMinimumIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "DisadvantageIndicator", scope = Account.class)
    public JAXBElement<String> createAccountDisadvantageIndicator(String value) {
        return new JAXBElement<String>(_AccountDisadvantageIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrimaryContactEmail", scope = Account.class)
    public JAXBElement<String> createAccountPrimaryContactEmail(String value) {
        return new JAXBElement<String>(_AccountPrimaryContactEmail_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "GeneralServicesAdministrationFlag", scope = Account.class)
    public JAXBElement<Boolean> createAccountGeneralServicesAdministrationFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountGeneralServicesAdministrationFlag_QNAME, Boolean.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LocalBusinessIdentifier", scope = Account.class)
    public JAXBElement<String> createAccountLocalBusinessIdentifier(String value) {
        return new JAXBElement<String>(_AccountLocalBusinessIdentifier_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PhoneExtension", scope = Account.class)
    public JAXBElement<String> createAccountPhoneExtension(String value) {
        return new JAXBElement<String>(_AccountPhoneExtension_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "StockSymbol", scope = Account.class)
    public JAXBElement<String> createAccountStockSymbol(String value) {
        return new JAXBElement<String>(_AccountStockSymbol_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "WomanOwnedIndicator", scope = Account.class)
    public JAXBElement<String> createAccountWomanOwnedIndicator(String value) {
        return new JAXBElement<String>(_AccountWomanOwnedIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LineOfBusiness", scope = Account.class)
    public JAXBElement<String> createAccountLineOfBusiness(String value) {
        return new JAXBElement<String>(_AccountLineOfBusiness_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CurrencyCode", scope = Account.class)
    public JAXBElement<String> createAccountCurrencyCode(String value) {
        return new JAXBElement<String>(_AccountCurrencyCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "TotalEmployeesEstimatedIndicator", scope = Account.class)
    public JAXBElement<String> createAccountTotalEmployeesEstimatedIndicator(String value) {
        return new JAXBElement<String>(_AccountTotalEmployeesEstimatedIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "SourceSystemReferenceValue", scope = Account.class)
    public JAXBElement<String> createAccountSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_AccountSourceSystemReferenceValue_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "NextFiscalYearPotentialRevenueAmount", scope = Account.class)
    public JAXBElement<AmountType> createAccountNextFiscalYearPotentialRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountNextFiscalYearPotentialRevenueAmount_QNAME, AmountType.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "FiscalYearendMonth", scope = Account.class)
    public JAXBElement<String> createAccountFiscalYearendMonth(String value) {
        return new JAXBElement<String>(_AccountFiscalYearendMonth_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "SourceSystem", scope = Account.class)
    public JAXBElement<String> createAccountSourceSystem(String value) {
        return new JAXBElement<String>(_AccountSourceSystem_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "FaxCountryCode", scope = Account.class)
    public JAXBElement<String> createAccountFaxCountryCode(String value) {
        return new JAXBElement<String>(_AccountFaxCountryCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ExportIndicator", scope = Account.class)
    public JAXBElement<String> createAccountExportIndicator(String value) {
        return new JAXBElement<String>(_AccountExportIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PublicPrivateOwnershipFlag", scope = Account.class)
    public JAXBElement<Boolean> createAccountPublicPrivateOwnershipFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountPublicPrivateOwnershipFlag_QNAME, Boolean.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "YearIncorporated", scope = Account.class)
    public JAXBElement<Integer> createAccountYearIncorporated(Integer value) {
        return new JAXBElement<Integer>(_AccountYearIncorporated_QNAME, Integer.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrincipalName", scope = Account.class)
    public JAXBElement<String> createAccountPrincipalName(String value) {
        return new JAXBElement<String>(_AccountPrincipalName_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrincipalTitle", scope = Account.class)
    public JAXBElement<String> createAccountPrincipalTitle(String value) {
        return new JAXBElement<String>(_AccountPrincipalTitle_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ImportIndicator", scope = Account.class)
    public JAXBElement<String> createAccountImportIndicator(String value) {
        return new JAXBElement<String>(_AccountImportIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "MinorityOwnedType", scope = Account.class)
    public JAXBElement<String> createAccountMinorityOwnedType(String value) {
        return new JAXBElement<String>(_AccountMinorityOwnedType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "MissionStatement", scope = Account.class)
    public JAXBElement<String> createAccountMissionStatement(String value) {
        return new JAXBElement<String>(_AccountMissionStatement_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PreferredFunctionalCurrency", scope = Account.class)
    public JAXBElement<String> createAccountPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_AccountPreferredFunctionalCurrency_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OrganizationDEO_TimeWSTest_c", scope = Account.class)
    public JAXBElement<byte[]> createAccountOrganizationDEOTimeWSTestC(byte[] value) {
        return new JAXBElement<byte[]>(_AccountOrganizationDEOTimeWSTestC_QNAME, byte[].class, Account.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "GlobalUltimateDUNSNumber", scope = Account.class)
    public JAXBElement<String> createAccountGlobalUltimateDUNSNumber(String value) {
        return new JAXBElement<String>(_AccountGlobalUltimateDUNSNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OrganizationDEO_TestWS_c", scope = Account.class)
    public JAXBElement<String> createAccountOrganizationDEOTestWSC(String value) {
        return new JAXBElement<String>(_AccountOrganizationDEOTestWSC_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CertificationReasonCode", scope = Account.class)
    public JAXBElement<String> createAccountCertificationReasonCode(String value) {
        return new JAXBElement<String>(_AccountCertificationReasonCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "FormattedFaxNumber", scope = Account.class)
    public JAXBElement<String> createAccountFormattedFaxNumber(String value) {
        return new JAXBElement<String>(_AccountFormattedFaxNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "EmployeesAtPrimaryAddress", scope = Account.class)
    public JAXBElement<String> createAccountEmployeesAtPrimaryAddress(String value) {
        return new JAXBElement<String>(_AccountEmployeesAtPrimaryAddress_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "RegistrationType", scope = Account.class)
    public JAXBElement<String> createAccountRegistrationType(String value) {
        return new JAXBElement<String>(_AccountRegistrationType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CurrentFiscalYearPotentialRevenueAmount", scope = Account.class)
    public JAXBElement<AmountType> createAccountCurrentFiscalYearPotentialRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountCurrentFiscalYearPotentialRevenueAmount_QNAME, AmountType.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CurcyConvRateType", scope = Account.class)
    public JAXBElement<String> createAccountCurcyConvRateType(String value) {
        return new JAXBElement<String>(_AccountCurcyConvRateType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ExistingCustomerFlag", scope = Account.class)
    public JAXBElement<Boolean> createAccountExistingCustomerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountExistingCustomerFlag_QNAME, Boolean.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OrganizationSize", scope = Account.class)
    public JAXBElement<String> createAccountOrganizationSize(String value) {
        return new JAXBElement<String>(_AccountOrganizationSize_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OutOfBusinessIndicator", scope = Account.class)
    public JAXBElement<String> createAccountOutOfBusinessIndicator(String value) {
        return new JAXBElement<String>(_AccountOutOfBusinessIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "RentOrOwnIndicator", scope = Account.class)
    public JAXBElement<String> createAccountRentOrOwnIndicator(String value) {
        return new JAXBElement<String>(_AccountRentOrOwnIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "HomeCountry", scope = Account.class)
    public JAXBElement<String> createAccountHomeCountry(String value) {
        return new JAXBElement<String>(_AccountHomeCountry_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "IndustryCodeType", scope = Account.class)
    public JAXBElement<String> createAccountIndustryCodeType(String value) {
        return new JAXBElement<String>(_AccountIndustryCodeType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CreatedByModule", scope = Account.class, defaultValue = "HZ_WS")
    public JAXBElement<String> createAccountCreatedByModule(String value) {
        return new JAXBElement<String>(_AccountCreatedByModule_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PhoneNumber", scope = Account.class)
    public JAXBElement<String> createAccountPhoneNumber(String value) {
        return new JAXBElement<String>(_AccountPhoneNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ParentAccountPartyNumber", scope = Account.class)
    public JAXBElement<String> createAccountParentAccountPartyNumber(String value) {
        return new JAXBElement<String>(_AccountParentAccountPartyNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LaborSurplusIndicator", scope = Account.class)
    public JAXBElement<String> createAccountLaborSurplusIndicator(String value) {
        return new JAXBElement<String>(_AccountLaborSurplusIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrimaryContactPhone", scope = Account.class)
    public JAXBElement<String> createAccountPrimaryContactPhone(String value) {
        return new JAXBElement<String>(_AccountPrimaryContactPhone_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrimaryContactSourceSystem", scope = Account.class)
    public JAXBElement<String> createAccountPrimaryContactSourceSystem(String value) {
        return new JAXBElement<String>(_AccountPrimaryContactSourceSystem_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LegalStatus", scope = Account.class)
    public JAXBElement<String> createAccountLegalStatus(String value) {
        return new JAXBElement<String>(_AccountLegalStatus_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "DoNotConfuseWith", scope = Account.class)
    public JAXBElement<String> createAccountDoNotConfuseWith(String value) {
        return new JAXBElement<String>(_AccountDoNotConfuseWith_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "BusinessReport", scope = Account.class)
    public JAXBElement<byte[]> createAccountBusinessReport(byte[] value) {
        return new JAXBElement<byte[]>(_AccountBusinessReport_QNAME, byte[].class, Account.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "NamedFlag", scope = Account.class)
    public JAXBElement<Boolean> createAccountNamedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountNamedFlag_QNAME, Boolean.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "BusinessScope", scope = Account.class)
    public JAXBElement<String> createAccountBusinessScope(String value) {
        return new JAXBElement<String>(_AccountBusinessScope_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrimaryContactPartyNumber", scope = Account.class)
    public JAXBElement<String> createAccountPrimaryContactPartyNumber(String value) {
        return new JAXBElement<String>(_AccountPrimaryContactPartyNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ControlYear", scope = Account.class)
    public JAXBElement<BigDecimal> createAccountControlYear(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AccountControlYear_QNAME, BigDecimal.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CertificationLevel", scope = Account.class)
    public JAXBElement<String> createAccountCertificationLevel(String value) {
        return new JAXBElement<String>(_AccountCertificationLevel_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrimaryContactPartyId", scope = Account.class)
    public JAXBElement<Long> createAccountPrimaryContactPartyId(Long value) {
        return new JAXBElement<Long>(_AccountPrimaryContactPartyId_QNAME, Long.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrimaryContactSourceSystemReferenceValue", scope = Account.class)
    public JAXBElement<String> createAccountPrimaryContactSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_AccountPrimaryContactSourceSystemReferenceValue_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "TaxpayerIdentificationNumber", scope = Account.class)
    public JAXBElement<String> createAccountTaxpayerIdentificationNumber(String value) {
        return new JAXBElement<String>(_AccountTaxpayerIdentificationNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "TotalPaymentAmount", scope = Account.class)
    public JAXBElement<AmountType> createAccountTotalPaymentAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountTotalPaymentAmount_QNAME, AmountType.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ParentAccountSourceSystem", scope = Account.class)
    public JAXBElement<String> createAccountParentAccountSourceSystem(String value) {
        return new JAXBElement<String>(_AccountParentAccountSourceSystem_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "FaxNumber", scope = Account.class)
    public JAXBElement<String> createAccountFaxNumber(String value) {
        return new JAXBElement<String>(_AccountFaxNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PrimaryContactName", scope = Account.class)
    public JAXBElement<String> createAccountPrimaryContactName(String value) {
        return new JAXBElement<String>(_AccountPrimaryContactName_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CEOTitle", scope = Account.class)
    public JAXBElement<String> createAccountCEOTitle(String value) {
        return new JAXBElement<String>(_AccountCEOTitle_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "EmployeesTotal", scope = Account.class)
    public JAXBElement<BigDecimal> createAccountEmployeesTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AccountEmployeesTotal_QNAME, BigDecimal.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OrganizationDEO_CreditHealthScore_c", scope = Account.class)
    public JAXBElement<BigDecimal> createAccountOrganizationDEOCreditHealthScoreC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AccountOrganizationDEOCreditHealthScoreC_QNAME, BigDecimal.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "SmallBusinessIndicator", scope = Account.class)
    public JAXBElement<String> createAccountSmallBusinessIndicator(String value) {
        return new JAXBElement<String>(_AccountSmallBusinessIndicator_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LastEnrichmentDate", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountLastEnrichmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountLastEnrichmentDate_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "DUNSCreditRating", scope = Account.class)
    public JAXBElement<String> createAccountDUNSCreditRating(String value) {
        return new JAXBElement<String>(_AccountDUNSCreditRating_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "UniqueNameSuffix", scope = Account.class)
    public JAXBElement<String> createAccountUniqueNameSuffix(String value) {
        return new JAXBElement<String>(_AccountUniqueNameSuffix_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LastUpdateLogin", scope = Account.class)
    public JAXBElement<String> createAccountLastUpdateLogin(String value) {
        return new JAXBElement<String>(_AccountLastUpdateLogin_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "PreferredContactMethod", scope = Account.class)
    public JAXBElement<String> createAccountPreferredContactMethod(String value) {
        return new JAXBElement<String>(_AccountPreferredContactMethod_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "LocalActivityCode", scope = Account.class)
    public JAXBElement<String> createAccountLocalActivityCode(String value) {
        return new JAXBElement<String>(_AccountLocalActivityCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "EmployeesAtPrimaryAddressEstimation", scope = Account.class)
    public JAXBElement<String> createAccountEmployeesAtPrimaryAddressEstimation(String value) {
        return new JAXBElement<String>(_AccountEmployeesAtPrimaryAddressEstimation_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ExistingCustomerFlagLastUpdateDate", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountExistingCustomerFlagLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountExistingCustomerFlagLastUpdateDate_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CongressionalDistrictCode", scope = Account.class)
    public JAXBElement<String> createAccountCongressionalDistrictCode(String value) {
        return new JAXBElement<String>(_AccountCongressionalDistrictCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "DataCloudStatus", scope = Account.class)
    public JAXBElement<String> createAccountDataCloudStatus(String value) {
        return new JAXBElement<String>(_AccountDataCloudStatus_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "SalesProfileStatus", scope = Account.class)
    public JAXBElement<String> createAccountSalesProfileStatus(String value) {
        return new JAXBElement<String>(_AccountSalesProfileStatus_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "OrganizationType", scope = Account.class)
    public JAXBElement<String> createAccountOrganizationType(String value) {
        return new JAXBElement<String>(_AccountOrganizationType_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ParentAccountPartyId", scope = Account.class)
    public JAXBElement<Long> createAccountParentAccountPartyId(Long value) {
        return new JAXBElement<Long>(_AccountParentAccountPartyId_QNAME, Long.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ParentDUNSNumber", scope = Account.class)
    public JAXBElement<String> createAccountParentDUNSNumber(String value) {
        return new JAXBElement<String>(_AccountParentDUNSNumber_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "ParentAccountSourceSystemReferenceValue", scope = Account.class)
    public JAXBElement<String> createAccountParentAccountSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_AccountParentAccountSourceSystemReferenceValue_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "CorpCurrencyCode", scope = Account.class)
    public JAXBElement<String> createAccountCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_AccountCorpCurrencyCode_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/", name = "TotalEmployeesText", scope = Account.class)
    public JAXBElement<String> createAccountTotalEmployeesText(String value) {
        return new JAXBElement<String>(_AccountTotalEmployeesText_QNAME, String.class, Account.class, value);
    }

}

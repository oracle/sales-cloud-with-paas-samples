
package com.oracle.xmlns.apps.cdm.foundation.parties.personservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.personservice package. 
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

    private final static QName _PersonProfile_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "personProfile");
    private final static QName _Education_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "education");
    private final static QName _Citizenship_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "citizenship");
    private final static QName _PersonInterest_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "personInterest");
    private final static QName _PersonResult_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "personResult");
    private final static QName _EmploymentHistory_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "employmentHistory");
    private final static QName _AdditionalPersonName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "additionalPersonName");
    private final static QName _WorkClass_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "workClass");
    private final static QName _Person_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "person");
    private final static QName _WorkClassCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CreatedByModule");
    private final static QName _WorkClassLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastUpdateLogin");
    private final static QName _WorkClassRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RequestId");
    private final static QName _WorkClassStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Status");
    private final static QName _WorkClassLevelOfExperience_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LevelOfExperience");
    private final static QName _PersonPreferredNameId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredNameId");
    private final static QName _PersonPrimaryPhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneCountryCode");
    private final static QName _PersonState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "State");
    private final static QName _PersonPrimaryPhoneExtension_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneExtension");
    private final static QName _PersonCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "County");
    private final static QName _PersonPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PostalCode");
    private final static QName _PersonProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Province");
    private final static QName _PersonCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "City");
    private final static QName _PersonPreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactMethod");
    private final static QName _PersonPrimaryPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneNumber");
    private final static QName _PersonIdenAddrPartySiteId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "IdenAddrPartySiteId");
    private final static QName _PersonURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "URL");
    private final static QName _PersonValidatedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ValidatedFlag");
    private final static QName _PersonMaritalStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MaritalStatus");
    private final static QName _PersonPrimaryPhonePurpose_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhonePurpose");
    private final static QName _PersonPrimaryURLContactPTId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryURLContactPTId");
    private final static QName _PersonPrimaryPhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneAreaCode");
    private final static QName _PersonPreferredName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredName");
    private final static QName _PersonGSAIndicatorFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "GSAIndicatorFlag");
    private final static QName _PersonCertificationLevel_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CertificationLevel");
    private final static QName _PersonPersonAcademicTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonAcademicTitle");
    private final static QName _PersonJgzzFiscalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "JgzzFiscalCode");
    private final static QName _PersonPersonPreNameAdjunct_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonPreNameAdjunct");
    private final static QName _PersonPrimaryPhoneLineType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneLineType");
    private final static QName _PersonPersonLastNamePrefix_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonLastNamePrefix");
    private final static QName _PersonLanguageName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LanguageName");
    private final static QName _PersonGender_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Gender");
    private final static QName _PersonPersonNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonNameSuffix");
    private final static QName _PersonDateOfBirth_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateOfBirth");
    private final static QName _PersonPersonMiddleName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonMiddleName");
    private final static QName _PersonCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Country");
    private final static QName _PersonCertReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CertReasonCode");
    private final static QName _PersonAddress4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address4");
    private final static QName _PersonSalutation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Salutation");
    private final static QName _PersonIdenAddrLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "IdenAddrLocationId");
    private final static QName _PersonPersonSecondLastName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonSecondLastName");
    private final static QName _PersonSICCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SICCode");
    private final static QName _PersonComments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Comments");
    private final static QName _PersonInternalFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "InternalFlag");
    private final static QName _PersonPersonPreviousLastName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonPreviousLastName");
    private final static QName _PersonPersonTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonTitle");
    private final static QName _PersonPrimaryPhoneContactPTId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneContactPTId");
    private final static QName _PersonEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmailAddress");
    private final static QName _PersonPrimaryEmailContactPTId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryEmailContactPTId");
    private final static QName _PersonAddress3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address3");
    private final static QName _PersonAddress2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address2");
    private final static QName _PersonPersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonFirstName");
    private final static QName _PersonAddress1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Address1");
    private final static QName _PersonSICCodeType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SICCodeType");
    private final static QName _PersonPreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredFunctionalCurrency");
    private final static QName _PersonMissionStatement_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MissionStatement");
    private final static QName _PersonPersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonLastName");
    private final static QName _PersonUserGUID_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "UserGUID");
    private final static QName _PersonPreferredContactPersonId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactPersonId");
    private final static QName _PersonThirdPartyFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ThirdPartyFlag");
    private final static QName _PersonCategoryCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CategoryCode");
    private final static QName _PersonInterestTeam_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Team");
    private final static QName _PersonInterestSince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Since");
    private final static QName _PersonInterestLevelOfParticipation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LevelOfParticipation");
    private final static QName _PersonInterestInterestTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "InterestTypeCode");
    private final static QName _PersonInterestLevelOfInterest_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LevelOfInterest");
    private final static QName _PersonInterestSubInterestTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SubInterestTypeCode");
    private final static QName _PersonInterestSportIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SportIndicator");
    private final static QName _PersonProfileCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CorpCurrencyCode");
    private final static QName _PersonProfilePersonalIncomeAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonalIncomeAmount");
    private final static QName _PersonProfileHouseholdIncomeAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "HouseholdIncomeAmount");
    private final static QName _PersonProfileAlias_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Alias");
    private final static QName _PersonProfileEffectiveEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EffectiveEndDate");
    private final static QName _PersonProfileCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurrencyCode");
    private final static QName _PersonProfilePlaceOfBirth_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PlaceOfBirth");
    private final static QName _PersonProfilePersonInitials_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonInitials");
    private final static QName _PersonProfilePrimaryURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryURL");
    private final static QName _PersonProfilePreferredContactEmail_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactEmail");
    private final static QName _PersonProfileUniqueNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "UniqueNameSuffix");
    private final static QName _PersonProfilePrimaryEmailId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryEmailId");
    private final static QName _PersonProfileSuffixOverriddenFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SuffixOverriddenFlag");
    private final static QName _PersonProfilePrimaryEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryEmailAddress");
    private final static QName _PersonProfilePrimaryPhoneId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryPhoneId");
    private final static QName _PersonProfileDeceasedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DeceasedFlag");
    private final static QName _PersonProfilePreferredContactName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactName");
    private final static QName _PersonProfilePrimaryAddressCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressCountry");
    private final static QName _PersonProfileOrigSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OrigSystem");
    private final static QName _PersonProfilePrimaryAddressState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressState");
    private final static QName _PersonProfilePrimaryFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryFormattedPhoneNumber");
    private final static QName _PersonProfileMaritalStatusEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MaritalStatusEffectiveDate");
    private final static QName _PersonProfileOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OrigSystemReference");
    private final static QName _PersonProfileDeclaredEthnicity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DeclaredEthnicity");
    private final static QName _PersonProfileLastKnownGPS_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastKnownGPS");
    private final static QName _PersonProfilePrimaryWebId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryWebId");
    private final static QName _PersonProfilePrimaryAddressCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressCounty");
    private final static QName _PersonProfilePreferredContactPhone_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactPhone");
    private final static QName _PersonProfilePrimaryLanguage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryLanguage");
    private final static QName _PersonProfilePrimaryFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryFormattedAddress");
    private final static QName _PersonProfileCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurcyConvRateType");
    private final static QName _PersonProfilePrimaryAddressLine4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine4");
    private final static QName _PersonProfilePrimaryAddressLine3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine3");
    private final static QName _PersonProfilePrimaryAddressLine2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine2");
    private final static QName _PersonProfilePrimaryAddressLine1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressLine1");
    private final static QName _PersonProfileHouseholdSize_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "HouseholdSize");
    private final static QName _PersonProfilePreferredContactURL_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredContactURL");
    private final static QName _PersonProfilePrimaryAddressProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressProvince");
    private final static QName _PersonProfileRentOwnInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RentOwnInd");
    private final static QName _PersonProfileDateOfDeath_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateOfDeath");
    private final static QName _PersonProfileHeadOfHouseholdFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "HeadOfHouseholdFlag");
    private final static QName _PersonProfilePersonName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonName");
    private final static QName _PersonProfilePronunciation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Pronunciation");
    private final static QName _PersonProfilePrimaryAddressPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressPostalCode");
    private final static QName _PersonProfilePrimaryAddressCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PrimaryAddressCity");
    private final static QName _PersonProfileEffectiveSequence_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EffectiveSequence");
    private final static QName _EducationTypeOfSchool_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TypeOfSchool");
    private final static QName _EducationStartDateAttended_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "StartDateAttended");
    private final static QName _EducationCourseMajor_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CourseMajor");
    private final static QName _EducationSchoolPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SchoolPartyId");
    private final static QName _EducationSchoolAttendedName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SchoolAttendedName");
    private final static QName _EducationLastDateAttended_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastDateAttended");
    private final static QName _EducationDegreeReceived_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DegreeReceived");
    private final static QName _AdditionalPersonNamePartyName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PartyName");
    private final static QName _AdditionalPersonNamePreferredFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PreferredFlag");
    private final static QName _AdditionalPersonNameTransliterationLang_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TransliterationLang");
    private final static QName _AdditionalPersonNameOverallPreferredFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "OverallPreferredFlag");
    private final static QName _AdditionalPersonNameDescription_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Description");
    private final static QName _CitizenshipDocumentReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DocumentReference");
    private final static QName _CitizenshipBirthOrSelected_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "BirthOrSelected");
    private final static QName _CitizenshipDocumentType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DocumentType");
    private final static QName _CitizenshipDateRecognized_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateRecognized");
    private final static QName _CitizenshipDateDisowned_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DateDisowned");
    private final static QName _CitizenshipEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EndDate");
    private final static QName _EmploymentHistorySupervisorName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SupervisorName");
    private final static QName _EmploymentHistoryEmployedAsTitleCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedAsTitleCode");
    private final static QName _EmploymentHistoryFractionOfTenure_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "FractionOfTenure");
    private final static QName _EmploymentHistoryServed_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Served");
    private final static QName _EmploymentHistoryStation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Station");
    private final static QName _EmploymentHistoryEmployedAsTitle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedAsTitle");
    private final static QName _EmploymentHistoryEmployedByDivisionName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedByDivisionName");
    private final static QName _EmploymentHistoryEmploymentTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmploymentTypeCode");
    private final static QName _EmploymentHistoryReasonForLeaving_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ReasonForLeaving");
    private final static QName _EmploymentHistoryResponsibility_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Responsibility");
    private final static QName _EmploymentHistoryEmployedByNameCompany_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedByNameCompany");
    private final static QName _EmploymentHistoryWeeklyWorkHours_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "WeeklyWorkHours");
    private final static QName _EmploymentHistoryTenureCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "TenureCode");
    private final static QName _EmploymentHistoryFacultyPositionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "FacultyPositionFlag");
    private final static QName _EmploymentHistoryEmployedByPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "EmployedByPartyId");
    private final static QName _EmploymentHistoryBranch_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Branch");
    private final static QName _EmploymentHistoryMilitaryRank_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "MilitaryRank");
    private final static QName _EmploymentHistoryBeginDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "BeginDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.personservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonResult }
     * 
     */
    public PersonResult createPersonResult() {
        return new PersonResult();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PersonProfile }
     * 
     */
    public PersonProfile createPersonProfile() {
        return new PersonProfile();
    }

    /**
     * Create an instance of {@link EmploymentHistory }
     * 
     */
    public EmploymentHistory createEmploymentHistory() {
        return new EmploymentHistory();
    }

    /**
     * Create an instance of {@link PersonInterest }
     * 
     */
    public PersonInterest createPersonInterest() {
        return new PersonInterest();
    }

    /**
     * Create an instance of {@link Citizenship }
     * 
     */
    public Citizenship createCitizenship() {
        return new Citizenship();
    }

    /**
     * Create an instance of {@link WorkClass }
     * 
     */
    public WorkClass createWorkClass() {
        return new WorkClass();
    }

    /**
     * Create an instance of {@link Education }
     * 
     */
    public Education createEducation() {
        return new Education();
    }

    /**
     * Create an instance of {@link AdditionalPersonName }
     * 
     */
    public AdditionalPersonName createAdditionalPersonName() {
        return new AdditionalPersonName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "personProfile")
    public JAXBElement<PersonProfile> createPersonProfile(PersonProfile value) {
        return new JAXBElement<PersonProfile>(_PersonProfile_QNAME, PersonProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Education }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "education")
    public JAXBElement<Education> createEducation(Education value) {
        return new JAXBElement<Education>(_Education_QNAME, Education.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Citizenship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "citizenship")
    public JAXBElement<Citizenship> createCitizenship(Citizenship value) {
        return new JAXBElement<Citizenship>(_Citizenship_QNAME, Citizenship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInterest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "personInterest")
    public JAXBElement<PersonInterest> createPersonInterest(PersonInterest value) {
        return new JAXBElement<PersonInterest>(_PersonInterest_QNAME, PersonInterest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "personResult")
    public JAXBElement<PersonResult> createPersonResult(PersonResult value) {
        return new JAXBElement<PersonResult>(_PersonResult_QNAME, PersonResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmploymentHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "employmentHistory")
    public JAXBElement<EmploymentHistory> createEmploymentHistory(EmploymentHistory value) {
        return new JAXBElement<EmploymentHistory>(_EmploymentHistory_QNAME, EmploymentHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalPersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "additionalPersonName")
    public JAXBElement<AdditionalPersonName> createAdditionalPersonName(AdditionalPersonName value) {
        return new JAXBElement<AdditionalPersonName>(_AdditionalPersonName_QNAME, AdditionalPersonName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "workClass")
    public JAXBElement<WorkClass> createWorkClass(WorkClass value) {
        return new JAXBElement<WorkClass>(_WorkClass_QNAME, WorkClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassCreatedByModule(String value) {
        return new JAXBElement<String>(_WorkClassCreatedByModule_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = WorkClass.class)
    public JAXBElement<Long> createWorkClassRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassStatus(String value) {
        return new JAXBElement<String>(_WorkClassStatus_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LevelOfExperience", scope = WorkClass.class)
    public JAXBElement<String> createWorkClassLevelOfExperience(String value) {
        return new JAXBElement<String>(_WorkClassLevelOfExperience_QNAME, String.class, WorkClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredNameId", scope = Person.class)
    public JAXBElement<Long> createPersonPreferredNameId(Long value) {
        return new JAXBElement<Long>(_PersonPreferredNameId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneCountryCode", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneCountryCode(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneCountryCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "State", scope = Person.class)
    public JAXBElement<String> createPersonState(String value) {
        return new JAXBElement<String>(_PersonState_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneExtension", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneExtension(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneExtension_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "County", scope = Person.class)
    public JAXBElement<String> createPersonCounty(String value) {
        return new JAXBElement<String>(_PersonCounty_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PostalCode", scope = Person.class)
    public JAXBElement<String> createPersonPostalCode(String value) {
        return new JAXBElement<String>(_PersonPostalCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Province", scope = Person.class)
    public JAXBElement<String> createPersonProvince(String value) {
        return new JAXBElement<String>(_PersonProvince_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "City", scope = Person.class)
    public JAXBElement<String> createPersonCity(String value) {
        return new JAXBElement<String>(_PersonCity_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactMethod", scope = Person.class)
    public JAXBElement<String> createPersonPreferredContactMethod(String value) {
        return new JAXBElement<String>(_PersonPreferredContactMethod_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = Person.class)
    public JAXBElement<String> createPersonLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneNumber", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneNumber_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "IdenAddrPartySiteId", scope = Person.class)
    public JAXBElement<Long> createPersonIdenAddrPartySiteId(Long value) {
        return new JAXBElement<Long>(_PersonIdenAddrPartySiteId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "URL", scope = Person.class)
    public JAXBElement<String> createPersonURL(String value) {
        return new JAXBElement<String>(_PersonURL_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ValidatedFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonValidatedFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MaritalStatus", scope = Person.class)
    public JAXBElement<String> createPersonMaritalStatus(String value) {
        return new JAXBElement<String>(_PersonMaritalStatus_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhonePurpose", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhonePurpose(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhonePurpose_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryURLContactPTId", scope = Person.class)
    public JAXBElement<Long> createPersonPrimaryURLContactPTId(Long value) {
        return new JAXBElement<Long>(_PersonPrimaryURLContactPTId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneAreaCode", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneAreaCode(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneAreaCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredName", scope = Person.class)
    public JAXBElement<String> createPersonPreferredName(String value) {
        return new JAXBElement<String>(_PersonPreferredName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "GSAIndicatorFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonGSAIndicatorFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonGSAIndicatorFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertificationLevel", scope = Person.class)
    public JAXBElement<String> createPersonCertificationLevel(String value) {
        return new JAXBElement<String>(_PersonCertificationLevel_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonAcademicTitle", scope = Person.class)
    public JAXBElement<String> createPersonPersonAcademicTitle(String value) {
        return new JAXBElement<String>(_PersonPersonAcademicTitle_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JgzzFiscalCode", scope = Person.class)
    public JAXBElement<String> createPersonJgzzFiscalCode(String value) {
        return new JAXBElement<String>(_PersonJgzzFiscalCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreNameAdjunct", scope = Person.class)
    public JAXBElement<String> createPersonPersonPreNameAdjunct(String value) {
        return new JAXBElement<String>(_PersonPersonPreNameAdjunct_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneLineType", scope = Person.class)
    public JAXBElement<String> createPersonPrimaryPhoneLineType(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneLineType_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastNamePrefix", scope = Person.class)
    public JAXBElement<String> createPersonPersonLastNamePrefix(String value) {
        return new JAXBElement<String>(_PersonPersonLastNamePrefix_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LanguageName", scope = Person.class)
    public JAXBElement<String> createPersonLanguageName(String value) {
        return new JAXBElement<String>(_PersonLanguageName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Gender", scope = Person.class)
    public JAXBElement<String> createPersonGender(String value) {
        return new JAXBElement<String>(_PersonGender_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = Person.class)
    public JAXBElement<Long> createPersonRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonNameSuffix", scope = Person.class)
    public JAXBElement<String> createPersonPersonNameSuffix(String value) {
        return new JAXBElement<String>(_PersonPersonNameSuffix_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateOfBirth", scope = Person.class)
    public JAXBElement<XMLGregorianCalendar> createPersonDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonDateOfBirth_QNAME, XMLGregorianCalendar.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonMiddleName", scope = Person.class)
    public JAXBElement<String> createPersonPersonMiddleName(String value) {
        return new JAXBElement<String>(_PersonPersonMiddleName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Country", scope = Person.class)
    public JAXBElement<String> createPersonCountry(String value) {
        return new JAXBElement<String>(_PersonCountry_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertReasonCode", scope = Person.class)
    public JAXBElement<String> createPersonCertReasonCode(String value) {
        return new JAXBElement<String>(_PersonCertReasonCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address4", scope = Person.class)
    public JAXBElement<String> createPersonAddress4(String value) {
        return new JAXBElement<String>(_PersonAddress4_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Salutation", scope = Person.class)
    public JAXBElement<String> createPersonSalutation(String value) {
        return new JAXBElement<String>(_PersonSalutation_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "IdenAddrLocationId", scope = Person.class)
    public JAXBElement<Long> createPersonIdenAddrLocationId(Long value) {
        return new JAXBElement<Long>(_PersonIdenAddrLocationId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = Person.class)
    public JAXBElement<String> createPersonCreatedByModule(String value) {
        return new JAXBElement<String>(_WorkClassCreatedByModule_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonSecondLastName", scope = Person.class)
    public JAXBElement<String> createPersonPersonSecondLastName(String value) {
        return new JAXBElement<String>(_PersonPersonSecondLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SICCode", scope = Person.class)
    public JAXBElement<String> createPersonSICCode(String value) {
        return new JAXBElement<String>(_PersonSICCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = Person.class)
    public JAXBElement<String> createPersonComments(String value) {
        return new JAXBElement<String>(_PersonComments_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "InternalFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonInternalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonInternalFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreviousLastName", scope = Person.class)
    public JAXBElement<String> createPersonPersonPreviousLastName(String value) {
        return new JAXBElement<String>(_PersonPersonPreviousLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonTitle", scope = Person.class)
    public JAXBElement<String> createPersonPersonTitle(String value) {
        return new JAXBElement<String>(_PersonPersonTitle_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneContactPTId", scope = Person.class)
    public JAXBElement<Long> createPersonPrimaryPhoneContactPTId(Long value) {
        return new JAXBElement<Long>(_PersonPrimaryPhoneContactPTId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmailAddress", scope = Person.class)
    public JAXBElement<String> createPersonEmailAddress(String value) {
        return new JAXBElement<String>(_PersonEmailAddress_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryEmailContactPTId", scope = Person.class)
    public JAXBElement<Long> createPersonPrimaryEmailContactPTId(Long value) {
        return new JAXBElement<Long>(_PersonPrimaryEmailContactPTId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address3", scope = Person.class)
    public JAXBElement<String> createPersonAddress3(String value) {
        return new JAXBElement<String>(_PersonAddress3_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address2", scope = Person.class)
    public JAXBElement<String> createPersonAddress2(String value) {
        return new JAXBElement<String>(_PersonAddress2_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonFirstName", scope = Person.class)
    public JAXBElement<String> createPersonPersonFirstName(String value) {
        return new JAXBElement<String>(_PersonPersonFirstName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Address1", scope = Person.class)
    public JAXBElement<String> createPersonAddress1(String value) {
        return new JAXBElement<String>(_PersonAddress1_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SICCodeType", scope = Person.class)
    public JAXBElement<String> createPersonSICCodeType(String value) {
        return new JAXBElement<String>(_PersonSICCodeType_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredFunctionalCurrency", scope = Person.class)
    public JAXBElement<String> createPersonPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_PersonPreferredFunctionalCurrency_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MissionStatement", scope = Person.class)
    public JAXBElement<String> createPersonMissionStatement(String value) {
        return new JAXBElement<String>(_PersonMissionStatement_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastName", scope = Person.class)
    public JAXBElement<String> createPersonPersonLastName(String value) {
        return new JAXBElement<String>(_PersonPersonLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "UserGUID", scope = Person.class)
    public JAXBElement<String> createPersonUserGUID(String value) {
        return new JAXBElement<String>(_PersonUserGUID_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactPersonId", scope = Person.class)
    public JAXBElement<Long> createPersonPreferredContactPersonId(Long value) {
        return new JAXBElement<Long>(_PersonPreferredContactPersonId_QNAME, Long.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ThirdPartyFlag", scope = Person.class)
    public JAXBElement<Boolean> createPersonThirdPartyFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonThirdPartyFlag_QNAME, Boolean.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CategoryCode", scope = Person.class)
    public JAXBElement<String> createPersonCategoryCode(String value) {
        return new JAXBElement<String>(_PersonCategoryCode_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Team", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestTeam(String value) {
        return new JAXBElement<String>(_PersonInterestTeam_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Since", scope = PersonInterest.class)
    public JAXBElement<XMLGregorianCalendar> createPersonInterestSince(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonInterestSince_QNAME, XMLGregorianCalendar.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LevelOfParticipation", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestLevelOfParticipation(String value) {
        return new JAXBElement<String>(_PersonInterestLevelOfParticipation_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "InterestTypeCode", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestInterestTypeCode(String value) {
        return new JAXBElement<String>(_PersonInterestInterestTypeCode_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LevelOfInterest", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestLevelOfInterest(String value) {
        return new JAXBElement<String>(_PersonInterestLevelOfInterest_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestCreatedByModule(String value) {
        return new JAXBElement<String>(_WorkClassCreatedByModule_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = PersonInterest.class)
    public JAXBElement<Long> createPersonInterestRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SubInterestTypeCode", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestSubInterestTypeCode(String value) {
        return new JAXBElement<String>(_PersonInterestSubInterestTypeCode_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestStatus(String value) {
        return new JAXBElement<String>(_WorkClassStatus_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SportIndicator", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestSportIndicator(String value) {
        return new JAXBElement<String>(_PersonInterestSportIndicator_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = PersonInterest.class)
    public JAXBElement<String> createPersonInterestComments(String value) {
        return new JAXBElement<String>(_PersonComments_QNAME, String.class, PersonInterest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CorpCurrencyCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PersonProfileCorpCurrencyCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredNameId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePreferredNameId(Long value) {
        return new JAXBElement<Long>(_PersonPreferredNameId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonalIncomeAmount", scope = PersonProfile.class)
    public JAXBElement<AmountType> createPersonProfilePersonalIncomeAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PersonProfilePersonalIncomeAmount_QNAME, AmountType.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneCountryCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneCountryCode(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneCountryCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "HouseholdIncomeAmount", scope = PersonProfile.class)
    public JAXBElement<AmountType> createPersonProfileHouseholdIncomeAmount(AmountType value) {
        return new JAXBElement<AmountType>(_PersonProfileHouseholdIncomeAmount_QNAME, AmountType.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneExtension", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneExtension(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneExtension_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Alias", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileAlias(String value) {
        return new JAXBElement<String>(_PersonProfileAlias_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EffectiveEndDate", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileEffectiveEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileEffectiveEndDate_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileStatus(String value) {
        return new JAXBElement<String>(_WorkClassStatus_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrencyCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurrencyCode(String value) {
        return new JAXBElement<String>(_PersonProfileCurrencyCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PlaceOfBirth", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePlaceOfBirth(String value) {
        return new JAXBElement<String>(_PersonProfilePlaceOfBirth_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonInitials", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonInitials(String value) {
        return new JAXBElement<String>(_PersonProfilePersonInitials_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactMethod", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactMethod(String value) {
        return new JAXBElement<String>(_PersonPreferredContactMethod_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryURL", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryURL(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryURL_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactEmail", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactEmail(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactEmail_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "UniqueNameSuffix", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileUniqueNameSuffix(String value) {
        return new JAXBElement<String>(_PersonProfileUniqueNameSuffix_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneNumber", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneNumber_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryEmailId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryEmailId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryEmailId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SuffixOverriddenFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileSuffixOverriddenFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileSuffixOverriddenFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ValidatedFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonValidatedFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MaritalStatus", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileMaritalStatus(String value) {
        return new JAXBElement<String>(_PersonMaritalStatus_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhonePurpose", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhonePurpose(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhonePurpose_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryEmailAddress", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryEmailAddress(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryEmailAddress_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryPhoneId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryPhoneId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DeceasedFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileDeceasedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileDeceasedFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneAreaCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneAreaCode(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneAreaCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredName(String value) {
        return new JAXBElement<String>(_PersonPreferredName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactName(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressCountry", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressCountry(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressCountry_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystem", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileOrigSystem(String value) {
        return new JAXBElement<String>(_PersonProfileOrigSystem_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertificationLevel", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCertificationLevel(String value) {
        return new JAXBElement<String>(_PersonCertificationLevel_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonAcademicTitle", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonAcademicTitle(String value) {
        return new JAXBElement<String>(_PersonPersonAcademicTitle_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JgzzFiscalCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileJgzzFiscalCode(String value) {
        return new JAXBElement<String>(_PersonJgzzFiscalCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreNameAdjunct", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonPreNameAdjunct(String value) {
        return new JAXBElement<String>(_PersonPersonPreNameAdjunct_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressState", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressState(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressState_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryPhoneLineType", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryPhoneLineType(String value) {
        return new JAXBElement<String>(_PersonPrimaryPhoneLineType_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryFormattedPhoneNumber", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryFormattedPhoneNumber_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MaritalStatusEffectiveDate", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileMaritalStatusEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileMaritalStatusEffectiveDate_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastNamePrefix", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonLastNamePrefix(String value) {
        return new JAXBElement<String>(_PersonPersonLastNamePrefix_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystemReference", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileOrigSystemReference(String value) {
        return new JAXBElement<String>(_PersonProfileOrigSystemReference_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Gender", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileGender(String value) {
        return new JAXBElement<String>(_PersonGender_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfileRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonNameSuffix", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonNameSuffix(String value) {
        return new JAXBElement<String>(_PersonPersonNameSuffix_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DeclaredEthnicity", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileDeclaredEthnicity(String value) {
        return new JAXBElement<String>(_PersonProfileDeclaredEthnicity_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateOfBirth", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonDateOfBirth_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonMiddleName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonMiddleName(String value) {
        return new JAXBElement<String>(_PersonPersonMiddleName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastKnownGPS", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileLastKnownGPS(String value) {
        return new JAXBElement<String>(_PersonProfileLastKnownGPS_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CertReasonCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCertReasonCode(String value) {
        return new JAXBElement<String>(_PersonCertReasonCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Salutation", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileSalutation(String value) {
        return new JAXBElement<String>(_PersonSalutation_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryWebId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePrimaryWebId(Long value) {
        return new JAXBElement<Long>(_PersonProfilePrimaryWebId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCreatedByModule(String value) {
        return new JAXBElement<String>(_WorkClassCreatedByModule_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonSecondLastName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonSecondLastName(String value) {
        return new JAXBElement<String>(_PersonPersonSecondLastName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressCounty", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressCounty(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressCounty_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileComments(String value) {
        return new JAXBElement<String>(_PersonComments_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "InternalFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileInternalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonInternalFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreviousLastName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonPreviousLastName(String value) {
        return new JAXBElement<String>(_PersonPersonPreviousLastName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactPhone", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactPhone(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactPhone_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonTitle", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonTitle(String value) {
        return new JAXBElement<String>(_PersonPersonTitle_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryLanguage", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryLanguage(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryLanguage_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryFormattedAddress", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryFormattedAddress(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryFormattedAddress_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurcyConvRateType", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PersonProfileCurcyConvRateType_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine4", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine4(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine4_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonFirstName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonFirstName(String value) {
        return new JAXBElement<String>(_PersonPersonFirstName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine3", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine3(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine3_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine2", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine2(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine2_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressLine1", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressLine1(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressLine1_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "HouseholdSize", scope = PersonProfile.class)
    public JAXBElement<BigDecimal> createPersonProfileHouseholdSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonProfileHouseholdSize_QNAME, BigDecimal.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactURL", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredContactURL(String value) {
        return new JAXBElement<String>(_PersonProfilePreferredContactURL_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressProvince", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressProvince(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressProvince_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredFunctionalCurrency", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_PersonPreferredFunctionalCurrency_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RentOwnInd", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfileRentOwnInd(String value) {
        return new JAXBElement<String>(_PersonProfileRentOwnInd_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateOfDeath", scope = PersonProfile.class)
    public JAXBElement<XMLGregorianCalendar> createPersonProfileDateOfDeath(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonProfileDateOfDeath_QNAME, XMLGregorianCalendar.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonLastName(String value) {
        return new JAXBElement<String>(_PersonPersonLastName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "HeadOfHouseholdFlag", scope = PersonProfile.class)
    public JAXBElement<Boolean> createPersonProfileHeadOfHouseholdFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonProfileHeadOfHouseholdFlag_QNAME, Boolean.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonName", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePersonName(String value) {
        return new JAXBElement<String>(_PersonProfilePersonName_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Pronunciation", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePronunciation(String value) {
        return new JAXBElement<String>(_PersonProfilePronunciation_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredContactPersonId", scope = PersonProfile.class)
    public JAXBElement<Long> createPersonProfilePreferredContactPersonId(Long value) {
        return new JAXBElement<Long>(_PersonPreferredContactPersonId_QNAME, Long.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressPostalCode", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressPostalCode(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressPostalCode_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PrimaryAddressCity", scope = PersonProfile.class)
    public JAXBElement<String> createPersonProfilePrimaryAddressCity(String value) {
        return new JAXBElement<String>(_PersonProfilePrimaryAddressCity_QNAME, String.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EffectiveSequence", scope = PersonProfile.class)
    public JAXBElement<Integer> createPersonProfileEffectiveSequence(Integer value) {
        return new JAXBElement<Integer>(_PersonProfileEffectiveSequence_QNAME, Integer.class, PersonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TypeOfSchool", scope = Education.class)
    public JAXBElement<String> createEducationTypeOfSchool(String value) {
        return new JAXBElement<String>(_EducationTypeOfSchool_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "StartDateAttended", scope = Education.class)
    public JAXBElement<XMLGregorianCalendar> createEducationStartDateAttended(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EducationStartDateAttended_QNAME, XMLGregorianCalendar.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CourseMajor", scope = Education.class)
    public JAXBElement<String> createEducationCourseMajor(String value) {
        return new JAXBElement<String>(_EducationCourseMajor_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = Education.class)
    public JAXBElement<String> createEducationCreatedByModule(String value) {
        return new JAXBElement<String>(_WorkClassCreatedByModule_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SchoolPartyId", scope = Education.class)
    public JAXBElement<Long> createEducationSchoolPartyId(Long value) {
        return new JAXBElement<Long>(_EducationSchoolPartyId_QNAME, Long.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SchoolAttendedName", scope = Education.class)
    public JAXBElement<String> createEducationSchoolAttendedName(String value) {
        return new JAXBElement<String>(_EducationSchoolAttendedName_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastDateAttended", scope = Education.class)
    public JAXBElement<XMLGregorianCalendar> createEducationLastDateAttended(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EducationLastDateAttended_QNAME, XMLGregorianCalendar.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = Education.class)
    public JAXBElement<String> createEducationLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = Education.class)
    public JAXBElement<Long> createEducationRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = Education.class)
    public JAXBElement<String> createEducationStatus(String value) {
        return new JAXBElement<String>(_WorkClassStatus_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DegreeReceived", scope = Education.class)
    public JAXBElement<String> createEducationDegreeReceived(String value) {
        return new JAXBElement<String>(_EducationDegreeReceived_QNAME, String.class, Education.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonTitle", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonTitle(String value) {
        return new JAXBElement<String>(_PersonPersonTitle_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastNamePrefix", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonLastNamePrefix(String value) {
        return new JAXBElement<String>(_PersonPersonLastNamePrefix_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystemReference", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameOrigSystemReference(String value) {
        return new JAXBElement<String>(_PersonProfileOrigSystemReference_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonFirstName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonFirstName(String value) {
        return new JAXBElement<String>(_PersonPersonFirstName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = AdditionalPersonName.class)
    public JAXBElement<Long> createAdditionalPersonNameRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonNameSuffix", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonNameSuffix(String value) {
        return new JAXBElement<String>(_PersonPersonNameSuffix_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonMiddleName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonMiddleName(String value) {
        return new JAXBElement<String>(_PersonPersonMiddleName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PartyName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePartyName(String value) {
        return new JAXBElement<String>(_AdditionalPersonNamePartyName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonLastName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonLastName(String value) {
        return new JAXBElement<String>(_PersonPersonLastName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PreferredFlag", scope = AdditionalPersonName.class)
    public JAXBElement<Boolean> createAdditionalPersonNamePreferredFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AdditionalPersonNamePreferredFlag_QNAME, Boolean.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OrigSystem", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameOrigSystem(String value) {
        return new JAXBElement<String>(_PersonProfileOrigSystem_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TransliterationLang", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameTransliterationLang(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameTransliterationLang_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonAcademicTitle", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonAcademicTitle(String value) {
        return new JAXBElement<String>(_PersonPersonAcademicTitle_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonSecondLastName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonSecondLastName(String value) {
        return new JAXBElement<String>(_PersonPersonSecondLastName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "OverallPreferredFlag", scope = AdditionalPersonName.class)
    public JAXBElement<Boolean> createAdditionalPersonNameOverallPreferredFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AdditionalPersonNameOverallPreferredFlag_QNAME, Boolean.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreNameAdjunct", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonPreNameAdjunct(String value) {
        return new JAXBElement<String>(_PersonPersonPreNameAdjunct_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Description", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNameDescription(String value) {
        return new JAXBElement<String>(_AdditionalPersonNameDescription_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonPreviousLastName", scope = AdditionalPersonName.class)
    public JAXBElement<String> createAdditionalPersonNamePersonPreviousLastName(String value) {
        return new JAXBElement<String>(_PersonPersonPreviousLastName_QNAME, String.class, AdditionalPersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DocumentReference", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipDocumentReference(String value) {
        return new JAXBElement<String>(_CitizenshipDocumentReference_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "BirthOrSelected", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipBirthOrSelected(String value) {
        return new JAXBElement<String>(_CitizenshipBirthOrSelected_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DocumentType", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipDocumentType(String value) {
        return new JAXBElement<String>(_CitizenshipDocumentType_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateRecognized", scope = Citizenship.class)
    public JAXBElement<XMLGregorianCalendar> createCitizenshipDateRecognized(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipDateRecognized_QNAME, XMLGregorianCalendar.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DateDisowned", scope = Citizenship.class)
    public JAXBElement<XMLGregorianCalendar> createCitizenshipDateDisowned(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipDateDisowned_QNAME, XMLGregorianCalendar.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipCreatedByModule(String value) {
        return new JAXBElement<String>(_WorkClassCreatedByModule_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = Citizenship.class)
    public JAXBElement<Long> createCitizenshipRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = Citizenship.class)
    public JAXBElement<String> createCitizenshipStatus(String value) {
        return new JAXBElement<String>(_WorkClassStatus_QNAME, String.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EndDate", scope = Citizenship.class)
    public JAXBElement<XMLGregorianCalendar> createCitizenshipEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipEndDate_QNAME, XMLGregorianCalendar.class, Citizenship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SupervisorName", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistorySupervisorName(String value) {
        return new JAXBElement<String>(_EmploymentHistorySupervisorName_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedAsTitleCode", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedAsTitleCode(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedAsTitleCode_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "FractionOfTenure", scope = EmploymentHistory.class)
    public JAXBElement<BigDecimal> createEmploymentHistoryFractionOfTenure(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmploymentHistoryFractionOfTenure_QNAME, BigDecimal.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Served", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryServed(String value) {
        return new JAXBElement<String>(_EmploymentHistoryServed_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = EmploymentHistory.class)
    public JAXBElement<Long> createEmploymentHistoryRequestId(Long value) {
        return new JAXBElement<Long>(_WorkClassRequestId_QNAME, Long.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Station", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryStation(String value) {
        return new JAXBElement<String>(_EmploymentHistoryStation_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryStatus(String value) {
        return new JAXBElement<String>(_WorkClassStatus_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedAsTitle", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedAsTitle(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedAsTitle_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EndDate", scope = EmploymentHistory.class)
    public JAXBElement<XMLGregorianCalendar> createEmploymentHistoryEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CitizenshipEndDate_QNAME, XMLGregorianCalendar.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedByDivisionName", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedByDivisionName(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedByDivisionName_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmploymentTypeCode", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmploymentTypeCode(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmploymentTypeCode_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CreatedByModule", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryCreatedByModule(String value) {
        return new JAXBElement<String>(_WorkClassCreatedByModule_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ReasonForLeaving", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryReasonForLeaving(String value) {
        return new JAXBElement<String>(_EmploymentHistoryReasonForLeaving_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Responsibility", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryResponsibility(String value) {
        return new JAXBElement<String>(_EmploymentHistoryResponsibility_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedByNameCompany", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryEmployedByNameCompany(String value) {
        return new JAXBElement<String>(_EmploymentHistoryEmployedByNameCompany_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryLastUpdateLogin(String value) {
        return new JAXBElement<String>(_WorkClassLastUpdateLogin_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "WeeklyWorkHours", scope = EmploymentHistory.class)
    public JAXBElement<BigDecimal> createEmploymentHistoryWeeklyWorkHours(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmploymentHistoryWeeklyWorkHours_QNAME, BigDecimal.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "TenureCode", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryTenureCode(String value) {
        return new JAXBElement<String>(_EmploymentHistoryTenureCode_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "FacultyPositionFlag", scope = EmploymentHistory.class)
    public JAXBElement<Boolean> createEmploymentHistoryFacultyPositionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_EmploymentHistoryFacultyPositionFlag_QNAME, Boolean.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryComments(String value) {
        return new JAXBElement<String>(_PersonComments_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "EmployedByPartyId", scope = EmploymentHistory.class)
    public JAXBElement<Long> createEmploymentHistoryEmployedByPartyId(Long value) {
        return new JAXBElement<Long>(_EmploymentHistoryEmployedByPartyId_QNAME, Long.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Branch", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryBranch(String value) {
        return new JAXBElement<String>(_EmploymentHistoryBranch_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "MilitaryRank", scope = EmploymentHistory.class)
    public JAXBElement<String> createEmploymentHistoryMilitaryRank(String value) {
        return new JAXBElement<String>(_EmploymentHistoryMilitaryRank_QNAME, String.class, EmploymentHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "BeginDate", scope = EmploymentHistory.class)
    public JAXBElement<XMLGregorianCalendar> createEmploymentHistoryBeginDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmploymentHistoryBeginDate_QNAME, XMLGregorianCalendar.class, EmploymentHistory.class, value);
    }

}

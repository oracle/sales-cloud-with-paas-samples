
package com.oracle.xmlns.apps.cdm.foundation.parties.partyservice;

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
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.partyservice package. 
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

    private final static QName _CodeAssignment_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "codeAssignment");
    private final static QName _OriginalSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "originalSystemReference");
    private final static QName _PersonPartySite_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "personPartySite");
    private final static QName _Certification_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "certification");
    private final static QName _CreditRating_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "creditRating");
    private final static QName _FinancialProfile_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "financialProfile");
    private final static QName _PartySiteUse_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "partySiteUse");
    private final static QName _PartyPreference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "partyPreference");
    private final static QName _PartyUsageAssignmentResult_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "partyUsageAssignmentResult");
    private final static QName _PartyUsageAssignment_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "partyUsageAssignment");
    private final static QName _EmailDomain_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "emailDomain");
    private final static QName _AdditionalPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "additionalPartyId");
    private final static QName _PartySite_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "partySite");
    private final static QName _PersonLanguage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "personLanguage");
    private final static QName _PersonLanguageRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "RequestId");
    private final static QName _PersonLanguageLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "LastUpdateLogin");
    private final static QName _PersonLanguageSpokenComprehensionLevel_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SpokenComprehensionLevel");
    private final static QName _PersonLanguageCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreatedByModule");
    private final static QName _PersonLanguageNativeLanguageFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "NativeLanguageFlag");
    private final static QName _PersonLanguageStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Status");
    private final static QName _PersonLanguageWritesLevel_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "WritesLevel");
    private final static QName _PersonLanguageReadsLevel_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ReadsLevel");
    private final static QName _PersonLanguageSpeaksLevel_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SpeaksLevel");
    private final static QName _PersonLanguagePrimaryLanguageIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PrimaryLanguageIndicator");
    private final static QName _CodeAssignmentOwnerTableKey4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OwnerTableKey4");
    private final static QName _CodeAssignmentOwnerTableKey5_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OwnerTableKey5");
    private final static QName _CodeAssignmentOwnerTableId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OwnerTableId");
    private final static QName _CodeAssignmentRank_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Rank");
    private final static QName _CodeAssignmentEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "EndDateActive");
    private final static QName _CodeAssignmentOwnerTableKey1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OwnerTableKey1");
    private final static QName _CodeAssignmentOwnerTableKey3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OwnerTableKey3");
    private final static QName _CodeAssignmentOwnerTableKey2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OwnerTableKey2");
    private final static QName _CreditRatingPaydexComment_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexComment");
    private final static QName _CreditRatingOprgSpecificationEvntInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OprgSpecificationEvntInd");
    private final static QName _CreditRatingPrntBkcyChapterConv_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PrntBkcyChapterConv");
    private final static QName _CreditRatingCriminalProceedingInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CriminalProceedingInd");
    private final static QName _CreditRatingDebarmentInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DebarmentInd");
    private final static QName _CreditRatingSpecialEventUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SpecialEventUpdateDate");
    private final static QName _CreditRatingPaydexThreeMonthsAgo_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexThreeMonthsAgo");
    private final static QName _CreditRatingNegvPmtExpl_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "NegvPmtExpl");
    private final static QName _CreditRatingCreditScoreDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreDate");
    private final static QName _CreditRatingCreditScore_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScore");
    private final static QName _CreditRatingFailureScoreClass_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreClass");
    private final static QName _CreditRatingCreditRiskScoreExplain_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditRiskScoreExplain");
    private final static QName _CreditRatingAverageHighCredit_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AverageHighCredit");
    private final static QName _CreditRatingOtherSpecificationEvntInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OtherSpecificationEvntInd");
    private final static QName _CreditRatingPaydexNorm_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexNorm");
    private final static QName _CreditRatingLienInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "LienInd");
    private final static QName _CreditRatingDescription_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Description");
    private final static QName _CreditRatingCreditScoreCommentary10_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary10");
    private final static QName _CreditRatingFailureScoreNatnlPercentile_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreNatnlPercentile");
    private final static QName _CreditRatingCreditScoreNatlPercentile_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreNatlPercentile");
    private final static QName _CreditRatingPaydexScore_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexScore");
    private final static QName _CreditRatingSpecialEventText_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SpecialEventText");
    private final static QName _CreditRatingParentHQBankruptcyInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ParentHQBankruptcyInd");
    private final static QName _CreditRatingMaximumCreditRecommendationAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "MaximumCreditRecommendationAmount");
    private final static QName _CreditRatingLowRngDelqScr_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "LowRngDelqScr");
    private final static QName _CreditRatingPrntBkcyFilgDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PrntBkcyFilgDate");
    private final static QName _CreditRatingDetHistoryInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DetHistoryInd");
    private final static QName _CreditRatingSecuredFlngInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SecuredFlngInd");
    private final static QName _CreditRatingFailureScoreCommentary_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary");
    private final static QName _CreditRatingPrntBkcyFilgChapter_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PrntBkcyFilgChapter");
    private final static QName _CreditRatingFailureScore_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScore");
    private final static QName _CreditRatingMaximumCreditCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "MaximumCreditCurrencyCode");
    private final static QName _CreditRatingDisasterInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DisasterInd");
    private final static QName _CreditRatingJudgementInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "JudgementInd");
    private final static QName _CreditRatingFailureScoreOverrideCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreOverrideCode");
    private final static QName _CreditRatingClaimsInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ClaimsInd");
    private final static QName _CreditRatingCreditScoreIncdDefault_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreIncdDefault");
    private final static QName _CreditRatingDelqPmtPctgForAllFirms_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DelqPmtPctgForAllFirms");
    private final static QName _CreditRatingNumberSpecialEvent_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "NumberSpecialEvent");
    private final static QName _CreditRatingPubRecExpl_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PubRecExpl");
    private final static QName _CreditRatingPaydexIndustryComment_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexIndustryComment");
    private final static QName _CreditRatingFinclEmbtInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FinclEmbtInd");
    private final static QName _CreditRatingFailureScoreCommentary10_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary10");
    private final static QName _CreditRatingCreditScoreCommentary_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary");
    private final static QName _CreditRatingDebarmentsDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DebarmentsDate");
    private final static QName _CreditRatingPaydexFirmComment_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexFirmComment");
    private final static QName _CreditRatingBankruptcyInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "BankruptcyInd");
    private final static QName _CreditRatingFailureScoreAge_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreAge");
    private final static QName _CreditRatingPrntBkcyFilgType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PrntBkcyFilgType");
    private final static QName _CreditRatingCreditScoreCommentary5_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary5");
    private final static QName _CreditRatingCreditScoreCommentary4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary4");
    private final static QName _CreditRatingCreditScoreOverrideCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreOverrideCode");
    private final static QName _CreditRatingDelqPmtRngPrcnt_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DelqPmtRngPrcnt");
    private final static QName _CreditRatingCreditScoreCommentary3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary3");
    private final static QName _CreditRatingRatedAsOfDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "RatedAsOfDate");
    private final static QName _CreditRatingCreditScoreCommentary2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary2");
    private final static QName _CreditRatingFailureScoreDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreDate");
    private final static QName _CreditRatingCreditScoreCommentary9_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary9");
    private final static QName _CreditRatingComments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Comments");
    private final static QName _CreditRatingCreditScoreCommentary8_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary8");
    private final static QName _CreditRatingCreditScoreCommentary7_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary7");
    private final static QName _CreditRatingGlobalFailureScore_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "GlobalFailureScore");
    private final static QName _CreditRatingCreditScoreCommentary6_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreCommentary6");
    private final static QName _CreditRatingSpecialEventComment_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SpecialEventComment");
    private final static QName _CreditRatingSlowTradeExpl_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SlowTradeExpl");
    private final static QName _CreditRatingDebarmentsCount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DebarmentsCount");
    private final static QName _CreditRatingPrntBkcyConvDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PrntBkcyConvDate");
    private final static QName _CreditRatingPaydexIndustryDays_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexIndustryDays");
    private final static QName _CreditRatingNumberParentBankruptcyConversions_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "NumberParentBankruptcyConversions");
    private final static QName _CreditRatingFailureScoreCommentary8_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary8");
    private final static QName _CreditRatingFailureScoreCommentary7_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary7");
    private final static QName _CreditRatingFailureScoreCommentary6_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary6");
    private final static QName _CreditRatingHighCredit_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "HighCredit");
    private final static QName _CreditRatingFailureScoreCommentary5_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary5");
    private final static QName _CreditRatingNoTradeInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "NoTradeInd");
    private final static QName _CreditRatingFailureScoreCommentary4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary4");
    private final static QName _CreditRatingFailureScoreCommentary3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary3");
    private final static QName _CreditRatingRatingOrganization_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "RatingOrganization");
    private final static QName _CreditRatingFailureScoreCommentary2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary2");
    private final static QName _CreditRatingNumberParentBankruptcyFiling_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "NumberParentBankruptcyFiling");
    private final static QName _CreditRatingNumberTradeExperiences_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "NumberTradeExperiences");
    private final static QName _CreditRatingCreditScoreClass_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreClass");
    private final static QName _CreditRatingFinclLglEventInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FinclLglEventInd");
    private final static QName _CreditRatingBusinessDiscontinued_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "BusinessDiscontinued");
    private final static QName _CreditRatingSuitInd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SuitInd");
    private final static QName _CreditRatingCreditScoreAge_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CreditScoreAge");
    private final static QName _CreditRatingHighRngDelqScr_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "HighRngDelqScr");
    private final static QName _CreditRatingFailureScoreIncdDefault_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreIncdDefault");
    private final static QName _CreditRatingFailureScoreCommentary9_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FailureScoreCommentary9");
    private final static QName _CreditRatingPaydexFirmDays_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PaydexFirmDays");
    private final static QName _PartyUsageAssignmentEffectiveEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "EffectiveEndDate");
    private final static QName _PartyUsageAssignmentOwnerTableName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OwnerTableName");
    private final static QName _AdditionalPartyIdIssuingAuthorityPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "IssuingAuthorityPartyId");
    private final static QName _AdditionalPartyIdIssueDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "IssueDate");
    private final static QName _AdditionalPartyIdExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ExpirationDate");
    private final static QName _AdditionalPartyIdCountry_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Country");
    private final static QName _AdditionalPartyIdIssuingAuthorityName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "IssuingAuthorityName");
    private final static QName _AdditionalPartyIdStateProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "StateProvince");
    private final static QName _AdditionalPartyIdPartyName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartyName");
    private final static QName _PersonPartySitePartySiteType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartySiteType");
    private final static QName _PersonPartySiteMailstop_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Mailstop");
    private final static QName _PersonPartySiteRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "RelationshipId");
    private final static QName _PersonPartySitePartyNameLegal_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartyNameLegal");
    private final static QName _PersonPartySitePartySiteName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartySiteName");
    private final static QName _PersonPartySitePartyNameDivision_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartyNameDivision");
    private final static QName _PersonPartySiteGlobalLocationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "GlobalLocationNumber");
    private final static QName _PersonPartySitePartyNameDba_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartyNameDba");
    private final static QName _PersonPartySitePartyUsageCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartyUsageCode");
    private final static QName _PersonPartySiteAddressee_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Addressee");
    private final static QName _PersonPartySiteLanguage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Language");
    private final static QName _PersonPartySiteDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DUNSNumberC");
    private final static QName _PartySiteUsePrimaryPerType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PrimaryPerType");
    private final static QName _PartySiteUseEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "EndDate");
    private final static QName _PartySiteUseBeginDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "BeginDate");
    private final static QName _PartySiteUsePartySiteId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartySiteId");
    private final static QName _PartySiteUseSiteUseType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "SiteUseType");
    private final static QName _PartySiteUseIntegrationKey_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "IntegrationKey");
    private final static QName _OriginalSystemReferencePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PartyId");
    private final static QName _OriginalSystemReferenceOldOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OldOrigSystemReference");
    private final static QName _OriginalSystemReferenceReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ReasonCode");
    private final static QName _CertificationGrade_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Grade");
    private final static QName _CertificationIssuedOnDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "IssuedOnDate");
    private final static QName _CertificationIssuedByAuthority_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "IssuedByAuthority");
    private final static QName _CertificationExpiresOnDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ExpiresOnDate");
    private final static QName _CertificationCurrentStatus_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CurrentStatus");
    private final static QName _FinancialProfileFinancialOrgType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FinancialOrgType");
    private final static QName _FinancialProfileFinancialOrganizationName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FinancialOrganizationName");
    private final static QName _FinancialProfileAccessAuthorityGranted_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AccessAuthorityGranted");
    private final static QName _FinancialProfileBalanceVerifiedOnDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "BalanceVerifiedOnDate");
    private final static QName _FinancialProfileAccessAuthorityDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AccessAuthorityDate");
    private final static QName _FinancialProfileFinancialAccountType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FinancialAccountType");
    private final static QName _FinancialProfileBalanceAmount_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "BalanceAmount");
    private final static QName _FinancialProfilePreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PreferredFunctionalCurrency");
    private final static QName _FinancialProfileFinancialAccountNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FinancialAccountNumber");
    private final static QName _PartyPreferenceAdditionalValue5_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AdditionalValue5");
    private final static QName _PartyPreferenceAdditionalValue4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AdditionalValue4");
    private final static QName _PartyPreferenceValueDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ValueDate");
    private final static QName _PartyPreferenceAdditionalValue3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AdditionalValue3");
    private final static QName _PartyPreferenceAdditionalValue2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AdditionalValue2");
    private final static QName _PartyPreferenceAdditionalValue1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AdditionalValue1");
    private final static QName _PartyPreferenceModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Module");
    private final static QName _PartyPreferenceValueName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ValueName");
    private final static QName _PartyPreferenceValueNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ValueNumber");
    private final static QName _PartyPreferenceValueVarchar2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ValueVarchar2");
    private final static QName _PartySiteOrigSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OrigSystem");
    private final static QName _PartySiteUsageCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "UsageCode");
    private final static QName _PartySiteValidationStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ValidationStatusCode");
    private final static QName _PartySiteStartDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "StartDateActive");
    private final static QName _PartySiteValidatedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ValidatedFlag");
    private final static QName _PartySiteFormattedLocaleAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FormattedLocaleAddress");
    private final static QName _PartySiteAddressLinesPhonetic_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AddressLinesPhonetic");
    private final static QName _PartySiteHouseType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "HouseType");
    private final static QName _PartySiteCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "City");
    private final static QName _PartySiteCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CurrencyCode");
    private final static QName _PartySiteProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Province");
    private final static QName _PartySiteState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "State");
    private final static QName _PartySitePostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PostalCode");
    private final static QName _PartySiteCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "County");
    private final static QName _PartySiteFormattedMultilineAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FormattedMultilineAddress");
    private final static QName _PartySiteCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CorpCurrencyCode");
    private final static QName _PartySiteContactPreferenceExistFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "ContactPreferenceExistFlag");
    private final static QName _PartySiteAddressStyle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AddressStyle");
    private final static QName _PartySitePosition_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Position");
    private final static QName _PartySiteDoNotValidateFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DoNotValidateFlag");
    private final static QName _PartySiteAddressExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "AddressExpirationDate");
    private final static QName _PartySiteAddress1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Address1");
    private final static QName _PartySiteAddress2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Address2");
    private final static QName _PartySiteAddress3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Address3");
    private final static QName _PartySiteLocationLanguage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "LocationLanguage");
    private final static QName _PartySiteCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "CurcyConvRateType");
    private final static QName _PartySiteEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "EmailAddress");
    private final static QName _PartySiteInternalFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "InternalFlag");
    private final static QName _PartySiteFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "FormattedAddress");
    private final static QName _PartySiteDateValidated_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "DateValidated");
    private final static QName _PartySiteAddress4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "Address4");
    private final static QName _PartySiteOrigSystemReference_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "OrigSystemReference");
    private final static QName _PartySiteLocationDirections_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "LocationDirections");
    private final static QName _PartySitePostalPlus4Code_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", "PostalPlus4Code");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.partyservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartyPreference }
     * 
     */
    public PartyPreference createPartyPreference() {
        return new PartyPreference();
    }

    /**
     * Create an instance of {@link PersonPartySite }
     * 
     */
    public PersonPartySite createPersonPartySite() {
        return new PersonPartySite();
    }

    /**
     * Create an instance of {@link AdditionalPartyId }
     * 
     */
    public AdditionalPartyId createAdditionalPartyId() {
        return new AdditionalPartyId();
    }

    /**
     * Create an instance of {@link CodeAssignment }
     * 
     */
    public CodeAssignment createCodeAssignment() {
        return new CodeAssignment();
    }

    /**
     * Create an instance of {@link EmailDomain }
     * 
     */
    public EmailDomain createEmailDomain() {
        return new EmailDomain();
    }

    /**
     * Create an instance of {@link PartyUsageAssignment }
     * 
     */
    public PartyUsageAssignment createPartyUsageAssignment() {
        return new PartyUsageAssignment();
    }

    /**
     * Create an instance of {@link CreditRating }
     * 
     */
    public CreditRating createCreditRating() {
        return new CreditRating();
    }

    /**
     * Create an instance of {@link Certification }
     * 
     */
    public Certification createCertification() {
        return new Certification();
    }

    /**
     * Create an instance of {@link PartySite }
     * 
     */
    public PartySite createPartySite() {
        return new PartySite();
    }

    /**
     * Create an instance of {@link PartyUsageAssignmentResult }
     * 
     */
    public PartyUsageAssignmentResult createPartyUsageAssignmentResult() {
        return new PartyUsageAssignmentResult();
    }

    /**
     * Create an instance of {@link OriginalSystemReference }
     * 
     */
    public OriginalSystemReference createOriginalSystemReference() {
        return new OriginalSystemReference();
    }

    /**
     * Create an instance of {@link PersonLanguage }
     * 
     */
    public PersonLanguage createPersonLanguage() {
        return new PersonLanguage();
    }

    /**
     * Create an instance of {@link FinancialProfile }
     * 
     */
    public FinancialProfile createFinancialProfile() {
        return new FinancialProfile();
    }

    /**
     * Create an instance of {@link PartySiteUse }
     * 
     */
    public PartySiteUse createPartySiteUse() {
        return new PartySiteUse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "codeAssignment")
    public JAXBElement<CodeAssignment> createCodeAssignment(CodeAssignment value) {
        return new JAXBElement<CodeAssignment>(_CodeAssignment_QNAME, CodeAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginalSystemReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "originalSystemReference")
    public JAXBElement<OriginalSystemReference> createOriginalSystemReference(OriginalSystemReference value) {
        return new JAXBElement<OriginalSystemReference>(_OriginalSystemReference_QNAME, OriginalSystemReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPartySite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "personPartySite")
    public JAXBElement<PersonPartySite> createPersonPartySite(PersonPartySite value) {
        return new JAXBElement<PersonPartySite>(_PersonPartySite_QNAME, PersonPartySite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Certification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "certification")
    public JAXBElement<Certification> createCertification(Certification value) {
        return new JAXBElement<Certification>(_Certification_QNAME, Certification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "creditRating")
    public JAXBElement<CreditRating> createCreditRating(CreditRating value) {
        return new JAXBElement<CreditRating>(_CreditRating_QNAME, CreditRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "financialProfile")
    public JAXBElement<FinancialProfile> createFinancialProfile(FinancialProfile value) {
        return new JAXBElement<FinancialProfile>(_FinancialProfile_QNAME, FinancialProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartySiteUse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "partySiteUse")
    public JAXBElement<PartySiteUse> createPartySiteUse(PartySiteUse value) {
        return new JAXBElement<PartySiteUse>(_PartySiteUse_QNAME, PartySiteUse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "partyPreference")
    public JAXBElement<PartyPreference> createPartyPreference(PartyPreference value) {
        return new JAXBElement<PartyPreference>(_PartyPreference_QNAME, PartyPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyUsageAssignmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "partyUsageAssignmentResult")
    public JAXBElement<PartyUsageAssignmentResult> createPartyUsageAssignmentResult(PartyUsageAssignmentResult value) {
        return new JAXBElement<PartyUsageAssignmentResult>(_PartyUsageAssignmentResult_QNAME, PartyUsageAssignmentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyUsageAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "partyUsageAssignment")
    public JAXBElement<PartyUsageAssignment> createPartyUsageAssignment(PartyUsageAssignment value) {
        return new JAXBElement<PartyUsageAssignment>(_PartyUsageAssignment_QNAME, PartyUsageAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "emailDomain")
    public JAXBElement<EmailDomain> createEmailDomain(EmailDomain value) {
        return new JAXBElement<EmailDomain>(_EmailDomain_QNAME, EmailDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalPartyId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "additionalPartyId")
    public JAXBElement<AdditionalPartyId> createAdditionalPartyId(AdditionalPartyId value) {
        return new JAXBElement<AdditionalPartyId>(_AdditionalPartyId_QNAME, AdditionalPartyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartySite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "partySite")
    public JAXBElement<PartySite> createPartySite(PartySite value) {
        return new JAXBElement<PartySite>(_PartySite_QNAME, PartySite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonLanguage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "personLanguage")
    public JAXBElement<PersonLanguage> createPersonLanguage(PersonLanguage value) {
        return new JAXBElement<PersonLanguage>(_PersonLanguage_QNAME, PersonLanguage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = PersonLanguage.class)
    public JAXBElement<Long> createPersonLanguageRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguageLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SpokenComprehensionLevel", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguageSpokenComprehensionLevel(String value) {
        return new JAXBElement<String>(_PersonLanguageSpokenComprehensionLevel_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguageCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonLanguageCreatedByModule_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "NativeLanguageFlag", scope = PersonLanguage.class)
    public JAXBElement<Boolean> createPersonLanguageNativeLanguageFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PersonLanguageNativeLanguageFlag_QNAME, Boolean.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Status", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguageStatus(String value) {
        return new JAXBElement<String>(_PersonLanguageStatus_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "WritesLevel", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguageWritesLevel(String value) {
        return new JAXBElement<String>(_PersonLanguageWritesLevel_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ReadsLevel", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguageReadsLevel(String value) {
        return new JAXBElement<String>(_PersonLanguageReadsLevel_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SpeaksLevel", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguageSpeaksLevel(String value) {
        return new JAXBElement<String>(_PersonLanguageSpeaksLevel_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PrimaryLanguageIndicator", scope = PersonLanguage.class)
    public JAXBElement<String> createPersonLanguagePrimaryLanguageIndicator(String value) {
        return new JAXBElement<String>(_PersonLanguagePrimaryLanguageIndicator_QNAME, String.class, PersonLanguage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = CodeAssignment.class)
    public JAXBElement<Long> createCodeAssignmentRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableKey4", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentOwnerTableKey4(String value) {
        return new JAXBElement<String>(_CodeAssignmentOwnerTableKey4_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableKey5", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentOwnerTableKey5(String value) {
        return new JAXBElement<String>(_CodeAssignmentOwnerTableKey5_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableId", scope = CodeAssignment.class)
    public JAXBElement<Long> createCodeAssignmentOwnerTableId(Long value) {
        return new JAXBElement<Long>(_CodeAssignmentOwnerTableId_QNAME, Long.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Rank", scope = CodeAssignment.class)
    public JAXBElement<BigDecimal> createCodeAssignmentRank(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CodeAssignmentRank_QNAME, BigDecimal.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonLanguageCreatedByModule_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Status", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentStatus(String value) {
        return new JAXBElement<String>(_PersonLanguageStatus_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EndDateActive", scope = CodeAssignment.class)
    public JAXBElement<XMLGregorianCalendar> createCodeAssignmentEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CodeAssignmentEndDateActive_QNAME, XMLGregorianCalendar.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableKey1", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentOwnerTableKey1(String value) {
        return new JAXBElement<String>(_CodeAssignmentOwnerTableKey1_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableKey3", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentOwnerTableKey3(String value) {
        return new JAXBElement<String>(_CodeAssignmentOwnerTableKey3_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableKey2", scope = CodeAssignment.class)
    public JAXBElement<String> createCodeAssignmentOwnerTableKey2(String value) {
        return new JAXBElement<String>(_CodeAssignmentOwnerTableKey2_QNAME, String.class, CodeAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexComment", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexComment(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexComment_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OprgSpecificationEvntInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingOprgSpecificationEvntInd(String value) {
        return new JAXBElement<String>(_CreditRatingOprgSpecificationEvntInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PrntBkcyChapterConv", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPrntBkcyChapterConv(String value) {
        return new JAXBElement<String>(_CreditRatingPrntBkcyChapterConv_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CriminalProceedingInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCriminalProceedingInd(String value) {
        return new JAXBElement<String>(_CreditRatingCriminalProceedingInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DebarmentInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingDebarmentInd(String value) {
        return new JAXBElement<String>(_CreditRatingDebarmentInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SpecialEventUpdateDate", scope = CreditRating.class)
    public JAXBElement<XMLGregorianCalendar> createCreditRatingSpecialEventUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditRatingSpecialEventUpdateDate_QNAME, XMLGregorianCalendar.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexThreeMonthsAgo", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexThreeMonthsAgo(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexThreeMonthsAgo_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "NegvPmtExpl", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingNegvPmtExpl(String value) {
        return new JAXBElement<String>(_CreditRatingNegvPmtExpl_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreDate", scope = CreditRating.class)
    public JAXBElement<XMLGregorianCalendar> createCreditRatingCreditScoreDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditRatingCreditScoreDate_QNAME, XMLGregorianCalendar.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScore", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScore(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScore_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreClass", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingFailureScoreClass(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingFailureScoreClass_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditRiskScoreExplain", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditRiskScoreExplain(String value) {
        return new JAXBElement<String>(_CreditRatingCreditRiskScoreExplain_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AverageHighCredit", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingAverageHighCredit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingAverageHighCredit_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OtherSpecificationEvntInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingOtherSpecificationEvntInd(String value) {
        return new JAXBElement<String>(_CreditRatingOtherSpecificationEvntInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexNorm", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexNorm(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexNorm_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LienInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingLienInd(String value) {
        return new JAXBElement<String>(_CreditRatingLienInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Description", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingDescription(String value) {
        return new JAXBElement<String>(_CreditRatingDescription_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary10", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary10(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary10_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreNatnlPercentile", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingFailureScoreNatnlPercentile(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingFailureScoreNatnlPercentile_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreNatlPercentile", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingCreditScoreNatlPercentile(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingCreditScoreNatlPercentile_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexScore", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexScore(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexScore_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SpecialEventText", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingSpecialEventText(String value) {
        return new JAXBElement<String>(_CreditRatingSpecialEventText_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ParentHQBankruptcyInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingParentHQBankruptcyInd(String value) {
        return new JAXBElement<String>(_CreditRatingParentHQBankruptcyInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "MaximumCreditRecommendationAmount", scope = CreditRating.class)
    public JAXBElement<AmountType> createCreditRatingMaximumCreditRecommendationAmount(AmountType value) {
        return new JAXBElement<AmountType>(_CreditRatingMaximumCreditRecommendationAmount_QNAME, AmountType.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LowRngDelqScr", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingLowRngDelqScr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingLowRngDelqScr_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PrntBkcyFilgDate", scope = CreditRating.class)
    public JAXBElement<XMLGregorianCalendar> createCreditRatingPrntBkcyFilgDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditRatingPrntBkcyFilgDate_QNAME, XMLGregorianCalendar.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Status", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingStatus(String value) {
        return new JAXBElement<String>(_PersonLanguageStatus_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DetHistoryInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingDetHistoryInd(String value) {
        return new JAXBElement<String>(_CreditRatingDetHistoryInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SecuredFlngInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingSecuredFlngInd(String value) {
        return new JAXBElement<String>(_CreditRatingSecuredFlngInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PrntBkcyFilgChapter", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingPrntBkcyFilgChapter(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingPrntBkcyFilgChapter_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScore", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScore(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScore_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "MaximumCreditCurrencyCode", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingMaximumCreditCurrencyCode(String value) {
        return new JAXBElement<String>(_CreditRatingMaximumCreditCurrencyCode_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DisasterInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingDisasterInd(String value) {
        return new JAXBElement<String>(_CreditRatingDisasterInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "JudgementInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingJudgementInd(String value) {
        return new JAXBElement<String>(_CreditRatingJudgementInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreOverrideCode", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreOverrideCode(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreOverrideCode_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ClaimsInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingClaimsInd(String value) {
        return new JAXBElement<String>(_CreditRatingClaimsInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreIncdDefault", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingCreditScoreIncdDefault(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingCreditScoreIncdDefault_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DelqPmtPctgForAllFirms", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingDelqPmtPctgForAllFirms(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingDelqPmtPctgForAllFirms_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "NumberSpecialEvent", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingNumberSpecialEvent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingNumberSpecialEvent_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PubRecExpl", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPubRecExpl(String value) {
        return new JAXBElement<String>(_CreditRatingPubRecExpl_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexIndustryComment", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexIndustryComment(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexIndustryComment_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FinclEmbtInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFinclEmbtInd(String value) {
        return new JAXBElement<String>(_CreditRatingFinclEmbtInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary10", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary10(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary10_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DebarmentsDate", scope = CreditRating.class)
    public JAXBElement<XMLGregorianCalendar> createCreditRatingDebarmentsDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditRatingDebarmentsDate_QNAME, XMLGregorianCalendar.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexFirmComment", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexFirmComment(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexFirmComment_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "BankruptcyInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingBankruptcyInd(String value) {
        return new JAXBElement<String>(_CreditRatingBankruptcyInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreAge", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingFailureScoreAge(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingFailureScoreAge_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PrntBkcyFilgType", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPrntBkcyFilgType(String value) {
        return new JAXBElement<String>(_CreditRatingPrntBkcyFilgType_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary5", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary5(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary5_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary4", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary4(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary4_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreOverrideCode", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreOverrideCode(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreOverrideCode_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DelqPmtRngPrcnt", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingDelqPmtRngPrcnt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingDelqPmtRngPrcnt_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary3", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary3(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary3_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RatedAsOfDate", scope = CreditRating.class)
    public JAXBElement<XMLGregorianCalendar> createCreditRatingRatedAsOfDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditRatingRatedAsOfDate_QNAME, XMLGregorianCalendar.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary2", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary2(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary2_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonLanguageCreatedByModule_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreDate", scope = CreditRating.class)
    public JAXBElement<XMLGregorianCalendar> createCreditRatingFailureScoreDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditRatingFailureScoreDate_QNAME, XMLGregorianCalendar.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary9", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary9(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary9_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Comments", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingComments(String value) {
        return new JAXBElement<String>(_CreditRatingComments_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary8", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary8(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary8_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary7", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary7(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary7_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "GlobalFailureScore", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingGlobalFailureScore(String value) {
        return new JAXBElement<String>(_CreditRatingGlobalFailureScore_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreCommentary6", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingCreditScoreCommentary6(String value) {
        return new JAXBElement<String>(_CreditRatingCreditScoreCommentary6_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SpecialEventComment", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingSpecialEventComment(String value) {
        return new JAXBElement<String>(_CreditRatingSpecialEventComment_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SlowTradeExpl", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingSlowTradeExpl(String value) {
        return new JAXBElement<String>(_CreditRatingSlowTradeExpl_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DebarmentsCount", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingDebarmentsCount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingDebarmentsCount_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PrntBkcyConvDate", scope = CreditRating.class)
    public JAXBElement<XMLGregorianCalendar> createCreditRatingPrntBkcyConvDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditRatingPrntBkcyConvDate_QNAME, XMLGregorianCalendar.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexIndustryDays", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexIndustryDays(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexIndustryDays_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "NumberParentBankruptcyConversions", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingNumberParentBankruptcyConversions(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingNumberParentBankruptcyConversions_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary8", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary8(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary8_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = CreditRating.class)
    public JAXBElement<Long> createCreditRatingRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary7", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary7(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary7_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary6", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary6(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary6_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "HighCredit", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingHighCredit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingHighCredit_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary5", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary5(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary5_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "NoTradeInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingNoTradeInd(String value) {
        return new JAXBElement<String>(_CreditRatingNoTradeInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary4", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary4(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary4_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary3", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary3(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary3_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RatingOrganization", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingRatingOrganization(String value) {
        return new JAXBElement<String>(_CreditRatingRatingOrganization_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary2", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary2(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary2_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "NumberParentBankruptcyFiling", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingNumberParentBankruptcyFiling(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingNumberParentBankruptcyFiling_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "NumberTradeExperiences", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingNumberTradeExperiences(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingNumberTradeExperiences_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreClass", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingCreditScoreClass(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingCreditScoreClass_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FinclLglEventInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFinclLglEventInd(String value) {
        return new JAXBElement<String>(_CreditRatingFinclLglEventInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "BusinessDiscontinued", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingBusinessDiscontinued(String value) {
        return new JAXBElement<String>(_CreditRatingBusinessDiscontinued_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SuitInd", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingSuitInd(String value) {
        return new JAXBElement<String>(_CreditRatingSuitInd_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreditScoreAge", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingCreditScoreAge(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingCreditScoreAge_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "HighRngDelqScr", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingHighRngDelqScr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingHighRngDelqScr_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreIncdDefault", scope = CreditRating.class)
    public JAXBElement<BigDecimal> createCreditRatingFailureScoreIncdDefault(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CreditRatingFailureScoreIncdDefault_QNAME, BigDecimal.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FailureScoreCommentary9", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingFailureScoreCommentary9(String value) {
        return new JAXBElement<String>(_CreditRatingFailureScoreCommentary9_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PaydexFirmDays", scope = CreditRating.class)
    public JAXBElement<String> createCreditRatingPaydexFirmDays(String value) {
        return new JAXBElement<String>(_CreditRatingPaydexFirmDays_QNAME, String.class, CreditRating.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = PartyUsageAssignment.class)
    public JAXBElement<Long> createPartyUsageAssignmentRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, PartyUsageAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = PartyUsageAssignment.class)
    public JAXBElement<String> createPartyUsageAssignmentLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, PartyUsageAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableId", scope = PartyUsageAssignment.class)
    public JAXBElement<Long> createPartyUsageAssignmentOwnerTableId(Long value) {
        return new JAXBElement<Long>(_CodeAssignmentOwnerTableId_QNAME, Long.class, PartyUsageAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EffectiveEndDate", scope = PartyUsageAssignment.class)
    public JAXBElement<XMLGregorianCalendar> createPartyUsageAssignmentEffectiveEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartyUsageAssignmentEffectiveEndDate_QNAME, XMLGregorianCalendar.class, PartyUsageAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Comments", scope = PartyUsageAssignment.class)
    public JAXBElement<String> createPartyUsageAssignmentComments(String value) {
        return new JAXBElement<String>(_CreditRatingComments_QNAME, String.class, PartyUsageAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OwnerTableName", scope = PartyUsageAssignment.class)
    public JAXBElement<String> createPartyUsageAssignmentOwnerTableName(String value) {
        return new JAXBElement<String>(_PartyUsageAssignmentOwnerTableName_QNAME, String.class, PartyUsageAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = EmailDomain.class)
    public JAXBElement<String> createEmailDomainLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, EmailDomain.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Status", scope = EmailDomain.class)
    public JAXBElement<String> createEmailDomainStatus(String value) {
        return new JAXBElement<String>(_PersonLanguageStatus_QNAME, String.class, EmailDomain.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = AdditionalPartyId.class)
    public JAXBElement<Long> createAdditionalPartyIdRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = AdditionalPartyId.class)
    public JAXBElement<String> createAdditionalPartyIdLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "IssuingAuthorityPartyId", scope = AdditionalPartyId.class)
    public JAXBElement<Long> createAdditionalPartyIdIssuingAuthorityPartyId(Long value) {
        return new JAXBElement<Long>(_AdditionalPartyIdIssuingAuthorityPartyId_QNAME, Long.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Description", scope = AdditionalPartyId.class)
    public JAXBElement<String> createAdditionalPartyIdDescription(String value) {
        return new JAXBElement<String>(_CreditRatingDescription_QNAME, String.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "IssueDate", scope = AdditionalPartyId.class)
    public JAXBElement<XMLGregorianCalendar> createAdditionalPartyIdIssueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdditionalPartyIdIssueDate_QNAME, XMLGregorianCalendar.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ExpirationDate", scope = AdditionalPartyId.class)
    public JAXBElement<XMLGregorianCalendar> createAdditionalPartyIdExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdditionalPartyIdExpirationDate_QNAME, XMLGregorianCalendar.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Country", scope = AdditionalPartyId.class)
    public JAXBElement<String> createAdditionalPartyIdCountry(String value) {
        return new JAXBElement<String>(_AdditionalPartyIdCountry_QNAME, String.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "IssuingAuthorityName", scope = AdditionalPartyId.class)
    public JAXBElement<String> createAdditionalPartyIdIssuingAuthorityName(String value) {
        return new JAXBElement<String>(_AdditionalPartyIdIssuingAuthorityName_QNAME, String.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "StateProvince", scope = AdditionalPartyId.class)
    public JAXBElement<String> createAdditionalPartyIdStateProvince(String value) {
        return new JAXBElement<String>(_AdditionalPartyIdStateProvince_QNAME, String.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyName", scope = AdditionalPartyId.class)
    public JAXBElement<String> createAdditionalPartyIdPartyName(String value) {
        return new JAXBElement<String>(_AdditionalPartyIdPartyName_QNAME, String.class, AdditionalPartyId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonLanguageCreatedByModule_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartySiteType", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySitePartySiteType(String value) {
        return new JAXBElement<String>(_PersonPartySitePartySiteType_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Comments", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteComments(String value) {
        return new JAXBElement<String>(_CreditRatingComments_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Mailstop", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteMailstop(String value) {
        return new JAXBElement<String>(_PersonPartySiteMailstop_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RelationshipId", scope = PersonPartySite.class)
    public JAXBElement<Long> createPersonPartySiteRelationshipId(Long value) {
        return new JAXBElement<Long>(_PersonPartySiteRelationshipId_QNAME, Long.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = PersonPartySite.class)
    public JAXBElement<Long> createPersonPartySiteRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyNameLegal", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySitePartyNameLegal(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyNameLegal_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartySiteName", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySitePartySiteName(String value) {
        return new JAXBElement<String>(_PersonPartySitePartySiteName_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyNameDivision", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySitePartyNameDivision(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyNameDivision_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "GlobalLocationNumber", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteGlobalLocationNumber(String value) {
        return new JAXBElement<String>(_PersonPartySiteGlobalLocationNumber_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyNameDba", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySitePartyNameDba(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyNameDba_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EndDateActive", scope = PersonPartySite.class)
    public JAXBElement<XMLGregorianCalendar> createPersonPartySiteEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CodeAssignmentEndDateActive_QNAME, XMLGregorianCalendar.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyUsageCode", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySitePartyUsageCode(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyUsageCode_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Addressee", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteAddressee(String value) {
        return new JAXBElement<String>(_PersonPartySiteAddressee_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Language", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteLanguage(String value) {
        return new JAXBElement<String>(_PersonPartySiteLanguage_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DUNSNumberC", scope = PersonPartySite.class)
    public JAXBElement<String> createPersonPartySiteDUNSNumberC(String value) {
        return new JAXBElement<String>(_PersonPartySiteDUNSNumberC_QNAME, String.class, PersonPartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = PartySiteUse.class)
    public JAXBElement<Long> createPartySiteUseRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PrimaryPerType", scope = PartySiteUse.class)
    public JAXBElement<String> createPartySiteUsePrimaryPerType(String value) {
        return new JAXBElement<String>(_PartySiteUsePrimaryPerType_QNAME, String.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = PartySiteUse.class)
    public JAXBElement<String> createPartySiteUseLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = PartySiteUse.class)
    public JAXBElement<String> createPartySiteUseCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonLanguageCreatedByModule_QNAME, String.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EndDate", scope = PartySiteUse.class)
    public JAXBElement<XMLGregorianCalendar> createPartySiteUseEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartySiteUseEndDate_QNAME, XMLGregorianCalendar.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "BeginDate", scope = PartySiteUse.class)
    public JAXBElement<XMLGregorianCalendar> createPartySiteUseBeginDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartySiteUseBeginDate_QNAME, XMLGregorianCalendar.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Comments", scope = PartySiteUse.class)
    public JAXBElement<String> createPartySiteUseComments(String value) {
        return new JAXBElement<String>(_CreditRatingComments_QNAME, String.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Status", scope = PartySiteUse.class)
    public JAXBElement<String> createPartySiteUseStatus(String value) {
        return new JAXBElement<String>(_PersonLanguageStatus_QNAME, String.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartySiteId", scope = PartySiteUse.class)
    public JAXBElement<Long> createPartySiteUsePartySiteId(Long value) {
        return new JAXBElement<Long>(_PartySiteUsePartySiteId_QNAME, Long.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "SiteUseType", scope = PartySiteUse.class)
    public JAXBElement<String> createPartySiteUseSiteUseType(String value) {
        return new JAXBElement<String>(_PartySiteUseSiteUseType_QNAME, String.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "IntegrationKey", scope = PartySiteUse.class)
    public JAXBElement<String> createPartySiteUseIntegrationKey(String value) {
        return new JAXBElement<String>(_PartySiteUseIntegrationKey_QNAME, String.class, PartySiteUse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = OriginalSystemReference.class)
    public JAXBElement<Long> createOriginalSystemReferenceRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyId", scope = OriginalSystemReference.class)
    public JAXBElement<Long> createOriginalSystemReferencePartyId(Long value) {
        return new JAXBElement<Long>(_OriginalSystemReferencePartyId_QNAME, Long.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonLanguageCreatedByModule_QNAME, String.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EndDateActive", scope = OriginalSystemReference.class)
    public JAXBElement<XMLGregorianCalendar> createOriginalSystemReferenceEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CodeAssignmentEndDateActive_QNAME, XMLGregorianCalendar.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OldOrigSystemReference", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceOldOrigSystemReference(String value) {
        return new JAXBElement<String>(_OriginalSystemReferenceOldOrigSystemReference_QNAME, String.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ReasonCode", scope = OriginalSystemReference.class)
    public JAXBElement<String> createOriginalSystemReferenceReasonCode(String value) {
        return new JAXBElement<String>(_OriginalSystemReferenceReasonCode_QNAME, String.class, OriginalSystemReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = Certification.class)
    public JAXBElement<Long> createCertificationRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = Certification.class)
    public JAXBElement<String> createCertificationLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Grade", scope = Certification.class)
    public JAXBElement<String> createCertificationGrade(String value) {
        return new JAXBElement<String>(_CertificationGrade_QNAME, String.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Status", scope = Certification.class)
    public JAXBElement<String> createCertificationStatus(String value) {
        return new JAXBElement<String>(_PersonLanguageStatus_QNAME, String.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "IssuedOnDate", scope = Certification.class)
    public JAXBElement<XMLGregorianCalendar> createCertificationIssuedOnDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificationIssuedOnDate_QNAME, XMLGregorianCalendar.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "IssuedByAuthority", scope = Certification.class)
    public JAXBElement<String> createCertificationIssuedByAuthority(String value) {
        return new JAXBElement<String>(_CertificationIssuedByAuthority_QNAME, String.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ExpiresOnDate", scope = Certification.class)
    public JAXBElement<XMLGregorianCalendar> createCertificationExpiresOnDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificationExpiresOnDate_QNAME, XMLGregorianCalendar.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CurrentStatus", scope = Certification.class)
    public JAXBElement<String> createCertificationCurrentStatus(String value) {
        return new JAXBElement<String>(_CertificationCurrentStatus_QNAME, String.class, Certification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = FinancialProfile.class)
    public JAXBElement<Long> createFinancialProfileRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfileLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FinancialOrgType", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfileFinancialOrgType(String value) {
        return new JAXBElement<String>(_FinancialProfileFinancialOrgType_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Status", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfileStatus(String value) {
        return new JAXBElement<String>(_PersonLanguageStatus_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FinancialOrganizationName", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfileFinancialOrganizationName(String value) {
        return new JAXBElement<String>(_FinancialProfileFinancialOrganizationName_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AccessAuthorityGranted", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfileAccessAuthorityGranted(String value) {
        return new JAXBElement<String>(_FinancialProfileAccessAuthorityGranted_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "BalanceVerifiedOnDate", scope = FinancialProfile.class)
    public JAXBElement<XMLGregorianCalendar> createFinancialProfileBalanceVerifiedOnDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinancialProfileBalanceVerifiedOnDate_QNAME, XMLGregorianCalendar.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AccessAuthorityDate", scope = FinancialProfile.class)
    public JAXBElement<XMLGregorianCalendar> createFinancialProfileAccessAuthorityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FinancialProfileAccessAuthorityDate_QNAME, XMLGregorianCalendar.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FinancialAccountType", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfileFinancialAccountType(String value) {
        return new JAXBElement<String>(_FinancialProfileFinancialAccountType_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "BalanceAmount", scope = FinancialProfile.class)
    public JAXBElement<AmountType> createFinancialProfileBalanceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_FinancialProfileBalanceAmount_QNAME, AmountType.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PreferredFunctionalCurrency", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfilePreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_FinancialProfilePreferredFunctionalCurrency_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FinancialAccountNumber", scope = FinancialProfile.class)
    public JAXBElement<String> createFinancialProfileFinancialAccountNumber(String value) {
        return new JAXBElement<String>(_FinancialProfileFinancialAccountNumber_QNAME, String.class, FinancialProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AdditionalValue5", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceAdditionalValue5(String value) {
        return new JAXBElement<String>(_PartyPreferenceAdditionalValue5_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AdditionalValue4", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceAdditionalValue4(String value) {
        return new JAXBElement<String>(_PartyPreferenceAdditionalValue4_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ValueDate", scope = PartyPreference.class)
    public JAXBElement<XMLGregorianCalendar> createPartyPreferenceValueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartyPreferenceValueDate_QNAME, XMLGregorianCalendar.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AdditionalValue3", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceAdditionalValue3(String value) {
        return new JAXBElement<String>(_PartyPreferenceAdditionalValue3_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AdditionalValue2", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceAdditionalValue2(String value) {
        return new JAXBElement<String>(_PartyPreferenceAdditionalValue2_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AdditionalValue1", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceAdditionalValue1(String value) {
        return new JAXBElement<String>(_PartyPreferenceAdditionalValue1_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Module", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceModule(String value) {
        return new JAXBElement<String>(_PartyPreferenceModule_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ValueName", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceValueName(String value) {
        return new JAXBElement<String>(_PartyPreferenceValueName_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ValueNumber", scope = PartyPreference.class)
    public JAXBElement<BigDecimal> createPartyPreferenceValueNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PartyPreferenceValueNumber_QNAME, BigDecimal.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ValueVarchar2", scope = PartyPreference.class)
    public JAXBElement<String> createPartyPreferenceValueVarchar2(String value) {
        return new JAXBElement<String>(_PartyPreferenceValueVarchar2_QNAME, String.class, PartyPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OrigSystem", scope = PartySite.class)
    public JAXBElement<String> createPartySiteOrigSystem(String value) {
        return new JAXBElement<String>(_PartySiteOrigSystem_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "UsageCode", scope = PartySite.class)
    public JAXBElement<String> createPartySiteUsageCode(String value) {
        return new JAXBElement<String>(_PartySiteUsageCode_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ValidationStatusCode", scope = PartySite.class)
    public JAXBElement<String> createPartySiteValidationStatusCode(String value) {
        return new JAXBElement<String>(_PartySiteValidationStatusCode_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyNameDba", scope = PartySite.class)
    public JAXBElement<String> createPartySitePartyNameDba(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyNameDba_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "StartDateActive", scope = PartySite.class)
    public JAXBElement<XMLGregorianCalendar> createPartySiteStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartySiteStartDateActive_QNAME, XMLGregorianCalendar.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DUNSNumberC", scope = PartySite.class)
    public JAXBElement<String> createPartySiteDUNSNumberC(String value) {
        return new JAXBElement<String>(_PersonPartySiteDUNSNumberC_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ValidatedFlag", scope = PartySite.class)
    public JAXBElement<Boolean> createPartySiteValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PartySiteValidatedFlag_QNAME, Boolean.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FormattedLocaleAddress", scope = PartySite.class)
    public JAXBElement<String> createPartySiteFormattedLocaleAddress(String value) {
        return new JAXBElement<String>(_PartySiteFormattedLocaleAddress_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LastUpdateLogin", scope = PartySite.class)
    public JAXBElement<String> createPartySiteLastUpdateLogin(String value) {
        return new JAXBElement<String>(_PersonLanguageLastUpdateLogin_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AddressLinesPhonetic", scope = PartySite.class)
    public JAXBElement<String> createPartySiteAddressLinesPhonetic(String value) {
        return new JAXBElement<String>(_PartySiteAddressLinesPhonetic_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "HouseType", scope = PartySite.class)
    public JAXBElement<String> createPartySiteHouseType(String value) {
        return new JAXBElement<String>(_PartySiteHouseType_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Mailstop", scope = PartySite.class)
    public JAXBElement<String> createPartySiteMailstop(String value) {
        return new JAXBElement<String>(_PersonPartySiteMailstop_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "City", scope = PartySite.class)
    public JAXBElement<String> createPartySiteCity(String value) {
        return new JAXBElement<String>(_PartySiteCity_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CurrencyCode", scope = PartySite.class)
    public JAXBElement<String> createPartySiteCurrencyCode(String value) {
        return new JAXBElement<String>(_PartySiteCurrencyCode_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Province", scope = PartySite.class)
    public JAXBElement<String> createPartySiteProvince(String value) {
        return new JAXBElement<String>(_PartySiteProvince_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartySiteName", scope = PartySite.class)
    public JAXBElement<String> createPartySitePartySiteName(String value) {
        return new JAXBElement<String>(_PersonPartySitePartySiteName_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "State", scope = PartySite.class)
    public JAXBElement<String> createPartySiteState(String value) {
        return new JAXBElement<String>(_PartySiteState_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyNameDivision", scope = PartySite.class)
    public JAXBElement<String> createPartySitePartyNameDivision(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyNameDivision_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PostalCode", scope = PartySite.class)
    public JAXBElement<String> createPartySitePostalCode(String value) {
        return new JAXBElement<String>(_PartySitePostalCode_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "County", scope = PartySite.class)
    public JAXBElement<String> createPartySiteCounty(String value) {
        return new JAXBElement<String>(_PartySiteCounty_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FormattedMultilineAddress", scope = PartySite.class)
    public JAXBElement<String> createPartySiteFormattedMultilineAddress(String value) {
        return new JAXBElement<String>(_PartySiteFormattedMultilineAddress_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CorpCurrencyCode", scope = PartySite.class)
    public JAXBElement<String> createPartySiteCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PartySiteCorpCurrencyCode_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "ContactPreferenceExistFlag", scope = PartySite.class)
    public JAXBElement<Boolean> createPartySiteContactPreferenceExistFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PartySiteContactPreferenceExistFlag_QNAME, Boolean.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AddressStyle", scope = PartySite.class)
    public JAXBElement<String> createPartySiteAddressStyle(String value) {
        return new JAXBElement<String>(_PartySiteAddressStyle_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Language", scope = PartySite.class)
    public JAXBElement<String> createPartySiteLanguage(String value) {
        return new JAXBElement<String>(_PersonPartySiteLanguage_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Position", scope = PartySite.class)
    public JAXBElement<String> createPartySitePosition(String value) {
        return new JAXBElement<String>(_PartySitePosition_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartySiteType", scope = PartySite.class)
    public JAXBElement<String> createPartySitePartySiteType(String value) {
        return new JAXBElement<String>(_PersonPartySitePartySiteType_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DoNotValidateFlag", scope = PartySite.class)
    public JAXBElement<Boolean> createPartySiteDoNotValidateFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PartySiteDoNotValidateFlag_QNAME, Boolean.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "AddressExpirationDate", scope = PartySite.class)
    public JAXBElement<XMLGregorianCalendar> createPartySiteAddressExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartySiteAddressExpirationDate_QNAME, XMLGregorianCalendar.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Address1", scope = PartySite.class)
    public JAXBElement<String> createPartySiteAddress1(String value) {
        return new JAXBElement<String>(_PartySiteAddress1_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyNameLegal", scope = PartySite.class)
    public JAXBElement<String> createPartySitePartyNameLegal(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyNameLegal_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Address2", scope = PartySite.class)
    public JAXBElement<String> createPartySiteAddress2(String value) {
        return new JAXBElement<String>(_PartySiteAddress2_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Address3", scope = PartySite.class)
    public JAXBElement<String> createPartySiteAddress3(String value) {
        return new JAXBElement<String>(_PartySiteAddress3_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LocationLanguage", scope = PartySite.class)
    public JAXBElement<String> createPartySiteLocationLanguage(String value) {
        return new JAXBElement<String>(_PartySiteLocationLanguage_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EndDateActive", scope = PartySite.class)
    public JAXBElement<XMLGregorianCalendar> createPartySiteEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CodeAssignmentEndDateActive_QNAME, XMLGregorianCalendar.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PartyUsageCode", scope = PartySite.class)
    public JAXBElement<String> createPartySitePartyUsageCode(String value) {
        return new JAXBElement<String>(_PersonPartySitePartyUsageCode_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CurcyConvRateType", scope = PartySite.class)
    public JAXBElement<String> createPartySiteCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PartySiteCurcyConvRateType_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "EmailAddress", scope = PartySite.class)
    public JAXBElement<String> createPartySiteEmailAddress(String value) {
        return new JAXBElement<String>(_PartySiteEmailAddress_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "CreatedByModule", scope = PartySite.class)
    public JAXBElement<String> createPartySiteCreatedByModule(String value) {
        return new JAXBElement<String>(_PersonLanguageCreatedByModule_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "InternalFlag", scope = PartySite.class)
    public JAXBElement<Boolean> createPartySiteInternalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PartySiteInternalFlag_QNAME, Boolean.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Comments", scope = PartySite.class)
    public JAXBElement<String> createPartySiteComments(String value) {
        return new JAXBElement<String>(_CreditRatingComments_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "FormattedAddress", scope = PartySite.class)
    public JAXBElement<String> createPartySiteFormattedAddress(String value) {
        return new JAXBElement<String>(_PartySiteFormattedAddress_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RelationshipId", scope = PartySite.class)
    public JAXBElement<Long> createPartySiteRelationshipId(Long value) {
        return new JAXBElement<Long>(_PersonPartySiteRelationshipId_QNAME, Long.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "DateValidated", scope = PartySite.class)
    public JAXBElement<XMLGregorianCalendar> createPartySiteDateValidated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PartySiteDateValidated_QNAME, XMLGregorianCalendar.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Address4", scope = PartySite.class)
    public JAXBElement<String> createPartySiteAddress4(String value) {
        return new JAXBElement<String>(_PartySiteAddress4_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "RequestId", scope = PartySite.class)
    public JAXBElement<Long> createPartySiteRequestId(Long value) {
        return new JAXBElement<Long>(_PersonLanguageRequestId_QNAME, Long.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "OrigSystemReference", scope = PartySite.class)
    public JAXBElement<String> createPartySiteOrigSystemReference(String value) {
        return new JAXBElement<String>(_PartySiteOrigSystemReference_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "GlobalLocationNumber", scope = PartySite.class)
    public JAXBElement<String> createPartySiteGlobalLocationNumber(String value) {
        return new JAXBElement<String>(_PersonPartySiteGlobalLocationNumber_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "LocationDirections", scope = PartySite.class)
    public JAXBElement<String> createPartySiteLocationDirections(String value) {
        return new JAXBElement<String>(_PartySiteLocationDirections_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "PostalPlus4Code", scope = PartySite.class)
    public JAXBElement<String> createPartySitePostalPlus4Code(String value) {
        return new JAXBElement<String>(_PartySitePostalPlus4Code_QNAME, String.class, PartySite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", name = "Addressee", scope = PartySite.class)
    public JAXBElement<String> createPartySiteAddressee(String value) {
        return new JAXBElement<String>(_PersonPartySiteAddressee_QNAME, String.class, PartySite.class, value);
    }

}

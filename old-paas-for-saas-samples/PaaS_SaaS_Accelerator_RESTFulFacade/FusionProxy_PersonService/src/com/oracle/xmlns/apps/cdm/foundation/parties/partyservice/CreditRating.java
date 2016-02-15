
package com.oracle.xmlns.apps.cdm.foundation.parties.partyservice;

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
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * <p>Java class for CreditRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditRatingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatedAsOfDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RatingOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetHistoryInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinclEmbtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CriminalProceedingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecuredFlngInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinclLglEventInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisasterInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OprgSpecificationEvntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherSpecificationEvntInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageHighCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreAge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditScoreClass" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreCommentary10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CreditScoreIncdDefault" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditScoreNatlPercentile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebarmentInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebarmentsCount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebarmentsDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="HighCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumCreditCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumCreditRecommendationAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PaydexNorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaydexScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaydexThreeMonthsAgo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditScoreOverrideCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRiskScoreExplain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowRngDelqScr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HighRngDelqScr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DelqPmtRngPrcnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DelqPmtPctgForAllFirms" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumberTradeExperiences" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaydexFirmDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaydexFirmComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaydexIndustryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaydexIndustryComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaydexComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuitInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LienInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgementInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankruptcyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoTradeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentHQBankruptcyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberParentBankruptcyFiling" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrntBkcyFilgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrntBkcyFilgChapter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrntBkcyFilgDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NumberParentBankruptcyConversions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrntBkcyConvDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PrntBkcyChapterConv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlowTradeExpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegvPmtExpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PubRecExpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessDiscontinued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialEventComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberSpecialEvent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SpecialEventUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SpecialEventText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreAge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FailureScoreClass" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreCommentary10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureScoreDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="FailureScoreIncdDefault" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FailureScoreNatnlPercentile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FailureScoreOverrideCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalFailureScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CreditRating", propOrder = {
    "creditRatingId",
    "description",
    "partyId",
    "rating",
    "ratedAsOfDate",
    "ratingOrganization",
    "createdBy",
    "creationDate",
    "lastUpdateLogin",
    "lastUpdateDate",
    "lastUpdatedBy",
    "requestId",
    "comments",
    "detHistoryInd",
    "finclEmbtInd",
    "criminalProceedingInd",
    "claimsInd",
    "securedFlngInd",
    "finclLglEventInd",
    "disasterInd",
    "oprgSpecificationEvntInd",
    "otherSpecificationEvntInd",
    "status",
    "objectVersionNumber",
    "createdByModule",
    "averageHighCredit",
    "creditScore",
    "creditScoreAge",
    "creditScoreClass",
    "creditScoreCommentary",
    "creditScoreCommentary2",
    "creditScoreCommentary3",
    "creditScoreCommentary4",
    "creditScoreCommentary5",
    "creditScoreCommentary6",
    "creditScoreCommentary7",
    "creditScoreCommentary8",
    "creditScoreCommentary9",
    "creditScoreCommentary10",
    "creditScoreDate",
    "creditScoreIncdDefault",
    "creditScoreNatlPercentile",
    "debarmentInd",
    "debarmentsCount",
    "debarmentsDate",
    "highCredit",
    "maximumCreditCurrencyCode",
    "maximumCreditRecommendationAmount",
    "paydexNorm",
    "paydexScore",
    "paydexThreeMonthsAgo",
    "creditScoreOverrideCode",
    "creditRiskScoreExplain",
    "lowRngDelqScr",
    "highRngDelqScr",
    "delqPmtRngPrcnt",
    "delqPmtPctgForAllFirms",
    "numberTradeExperiences",
    "paydexFirmDays",
    "paydexFirmComment",
    "paydexIndustryDays",
    "paydexIndustryComment",
    "paydexComment",
    "suitInd",
    "lienInd",
    "judgementInd",
    "bankruptcyInd",
    "noTradeInd",
    "parentHQBankruptcyInd",
    "numberParentBankruptcyFiling",
    "prntBkcyFilgType",
    "prntBkcyFilgChapter",
    "prntBkcyFilgDate",
    "numberParentBankruptcyConversions",
    "prntBkcyConvDate",
    "prntBkcyChapterConv",
    "slowTradeExpl",
    "negvPmtExpl",
    "pubRecExpl",
    "businessDiscontinued",
    "specialEventComment",
    "numberSpecialEvent",
    "specialEventUpdateDate",
    "specialEventText",
    "failureScore",
    "failureScoreAge",
    "failureScoreClass",
    "failureScoreCommentary",
    "failureScoreCommentary2",
    "failureScoreCommentary3",
    "failureScoreCommentary4",
    "failureScoreCommentary5",
    "failureScoreCommentary6",
    "failureScoreCommentary7",
    "failureScoreCommentary8",
    "failureScoreCommentary9",
    "failureScoreCommentary10",
    "failureScoreDate",
    "failureScoreIncdDefault",
    "failureScoreNatnlPercentile",
    "failureScoreOverrideCode",
    "globalFailureScore",
    "originalSystemReference"
})
public class CreditRating {

    @XmlElement(name = "CreditRatingId")
    protected Long creditRatingId;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "Rating")
    protected String rating;
    @XmlElementRef(name = "RatedAsOfDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> ratedAsOfDate;
    @XmlElementRef(name = "RatingOrganization", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> ratingOrganization;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "DetHistoryInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> detHistoryInd;
    @XmlElementRef(name = "FinclEmbtInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> finclEmbtInd;
    @XmlElementRef(name = "CriminalProceedingInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> criminalProceedingInd;
    @XmlElementRef(name = "ClaimsInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> claimsInd;
    @XmlElementRef(name = "SecuredFlngInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> securedFlngInd;
    @XmlElementRef(name = "FinclLglEventInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> finclLglEventInd;
    @XmlElementRef(name = "DisasterInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> disasterInd;
    @XmlElementRef(name = "OprgSpecificationEvntInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> oprgSpecificationEvntInd;
    @XmlElementRef(name = "OtherSpecificationEvntInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> otherSpecificationEvntInd;
    @XmlElementRef(name = "Status", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElementRef(name = "AverageHighCredit", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> averageHighCredit;
    @XmlElementRef(name = "CreditScore", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScore;
    @XmlElementRef(name = "CreditScoreAge", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> creditScoreAge;
    @XmlElementRef(name = "CreditScoreClass", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> creditScoreClass;
    @XmlElementRef(name = "CreditScoreCommentary", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary;
    @XmlElementRef(name = "CreditScoreCommentary2", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary2;
    @XmlElementRef(name = "CreditScoreCommentary3", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary3;
    @XmlElementRef(name = "CreditScoreCommentary4", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary4;
    @XmlElementRef(name = "CreditScoreCommentary5", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary5;
    @XmlElementRef(name = "CreditScoreCommentary6", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary6;
    @XmlElementRef(name = "CreditScoreCommentary7", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary7;
    @XmlElementRef(name = "CreditScoreCommentary8", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary8;
    @XmlElementRef(name = "CreditScoreCommentary9", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary9;
    @XmlElementRef(name = "CreditScoreCommentary10", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreCommentary10;
    @XmlElementRef(name = "CreditScoreDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> creditScoreDate;
    @XmlElementRef(name = "CreditScoreIncdDefault", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> creditScoreIncdDefault;
    @XmlElementRef(name = "CreditScoreNatlPercentile", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> creditScoreNatlPercentile;
    @XmlElementRef(name = "DebarmentInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> debarmentInd;
    @XmlElementRef(name = "DebarmentsCount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> debarmentsCount;
    @XmlElementRef(name = "DebarmentsDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> debarmentsDate;
    @XmlElementRef(name = "HighCredit", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> highCredit;
    @XmlElementRef(name = "MaximumCreditCurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> maximumCreditCurrencyCode;
    @XmlElementRef(name = "MaximumCreditRecommendationAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> maximumCreditRecommendationAmount;
    @XmlElementRef(name = "PaydexNorm", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexNorm;
    @XmlElementRef(name = "PaydexScore", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexScore;
    @XmlElementRef(name = "PaydexThreeMonthsAgo", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexThreeMonthsAgo;
    @XmlElementRef(name = "CreditScoreOverrideCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditScoreOverrideCode;
    @XmlElementRef(name = "CreditRiskScoreExplain", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> creditRiskScoreExplain;
    @XmlElementRef(name = "LowRngDelqScr", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> lowRngDelqScr;
    @XmlElementRef(name = "HighRngDelqScr", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> highRngDelqScr;
    @XmlElementRef(name = "DelqPmtRngPrcnt", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> delqPmtRngPrcnt;
    @XmlElementRef(name = "DelqPmtPctgForAllFirms", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> delqPmtPctgForAllFirms;
    @XmlElementRef(name = "NumberTradeExperiences", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numberTradeExperiences;
    @XmlElementRef(name = "PaydexFirmDays", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexFirmDays;
    @XmlElementRef(name = "PaydexFirmComment", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexFirmComment;
    @XmlElementRef(name = "PaydexIndustryDays", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexIndustryDays;
    @XmlElementRef(name = "PaydexIndustryComment", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexIndustryComment;
    @XmlElementRef(name = "PaydexComment", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> paydexComment;
    @XmlElementRef(name = "SuitInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> suitInd;
    @XmlElementRef(name = "LienInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> lienInd;
    @XmlElementRef(name = "JudgementInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> judgementInd;
    @XmlElementRef(name = "BankruptcyInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> bankruptcyInd;
    @XmlElementRef(name = "NoTradeInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> noTradeInd;
    @XmlElementRef(name = "ParentHQBankruptcyInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> parentHQBankruptcyInd;
    @XmlElementRef(name = "NumberParentBankruptcyFiling", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numberParentBankruptcyFiling;
    @XmlElementRef(name = "PrntBkcyFilgType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> prntBkcyFilgType;
    @XmlElementRef(name = "PrntBkcyFilgChapter", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> prntBkcyFilgChapter;
    @XmlElementRef(name = "PrntBkcyFilgDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> prntBkcyFilgDate;
    @XmlElementRef(name = "NumberParentBankruptcyConversions", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numberParentBankruptcyConversions;
    @XmlElementRef(name = "PrntBkcyConvDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> prntBkcyConvDate;
    @XmlElementRef(name = "PrntBkcyChapterConv", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> prntBkcyChapterConv;
    @XmlElementRef(name = "SlowTradeExpl", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> slowTradeExpl;
    @XmlElementRef(name = "NegvPmtExpl", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> negvPmtExpl;
    @XmlElementRef(name = "PubRecExpl", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> pubRecExpl;
    @XmlElementRef(name = "BusinessDiscontinued", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> businessDiscontinued;
    @XmlElementRef(name = "SpecialEventComment", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> specialEventComment;
    @XmlElementRef(name = "NumberSpecialEvent", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numberSpecialEvent;
    @XmlElementRef(name = "SpecialEventUpdateDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> specialEventUpdateDate;
    @XmlElementRef(name = "SpecialEventText", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> specialEventText;
    @XmlElementRef(name = "FailureScore", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScore;
    @XmlElementRef(name = "FailureScoreAge", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> failureScoreAge;
    @XmlElementRef(name = "FailureScoreClass", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> failureScoreClass;
    @XmlElementRef(name = "FailureScoreCommentary", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary;
    @XmlElementRef(name = "FailureScoreCommentary2", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary2;
    @XmlElementRef(name = "FailureScoreCommentary3", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary3;
    @XmlElementRef(name = "FailureScoreCommentary4", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary4;
    @XmlElementRef(name = "FailureScoreCommentary5", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary5;
    @XmlElementRef(name = "FailureScoreCommentary6", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary6;
    @XmlElementRef(name = "FailureScoreCommentary7", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary7;
    @XmlElementRef(name = "FailureScoreCommentary8", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary8;
    @XmlElementRef(name = "FailureScoreCommentary9", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary9;
    @XmlElementRef(name = "FailureScoreCommentary10", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreCommentary10;
    @XmlElementRef(name = "FailureScoreDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> failureScoreDate;
    @XmlElementRef(name = "FailureScoreIncdDefault", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> failureScoreIncdDefault;
    @XmlElementRef(name = "FailureScoreNatnlPercentile", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> failureScoreNatnlPercentile;
    @XmlElementRef(name = "FailureScoreOverrideCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> failureScoreOverrideCode;
    @XmlElementRef(name = "GlobalFailureScore", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/", type = JAXBElement.class)
    protected JAXBElement<String> globalFailureScore;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;

    /**
     * Gets the value of the creditRatingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditRatingId() {
        return creditRatingId;
    }

    /**
     * Sets the value of the creditRatingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditRatingId(Long value) {
        this.creditRatingId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
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
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the ratedAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRatedAsOfDate() {
        return ratedAsOfDate;
    }

    /**
     * Sets the value of the ratedAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRatedAsOfDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ratedAsOfDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ratingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRatingOrganization() {
        return ratingOrganization;
    }

    /**
     * Sets the value of the ratingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRatingOrganization(JAXBElement<String> value) {
        this.ratingOrganization = ((JAXBElement<String> ) value);
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
     * Gets the value of the detHistoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetHistoryInd() {
        return detHistoryInd;
    }

    /**
     * Sets the value of the detHistoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetHistoryInd(JAXBElement<String> value) {
        this.detHistoryInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finclEmbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinclEmbtInd() {
        return finclEmbtInd;
    }

    /**
     * Sets the value of the finclEmbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinclEmbtInd(JAXBElement<String> value) {
        this.finclEmbtInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the criminalProceedingInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCriminalProceedingInd() {
        return criminalProceedingInd;
    }

    /**
     * Sets the value of the criminalProceedingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCriminalProceedingInd(JAXBElement<String> value) {
        this.criminalProceedingInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the claimsInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimsInd() {
        return claimsInd;
    }

    /**
     * Sets the value of the claimsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimsInd(JAXBElement<String> value) {
        this.claimsInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securedFlngInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecuredFlngInd() {
        return securedFlngInd;
    }

    /**
     * Sets the value of the securedFlngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecuredFlngInd(JAXBElement<String> value) {
        this.securedFlngInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finclLglEventInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinclLglEventInd() {
        return finclLglEventInd;
    }

    /**
     * Sets the value of the finclLglEventInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinclLglEventInd(JAXBElement<String> value) {
        this.finclLglEventInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the disasterInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisasterInd() {
        return disasterInd;
    }

    /**
     * Sets the value of the disasterInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisasterInd(JAXBElement<String> value) {
        this.disasterInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oprgSpecificationEvntInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOprgSpecificationEvntInd() {
        return oprgSpecificationEvntInd;
    }

    /**
     * Sets the value of the oprgSpecificationEvntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOprgSpecificationEvntInd(JAXBElement<String> value) {
        this.oprgSpecificationEvntInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the otherSpecificationEvntInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherSpecificationEvntInd() {
        return otherSpecificationEvntInd;
    }

    /**
     * Sets the value of the otherSpecificationEvntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherSpecificationEvntInd(JAXBElement<String> value) {
        this.otherSpecificationEvntInd = ((JAXBElement<String> ) value);
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
     * Gets the value of the averageHighCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAverageHighCredit() {
        return averageHighCredit;
    }

    /**
     * Sets the value of the averageHighCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAverageHighCredit(JAXBElement<BigDecimal> value) {
        this.averageHighCredit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the creditScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScore(JAXBElement<String> value) {
        this.creditScore = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreditScoreAge() {
        return creditScoreAge;
    }

    /**
     * Sets the value of the creditScoreAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreditScoreAge(JAXBElement<BigDecimal> value) {
        this.creditScoreAge = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the creditScoreClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreditScoreClass() {
        return creditScoreClass;
    }

    /**
     * Sets the value of the creditScoreClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreditScoreClass(JAXBElement<BigDecimal> value) {
        this.creditScoreClass = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary() {
        return creditScoreCommentary;
    }

    /**
     * Sets the value of the creditScoreCommentary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary(JAXBElement<String> value) {
        this.creditScoreCommentary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary2() {
        return creditScoreCommentary2;
    }

    /**
     * Sets the value of the creditScoreCommentary2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary2(JAXBElement<String> value) {
        this.creditScoreCommentary2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary3() {
        return creditScoreCommentary3;
    }

    /**
     * Sets the value of the creditScoreCommentary3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary3(JAXBElement<String> value) {
        this.creditScoreCommentary3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary4() {
        return creditScoreCommentary4;
    }

    /**
     * Sets the value of the creditScoreCommentary4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary4(JAXBElement<String> value) {
        this.creditScoreCommentary4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary5() {
        return creditScoreCommentary5;
    }

    /**
     * Sets the value of the creditScoreCommentary5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary5(JAXBElement<String> value) {
        this.creditScoreCommentary5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary6() {
        return creditScoreCommentary6;
    }

    /**
     * Sets the value of the creditScoreCommentary6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary6(JAXBElement<String> value) {
        this.creditScoreCommentary6 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary7() {
        return creditScoreCommentary7;
    }

    /**
     * Sets the value of the creditScoreCommentary7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary7(JAXBElement<String> value) {
        this.creditScoreCommentary7 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary8() {
        return creditScoreCommentary8;
    }

    /**
     * Sets the value of the creditScoreCommentary8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary8(JAXBElement<String> value) {
        this.creditScoreCommentary8 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary9() {
        return creditScoreCommentary9;
    }

    /**
     * Sets the value of the creditScoreCommentary9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary9(JAXBElement<String> value) {
        this.creditScoreCommentary9 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreCommentary10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreCommentary10() {
        return creditScoreCommentary10;
    }

    /**
     * Sets the value of the creditScoreCommentary10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreCommentary10(JAXBElement<String> value) {
        this.creditScoreCommentary10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreditScoreDate() {
        return creditScoreDate;
    }

    /**
     * Sets the value of the creditScoreDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreditScoreDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creditScoreDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the creditScoreIncdDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreditScoreIncdDefault() {
        return creditScoreIncdDefault;
    }

    /**
     * Sets the value of the creditScoreIncdDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreditScoreIncdDefault(JAXBElement<BigDecimal> value) {
        this.creditScoreIncdDefault = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the creditScoreNatlPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreditScoreNatlPercentile() {
        return creditScoreNatlPercentile;
    }

    /**
     * Sets the value of the creditScoreNatlPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreditScoreNatlPercentile(JAXBElement<BigDecimal> value) {
        this.creditScoreNatlPercentile = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the debarmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebarmentInd() {
        return debarmentInd;
    }

    /**
     * Sets the value of the debarmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebarmentInd(JAXBElement<String> value) {
        this.debarmentInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the debarmentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDebarmentsCount() {
        return debarmentsCount;
    }

    /**
     * Sets the value of the debarmentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDebarmentsCount(JAXBElement<BigDecimal> value) {
        this.debarmentsCount = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the debarmentsDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDebarmentsDate() {
        return debarmentsDate;
    }

    /**
     * Sets the value of the debarmentsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDebarmentsDate(JAXBElement<XMLGregorianCalendar> value) {
        this.debarmentsDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the highCredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHighCredit() {
        return highCredit;
    }

    /**
     * Sets the value of the highCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHighCredit(JAXBElement<BigDecimal> value) {
        this.highCredit = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the maximumCreditCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaximumCreditCurrencyCode() {
        return maximumCreditCurrencyCode;
    }

    /**
     * Sets the value of the maximumCreditCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaximumCreditCurrencyCode(JAXBElement<String> value) {
        this.maximumCreditCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maximumCreditRecommendationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getMaximumCreditRecommendationAmount() {
        return maximumCreditRecommendationAmount;
    }

    /**
     * Sets the value of the maximumCreditRecommendationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setMaximumCreditRecommendationAmount(JAXBElement<AmountType> value) {
        this.maximumCreditRecommendationAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the paydexNorm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexNorm() {
        return paydexNorm;
    }

    /**
     * Sets the value of the paydexNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexNorm(JAXBElement<String> value) {
        this.paydexNorm = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexScore() {
        return paydexScore;
    }

    /**
     * Sets the value of the paydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexScore(JAXBElement<String> value) {
        this.paydexScore = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydexThreeMonthsAgo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexThreeMonthsAgo() {
        return paydexThreeMonthsAgo;
    }

    /**
     * Sets the value of the paydexThreeMonthsAgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexThreeMonthsAgo(JAXBElement<String> value) {
        this.paydexThreeMonthsAgo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditScoreOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditScoreOverrideCode() {
        return creditScoreOverrideCode;
    }

    /**
     * Sets the value of the creditScoreOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditScoreOverrideCode(JAXBElement<String> value) {
        this.creditScoreOverrideCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditRiskScoreExplain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditRiskScoreExplain() {
        return creditRiskScoreExplain;
    }

    /**
     * Sets the value of the creditRiskScoreExplain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditRiskScoreExplain(JAXBElement<String> value) {
        this.creditRiskScoreExplain = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lowRngDelqScr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLowRngDelqScr() {
        return lowRngDelqScr;
    }

    /**
     * Sets the value of the lowRngDelqScr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLowRngDelqScr(JAXBElement<BigDecimal> value) {
        this.lowRngDelqScr = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the highRngDelqScr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHighRngDelqScr() {
        return highRngDelqScr;
    }

    /**
     * Sets the value of the highRngDelqScr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHighRngDelqScr(JAXBElement<BigDecimal> value) {
        this.highRngDelqScr = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the delqPmtRngPrcnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDelqPmtRngPrcnt() {
        return delqPmtRngPrcnt;
    }

    /**
     * Sets the value of the delqPmtRngPrcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDelqPmtRngPrcnt(JAXBElement<BigDecimal> value) {
        this.delqPmtRngPrcnt = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the delqPmtPctgForAllFirms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDelqPmtPctgForAllFirms() {
        return delqPmtPctgForAllFirms;
    }

    /**
     * Sets the value of the delqPmtPctgForAllFirms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDelqPmtPctgForAllFirms(JAXBElement<BigDecimal> value) {
        this.delqPmtPctgForAllFirms = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the numberTradeExperiences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumberTradeExperiences() {
        return numberTradeExperiences;
    }

    /**
     * Sets the value of the numberTradeExperiences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumberTradeExperiences(JAXBElement<BigDecimal> value) {
        this.numberTradeExperiences = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the paydexFirmDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexFirmDays() {
        return paydexFirmDays;
    }

    /**
     * Sets the value of the paydexFirmDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexFirmDays(JAXBElement<String> value) {
        this.paydexFirmDays = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydexFirmComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexFirmComment() {
        return paydexFirmComment;
    }

    /**
     * Sets the value of the paydexFirmComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexFirmComment(JAXBElement<String> value) {
        this.paydexFirmComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydexIndustryDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexIndustryDays() {
        return paydexIndustryDays;
    }

    /**
     * Sets the value of the paydexIndustryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexIndustryDays(JAXBElement<String> value) {
        this.paydexIndustryDays = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydexIndustryComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexIndustryComment() {
        return paydexIndustryComment;
    }

    /**
     * Sets the value of the paydexIndustryComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexIndustryComment(JAXBElement<String> value) {
        this.paydexIndustryComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydexComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaydexComment() {
        return paydexComment;
    }

    /**
     * Sets the value of the paydexComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaydexComment(JAXBElement<String> value) {
        this.paydexComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the suitInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuitInd() {
        return suitInd;
    }

    /**
     * Sets the value of the suitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuitInd(JAXBElement<String> value) {
        this.suitInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lienInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLienInd() {
        return lienInd;
    }

    /**
     * Sets the value of the lienInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLienInd(JAXBElement<String> value) {
        this.lienInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the judgementInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJudgementInd() {
        return judgementInd;
    }

    /**
     * Sets the value of the judgementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJudgementInd(JAXBElement<String> value) {
        this.judgementInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bankruptcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankruptcyInd() {
        return bankruptcyInd;
    }

    /**
     * Sets the value of the bankruptcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankruptcyInd(JAXBElement<String> value) {
        this.bankruptcyInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noTradeInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoTradeInd() {
        return noTradeInd;
    }

    /**
     * Sets the value of the noTradeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoTradeInd(JAXBElement<String> value) {
        this.noTradeInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parentHQBankruptcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentHQBankruptcyInd() {
        return parentHQBankruptcyInd;
    }

    /**
     * Sets the value of the parentHQBankruptcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentHQBankruptcyInd(JAXBElement<String> value) {
        this.parentHQBankruptcyInd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numberParentBankruptcyFiling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumberParentBankruptcyFiling() {
        return numberParentBankruptcyFiling;
    }

    /**
     * Sets the value of the numberParentBankruptcyFiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumberParentBankruptcyFiling(JAXBElement<BigDecimal> value) {
        this.numberParentBankruptcyFiling = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prntBkcyFilgType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrntBkcyFilgType() {
        return prntBkcyFilgType;
    }

    /**
     * Sets the value of the prntBkcyFilgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrntBkcyFilgType(JAXBElement<String> value) {
        this.prntBkcyFilgType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prntBkcyFilgChapter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrntBkcyFilgChapter() {
        return prntBkcyFilgChapter;
    }

    /**
     * Sets the value of the prntBkcyFilgChapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrntBkcyFilgChapter(JAXBElement<BigDecimal> value) {
        this.prntBkcyFilgChapter = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prntBkcyFilgDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPrntBkcyFilgDate() {
        return prntBkcyFilgDate;
    }

    /**
     * Sets the value of the prntBkcyFilgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPrntBkcyFilgDate(JAXBElement<XMLGregorianCalendar> value) {
        this.prntBkcyFilgDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the numberParentBankruptcyConversions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumberParentBankruptcyConversions() {
        return numberParentBankruptcyConversions;
    }

    /**
     * Sets the value of the numberParentBankruptcyConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumberParentBankruptcyConversions(JAXBElement<BigDecimal> value) {
        this.numberParentBankruptcyConversions = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the prntBkcyConvDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPrntBkcyConvDate() {
        return prntBkcyConvDate;
    }

    /**
     * Sets the value of the prntBkcyConvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPrntBkcyConvDate(JAXBElement<XMLGregorianCalendar> value) {
        this.prntBkcyConvDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the prntBkcyChapterConv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrntBkcyChapterConv() {
        return prntBkcyChapterConv;
    }

    /**
     * Sets the value of the prntBkcyChapterConv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrntBkcyChapterConv(JAXBElement<String> value) {
        this.prntBkcyChapterConv = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the slowTradeExpl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSlowTradeExpl() {
        return slowTradeExpl;
    }

    /**
     * Sets the value of the slowTradeExpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSlowTradeExpl(JAXBElement<String> value) {
        this.slowTradeExpl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the negvPmtExpl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNegvPmtExpl() {
        return negvPmtExpl;
    }

    /**
     * Sets the value of the negvPmtExpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNegvPmtExpl(JAXBElement<String> value) {
        this.negvPmtExpl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pubRecExpl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPubRecExpl() {
        return pubRecExpl;
    }

    /**
     * Sets the value of the pubRecExpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPubRecExpl(JAXBElement<String> value) {
        this.pubRecExpl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the businessDiscontinued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessDiscontinued() {
        return businessDiscontinued;
    }

    /**
     * Sets the value of the businessDiscontinued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessDiscontinued(JAXBElement<String> value) {
        this.businessDiscontinued = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the specialEventComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialEventComment() {
        return specialEventComment;
    }

    /**
     * Sets the value of the specialEventComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialEventComment(JAXBElement<String> value) {
        this.specialEventComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numberSpecialEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumberSpecialEvent() {
        return numberSpecialEvent;
    }

    /**
     * Sets the value of the numberSpecialEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumberSpecialEvent(JAXBElement<BigDecimal> value) {
        this.numberSpecialEvent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the specialEventUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSpecialEventUpdateDate() {
        return specialEventUpdateDate;
    }

    /**
     * Sets the value of the specialEventUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSpecialEventUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.specialEventUpdateDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the specialEventText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialEventText() {
        return specialEventText;
    }

    /**
     * Sets the value of the specialEventText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialEventText(JAXBElement<String> value) {
        this.specialEventText = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScore() {
        return failureScore;
    }

    /**
     * Sets the value of the failureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScore(JAXBElement<String> value) {
        this.failureScore = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFailureScoreAge() {
        return failureScoreAge;
    }

    /**
     * Sets the value of the failureScoreAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFailureScoreAge(JAXBElement<BigDecimal> value) {
        this.failureScoreAge = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the failureScoreClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFailureScoreClass() {
        return failureScoreClass;
    }

    /**
     * Sets the value of the failureScoreClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFailureScoreClass(JAXBElement<BigDecimal> value) {
        this.failureScoreClass = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary() {
        return failureScoreCommentary;
    }

    /**
     * Sets the value of the failureScoreCommentary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary(JAXBElement<String> value) {
        this.failureScoreCommentary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary2() {
        return failureScoreCommentary2;
    }

    /**
     * Sets the value of the failureScoreCommentary2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary2(JAXBElement<String> value) {
        this.failureScoreCommentary2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary3() {
        return failureScoreCommentary3;
    }

    /**
     * Sets the value of the failureScoreCommentary3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary3(JAXBElement<String> value) {
        this.failureScoreCommentary3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary4() {
        return failureScoreCommentary4;
    }

    /**
     * Sets the value of the failureScoreCommentary4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary4(JAXBElement<String> value) {
        this.failureScoreCommentary4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary5() {
        return failureScoreCommentary5;
    }

    /**
     * Sets the value of the failureScoreCommentary5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary5(JAXBElement<String> value) {
        this.failureScoreCommentary5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary6() {
        return failureScoreCommentary6;
    }

    /**
     * Sets the value of the failureScoreCommentary6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary6(JAXBElement<String> value) {
        this.failureScoreCommentary6 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary7() {
        return failureScoreCommentary7;
    }

    /**
     * Sets the value of the failureScoreCommentary7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary7(JAXBElement<String> value) {
        this.failureScoreCommentary7 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary8() {
        return failureScoreCommentary8;
    }

    /**
     * Sets the value of the failureScoreCommentary8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary8(JAXBElement<String> value) {
        this.failureScoreCommentary8 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary9() {
        return failureScoreCommentary9;
    }

    /**
     * Sets the value of the failureScoreCommentary9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary9(JAXBElement<String> value) {
        this.failureScoreCommentary9 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreCommentary10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreCommentary10() {
        return failureScoreCommentary10;
    }

    /**
     * Sets the value of the failureScoreCommentary10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreCommentary10(JAXBElement<String> value) {
        this.failureScoreCommentary10 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failureScoreDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFailureScoreDate() {
        return failureScoreDate;
    }

    /**
     * Sets the value of the failureScoreDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFailureScoreDate(JAXBElement<XMLGregorianCalendar> value) {
        this.failureScoreDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the failureScoreIncdDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFailureScoreIncdDefault() {
        return failureScoreIncdDefault;
    }

    /**
     * Sets the value of the failureScoreIncdDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFailureScoreIncdDefault(JAXBElement<BigDecimal> value) {
        this.failureScoreIncdDefault = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the failureScoreNatnlPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFailureScoreNatnlPercentile() {
        return failureScoreNatnlPercentile;
    }

    /**
     * Sets the value of the failureScoreNatnlPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFailureScoreNatnlPercentile(JAXBElement<BigDecimal> value) {
        this.failureScoreNatnlPercentile = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the failureScoreOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailureScoreOverrideCode() {
        return failureScoreOverrideCode;
    }

    /**
     * Sets the value of the failureScoreOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailureScoreOverrideCode(JAXBElement<String> value) {
        this.failureScoreOverrideCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the globalFailureScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalFailureScore() {
        return globalFailureScore;
    }

    /**
     * Sets the value of the globalFailureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalFailureScore(JAXBElement<String> value) {
        this.globalFailureScore = ((JAXBElement<String> ) value);
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


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
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuffixOverriddenFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveLatestChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualIncome" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AnnualExpenses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AverageAge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Child0to6Number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Child13to18Number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Child7to12Number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DependentsNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CertificationReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedianAge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WealthAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredNameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ValidatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFormattedMultilineAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressPartySiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryPhonePurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneLineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEmailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryWebId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileCreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileCreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ProfileLastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ProfileLastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalGroupName" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/}AdditionalGroupName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalPartyId" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}AdditionalPartyId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Certification" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}Certification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodeAssignment" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}CodeAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPreference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}ContactPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmailDomain" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}EmailDomain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialProfile" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}FinancialProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstantMessaging" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}InstantMessaging" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginalSystemReference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}OriginalSystemReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyPreference" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartyPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartySite" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartySite" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartyUsageAssignment" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PartyUsageAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonLanguage" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/}PersonLanguage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/contactPointService/}Phone" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Group", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", propOrder = {
    "partyId",
    "partyNumber",
    "groupName",
    "groupType",
    "groupSize",
    "partyUniqueName",
    "uniqueNameSuffix",
    "suffixOverriddenFlag",
    "effectiveStartDate",
    "effectiveEndDate",
    "effectiveSequence",
    "effectiveLatestChange",
    "annualIncome",
    "annualExpenses",
    "averageAge",
    "child0To6Number",
    "child13To18Number",
    "child7To12Number",
    "dependentsNumber",
    "certificationReasonCode",
    "certificationLevel",
    "comments",
    "medianAge",
    "wealthAmount",
    "preferredFunctionalCurrency",
    "preferredContactMethod",
    "preferredName",
    "preferredNameId",
    "validatedFlag",
    "primaryAddressCountry",
    "primaryAddressLine1",
    "primaryAddressLine2",
    "primaryAddressLine3",
    "primaryAddressLine4",
    "primaryAddressCity",
    "primaryAddressCounty",
    "primaryAddressState",
    "primaryAddressProvince",
    "primaryAddressPostalCode",
    "primaryFormattedAddress",
    "primaryFormattedMultilineAddress",
    "primaryAddressPartySiteId",
    "primaryAddressLocationId",
    "primaryPhonePurpose",
    "primaryPhoneLineType",
    "primaryPhoneCountryCode",
    "primaryPhoneAreaCode",
    "primaryPhoneNumber",
    "primaryPhoneExtension",
    "primaryFormattedPhoneNumber",
    "primaryPhoneId",
    "primaryEmail",
    "primaryEmailId",
    "primaryURL",
    "primaryWebId",
    "preferredContactPersonName",
    "preferredContactPersonPhone",
    "preferredContactPersonEmail",
    "preferredContactPersonURL",
    "preferredContactPersonId",
    "primaryLanguage",
    "status",
    "createdByModule",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "profileCreatedByModule",
    "profileCreatedBy",
    "profileCreationDate",
    "profileLastUpdatedBy",
    "profileLastUpdateDate",
    "profileLastUpdateLogin",
    "requestId",
    "currencyCode",
    "corpCurrencyCode",
    "curcyConvRateType",
    "additionalGroupName",
    "additionalPartyId",
    "certification",
    "codeAssignment",
    "contactPreference",
    "emailDomain",
    "email",
    "financialProfile",
    "instantMessaging",
    "originalSystemReference",
    "partyPreference",
    "partySite",
    "partyUsageAssignment",
    "personLanguage",
    "phone",
    "web",
    "relationship"
})
public class Group {

    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "GroupType")
    protected String groupType;
    @XmlElementRef(name = "GroupSize", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> groupSize;
    @XmlElement(name = "PartyUniqueName")
    protected String partyUniqueName;
    @XmlElementRef(name = "UniqueNameSuffix", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> uniqueNameSuffix;
    @XmlElement(name = "SuffixOverriddenFlag")
    protected Boolean suffixOverriddenFlag;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "EffectiveSequence")
    protected Integer effectiveSequence;
    @XmlElement(name = "EffectiveLatestChange")
    protected String effectiveLatestChange;
    @XmlElementRef(name = "AnnualIncome", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> annualIncome;
    @XmlElementRef(name = "AnnualExpenses", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> annualExpenses;
    @XmlElementRef(name = "AverageAge", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> averageAge;
    @XmlElementRef(name = "Child0to6Number", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> child0To6Number;
    @XmlElementRef(name = "Child13to18Number", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> child13To18Number;
    @XmlElementRef(name = "Child7to12Number", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> child7To12Number;
    @XmlElementRef(name = "DependentsNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> dependentsNumber;
    @XmlElementRef(name = "CertificationReasonCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> certificationReasonCode;
    @XmlElementRef(name = "CertificationLevel", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> certificationLevel;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "MedianAge", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> medianAge;
    @XmlElementRef(name = "WealthAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> wealthAmount;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "PreferredName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredName;
    @XmlElementRef(name = "PreferredNameId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> preferredNameId;
    @XmlElementRef(name = "ValidatedFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> validatedFlag;
    @XmlElementRef(name = "PrimaryAddressCountry", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressCountry;
    @XmlElementRef(name = "PrimaryAddressLine1", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressLine1;
    @XmlElementRef(name = "PrimaryAddressLine2", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressLine2;
    @XmlElementRef(name = "PrimaryAddressLine3", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressLine3;
    @XmlElementRef(name = "PrimaryAddressLine4", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressLine4;
    @XmlElementRef(name = "PrimaryAddressCity", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressCity;
    @XmlElementRef(name = "PrimaryAddressCounty", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressCounty;
    @XmlElementRef(name = "PrimaryAddressState", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressState;
    @XmlElementRef(name = "PrimaryAddressProvince", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressProvince;
    @XmlElementRef(name = "PrimaryAddressPostalCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryAddressPostalCode;
    @XmlElementRef(name = "PrimaryFormattedAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryFormattedAddress;
    @XmlElementRef(name = "PrimaryFormattedMultilineAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryFormattedMultilineAddress;
    @XmlElementRef(name = "PrimaryAddressPartySiteId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryAddressPartySiteId;
    @XmlElementRef(name = "PrimaryAddressLocationId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryAddressLocationId;
    @XmlElementRef(name = "PrimaryPhonePurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhonePurpose;
    @XmlElementRef(name = "PrimaryPhoneLineType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneLineType;
    @XmlElementRef(name = "PrimaryPhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneCountryCode;
    @XmlElementRef(name = "PrimaryPhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneAreaCode;
    @XmlElementRef(name = "PrimaryPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneNumber;
    @XmlElementRef(name = "PrimaryPhoneExtension", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryPhoneExtension;
    @XmlElementRef(name = "PrimaryFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryFormattedPhoneNumber;
    @XmlElementRef(name = "PrimaryPhoneId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryPhoneId;
    @XmlElementRef(name = "PrimaryEmail", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryEmail;
    @XmlElementRef(name = "PrimaryEmailId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryEmailId;
    @XmlElementRef(name = "PrimaryURL", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryURL;
    @XmlElementRef(name = "PrimaryWebId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryWebId;
    @XmlElementRef(name = "PreferredContactPersonName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactPersonName;
    @XmlElementRef(name = "PreferredContactPersonPhone", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactPersonPhone;
    @XmlElementRef(name = "PreferredContactPersonEmail", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactPersonEmail;
    @XmlElementRef(name = "PreferredContactPersonURL", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredContactPersonURL;
    @XmlElementRef(name = "PreferredContactPersonId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> preferredContactPersonId;
    @XmlElementRef(name = "PrimaryLanguage", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryLanguage;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "ProfileCreatedByModule", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> profileCreatedByModule;
    @XmlElement(name = "ProfileCreatedBy")
    protected String profileCreatedBy;
    @XmlElement(name = "ProfileCreationDate")
    protected XMLGregorianCalendar profileCreationDate;
    @XmlElement(name = "ProfileLastUpdatedBy")
    protected String profileLastUpdatedBy;
    @XmlElement(name = "ProfileLastUpdateDate")
    protected XMLGregorianCalendar profileLastUpdateDate;
    @XmlElementRef(name = "ProfileLastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> profileLastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/groupService/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElement(name = "AdditionalGroupName")
    protected List<AdditionalGroupName> additionalGroupName;
    @XmlElement(name = "AdditionalPartyId")
    protected List<AdditionalPartyId> additionalPartyId;
    @XmlElement(name = "Certification")
    protected List<Certification> certification;
    @XmlElement(name = "CodeAssignment")
    protected List<CodeAssignment> codeAssignment;
    @XmlElement(name = "ContactPreference")
    protected List<ContactPreference> contactPreference;
    @XmlElement(name = "EmailDomain")
    protected List<EmailDomain> emailDomain;
    @XmlElement(name = "Email")
    protected List<Email> email;
    @XmlElement(name = "FinancialProfile")
    protected List<FinancialProfile> financialProfile;
    @XmlElement(name = "InstantMessaging")
    protected List<InstantMessaging> instantMessaging;
    @XmlElement(name = "OriginalSystemReference")
    protected List<OriginalSystemReference> originalSystemReference;
    @XmlElement(name = "PartyPreference")
    protected List<PartyPreference> partyPreference;
    @XmlElement(name = "PartySite")
    protected List<PartySite> partySite;
    @XmlElement(name = "PartyUsageAssignment")
    protected List<PartyUsageAssignment> partyUsageAssignment;
    @XmlElement(name = "PersonLanguage")
    protected List<PersonLanguage> personLanguage;
    @XmlElement(name = "Phone")
    protected List<Phone> phone;
    @XmlElement(name = "Web")
    protected List<Web> web;
    @XmlElement(name = "Relationship")
    protected List<Relationship> relationship;

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
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the groupSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGroupSize() {
        return groupSize;
    }

    /**
     * Sets the value of the groupSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGroupSize(JAXBElement<Long> value) {
        this.groupSize = ((JAXBElement<Long> ) value);
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
     * Gets the value of the suffixOverriddenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuffixOverriddenFlag() {
        return suffixOverriddenFlag;
    }

    /**
     * Sets the value of the suffixOverriddenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuffixOverriddenFlag(Boolean value) {
        this.suffixOverriddenFlag = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the effectiveSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEffectiveSequence() {
        return effectiveSequence;
    }

    /**
     * Sets the value of the effectiveSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEffectiveSequence(Integer value) {
        this.effectiveSequence = value;
    }

    /**
     * Gets the value of the effectiveLatestChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveLatestChange() {
        return effectiveLatestChange;
    }

    /**
     * Sets the value of the effectiveLatestChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveLatestChange(String value) {
        this.effectiveLatestChange = value;
    }

    /**
     * Gets the value of the annualIncome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Sets the value of the annualIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAnnualIncome(JAXBElement<Long> value) {
        this.annualIncome = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the annualExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAnnualExpenses() {
        return annualExpenses;
    }

    /**
     * Sets the value of the annualExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAnnualExpenses(JAXBElement<Long> value) {
        this.annualExpenses = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the averageAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAverageAge() {
        return averageAge;
    }

    /**
     * Sets the value of the averageAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAverageAge(JAXBElement<Long> value) {
        this.averageAge = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the child0To6Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChild0To6Number() {
        return child0To6Number;
    }

    /**
     * Sets the value of the child0To6Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChild0To6Number(JAXBElement<Long> value) {
        this.child0To6Number = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the child13To18Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChild13To18Number() {
        return child13To18Number;
    }

    /**
     * Sets the value of the child13To18Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChild13To18Number(JAXBElement<Long> value) {
        this.child13To18Number = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the child7To12Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChild7To12Number() {
        return child7To12Number;
    }

    /**
     * Sets the value of the child7To12Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChild7To12Number(JAXBElement<Long> value) {
        this.child7To12Number = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the dependentsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDependentsNumber() {
        return dependentsNumber;
    }

    /**
     * Sets the value of the dependentsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDependentsNumber(JAXBElement<Long> value) {
        this.dependentsNumber = ((JAXBElement<Long> ) value);
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
     * Gets the value of the medianAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMedianAge() {
        return medianAge;
    }

    /**
     * Sets the value of the medianAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMedianAge(JAXBElement<Long> value) {
        this.medianAge = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the wealthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getWealthAmount() {
        return wealthAmount;
    }

    /**
     * Sets the value of the wealthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setWealthAmount(JAXBElement<AmountType> value) {
        this.wealthAmount = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the primaryAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressCountry() {
        return primaryAddressCountry;
    }

    /**
     * Sets the value of the primaryAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressCountry(JAXBElement<String> value) {
        this.primaryAddressCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine1() {
        return primaryAddressLine1;
    }

    /**
     * Sets the value of the primaryAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine1(JAXBElement<String> value) {
        this.primaryAddressLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine2() {
        return primaryAddressLine2;
    }

    /**
     * Sets the value of the primaryAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine2(JAXBElement<String> value) {
        this.primaryAddressLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine3() {
        return primaryAddressLine3;
    }

    /**
     * Sets the value of the primaryAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine3(JAXBElement<String> value) {
        this.primaryAddressLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine4() {
        return primaryAddressLine4;
    }

    /**
     * Sets the value of the primaryAddressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine4(JAXBElement<String> value) {
        this.primaryAddressLine4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressCity() {
        return primaryAddressCity;
    }

    /**
     * Sets the value of the primaryAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressCity(JAXBElement<String> value) {
        this.primaryAddressCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressCounty() {
        return primaryAddressCounty;
    }

    /**
     * Sets the value of the primaryAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressCounty(JAXBElement<String> value) {
        this.primaryAddressCounty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressState() {
        return primaryAddressState;
    }

    /**
     * Sets the value of the primaryAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressState(JAXBElement<String> value) {
        this.primaryAddressState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressProvince() {
        return primaryAddressProvince;
    }

    /**
     * Sets the value of the primaryAddressProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressProvince(JAXBElement<String> value) {
        this.primaryAddressProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressPostalCode() {
        return primaryAddressPostalCode;
    }

    /**
     * Sets the value of the primaryAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressPostalCode(JAXBElement<String> value) {
        this.primaryAddressPostalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryFormattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryFormattedAddress() {
        return primaryFormattedAddress;
    }

    /**
     * Sets the value of the primaryFormattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryFormattedAddress(JAXBElement<String> value) {
        this.primaryFormattedAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryFormattedMultilineAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryFormattedMultilineAddress() {
        return primaryFormattedMultilineAddress;
    }

    /**
     * Sets the value of the primaryFormattedMultilineAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryFormattedMultilineAddress(JAXBElement<String> value) {
        this.primaryFormattedMultilineAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryAddressPartySiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryAddressPartySiteId() {
        return primaryAddressPartySiteId;
    }

    /**
     * Sets the value of the primaryAddressPartySiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryAddressPartySiteId(JAXBElement<Long> value) {
        this.primaryAddressPartySiteId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryAddressLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryAddressLocationId() {
        return primaryAddressLocationId;
    }

    /**
     * Sets the value of the primaryAddressLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryAddressLocationId(JAXBElement<Long> value) {
        this.primaryAddressLocationId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the primaryFormattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryFormattedPhoneNumber() {
        return primaryFormattedPhoneNumber;
    }

    /**
     * Sets the value of the primaryFormattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryFormattedPhoneNumber(JAXBElement<String> value) {
        this.primaryFormattedPhoneNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryPhoneId() {
        return primaryPhoneId;
    }

    /**
     * Sets the value of the primaryPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryPhoneId(JAXBElement<Long> value) {
        this.primaryPhoneId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryEmail() {
        return primaryEmail;
    }

    /**
     * Sets the value of the primaryEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryEmail(JAXBElement<String> value) {
        this.primaryEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryEmailId() {
        return primaryEmailId;
    }

    /**
     * Sets the value of the primaryEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryEmailId(JAXBElement<Long> value) {
        this.primaryEmailId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryURL() {
        return primaryURL;
    }

    /**
     * Sets the value of the primaryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryURL(JAXBElement<String> value) {
        this.primaryURL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryWebId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryWebId() {
        return primaryWebId;
    }

    /**
     * Sets the value of the primaryWebId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryWebId(JAXBElement<Long> value) {
        this.primaryWebId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the preferredContactPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactPersonName() {
        return preferredContactPersonName;
    }

    /**
     * Sets the value of the preferredContactPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactPersonName(JAXBElement<String> value) {
        this.preferredContactPersonName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferredContactPersonPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactPersonPhone() {
        return preferredContactPersonPhone;
    }

    /**
     * Sets the value of the preferredContactPersonPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactPersonPhone(JAXBElement<String> value) {
        this.preferredContactPersonPhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferredContactPersonEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactPersonEmail() {
        return preferredContactPersonEmail;
    }

    /**
     * Sets the value of the preferredContactPersonEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactPersonEmail(JAXBElement<String> value) {
        this.preferredContactPersonEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preferredContactPersonURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactPersonURL() {
        return preferredContactPersonURL;
    }

    /**
     * Sets the value of the preferredContactPersonURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactPersonURL(JAXBElement<String> value) {
        this.preferredContactPersonURL = ((JAXBElement<String> ) value);
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
     * Gets the value of the primaryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Sets the value of the primaryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryLanguage(JAXBElement<String> value) {
        this.primaryLanguage = ((JAXBElement<String> ) value);
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
     * Gets the value of the profileCreatedByModule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileCreatedByModule() {
        return profileCreatedByModule;
    }

    /**
     * Sets the value of the profileCreatedByModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileCreatedByModule(JAXBElement<String> value) {
        this.profileCreatedByModule = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the profileCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileCreatedBy() {
        return profileCreatedBy;
    }

    /**
     * Sets the value of the profileCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileCreatedBy(String value) {
        this.profileCreatedBy = value;
    }

    /**
     * Gets the value of the profileCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProfileCreationDate() {
        return profileCreationDate;
    }

    /**
     * Sets the value of the profileCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProfileCreationDate(XMLGregorianCalendar value) {
        this.profileCreationDate = value;
    }

    /**
     * Gets the value of the profileLastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileLastUpdatedBy() {
        return profileLastUpdatedBy;
    }

    /**
     * Sets the value of the profileLastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileLastUpdatedBy(String value) {
        this.profileLastUpdatedBy = value;
    }

    /**
     * Gets the value of the profileLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProfileLastUpdateDate() {
        return profileLastUpdateDate;
    }

    /**
     * Sets the value of the profileLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProfileLastUpdateDate(XMLGregorianCalendar value) {
        this.profileLastUpdateDate = value;
    }

    /**
     * Gets the value of the profileLastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileLastUpdateLogin() {
        return profileLastUpdateLogin;
    }

    /**
     * Sets the value of the profileLastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileLastUpdateLogin(JAXBElement<String> value) {
        this.profileLastUpdateLogin = ((JAXBElement<String> ) value);
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
     * Gets the value of the additionalGroupName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGroupName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGroupName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalGroupName }
     * 
     * 
     */
    public List<AdditionalGroupName> getAdditionalGroupName() {
        if (additionalGroupName == null) {
            additionalGroupName = new ArrayList<AdditionalGroupName>();
        }
        return this.additionalGroupName;
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
     * Gets the value of the personLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonLanguage }
     * 
     * 
     */
    public List<PersonLanguage> getPersonLanguage() {
        if (personLanguage == null) {
            personLanguage = new ArrayList<PersonLanguage>();
        }
        return this.personLanguage;
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

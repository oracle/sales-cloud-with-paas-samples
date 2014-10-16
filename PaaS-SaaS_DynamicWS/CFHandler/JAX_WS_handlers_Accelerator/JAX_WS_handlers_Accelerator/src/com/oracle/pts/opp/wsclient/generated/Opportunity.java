
package com.oracle.pts.opp.wsclient.generated;

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
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BudgetAvailableDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="BudgetedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ChampionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesStageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DealHorizonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerResourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryCompetitorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeyContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReasonWonLostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrategicLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryRevenueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TargetPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="TargetPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethodEOObjVerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SalesStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageDaysAtStage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaximumDaysInStage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PhaseCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotaFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RcmndWinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StageStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StgOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesStageEOObjVerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Revenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RevenueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentFyPotentialRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BdgtAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrSrcNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DownsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="UpsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastAssignedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LookupCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LookupValuesId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyCreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExpectAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrConRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CrmRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RevnLineSetEnabledFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="OptyLastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannelCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhonePreferenceExistsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesAccountUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastAssignedTimestamp" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExtnAttributeChar004" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtnAttributeTimestamp001" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExtnAttributeChar005" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtnAttributeTimestamp002" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExtnAttributeTimestamp003" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExtnAttributeTimestamp004" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="OpportunityContact" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}Revenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityReference" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitor2" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityCompetitor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitor3" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityCompetitor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityResource" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunitySource1" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunitySource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityLead" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityLead" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityResponse" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueTerritory" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenueTerritory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenuePartnerPrimary" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenuePartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueLineSet" type="{http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/}RevenueLineSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategorySummaryRevenue" type="{http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/}CategorySummaryRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Appointment" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientAppointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}SplitRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecurringRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RecurringRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Latitude_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Longitude_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpportunityType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Update_Of_Close_Date_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="Second_Last_Update_Of_Close_Da_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="Third_Last_Update_Of_Close_Dat_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="Fourth_Last_Update_Of_Close_Da_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="OpportunityTypeTest_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityTypeTest_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityType1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", propOrder = {
    "budgetAvailableDate",
    "budgetedFlag",
    "primaryOrganizationId",
    "championFlag",
    "conflictId",
    "createdBy",
    "creationDate",
    "currencyCode",
    "salesMethodId",
    "salesStageId",
    "customerAccountId",
    "dealHorizonCode",
    "decisionLevelCode",
    "description",
    "lastUpdateDate",
    "lastUpdatedBy",
    "lastUpdateLogin",
    "name",
    "objectVersionNumber",
    "optyId",
    "optyNumber",
    "ownerResourcePartyId",
    "primaryCompetitorId",
    "keyContactId",
    "reasonWonLostCode",
    "riskLevelCode",
    "statusCode",
    "strategicLevelCode",
    "primaryRevenueId",
    "targetPartyId",
    "userLastUpdateDate",
    "targetPartyName",
    "dunsNumber",
    "salesMethod",
    "salesMethodEOObjVerNumber",
    "salesStage",
    "descriptionText",
    "averageDaysAtStage",
    "maximumDaysInStage",
    "phaseCd",
    "quotaFactor",
    "rcmndWinProb",
    "stageStatusCd",
    "stgOrder",
    "salesStageEOObjVerNumber",
    "effectiveDate",
    "revenue",
    "revenueType",
    "revnId",
    "employeesTotal",
    "currentFyPotentialRevenue",
    "winProb",
    "objectVersionNumber1",
    "primaryContactPartyName",
    "primaryContactPartyId",
    "primaryContactFormattedPhoneNumber",
    "primaryContactEmailAddress",
    "accountNumber",
    "partyName",
    "locationId",
    "formattedAddress",
    "city",
    "country",
    "postalCode",
    "state",
    "bdgtAmount",
    "comments",
    "partyName1",
    "prSrcNumber",
    "downsideAmount",
    "upsideAmount",
    "emailAddress",
    "lastAssignedDate",
    "lookupCategory",
    "lookupValuesId",
    "optyCreationDate",
    "expectAmount",
    "preferredFunctionalCurrency",
    "partyUniqueName",
    "prConRelationshipId",
    "optyCreatedBy",
    "crmConversionRate",
    "crmRevenue",
    "revnLineSetEnabledFlag",
    "partyType",
    "optyLastUpdateDate",
    "optyLastUpdatedBy",
    "salesChannelCd",
    "lineOfBusinessCode",
    "phonePreferenceExistsFlag",
    "partyUniqueName1",
    "primaryOrganizationName",
    "salesAccountId",
    "salesAccountUniqueName",
    "consumerFirstName",
    "consumerLastName",
    "primaryContactFirstName",
    "primaryContactLastName",
    "lastAssignedTimestamp",
    "extnAttributeChar004",
    "extnAttributeTimestamp001",
    "extnAttributeChar005",
    "extnAttributeTimestamp002",
    "extnAttributeTimestamp003",
    "extnAttributeTimestamp004",
    "opportunityContact",
    "childRevenue",
    "note",
    "opportunityReference",
    "opportunityCompetitor2",
    "opportunityCompetitor3",
    "opportunityResource",
    "opportunitySource1",
    "opportunityLead",
    "opportunityResponse",
    "revenueTerritory",
    "revenuePartnerPrimary",
    "revenueLineSet",
    "categorySummaryRevenue",
    "appointment",
    "splitRevenue",
    "recurringRevenue",
    "latitudeC",
    "longitudeC",
    "opportunityTypeC",
    "opportunityTypeCMeaning",
    "lastUpdateOfCloseDateC",
    "secondLastUpdateOfCloseDaC",
    "thirdLastUpdateOfCloseDatC",
    "fourthLastUpdateOfCloseDaC",
    "opportunityTypeTestC",
    "opportunityTypeTestCMeaning",
    "opportunityType1C"
})
public class Opportunity {

    @XmlElementRef(name = "BudgetAvailableDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> budgetAvailableDate;
    @XmlElementRef(name = "BudgetedFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> budgetedFlag;
    @XmlElement(name = "PrimaryOrganizationId")
    protected Long primaryOrganizationId;
    @XmlElement(name = "ChampionFlag")
    protected Boolean championFlag;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElementRef(name = "SalesMethodId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> salesMethodId;
    @XmlElementRef(name = "SalesStageId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> salesStageId;
    @XmlElementRef(name = "CustomerAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerAccountId;
    @XmlElementRef(name = "DealHorizonCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> dealHorizonCode;
    @XmlElementRef(name = "DecisionLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> decisionLevelCode;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "OptyId")
    protected Long optyId;
    @XmlElement(name = "OptyNumber")
    protected String optyNumber;
    @XmlElement(name = "OwnerResourcePartyId")
    protected Long ownerResourcePartyId;
    @XmlElementRef(name = "PrimaryCompetitorId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryCompetitorId;
    @XmlElementRef(name = "KeyContactId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> keyContactId;
    @XmlElementRef(name = "ReasonWonLostCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> reasonWonLostCode;
    @XmlElementRef(name = "RiskLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> riskLevelCode;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "StrategicLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> strategicLevelCode;
    @XmlElementRef(name = "PrimaryRevenueId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryRevenueId;
    @XmlElementRef(name = "TargetPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> targetPartyId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElement(name = "TargetPartyName")
    protected String targetPartyName;
    @XmlElementRef(name = "DUNSNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> dunsNumber;
    @XmlElementRef(name = "SalesMethod", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> salesMethod;
    @XmlElement(name = "SalesMethodEOObjVerNumber")
    protected Integer salesMethodEOObjVerNumber;
    @XmlElement(name = "SalesStage")
    protected String salesStage;
    @XmlElementRef(name = "DescriptionText", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> descriptionText;
    @XmlElementRef(name = "AverageDaysAtStage", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> averageDaysAtStage;
    @XmlElementRef(name = "MaximumDaysInStage", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> maximumDaysInStage;
    @XmlElement(name = "PhaseCd")
    protected String phaseCd;
    @XmlElement(name = "QuotaFactor")
    protected BigDecimal quotaFactor;
    @XmlElementRef(name = "RcmndWinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rcmndWinProb;
    @XmlElementRef(name = "StageStatusCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> stageStatusCd;
    @XmlElement(name = "StgOrder")
    protected BigDecimal stgOrder;
    @XmlElement(name = "SalesStageEOObjVerNumber")
    protected Integer salesStageEOObjVerNumber;
    @XmlElementRef(name = "EffectiveDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> effectiveDate;
    @XmlElementRef(name = "Revenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> revenue;
    @XmlElementRef(name = "RevenueType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> revenueType;
    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElementRef(name = "EmployeesTotal", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> employeesTotal;
    @XmlElementRef(name = "CurrentFyPotentialRevenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> currentFyPotentialRevenue;
    @XmlElementRef(name = "WinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> winProb;
    @XmlElement(name = "ObjectVersionNumber1")
    protected Integer objectVersionNumber1;
    @XmlElement(name = "PrimaryContactPartyName")
    protected String primaryContactPartyName;
    @XmlElement(name = "PrimaryContactPartyId")
    protected Long primaryContactPartyId;
    @XmlElementRef(name = "PrimaryContactFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactFormattedPhoneNumber;
    @XmlElementRef(name = "PrimaryContactEmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactEmailAddress;
    @XmlElementRef(name = "AccountNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> accountNumber;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "LocationId")
    protected Long locationId;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "City", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElementRef(name = "PostalCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "State", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "BdgtAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> bdgtAmount;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElement(name = "PartyName1")
    protected String partyName1;
    @XmlElementRef(name = "PrSrcNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> prSrcNumber;
    @XmlElementRef(name = "DownsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> downsideAmount;
    @XmlElementRef(name = "UpsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> upsideAmount;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "LastAssignedDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastAssignedDate;
    @XmlElementRef(name = "LookupCategory", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> lookupCategory;
    @XmlElement(name = "LookupValuesId")
    protected Long lookupValuesId;
    @XmlElementRef(name = "OptyCreationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> optyCreationDate;
    @XmlElementRef(name = "ExpectAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> expectAmount;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "PartyUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> partyUniqueName;
    @XmlElementRef(name = "PrConRelationshipId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> prConRelationshipId;
    @XmlElementRef(name = "OptyCreatedBy", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> optyCreatedBy;
    @XmlElementRef(name = "CrmConversionRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> crmConversionRate;
    @XmlElementRef(name = "CrmRevenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> crmRevenue;
    @XmlElementRef(name = "RevnLineSetEnabledFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> revnLineSetEnabledFlag;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElementRef(name = "OptyLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> optyLastUpdateDate;
    @XmlElementRef(name = "OptyLastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> optyLastUpdatedBy;
    @XmlElementRef(name = "SalesChannelCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> salesChannelCd;
    @XmlElementRef(name = "LineOfBusinessCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> lineOfBusinessCode;
    @XmlElementRef(name = "PhonePreferenceExistsFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> phonePreferenceExistsFlag;
    @XmlElementRef(name = "PartyUniqueName1", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> partyUniqueName1;
    @XmlElementRef(name = "PrimaryOrganizationName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryOrganizationName;
    @XmlElementRef(name = "SalesAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<Long> salesAccountId;
    @XmlElementRef(name = "SalesAccountUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> salesAccountUniqueName;
    @XmlElementRef(name = "ConsumerFirstName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> consumerFirstName;
    @XmlElementRef(name = "ConsumerLastName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> consumerLastName;
    @XmlElementRef(name = "PrimaryContactFirstName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactFirstName;
    @XmlElementRef(name = "PrimaryContactLastName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactLastName;
    @XmlElementRef(name = "LastAssignedTimestamp", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastAssignedTimestamp;
    @XmlElementRef(name = "ExtnAttributeChar004", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> extnAttributeChar004;
    @XmlElementRef(name = "ExtnAttributeTimestamp001", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> extnAttributeTimestamp001;
    @XmlElementRef(name = "ExtnAttributeChar005", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> extnAttributeChar005;
    @XmlElementRef(name = "ExtnAttributeTimestamp002", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> extnAttributeTimestamp002;
    @XmlElementRef(name = "ExtnAttributeTimestamp003", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> extnAttributeTimestamp003;
    @XmlElementRef(name = "ExtnAttributeTimestamp004", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> extnAttributeTimestamp004;
    @XmlElement(name = "OpportunityContact")
    protected List<OpportunityContact> opportunityContact;
    @XmlElement(name = "ChildRevenue")
    protected List<Revenue> childRevenue;
    @XmlElement(name = "Note")
    protected List<Note> note;
    @XmlElement(name = "OpportunityReference")
    protected List<OpportunityReference> opportunityReference;
    @XmlElement(name = "OpportunityCompetitor2")
    protected List<OpportunityCompetitor> opportunityCompetitor2;
    @XmlElement(name = "OpportunityCompetitor3")
    protected List<OpportunityCompetitor> opportunityCompetitor3;
    @XmlElement(name = "OpportunityResource")
    protected List<OpportunityResource> opportunityResource;
    @XmlElement(name = "OpportunitySource1")
    protected List<OpportunitySource> opportunitySource1;
    @XmlElement(name = "OpportunityLead")
    protected List<OpportunityLead> opportunityLead;
    @XmlElement(name = "OpportunityResponse")
    protected List<OpportunityResponse> opportunityResponse;
    @XmlElement(name = "RevenueTerritory")
    protected List<RevenueTerritory> revenueTerritory;
    @XmlElement(name = "RevenuePartnerPrimary")
    protected List<RevenuePartner> revenuePartnerPrimary;
    @XmlElement(name = "RevenueLineSet")
    protected List<RevenueLineSet> revenueLineSet;
    @XmlElement(name = "CategorySummaryRevenue")
    protected List<CategorySummaryRevenue> categorySummaryRevenue;
    @XmlElement(name = "Appointment")
    protected List<TransientAppointment> appointment;
    @XmlElement(name = "SplitRevenue")
    protected List<SplitRevenue> splitRevenue;
    @XmlElement(name = "RecurringRevenue")
    protected List<RecurringRevenue> recurringRevenue;
    @XmlElementRef(name = "Latitude_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> latitudeC;
    @XmlElementRef(name = "Longitude_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> longitudeC;
    @XmlElementRef(name = "OpportunityType_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> opportunityTypeC;
    @XmlElementRef(name = "OpportunityType_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> opportunityTypeCMeaning;
    @XmlElementRef(name = "Last_Update_Of_Close_Date_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateOfCloseDateC;
    @XmlElementRef(name = "Second_Last_Update_Of_Close_Da_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> secondLastUpdateOfCloseDaC;
    @XmlElementRef(name = "Third_Last_Update_Of_Close_Dat_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> thirdLastUpdateOfCloseDatC;
    @XmlElementRef(name = "Fourth_Last_Update_Of_Close_Da_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fourthLastUpdateOfCloseDaC;
    @XmlElementRef(name = "OpportunityTypeTest_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> opportunityTypeTestC;
    @XmlElementRef(name = "OpportunityTypeTest_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> opportunityTypeTestCMeaning;
    @XmlElementRef(name = "OpportunityType1_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class)
    protected JAXBElement<String> opportunityType1C;

    /**
     * Gets the value of the budgetAvailableDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBudgetAvailableDate() {
        return budgetAvailableDate;
    }

    /**
     * Sets the value of the budgetAvailableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBudgetAvailableDate(JAXBElement<XMLGregorianCalendar> value) {
        this.budgetAvailableDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the budgetedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBudgetedFlag() {
        return budgetedFlag;
    }

    /**
     * Sets the value of the budgetedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBudgetedFlag(JAXBElement<Boolean> value) {
        this.budgetedFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryOrganizationId(Long value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the championFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChampionFlag() {
        return championFlag;
    }

    /**
     * Sets the value of the championFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChampionFlag(Boolean value) {
        this.championFlag = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConflictId(Long value) {
        this.conflictId = value;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the salesMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesMethodId() {
        return salesMethodId;
    }

    /**
     * Sets the value of the salesMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesMethodId(JAXBElement<Long> value) {
        this.salesMethodId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the salesStageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesStageId() {
        return salesStageId;
    }

    /**
     * Sets the value of the salesStageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesStageId(JAXBElement<Long> value) {
        this.salesStageId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the customerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerAccountId() {
        return customerAccountId;
    }

    /**
     * Sets the value of the customerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerAccountId(JAXBElement<Long> value) {
        this.customerAccountId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the dealHorizonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealHorizonCode() {
        return dealHorizonCode;
    }

    /**
     * Sets the value of the dealHorizonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealHorizonCode(JAXBElement<String> value) {
        this.dealHorizonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the decisionLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDecisionLevelCode() {
        return decisionLevelCode;
    }

    /**
     * Sets the value of the decisionLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDecisionLevelCode(JAXBElement<String> value) {
        this.decisionLevelCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyId(Long value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the optyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyNumber() {
        return optyNumber;
    }

    /**
     * Sets the value of the optyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyNumber(String value) {
        this.optyNumber = value;
    }

    /**
     * Gets the value of the ownerResourcePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerResourcePartyId() {
        return ownerResourcePartyId;
    }

    /**
     * Sets the value of the ownerResourcePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerResourcePartyId(Long value) {
        this.ownerResourcePartyId = value;
    }

    /**
     * Gets the value of the primaryCompetitorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryCompetitorId() {
        return primaryCompetitorId;
    }

    /**
     * Sets the value of the primaryCompetitorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryCompetitorId(JAXBElement<Long> value) {
        this.primaryCompetitorId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the keyContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getKeyContactId() {
        return keyContactId;
    }

    /**
     * Sets the value of the keyContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setKeyContactId(JAXBElement<Long> value) {
        this.keyContactId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the reasonWonLostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonWonLostCode() {
        return reasonWonLostCode;
    }

    /**
     * Sets the value of the reasonWonLostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonWonLostCode(JAXBElement<String> value) {
        this.reasonWonLostCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the riskLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskLevelCode() {
        return riskLevelCode;
    }

    /**
     * Sets the value of the riskLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskLevelCode(JAXBElement<String> value) {
        this.riskLevelCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusCode(JAXBElement<String> value) {
        this.statusCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the strategicLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrategicLevelCode() {
        return strategicLevelCode;
    }

    /**
     * Sets the value of the strategicLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrategicLevelCode(JAXBElement<String> value) {
        this.strategicLevelCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryRevenueId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryRevenueId() {
        return primaryRevenueId;
    }

    /**
     * Sets the value of the primaryRevenueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryRevenueId(JAXBElement<Long> value) {
        this.primaryRevenueId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the targetPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTargetPartyId() {
        return targetPartyId;
    }

    /**
     * Sets the value of the targetPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTargetPartyId(JAXBElement<Long> value) {
        this.targetPartyId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the targetPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPartyName() {
        return targetPartyName;
    }

    /**
     * Sets the value of the targetPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPartyName(String value) {
        this.targetPartyName = value;
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
     * Gets the value of the salesMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesMethod() {
        return salesMethod;
    }

    /**
     * Sets the value of the salesMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesMethod(JAXBElement<String> value) {
        this.salesMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesMethodEOObjVerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesMethodEOObjVerNumber() {
        return salesMethodEOObjVerNumber;
    }

    /**
     * Sets the value of the salesMethodEOObjVerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesMethodEOObjVerNumber(Integer value) {
        this.salesMethodEOObjVerNumber = value;
    }

    /**
     * Gets the value of the salesStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesStage() {
        return salesStage;
    }

    /**
     * Sets the value of the salesStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesStage(String value) {
        this.salesStage = value;
    }

    /**
     * Gets the value of the descriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionText(JAXBElement<String> value) {
        this.descriptionText = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the averageDaysAtStage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAverageDaysAtStage() {
        return averageDaysAtStage;
    }

    /**
     * Sets the value of the averageDaysAtStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAverageDaysAtStage(JAXBElement<Long> value) {
        this.averageDaysAtStage = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the maximumDaysInStage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMaximumDaysInStage() {
        return maximumDaysInStage;
    }

    /**
     * Sets the value of the maximumDaysInStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMaximumDaysInStage(JAXBElement<Long> value) {
        this.maximumDaysInStage = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the phaseCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseCd() {
        return phaseCd;
    }

    /**
     * Sets the value of the phaseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseCd(String value) {
        this.phaseCd = value;
    }

    /**
     * Gets the value of the quotaFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotaFactor() {
        return quotaFactor;
    }

    /**
     * Sets the value of the quotaFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotaFactor(BigDecimal value) {
        this.quotaFactor = value;
    }

    /**
     * Gets the value of the rcmndWinProb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRcmndWinProb() {
        return rcmndWinProb;
    }

    /**
     * Sets the value of the rcmndWinProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRcmndWinProb(JAXBElement<BigDecimal> value) {
        this.rcmndWinProb = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the stageStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStageStatusCd() {
        return stageStatusCd;
    }

    /**
     * Sets the value of the stageStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStageStatusCd(JAXBElement<String> value) {
        this.stageStatusCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stgOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStgOrder() {
        return stgOrder;
    }

    /**
     * Sets the value of the stgOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStgOrder(BigDecimal value) {
        this.stgOrder = value;
    }

    /**
     * Gets the value of the salesStageEOObjVerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesStageEOObjVerNumber() {
        return salesStageEOObjVerNumber;
    }

    /**
     * Sets the value of the salesStageEOObjVerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesStageEOObjVerNumber(Integer value) {
        this.salesStageEOObjVerNumber = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.effectiveDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRevenue(JAXBElement<BigDecimal> value) {
        this.revenue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the revenueType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevenueType() {
        return revenueType;
    }

    /**
     * Sets the value of the revenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevenueType(JAXBElement<String> value) {
        this.revenueType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the revnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevnId() {
        return revnId;
    }

    /**
     * Sets the value of the revnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevnId(Long value) {
        this.revnId = value;
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
     * Gets the value of the currentFyPotentialRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCurrentFyPotentialRevenue() {
        return currentFyPotentialRevenue;
    }

    /**
     * Sets the value of the currentFyPotentialRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCurrentFyPotentialRevenue(JAXBElement<BigDecimal> value) {
        this.currentFyPotentialRevenue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the winProb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWinProb() {
        return winProb;
    }

    /**
     * Sets the value of the winProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWinProb(JAXBElement<BigDecimal> value) {
        this.winProb = ((JAXBElement<BigDecimal> ) value);
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
     * Gets the value of the primaryContactPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactPartyName() {
        return primaryContactPartyName;
    }

    /**
     * Sets the value of the primaryContactPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactPartyName(String value) {
        this.primaryContactPartyName = value;
    }

    /**
     * Gets the value of the primaryContactPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryContactPartyId() {
        return primaryContactPartyId;
    }

    /**
     * Sets the value of the primaryContactPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryContactPartyId(Long value) {
        this.primaryContactPartyId = value;
    }

    /**
     * Gets the value of the primaryContactFormattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactFormattedPhoneNumber() {
        return primaryContactFormattedPhoneNumber;
    }

    /**
     * Sets the value of the primaryContactFormattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactFormattedPhoneNumber(JAXBElement<String> value) {
        this.primaryContactFormattedPhoneNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactEmailAddress() {
        return primaryContactEmailAddress;
    }

    /**
     * Sets the value of the primaryContactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactEmailAddress(JAXBElement<String> value) {
        this.primaryContactEmailAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the bdgtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBdgtAmount() {
        return bdgtAmount;
    }

    /**
     * Sets the value of the bdgtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBdgtAmount(JAXBElement<AmountType> value) {
        this.bdgtAmount = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the partyName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName1() {
        return partyName1;
    }

    /**
     * Sets the value of the partyName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName1(String value) {
        this.partyName1 = value;
    }

    /**
     * Gets the value of the prSrcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrSrcNumber() {
        return prSrcNumber;
    }

    /**
     * Sets the value of the prSrcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrSrcNumber(JAXBElement<String> value) {
        this.prSrcNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the downsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getDownsideAmount() {
        return downsideAmount;
    }

    /**
     * Sets the value of the downsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setDownsideAmount(JAXBElement<AmountType> value) {
        this.downsideAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the upsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getUpsideAmount() {
        return upsideAmount;
    }

    /**
     * Sets the value of the upsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setUpsideAmount(JAXBElement<AmountType> value) {
        this.upsideAmount = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the lookupCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLookupCategory() {
        return lookupCategory;
    }

    /**
     * Sets the value of the lookupCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLookupCategory(JAXBElement<String> value) {
        this.lookupCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lookupValuesId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLookupValuesId() {
        return lookupValuesId;
    }

    /**
     * Sets the value of the lookupValuesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLookupValuesId(Long value) {
        this.lookupValuesId = value;
    }

    /**
     * Gets the value of the optyCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOptyCreationDate() {
        return optyCreationDate;
    }

    /**
     * Sets the value of the optyCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOptyCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.optyCreationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the expectAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getExpectAmount() {
        return expectAmount;
    }

    /**
     * Sets the value of the expectAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setExpectAmount(JAXBElement<AmountType> value) {
        this.expectAmount = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the prConRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrConRelationshipId() {
        return prConRelationshipId;
    }

    /**
     * Sets the value of the prConRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrConRelationshipId(JAXBElement<Long> value) {
        this.prConRelationshipId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the optyCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptyCreatedBy() {
        return optyCreatedBy;
    }

    /**
     * Sets the value of the optyCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptyCreatedBy(JAXBElement<String> value) {
        this.optyCreatedBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crmConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrmConversionRate() {
        return crmConversionRate;
    }

    /**
     * Sets the value of the crmConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrmConversionRate(JAXBElement<BigDecimal> value) {
        this.crmConversionRate = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the crmRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrmRevenue() {
        return crmRevenue;
    }

    /**
     * Sets the value of the crmRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrmRevenue(JAXBElement<BigDecimal> value) {
        this.crmRevenue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the revnLineSetEnabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRevnLineSetEnabledFlag() {
        return revnLineSetEnabledFlag;
    }

    /**
     * Sets the value of the revnLineSetEnabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRevnLineSetEnabledFlag(JAXBElement<Boolean> value) {
        this.revnLineSetEnabledFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the optyLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOptyLastUpdateDate() {
        return optyLastUpdateDate;
    }

    /**
     * Sets the value of the optyLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOptyLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.optyLastUpdateDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the optyLastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptyLastUpdatedBy() {
        return optyLastUpdatedBy;
    }

    /**
     * Sets the value of the optyLastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptyLastUpdatedBy(JAXBElement<String> value) {
        this.optyLastUpdatedBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesChannelCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesChannelCd() {
        return salesChannelCd;
    }

    /**
     * Sets the value of the salesChannelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesChannelCd(JAXBElement<String> value) {
        this.salesChannelCd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lineOfBusinessCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }

    /**
     * Sets the value of the lineOfBusinessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineOfBusinessCode(JAXBElement<String> value) {
        this.lineOfBusinessCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phonePreferenceExistsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPhonePreferenceExistsFlag() {
        return phonePreferenceExistsFlag;
    }

    /**
     * Sets the value of the phonePreferenceExistsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPhonePreferenceExistsFlag(JAXBElement<Boolean> value) {
        this.phonePreferenceExistsFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the primaryOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryOrganizationName() {
        return primaryOrganizationName;
    }

    /**
     * Sets the value of the primaryOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryOrganizationName(JAXBElement<String> value) {
        this.primaryOrganizationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesAccountId() {
        return salesAccountId;
    }

    /**
     * Sets the value of the salesAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesAccountId(JAXBElement<Long> value) {
        this.salesAccountId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the consumerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerFirstName() {
        return consumerFirstName;
    }

    /**
     * Sets the value of the consumerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerFirstName(JAXBElement<String> value) {
        this.consumerFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the consumerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerLastName() {
        return consumerLastName;
    }

    /**
     * Sets the value of the consumerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerLastName(JAXBElement<String> value) {
        this.consumerLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactFirstName() {
        return primaryContactFirstName;
    }

    /**
     * Sets the value of the primaryContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactFirstName(JAXBElement<String> value) {
        this.primaryContactFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactLastName() {
        return primaryContactLastName;
    }

    /**
     * Sets the value of the primaryContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactLastName(JAXBElement<String> value) {
        this.primaryContactLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastAssignedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignedTimestamp() {
        return lastAssignedTimestamp;
    }

    /**
     * Sets the value of the lastAssignedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignedTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignedTimestamp = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the extnAttributeChar004 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtnAttributeChar004() {
        return extnAttributeChar004;
    }

    /**
     * Sets the value of the extnAttributeChar004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtnAttributeChar004(JAXBElement<String> value) {
        this.extnAttributeChar004 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the extnAttributeTimestamp001 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExtnAttributeTimestamp001() {
        return extnAttributeTimestamp001;
    }

    /**
     * Sets the value of the extnAttributeTimestamp001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExtnAttributeTimestamp001(JAXBElement<XMLGregorianCalendar> value) {
        this.extnAttributeTimestamp001 = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the extnAttributeChar005 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtnAttributeChar005() {
        return extnAttributeChar005;
    }

    /**
     * Sets the value of the extnAttributeChar005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtnAttributeChar005(JAXBElement<String> value) {
        this.extnAttributeChar005 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the extnAttributeTimestamp002 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExtnAttributeTimestamp002() {
        return extnAttributeTimestamp002;
    }

    /**
     * Sets the value of the extnAttributeTimestamp002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExtnAttributeTimestamp002(JAXBElement<XMLGregorianCalendar> value) {
        this.extnAttributeTimestamp002 = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the extnAttributeTimestamp003 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExtnAttributeTimestamp003() {
        return extnAttributeTimestamp003;
    }

    /**
     * Sets the value of the extnAttributeTimestamp003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExtnAttributeTimestamp003(JAXBElement<XMLGregorianCalendar> value) {
        this.extnAttributeTimestamp003 = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the extnAttributeTimestamp004 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExtnAttributeTimestamp004() {
        return extnAttributeTimestamp004;
    }

    /**
     * Sets the value of the extnAttributeTimestamp004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExtnAttributeTimestamp004(JAXBElement<XMLGregorianCalendar> value) {
        this.extnAttributeTimestamp004 = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the opportunityContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityContact }
     * 
     * 
     */
    public List<OpportunityContact> getOpportunityContact() {
        if (opportunityContact == null) {
            opportunityContact = new ArrayList<OpportunityContact>();
        }
        return this.opportunityContact;
    }

    /**
     * Gets the value of the childRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Revenue }
     * 
     * 
     */
    public List<Revenue> getChildRevenue() {
        if (childRevenue == null) {
            childRevenue = new ArrayList<Revenue>();
        }
        return this.childRevenue;
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
     * Gets the value of the opportunityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityReference }
     * 
     * 
     */
    public List<OpportunityReference> getOpportunityReference() {
        if (opportunityReference == null) {
            opportunityReference = new ArrayList<OpportunityReference>();
        }
        return this.opportunityReference;
    }

    /**
     * Gets the value of the opportunityCompetitor2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityCompetitor2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityCompetitor2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityCompetitor }
     * 
     * 
     */
    public List<OpportunityCompetitor> getOpportunityCompetitor2() {
        if (opportunityCompetitor2 == null) {
            opportunityCompetitor2 = new ArrayList<OpportunityCompetitor>();
        }
        return this.opportunityCompetitor2;
    }

    /**
     * Gets the value of the opportunityCompetitor3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityCompetitor3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityCompetitor3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityCompetitor }
     * 
     * 
     */
    public List<OpportunityCompetitor> getOpportunityCompetitor3() {
        if (opportunityCompetitor3 == null) {
            opportunityCompetitor3 = new ArrayList<OpportunityCompetitor>();
        }
        return this.opportunityCompetitor3;
    }

    /**
     * Gets the value of the opportunityResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityResource }
     * 
     * 
     */
    public List<OpportunityResource> getOpportunityResource() {
        if (opportunityResource == null) {
            opportunityResource = new ArrayList<OpportunityResource>();
        }
        return this.opportunityResource;
    }

    /**
     * Gets the value of the opportunitySource1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunitySource1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunitySource1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunitySource }
     * 
     * 
     */
    public List<OpportunitySource> getOpportunitySource1() {
        if (opportunitySource1 == null) {
            opportunitySource1 = new ArrayList<OpportunitySource>();
        }
        return this.opportunitySource1;
    }

    /**
     * Gets the value of the opportunityLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityLead }
     * 
     * 
     */
    public List<OpportunityLead> getOpportunityLead() {
        if (opportunityLead == null) {
            opportunityLead = new ArrayList<OpportunityLead>();
        }
        return this.opportunityLead;
    }

    /**
     * Gets the value of the opportunityResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityResponse }
     * 
     * 
     */
    public List<OpportunityResponse> getOpportunityResponse() {
        if (opportunityResponse == null) {
            opportunityResponse = new ArrayList<OpportunityResponse>();
        }
        return this.opportunityResponse;
    }

    /**
     * Gets the value of the revenueTerritory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueTerritory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueTerritory }
     * 
     * 
     */
    public List<RevenueTerritory> getRevenueTerritory() {
        if (revenueTerritory == null) {
            revenueTerritory = new ArrayList<RevenueTerritory>();
        }
        return this.revenueTerritory;
    }

    /**
     * Gets the value of the revenuePartnerPrimary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenuePartnerPrimary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenuePartnerPrimary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenuePartner }
     * 
     * 
     */
    public List<RevenuePartner> getRevenuePartnerPrimary() {
        if (revenuePartnerPrimary == null) {
            revenuePartnerPrimary = new ArrayList<RevenuePartner>();
        }
        return this.revenuePartnerPrimary;
    }

    /**
     * Gets the value of the revenueLineSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueLineSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueLineSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueLineSet }
     * 
     * 
     */
    public List<RevenueLineSet> getRevenueLineSet() {
        if (revenueLineSet == null) {
            revenueLineSet = new ArrayList<RevenueLineSet>();
        }
        return this.revenueLineSet;
    }

    /**
     * Gets the value of the categorySummaryRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorySummaryRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySummaryRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySummaryRevenue }
     * 
     * 
     */
    public List<CategorySummaryRevenue> getCategorySummaryRevenue() {
        if (categorySummaryRevenue == null) {
            categorySummaryRevenue = new ArrayList<CategorySummaryRevenue>();
        }
        return this.categorySummaryRevenue;
    }

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransientAppointment }
     * 
     * 
     */
    public List<TransientAppointment> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<TransientAppointment>();
        }
        return this.appointment;
    }

    /**
     * Gets the value of the splitRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitRevenue }
     * 
     * 
     */
    public List<SplitRevenue> getSplitRevenue() {
        if (splitRevenue == null) {
            splitRevenue = new ArrayList<SplitRevenue>();
        }
        return this.splitRevenue;
    }

    /**
     * Gets the value of the recurringRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringRevenue }
     * 
     * 
     */
    public List<RecurringRevenue> getRecurringRevenue() {
        if (recurringRevenue == null) {
            recurringRevenue = new ArrayList<RecurringRevenue>();
        }
        return this.recurringRevenue;
    }

    /**
     * Gets the value of the latitudeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLatitudeC() {
        return latitudeC;
    }

    /**
     * Sets the value of the latitudeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLatitudeC(JAXBElement<BigDecimal> value) {
        this.latitudeC = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the longitudeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLongitudeC() {
        return longitudeC;
    }

    /**
     * Sets the value of the longitudeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLongitudeC(JAXBElement<BigDecimal> value) {
        this.longitudeC = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the opportunityTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityTypeC() {
        return opportunityTypeC;
    }

    /**
     * Sets the value of the opportunityTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityTypeC(JAXBElement<String> value) {
        this.opportunityTypeC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the opportunityTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityTypeCMeaning() {
        return opportunityTypeCMeaning;
    }

    /**
     * Sets the value of the opportunityTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityTypeCMeaning(JAXBElement<String> value) {
        this.opportunityTypeCMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastUpdateOfCloseDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateOfCloseDateC() {
        return lastUpdateOfCloseDateC;
    }

    /**
     * Sets the value of the lastUpdateOfCloseDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateOfCloseDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateOfCloseDateC = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the secondLastUpdateOfCloseDaC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSecondLastUpdateOfCloseDaC() {
        return secondLastUpdateOfCloseDaC;
    }

    /**
     * Sets the value of the secondLastUpdateOfCloseDaC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSecondLastUpdateOfCloseDaC(JAXBElement<XMLGregorianCalendar> value) {
        this.secondLastUpdateOfCloseDaC = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the thirdLastUpdateOfCloseDatC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getThirdLastUpdateOfCloseDatC() {
        return thirdLastUpdateOfCloseDatC;
    }

    /**
     * Sets the value of the thirdLastUpdateOfCloseDatC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setThirdLastUpdateOfCloseDatC(JAXBElement<XMLGregorianCalendar> value) {
        this.thirdLastUpdateOfCloseDatC = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fourthLastUpdateOfCloseDaC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFourthLastUpdateOfCloseDaC() {
        return fourthLastUpdateOfCloseDaC;
    }

    /**
     * Sets the value of the fourthLastUpdateOfCloseDaC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFourthLastUpdateOfCloseDaC(JAXBElement<XMLGregorianCalendar> value) {
        this.fourthLastUpdateOfCloseDaC = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the opportunityTypeTestC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityTypeTestC() {
        return opportunityTypeTestC;
    }

    /**
     * Sets the value of the opportunityTypeTestC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityTypeTestC(JAXBElement<String> value) {
        this.opportunityTypeTestC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the opportunityTypeTestCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityTypeTestCMeaning() {
        return opportunityTypeTestCMeaning;
    }

    /**
     * Sets the value of the opportunityTypeTestCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityTypeTestCMeaning(JAXBElement<String> value) {
        this.opportunityTypeTestCMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the opportunityType1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityType1C() {
        return opportunityType1C;
    }

    /**
     * Sets the value of the opportunityType1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityType1C(JAXBElement<String> value) {
        this.opportunityType1C = ((JAXBElement<String> ) value);
    }

}

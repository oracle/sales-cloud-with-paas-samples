
package com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice;

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
import com.oracle.xmlns.apps.crmcommon.notes.noteservice.Note;
import com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.MklLeadResources;
import com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.MklLeadTcMembers;
import com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.MklProdAssoc;


/**
 * <p>Java class for MklLead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MklLead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerRegistryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDateFormatted" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timeframe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdNameOrGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToReassignFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ToRescoreFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FollowupTimestamp" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RejectedTimestamp" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RetiredTimestamp" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportTaskId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RejectByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RejectComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RejectReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetireComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetireReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReassignComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReassignReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPersonLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerIdenAddrLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerEmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerSICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryInventoryItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryInventoryOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadAcceptedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerPartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryProductGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LeadAging" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudgetAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="BudgetCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudgetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerNeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionMakerIdentifiedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualifiedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EstimatedCloseDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PartnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerProgramId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DaysUntilExpiration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreationDateFormatted" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="StatusCdMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationStatusMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationTypeMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RankMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerTypeMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannelMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalTaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApproverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AcceptedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RetireReasonCdMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RejectReasonCdMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentStatusCdMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RejectByTerritoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RejectByTerritoryVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="LastAssignmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ChannelTypeMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPersonFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPersonMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerResourceOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerTreeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTreeStructureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerTreeVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertedTimestamp" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RejectedCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="QualificationScore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCurrencyFyPotentialRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptedDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ApprovalDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ConvertedDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="QualifiedDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RejectedDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RetiredDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MklLeadResources" type="{http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/}MklLeadResources" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MklProdAssoc1" type="{http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/}MklProdAssoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MklLeadTcMembers1" type="{http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/}MklLeadTcMembers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MklLead", propOrder = {
    "name",
    "leadNumber",
    "ownerPartyName",
    "statusCode",
    "rank",
    "sourceCode",
    "customerPartyName",
    "customerPartyUniqueName",
    "customerRegistryId",
    "productGroupName",
    "inventoryItemDescription",
    "creationDate",
    "registrationNumber",
    "partnerPartyName",
    "registrationType",
    "registrationStatus",
    "lastUpdateDateFormatted",
    "primaryContactPartyName",
    "timeframe",
    "prodNameOrGroupName",
    "lastUpdateDate",
    "leadId",
    "createdBy",
    "lastUpdatedBy",
    "objectVersionNumber",
    "lastUpdateLogin",
    "toReassignFlag",
    "toRescoreFlag",
    "followupTimestamp",
    "rejectedTimestamp",
    "retiredTimestamp",
    "score",
    "customerId",
    "primaryContactId",
    "description",
    "importTaskId",
    "rejectByUserId",
    "rejectComment",
    "rejectReasonCode",
    "retireComment",
    "retireReasonCode",
    "reassignComment",
    "reassignReasonCode",
    "assignmentStatusCode",
    "channelType",
    "ownerId",
    "primaryContactPersonLastName",
    "customerIdenAddrLocationId",
    "customerCategoryCode",
    "customerPostalCode",
    "customerCountry",
    "customerEmployeesTotal",
    "customerSICCode",
    "primaryContactCountry",
    "primaryContactTitle",
    "primaryInventoryItemId",
    "primaryInventoryOrgId",
    "currencyCode",
    "leadAcceptedFlag",
    "customerPartyType",
    "primaryContactPartyType",
    "primaryProductGroupId",
    "primaryContactRelationshipId",
    "leadAging",
    "customerAddress1",
    "customerAddress2",
    "customerAddress3",
    "customerAddress4",
    "customerCity",
    "customerState",
    "customerURL",
    "productGroupDescription",
    "budgetAmount",
    "budgetCurrencyCode",
    "budgetStatus",
    "customerNeed",
    "decisionMakerIdentifiedFlag",
    "project",
    "qualifiedDate",
    "estimatedCloseDate",
    "expirationDate",
    "approvalDate",
    "partnerId",
    "partnerType",
    "salesChannel",
    "partnerProgramId",
    "daysUntilExpiration",
    "creationDateFormatted",
    "statusCdMeaning",
    "registrationStatusMeaning",
    "registrationTypeMeaning",
    "rankMeaning",
    "partnerTypeMeaning",
    "salesChannelMeaning",
    "currencyMeaning",
    "approvalTaskId",
    "approverId",
    "acceptedDate",
    "retireReasonCdMeaning",
    "rejectReasonCdMeaning",
    "assignmentStatusCdMeaning",
    "rejectByTerritoryId",
    "rejectByTerritoryVersionId",
    "programName",
    "dealAmount",
    "lastAssignmentDate",
    "channelTypeMeaning",
    "primaryContactAddress1",
    "primaryContactAddress2",
    "primaryContactAddress3",
    "primaryContactAddress4",
    "primaryContactCity",
    "primaryContactCounty",
    "primaryContactPersonFirstName",
    "primaryContactPersonMiddleName",
    "primaryContactPostalCode",
    "primaryContactProvince",
    "primaryContactState",
    "primaryContactURL",
    "convCurrencyCode",
    "convExchangeRate",
    "convRateType",
    "ownerResourceOrgId",
    "ownerTreeCode",
    "ownerTreeStructureCode",
    "ownerTreeVersionId",
    "convertedTimestamp",
    "rejectedCount",
    "qualificationScore",
    "longDescription",
    "customerCurrencyFyPotentialRevenue",
    "branchCode",
    "uniqueName",
    "primaryContactEmailAddress",
    "primaryContactFormattedPhoneNumber",
    "acceptedDateTime",
    "approvalDateTime",
    "convertedDateTime",
    "qualifiedDateTime",
    "rejectedDateTime",
    "retiredDateTime",
    "jobTitle",
    "orgContactId",
    "campaignName",
    "campaignId",
    "mklLeadResources",
    "mklProdAssoc1",
    "mklLeadTcMembers1",
    "note"
})
public class MklLead {

    @XmlElementRef(name = "Name", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElement(name = "LeadNumber")
    protected String leadNumber;
    @XmlElement(name = "OwnerPartyName")
    protected String ownerPartyName;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "Rank", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> rank;
    @XmlElementRef(name = "SourceCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceCode;
    @XmlElement(name = "CustomerPartyName")
    protected String customerPartyName;
    @XmlElementRef(name = "CustomerPartyUniqueName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerPartyUniqueName;
    @XmlElementRef(name = "CustomerRegistryId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerRegistryId;
    @XmlElement(name = "ProductGroupName")
    protected String productGroupName;
    @XmlElementRef(name = "InventoryItemDescription", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> inventoryItemDescription;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "RegistrationNumber", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> registrationNumber;
    @XmlElement(name = "PartnerPartyName")
    protected String partnerPartyName;
    @XmlElement(name = "RegistrationType")
    protected String registrationType;
    @XmlElementRef(name = "RegistrationStatus", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> registrationStatus;
    @XmlElementRef(name = "LastUpdateDateFormatted", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDateFormatted;
    @XmlElement(name = "PrimaryContactPartyName")
    protected String primaryContactPartyName;
    @XmlElementRef(name = "Timeframe", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> timeframe;
    @XmlElementRef(name = "ProdNameOrGroupName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> prodNameOrGroupName;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LeadId")
    protected Long leadId;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "ToReassignFlag")
    protected Boolean toReassignFlag;
    @XmlElement(name = "ToRescoreFlag")
    protected Boolean toRescoreFlag;
    @XmlElementRef(name = "FollowupTimestamp", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> followupTimestamp;
    @XmlElementRef(name = "RejectedTimestamp", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rejectedTimestamp;
    @XmlElementRef(name = "RetiredTimestamp", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> retiredTimestamp;
    @XmlElementRef(name = "Score", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> score;
    @XmlElementRef(name = "CustomerId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerId;
    @XmlElementRef(name = "PrimaryContactId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryContactId;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "ImportTaskId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> importTaskId;
    @XmlElementRef(name = "RejectByUserId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> rejectByUserId;
    @XmlElementRef(name = "RejectComment", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> rejectComment;
    @XmlElementRef(name = "RejectReasonCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> rejectReasonCode;
    @XmlElementRef(name = "RetireComment", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> retireComment;
    @XmlElementRef(name = "RetireReasonCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> retireReasonCode;
    @XmlElementRef(name = "ReassignComment", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> reassignComment;
    @XmlElementRef(name = "ReassignReasonCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> reassignReasonCode;
    @XmlElementRef(name = "AssignmentStatusCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentStatusCode;
    @XmlElementRef(name = "ChannelType", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> channelType;
    @XmlElementRef(name = "OwnerId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerId;
    @XmlElementRef(name = "PrimaryContactPersonLastName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactPersonLastName;
    @XmlElementRef(name = "CustomerIdenAddrLocationId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerIdenAddrLocationId;
    @XmlElementRef(name = "CustomerCategoryCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerCategoryCode;
    @XmlElementRef(name = "CustomerPostalCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerPostalCode;
    @XmlElementRef(name = "CustomerCountry", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerCountry;
    @XmlElementRef(name = "CustomerEmployeesTotal", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> customerEmployeesTotal;
    @XmlElementRef(name = "CustomerSICCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerSICCode;
    @XmlElementRef(name = "PrimaryContactCountry", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactCountry;
    @XmlElementRef(name = "PrimaryContactTitle", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactTitle;
    @XmlElementRef(name = "PrimaryInventoryItemId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryInventoryItemId;
    @XmlElementRef(name = "PrimaryInventoryOrgId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryInventoryOrgId;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "LeadAcceptedFlag", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> leadAcceptedFlag;
    @XmlElement(name = "CustomerPartyType")
    protected String customerPartyType;
    @XmlElement(name = "PrimaryContactPartyType")
    protected String primaryContactPartyType;
    @XmlElementRef(name = "PrimaryProductGroupId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryProductGroupId;
    @XmlElementRef(name = "PrimaryContactRelationshipId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> primaryContactRelationshipId;
    @XmlElementRef(name = "LeadAging", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> leadAging;
    @XmlElementRef(name = "CustomerAddress1", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerAddress1;
    @XmlElementRef(name = "CustomerAddress2", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerAddress2;
    @XmlElementRef(name = "CustomerAddress3", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerAddress3;
    @XmlElementRef(name = "CustomerAddress4", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerAddress4;
    @XmlElementRef(name = "CustomerCity", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerCity;
    @XmlElementRef(name = "CustomerState", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerState;
    @XmlElementRef(name = "CustomerURL", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerURL;
    @XmlElement(name = "ProductGroupDescription")
    protected String productGroupDescription;
    @XmlElementRef(name = "BudgetAmount", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> budgetAmount;
    @XmlElementRef(name = "BudgetCurrencyCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> budgetCurrencyCode;
    @XmlElementRef(name = "BudgetStatus", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> budgetStatus;
    @XmlElementRef(name = "CustomerNeed", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> customerNeed;
    @XmlElementRef(name = "DecisionMakerIdentifiedFlag", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> decisionMakerIdentifiedFlag;
    @XmlElementRef(name = "Project", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> project;
    @XmlElementRef(name = "QualifiedDate", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> qualifiedDate;
    @XmlElementRef(name = "EstimatedCloseDate", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> estimatedCloseDate;
    @XmlElementRef(name = "ExpirationDate", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> expirationDate;
    @XmlElementRef(name = "ApprovalDate", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> approvalDate;
    @XmlElementRef(name = "PartnerId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> partnerId;
    @XmlElementRef(name = "PartnerType", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> partnerType;
    @XmlElementRef(name = "SalesChannel", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> salesChannel;
    @XmlElementRef(name = "PartnerProgramId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> partnerProgramId;
    @XmlElementRef(name = "DaysUntilExpiration", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Integer> daysUntilExpiration;
    @XmlElementRef(name = "CreationDateFormatted", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> creationDateFormatted;
    @XmlElementRef(name = "StatusCdMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> statusCdMeaning;
    @XmlElementRef(name = "RegistrationStatusMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> registrationStatusMeaning;
    @XmlElementRef(name = "RegistrationTypeMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> registrationTypeMeaning;
    @XmlElementRef(name = "RankMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> rankMeaning;
    @XmlElementRef(name = "PartnerTypeMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> partnerTypeMeaning;
    @XmlElementRef(name = "SalesChannelMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> salesChannelMeaning;
    @XmlElementRef(name = "CurrencyMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyMeaning;
    @XmlElementRef(name = "ApprovalTaskId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> approvalTaskId;
    @XmlElementRef(name = "ApproverId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> approverId;
    @XmlElementRef(name = "AcceptedDate", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> acceptedDate;
    @XmlElementRef(name = "RetireReasonCdMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> retireReasonCdMeaning;
    @XmlElementRef(name = "RejectReasonCdMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> rejectReasonCdMeaning;
    @XmlElementRef(name = "AssignmentStatusCdMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentStatusCdMeaning;
    @XmlElementRef(name = "RejectByTerritoryId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> rejectByTerritoryId;
    @XmlElementRef(name = "RejectByTerritoryVersionId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> rejectByTerritoryVersionId;
    @XmlElementRef(name = "ProgramName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> programName;
    @XmlElementRef(name = "DealAmount", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> dealAmount;
    @XmlElementRef(name = "LastAssignmentDate", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastAssignmentDate;
    @XmlElementRef(name = "ChannelTypeMeaning", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> channelTypeMeaning;
    @XmlElementRef(name = "PrimaryContactAddress1", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactAddress1;
    @XmlElementRef(name = "PrimaryContactAddress2", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactAddress2;
    @XmlElementRef(name = "PrimaryContactAddress3", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactAddress3;
    @XmlElementRef(name = "PrimaryContactAddress4", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactAddress4;
    @XmlElementRef(name = "PrimaryContactCity", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactCity;
    @XmlElementRef(name = "PrimaryContactCounty", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactCounty;
    @XmlElementRef(name = "PrimaryContactPersonFirstName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactPersonFirstName;
    @XmlElementRef(name = "PrimaryContactPersonMiddleName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactPersonMiddleName;
    @XmlElementRef(name = "PrimaryContactPostalCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactPostalCode;
    @XmlElementRef(name = "PrimaryContactProvince", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactProvince;
    @XmlElementRef(name = "PrimaryContactState", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactState;
    @XmlElementRef(name = "PrimaryContactURL", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactURL;
    @XmlElementRef(name = "ConvCurrencyCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> convCurrencyCode;
    @XmlElementRef(name = "ConvExchangeRate", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> convExchangeRate;
    @XmlElementRef(name = "ConvRateType", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> convRateType;
    @XmlElementRef(name = "OwnerResourceOrgId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerResourceOrgId;
    @XmlElementRef(name = "OwnerTreeCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerTreeCode;
    @XmlElementRef(name = "OwnerTreeStructureCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerTreeStructureCode;
    @XmlElementRef(name = "OwnerTreeVersionId", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerTreeVersionId;
    @XmlElementRef(name = "ConvertedTimestamp", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> convertedTimestamp;
    @XmlElementRef(name = "RejectedCount", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> rejectedCount;
    @XmlElementRef(name = "QualificationScore", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> qualificationScore;
    @XmlElementRef(name = "LongDescription", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> longDescription;
    @XmlElementRef(name = "CustomerCurrencyFyPotentialRevenue", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> customerCurrencyFyPotentialRevenue;
    @XmlElementRef(name = "BranchCode", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> branchCode;
    @XmlElementRef(name = "UniqueName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> uniqueName;
    @XmlElementRef(name = "PrimaryContactEmailAddress", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactEmailAddress;
    @XmlElementRef(name = "PrimaryContactFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> primaryContactFormattedPhoneNumber;
    @XmlElementRef(name = "AcceptedDateTime", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> acceptedDateTime;
    @XmlElementRef(name = "ApprovalDateTime", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> approvalDateTime;
    @XmlElementRef(name = "ConvertedDateTime", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> convertedDateTime;
    @XmlElementRef(name = "QualifiedDateTime", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> qualifiedDateTime;
    @XmlElementRef(name = "RejectedDateTime", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> rejectedDateTime;
    @XmlElementRef(name = "RetiredDateTime", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> retiredDateTime;
    @XmlElementRef(name = "JobTitle", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> jobTitle;
    @XmlElement(name = "OrgContactId")
    protected Long orgContactId;
    @XmlElementRef(name = "CampaignName", namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> campaignName;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "MklLeadResources")
    protected List<MklLeadResources> mklLeadResources;
    @XmlElement(name = "MklProdAssoc1")
    protected List<MklProdAssoc> mklProdAssoc1;
    @XmlElement(name = "MklLeadTcMembers1")
    protected List<MklLeadTcMembers> mklLeadTcMembers1;
    @XmlElement(name = "Note")
    protected List<Note> note;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the leadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadNumber() {
        return leadNumber;
    }

    /**
     * Sets the value of the leadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadNumber(String value) {
        this.leadNumber = value;
    }

    /**
     * Gets the value of the ownerPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPartyName() {
        return ownerPartyName;
    }

    /**
     * Sets the value of the ownerPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPartyName(String value) {
        this.ownerPartyName = value;
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
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceCode(JAXBElement<String> value) {
        this.sourceCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPartyName() {
        return customerPartyName;
    }

    /**
     * Sets the value of the customerPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPartyName(String value) {
        this.customerPartyName = value;
    }

    /**
     * Gets the value of the customerPartyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerPartyUniqueName() {
        return customerPartyUniqueName;
    }

    /**
     * Sets the value of the customerPartyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerPartyUniqueName(JAXBElement<String> value) {
        this.customerPartyUniqueName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerRegistryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerRegistryId() {
        return customerRegistryId;
    }

    /**
     * Sets the value of the customerRegistryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerRegistryId(JAXBElement<String> value) {
        this.customerRegistryId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the productGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupName() {
        return productGroupName;
    }

    /**
     * Sets the value of the productGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupName(String value) {
        this.productGroupName = value;
    }

    /**
     * Gets the value of the inventoryItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventoryItemDescription() {
        return inventoryItemDescription;
    }

    /**
     * Sets the value of the inventoryItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventoryItemDescription(JAXBElement<String> value) {
        this.inventoryItemDescription = ((JAXBElement<String> ) value);
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
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerPartyName() {
        return partnerPartyName;
    }

    /**
     * Sets the value of the partnerPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerPartyName(String value) {
        this.partnerPartyName = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationStatus(JAXBElement<String> value) {
        this.registrationStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastUpdateDateFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDateFormatted() {
        return lastUpdateDateFormatted;
    }

    /**
     * Sets the value of the lastUpdateDateFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDateFormatted(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDateFormatted = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the timeframe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeframe() {
        return timeframe;
    }

    /**
     * Sets the value of the timeframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeframe(JAXBElement<String> value) {
        this.timeframe = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prodNameOrGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProdNameOrGroupName() {
        return prodNameOrGroupName;
    }

    /**
     * Sets the value of the prodNameOrGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProdNameOrGroupName(JAXBElement<String> value) {
        this.prodNameOrGroupName = ((JAXBElement<String> ) value);
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
     * Gets the value of the leadId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeadId() {
        return leadId;
    }

    /**
     * Sets the value of the leadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeadId(Long value) {
        this.leadId = value;
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
     * Gets the value of the toReassignFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToReassignFlag() {
        return toReassignFlag;
    }

    /**
     * Sets the value of the toReassignFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToReassignFlag(Boolean value) {
        this.toReassignFlag = value;
    }

    /**
     * Gets the value of the toRescoreFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToRescoreFlag() {
        return toRescoreFlag;
    }

    /**
     * Sets the value of the toRescoreFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToRescoreFlag(Boolean value) {
        this.toRescoreFlag = value;
    }

    /**
     * Gets the value of the followupTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFollowupTimestamp() {
        return followupTimestamp;
    }

    /**
     * Sets the value of the followupTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFollowupTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.followupTimestamp = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rejectedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRejectedTimestamp() {
        return rejectedTimestamp;
    }

    /**
     * Sets the value of the rejectedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRejectedTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.rejectedTimestamp = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the retiredTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRetiredTimestamp() {
        return retiredTimestamp;
    }

    /**
     * Sets the value of the retiredTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRetiredTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.retiredTimestamp = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setScore(JAXBElement<Long> value) {
        this.score = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<Long> value) {
        this.customerId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryContactId() {
        return primaryContactId;
    }

    /**
     * Sets the value of the primaryContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryContactId(JAXBElement<Long> value) {
        this.primaryContactId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the importTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getImportTaskId() {
        return importTaskId;
    }

    /**
     * Sets the value of the importTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setImportTaskId(JAXBElement<Long> value) {
        this.importTaskId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the rejectByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRejectByUserId() {
        return rejectByUserId;
    }

    /**
     * Sets the value of the rejectByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRejectByUserId(JAXBElement<Long> value) {
        this.rejectByUserId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the rejectComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectComment() {
        return rejectComment;
    }

    /**
     * Sets the value of the rejectComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectComment(JAXBElement<String> value) {
        this.rejectComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rejectReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectReasonCode() {
        return rejectReasonCode;
    }

    /**
     * Sets the value of the rejectReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectReasonCode(JAXBElement<String> value) {
        this.rejectReasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the retireComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetireComment() {
        return retireComment;
    }

    /**
     * Sets the value of the retireComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetireComment(JAXBElement<String> value) {
        this.retireComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the retireReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetireReasonCode() {
        return retireReasonCode;
    }

    /**
     * Sets the value of the retireReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetireReasonCode(JAXBElement<String> value) {
        this.retireReasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reassignComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReassignComment() {
        return reassignComment;
    }

    /**
     * Sets the value of the reassignComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReassignComment(JAXBElement<String> value) {
        this.reassignComment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reassignReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReassignReasonCode() {
        return reassignReasonCode;
    }

    /**
     * Sets the value of the reassignReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReassignReasonCode(JAXBElement<String> value) {
        this.reassignReasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the assignmentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentStatusCode() {
        return assignmentStatusCode;
    }

    /**
     * Sets the value of the assignmentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentStatusCode(JAXBElement<String> value) {
        this.assignmentStatusCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelType(JAXBElement<String> value) {
        this.channelType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerId(JAXBElement<Long> value) {
        this.ownerId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryContactPersonLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPersonLastName() {
        return primaryContactPersonLastName;
    }

    /**
     * Sets the value of the primaryContactPersonLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPersonLastName(JAXBElement<String> value) {
        this.primaryContactPersonLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerIdenAddrLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerIdenAddrLocationId() {
        return customerIdenAddrLocationId;
    }

    /**
     * Sets the value of the customerIdenAddrLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerIdenAddrLocationId(JAXBElement<Long> value) {
        this.customerIdenAddrLocationId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the customerCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerCategoryCode() {
        return customerCategoryCode;
    }

    /**
     * Sets the value of the customerCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerCategoryCode(JAXBElement<String> value) {
        this.customerCategoryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerPostalCode() {
        return customerPostalCode;
    }

    /**
     * Sets the value of the customerPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerPostalCode(JAXBElement<String> value) {
        this.customerPostalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerCountry() {
        return customerCountry;
    }

    /**
     * Sets the value of the customerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerCountry(JAXBElement<String> value) {
        this.customerCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerEmployeesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCustomerEmployeesTotal() {
        return customerEmployeesTotal;
    }

    /**
     * Sets the value of the customerEmployeesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCustomerEmployeesTotal(JAXBElement<BigDecimal> value) {
        this.customerEmployeesTotal = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the customerSICCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerSICCode() {
        return customerSICCode;
    }

    /**
     * Sets the value of the customerSICCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerSICCode(JAXBElement<String> value) {
        this.customerSICCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactCountry() {
        return primaryContactCountry;
    }

    /**
     * Sets the value of the primaryContactCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactCountry(JAXBElement<String> value) {
        this.primaryContactCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactTitle() {
        return primaryContactTitle;
    }

    /**
     * Sets the value of the primaryContactTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactTitle(JAXBElement<String> value) {
        this.primaryContactTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryInventoryItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryInventoryItemId() {
        return primaryInventoryItemId;
    }

    /**
     * Sets the value of the primaryInventoryItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryInventoryItemId(JAXBElement<Long> value) {
        this.primaryInventoryItemId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryInventoryOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryInventoryOrgId() {
        return primaryInventoryOrgId;
    }

    /**
     * Sets the value of the primaryInventoryOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryInventoryOrgId(JAXBElement<Long> value) {
        this.primaryInventoryOrgId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the leadAcceptedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLeadAcceptedFlag() {
        return leadAcceptedFlag;
    }

    /**
     * Sets the value of the leadAcceptedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLeadAcceptedFlag(JAXBElement<Boolean> value) {
        this.leadAcceptedFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the customerPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPartyType() {
        return customerPartyType;
    }

    /**
     * Sets the value of the customerPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPartyType(String value) {
        this.customerPartyType = value;
    }

    /**
     * Gets the value of the primaryContactPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactPartyType() {
        return primaryContactPartyType;
    }

    /**
     * Sets the value of the primaryContactPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactPartyType(String value) {
        this.primaryContactPartyType = value;
    }

    /**
     * Gets the value of the primaryProductGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryProductGroupId() {
        return primaryProductGroupId;
    }

    /**
     * Sets the value of the primaryProductGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryProductGroupId(JAXBElement<Long> value) {
        this.primaryProductGroupId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the primaryContactRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryContactRelationshipId() {
        return primaryContactRelationshipId;
    }

    /**
     * Sets the value of the primaryContactRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryContactRelationshipId(JAXBElement<Long> value) {
        this.primaryContactRelationshipId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the leadAging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLeadAging() {
        return leadAging;
    }

    /**
     * Sets the value of the leadAging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLeadAging(JAXBElement<BigDecimal> value) {
        this.leadAging = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the customerAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerAddress1() {
        return customerAddress1;
    }

    /**
     * Sets the value of the customerAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerAddress1(JAXBElement<String> value) {
        this.customerAddress1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerAddress2() {
        return customerAddress2;
    }

    /**
     * Sets the value of the customerAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerAddress2(JAXBElement<String> value) {
        this.customerAddress2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerAddress3() {
        return customerAddress3;
    }

    /**
     * Sets the value of the customerAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerAddress3(JAXBElement<String> value) {
        this.customerAddress3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerAddress4() {
        return customerAddress4;
    }

    /**
     * Sets the value of the customerAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerAddress4(JAXBElement<String> value) {
        this.customerAddress4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerCity() {
        return customerCity;
    }

    /**
     * Sets the value of the customerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerCity(JAXBElement<String> value) {
        this.customerCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerState() {
        return customerState;
    }

    /**
     * Sets the value of the customerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerState(JAXBElement<String> value) {
        this.customerState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerURL() {
        return customerURL;
    }

    /**
     * Sets the value of the customerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerURL(JAXBElement<String> value) {
        this.customerURL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the productGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupDescription() {
        return productGroupDescription;
    }

    /**
     * Sets the value of the productGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupDescription(String value) {
        this.productGroupDescription = value;
    }

    /**
     * Gets the value of the budgetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets the value of the budgetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBudgetAmount(JAXBElement<AmountType> value) {
        this.budgetAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the budgetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBudgetCurrencyCode() {
        return budgetCurrencyCode;
    }

    /**
     * Sets the value of the budgetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBudgetCurrencyCode(JAXBElement<String> value) {
        this.budgetCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the budgetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBudgetStatus() {
        return budgetStatus;
    }

    /**
     * Sets the value of the budgetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBudgetStatus(JAXBElement<String> value) {
        this.budgetStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerNeed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerNeed() {
        return customerNeed;
    }

    /**
     * Sets the value of the customerNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerNeed(JAXBElement<String> value) {
        this.customerNeed = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the decisionMakerIdentifiedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDecisionMakerIdentifiedFlag() {
        return decisionMakerIdentifiedFlag;
    }

    /**
     * Sets the value of the decisionMakerIdentifiedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDecisionMakerIdentifiedFlag(JAXBElement<Boolean> value) {
        this.decisionMakerIdentifiedFlag = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProject(JAXBElement<String> value) {
        this.project = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qualifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getQualifiedDate() {
        return qualifiedDate;
    }

    /**
     * Sets the value of the qualifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setQualifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.qualifiedDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the estimatedCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEstimatedCloseDate() {
        return estimatedCloseDate;
    }

    /**
     * Sets the value of the estimatedCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEstimatedCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.estimatedCloseDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setApprovalDate(JAXBElement<XMLGregorianCalendar> value) {
        this.approvalDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartnerId(JAXBElement<Long> value) {
        this.partnerId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the partnerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerType() {
        return partnerType;
    }

    /**
     * Sets the value of the partnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerType(JAXBElement<String> value) {
        this.partnerType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesChannel(JAXBElement<String> value) {
        this.salesChannel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPartnerProgramId() {
        return partnerProgramId;
    }

    /**
     * Sets the value of the partnerProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPartnerProgramId(JAXBElement<Long> value) {
        this.partnerProgramId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the daysUntilExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysUntilExpiration() {
        return daysUntilExpiration;
    }

    /**
     * Sets the value of the daysUntilExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysUntilExpiration(JAXBElement<Integer> value) {
        this.daysUntilExpiration = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the creationDateFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDateFormatted() {
        return creationDateFormatted;
    }

    /**
     * Sets the value of the creationDateFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDateFormatted(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDateFormatted = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the statusCdMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusCdMeaning() {
        return statusCdMeaning;
    }

    /**
     * Sets the value of the statusCdMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusCdMeaning(JAXBElement<String> value) {
        this.statusCdMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the registrationStatusMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationStatusMeaning() {
        return registrationStatusMeaning;
    }

    /**
     * Sets the value of the registrationStatusMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationStatusMeaning(JAXBElement<String> value) {
        this.registrationStatusMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the registrationTypeMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationTypeMeaning() {
        return registrationTypeMeaning;
    }

    /**
     * Sets the value of the registrationTypeMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationTypeMeaning(JAXBElement<String> value) {
        this.registrationTypeMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rankMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRankMeaning() {
        return rankMeaning;
    }

    /**
     * Sets the value of the rankMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRankMeaning(JAXBElement<String> value) {
        this.rankMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerTypeMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerTypeMeaning() {
        return partnerTypeMeaning;
    }

    /**
     * Sets the value of the partnerTypeMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerTypeMeaning(JAXBElement<String> value) {
        this.partnerTypeMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesChannelMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesChannelMeaning() {
        return salesChannelMeaning;
    }

    /**
     * Sets the value of the salesChannelMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesChannelMeaning(JAXBElement<String> value) {
        this.salesChannelMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the currencyMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyMeaning() {
        return currencyMeaning;
    }

    /**
     * Sets the value of the currencyMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyMeaning(JAXBElement<String> value) {
        this.currencyMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the approvalTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApprovalTaskId() {
        return approvalTaskId;
    }

    /**
     * Sets the value of the approvalTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApprovalTaskId(JAXBElement<String> value) {
        this.approvalTaskId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the approverId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getApproverId() {
        return approverId;
    }

    /**
     * Sets the value of the approverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setApproverId(JAXBElement<Long> value) {
        this.approverId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAcceptedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.acceptedDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the retireReasonCdMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetireReasonCdMeaning() {
        return retireReasonCdMeaning;
    }

    /**
     * Sets the value of the retireReasonCdMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetireReasonCdMeaning(JAXBElement<String> value) {
        this.retireReasonCdMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rejectReasonCdMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejectReasonCdMeaning() {
        return rejectReasonCdMeaning;
    }

    /**
     * Sets the value of the rejectReasonCdMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejectReasonCdMeaning(JAXBElement<String> value) {
        this.rejectReasonCdMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the assignmentStatusCdMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentStatusCdMeaning() {
        return assignmentStatusCdMeaning;
    }

    /**
     * Sets the value of the assignmentStatusCdMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentStatusCdMeaning(JAXBElement<String> value) {
        this.assignmentStatusCdMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rejectByTerritoryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRejectByTerritoryId() {
        return rejectByTerritoryId;
    }

    /**
     * Sets the value of the rejectByTerritoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRejectByTerritoryId(JAXBElement<Long> value) {
        this.rejectByTerritoryId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the rejectByTerritoryVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRejectByTerritoryVersionId() {
        return rejectByTerritoryVersionId;
    }

    /**
     * Sets the value of the rejectByTerritoryVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRejectByTerritoryVersionId(JAXBElement<Long> value) {
        this.rejectByTerritoryVersionId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgramName(JAXBElement<String> value) {
        this.programName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dealAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getDealAmount() {
        return dealAmount;
    }

    /**
     * Sets the value of the dealAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setDealAmount(JAXBElement<AmountType> value) {
        this.dealAmount = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the channelTypeMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelTypeMeaning() {
        return channelTypeMeaning;
    }

    /**
     * Sets the value of the channelTypeMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelTypeMeaning(JAXBElement<String> value) {
        this.channelTypeMeaning = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactAddress1() {
        return primaryContactAddress1;
    }

    /**
     * Sets the value of the primaryContactAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactAddress1(JAXBElement<String> value) {
        this.primaryContactAddress1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactAddress2() {
        return primaryContactAddress2;
    }

    /**
     * Sets the value of the primaryContactAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactAddress2(JAXBElement<String> value) {
        this.primaryContactAddress2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactAddress3() {
        return primaryContactAddress3;
    }

    /**
     * Sets the value of the primaryContactAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactAddress3(JAXBElement<String> value) {
        this.primaryContactAddress3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactAddress4() {
        return primaryContactAddress4;
    }

    /**
     * Sets the value of the primaryContactAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactAddress4(JAXBElement<String> value) {
        this.primaryContactAddress4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactCity() {
        return primaryContactCity;
    }

    /**
     * Sets the value of the primaryContactCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactCity(JAXBElement<String> value) {
        this.primaryContactCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactCounty() {
        return primaryContactCounty;
    }

    /**
     * Sets the value of the primaryContactCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactCounty(JAXBElement<String> value) {
        this.primaryContactCounty = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactPersonFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPersonFirstName() {
        return primaryContactPersonFirstName;
    }

    /**
     * Sets the value of the primaryContactPersonFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPersonFirstName(JAXBElement<String> value) {
        this.primaryContactPersonFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactPersonMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPersonMiddleName() {
        return primaryContactPersonMiddleName;
    }

    /**
     * Sets the value of the primaryContactPersonMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPersonMiddleName(JAXBElement<String> value) {
        this.primaryContactPersonMiddleName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactPostalCode() {
        return primaryContactPostalCode;
    }

    /**
     * Sets the value of the primaryContactPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactPostalCode(JAXBElement<String> value) {
        this.primaryContactPostalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactProvince() {
        return primaryContactProvince;
    }

    /**
     * Sets the value of the primaryContactProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactProvince(JAXBElement<String> value) {
        this.primaryContactProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactState() {
        return primaryContactState;
    }

    /**
     * Sets the value of the primaryContactState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactState(JAXBElement<String> value) {
        this.primaryContactState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryContactURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactURL() {
        return primaryContactURL;
    }

    /**
     * Sets the value of the primaryContactURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactURL(JAXBElement<String> value) {
        this.primaryContactURL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the convCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConvCurrencyCode() {
        return convCurrencyCode;
    }

    /**
     * Sets the value of the convCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConvCurrencyCode(JAXBElement<String> value) {
        this.convCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the convExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConvExchangeRate() {
        return convExchangeRate;
    }

    /**
     * Sets the value of the convExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConvExchangeRate(JAXBElement<BigDecimal> value) {
        this.convExchangeRate = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the convRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConvRateType() {
        return convRateType;
    }

    /**
     * Sets the value of the convRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConvRateType(JAXBElement<String> value) {
        this.convRateType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerResourceOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerResourceOrgId() {
        return ownerResourceOrgId;
    }

    /**
     * Sets the value of the ownerResourceOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerResourceOrgId(JAXBElement<Long> value) {
        this.ownerResourceOrgId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the ownerTreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerTreeCode() {
        return ownerTreeCode;
    }

    /**
     * Sets the value of the ownerTreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerTreeCode(JAXBElement<String> value) {
        this.ownerTreeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerTreeStructureCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerTreeStructureCode() {
        return ownerTreeStructureCode;
    }

    /**
     * Sets the value of the ownerTreeStructureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerTreeStructureCode(JAXBElement<String> value) {
        this.ownerTreeStructureCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerTreeVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerTreeVersionId() {
        return ownerTreeVersionId;
    }

    /**
     * Sets the value of the ownerTreeVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerTreeVersionId(JAXBElement<String> value) {
        this.ownerTreeVersionId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the convertedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConvertedTimestamp() {
        return convertedTimestamp;
    }

    /**
     * Sets the value of the convertedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConvertedTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.convertedTimestamp = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rejectedCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRejectedCount() {
        return rejectedCount;
    }

    /**
     * Sets the value of the rejectedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRejectedCount(JAXBElement<Long> value) {
        this.rejectedCount = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the qualificationScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getQualificationScore() {
        return qualificationScore;
    }

    /**
     * Sets the value of the qualificationScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setQualificationScore(JAXBElement<Long> value) {
        this.qualificationScore = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongDescription(JAXBElement<String> value) {
        this.longDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerCurrencyFyPotentialRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCustomerCurrencyFyPotentialRevenue() {
        return customerCurrencyFyPotentialRevenue;
    }

    /**
     * Sets the value of the customerCurrencyFyPotentialRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCustomerCurrencyFyPotentialRevenue(JAXBElement<BigDecimal> value) {
        this.customerCurrencyFyPotentialRevenue = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchCode(JAXBElement<String> value) {
        this.branchCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the uniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueName() {
        return uniqueName;
    }

    /**
     * Sets the value of the uniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueName(JAXBElement<String> value) {
        this.uniqueName = ((JAXBElement<String> ) value);
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
     * Gets the value of the acceptedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAcceptedDateTime() {
        return acceptedDateTime;
    }

    /**
     * Sets the value of the acceptedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAcceptedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.acceptedDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the approvalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getApprovalDateTime() {
        return approvalDateTime;
    }

    /**
     * Sets the value of the approvalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setApprovalDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.approvalDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the convertedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConvertedDateTime() {
        return convertedDateTime;
    }

    /**
     * Sets the value of the convertedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConvertedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.convertedDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the qualifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getQualifiedDateTime() {
        return qualifiedDateTime;
    }

    /**
     * Sets the value of the qualifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setQualifiedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.qualifiedDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the rejectedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRejectedDateTime() {
        return rejectedDateTime;
    }

    /**
     * Sets the value of the rejectedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRejectedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.rejectedDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the retiredDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRetiredDateTime() {
        return retiredDateTime;
    }

    /**
     * Sets the value of the retiredDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRetiredDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.retiredDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignName(JAXBElement<String> value) {
        this.campaignName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the mklLeadResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mklLeadResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMklLeadResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MklLeadResources }
     * 
     * 
     */
    public List<MklLeadResources> getMklLeadResources() {
        if (mklLeadResources == null) {
            mklLeadResources = new ArrayList<MklLeadResources>();
        }
        return this.mklLeadResources;
    }

    /**
     * Gets the value of the mklProdAssoc1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mklProdAssoc1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMklProdAssoc1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MklProdAssoc }
     * 
     * 
     */
    public List<MklProdAssoc> getMklProdAssoc1() {
        if (mklProdAssoc1 == null) {
            mklProdAssoc1 = new ArrayList<MklProdAssoc>();
        }
        return this.mklProdAssoc1;
    }

    /**
     * Gets the value of the mklLeadTcMembers1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mklLeadTcMembers1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMklLeadTcMembers1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MklLeadTcMembers }
     * 
     * 
     */
    public List<MklLeadTcMembers> getMklLeadTcMembers1() {
        if (mklLeadTcMembers1 == null) {
            mklLeadTcMembers1 = new ArrayList<MklLeadTcMembers>();
        }
        return this.mklLeadTcMembers1;
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

}

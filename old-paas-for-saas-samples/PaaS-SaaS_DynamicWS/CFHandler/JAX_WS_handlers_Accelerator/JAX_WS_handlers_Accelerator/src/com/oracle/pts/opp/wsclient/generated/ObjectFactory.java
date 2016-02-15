
package com.oracle.pts.opp.wsclient.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.pts.opp.wsclient.generated package. 
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

    private final static QName _RevenueTerritory_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenueTerritory");
    private final static QName _OpportunityReference_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityReference");
    private final static QName _RecurringRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "recurringRevenue");
    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", "Fault");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _OpportunitySource_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunitySource");
    private final static QName _Note_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "note");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _OpportunityLead_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityLead");
    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _DeleteError_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "deleteError");
    private final static QName _OpportunityResponse_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityResponse");
    private final static QName _OpportunityCompetitor_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityCompetitor");
    private final static QName _FindControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findControl");
    private final static QName _RevenueLineSet_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "revenueLineSet");
    private final static QName _SplitRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "splitRevenue");
    private final static QName _DeleteEntity_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "deleteEntity");
    private final static QName _NoteDFF_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "noteDFF");
    private final static QName _Opportunity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunity");
    private final static QName _TransientAppointment_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientAppointment");
    private final static QName _OpportunityContact_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityContact");
    private final static QName _Revenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenue");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _CategorySummaryRevenue_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "categorySummaryRevenue");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _TransientCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientCategory");
    private final static QName _TransientContact_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientContact");
    private final static QName _ProcessData_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processData");
    private final static QName _TransientAssignee_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientAssignee");
    private final static QName _OpportunityResource_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityResource");
    private final static QName _RevenuePartner_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenuePartner");
    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _TransientNote_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientNote");
    private final static QName _ProcessControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processControl");
    private final static QName _SplitRevenueSalesAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesAccountId");
    private final static QName _SplitRevenueOwnerLockAsgnFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerLockAsgnFlag");
    private final static QName _SplitRevenueUOMCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UOMCode");
    private final static QName _SplitRevenueUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UserLastUpdateDate");
    private final static QName _SplitRevenueConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ConversionRate");
    private final static QName _SplitRevenueCommitFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CommitFlag");
    private final static QName _SplitRevenueRecurFrequencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurFrequencyCode");
    private final static QName _SplitRevenueRecurTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurTypeCode");
    private final static QName _SplitRevenueDownsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DownsideAmount");
    private final static QName _SplitRevenueExpectAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ExpectAmount");
    private final static QName _SplitRevenueOwnerDealProtectedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerDealProtectedDate");
    private final static QName _SplitRevenueQuantity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "Quantity");
    private final static QName _SplitRevenueResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ResourcePartyId");
    private final static QName _SplitRevenueLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "LastUpdateLogin");
    private final static QName _SplitRevenueOwnerOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeCode");
    private final static QName _SplitRevenueConversionRateType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ConversionRateType");
    private final static QName _SplitRevenueExpectDlvryDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ExpectDlvryDate");
    private final static QName _SplitRevenueOwnerDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerDealExpirationDate");
    private final static QName _SplitRevenueSplitTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SplitTypeCode");
    private final static QName _SplitRevenueProdGroupId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ProdGroupId");
    private final static QName _SplitRevenueRecurParentRevnId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurParentRevnId");
    private final static QName _SplitRevenueInventoryOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "InventoryOrgId");
    private final static QName _SplitRevenueSplitPercent_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SplitPercent");
    private final static QName _SplitRevenueCloseReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CloseReasonCode");
    private final static QName _SplitRevenueRecurQuantity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurQuantity");
    private final static QName _SplitRevenueWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "WinProb");
    private final static QName _SplitRevenuePrTerritoryUpdatedById_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrTerritoryUpdatedById");
    private final static QName _SplitRevenueForecastOverrideCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ForecastOverrideCode");
    private final static QName _SplitRevenueOwnerOrgTreeStructCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeStructCode");
    private final static QName _SplitRevenueUpsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UpsideAmount");
    private final static QName _SplitRevenueUnitPrice_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UnitPrice");
    private final static QName _SplitRevenueTargetPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TargetPartyId");
    private final static QName _SplitRevenueComments_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "Comments");
    private final static QName _SplitRevenuePrCmptPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrCmptPartyId");
    private final static QName _SplitRevenueInventoryItemId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "InventoryItemId");
    private final static QName _SplitRevenueCustomerAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CustomerAccountId");
    private final static QName _SplitRevenueRecurRevnAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurRevnAmount");
    private final static QName _SplitRevenueOptyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OptyId");
    private final static QName _SplitRevenueRecurEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurEndDate");
    private final static QName _SplitRevenuePrTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrTerritoryVersionId");
    private final static QName _SplitRevenueMarginAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "MarginAmount");
    private final static QName _SplitRevenueRecurNumberPeriods_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurNumberPeriods");
    private final static QName _SplitRevenueOwnerResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerResourceOrgId");
    private final static QName _SplitRevenueTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TypeCode");
    private final static QName _SplitRevenueRevnAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmount");
    private final static QName _SplitRevenueEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "EffectiveDate");
    private final static QName _SplitRevenueRecurStartDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurStartDate");
    private final static QName _SplitRevenueCostAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CostAmount");
    private final static QName _SplitRevenueAssignmentType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AssignmentType");
    private final static QName _SplitRevenueCreditRcptPartOrgPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CreditRcptPartOrgPartyId");
    private final static QName _SplitRevenueSplitParentRevnId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SplitParentRevnId");
    private final static QName _SplitRevenueStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "StatusCode");
    private final static QName _SplitRevenuePrimaryFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrimaryFlag");
    private final static QName _SplitRevenueSalesCreditTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesCreditTypeCode");
    private final static QName _SplitRevenueRevnAmountCurcyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmountCurcyCode");
    private final static QName _SplitRevenueBUOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "BUOrgId");
    private final static QName _TransientAssigneeAssigneeId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AssigneeId");
    private final static QName _TransientAssigneeActivityAssigneeId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityAssigneeId");
    private final static QName _TransientAssigneePartyName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyName");
    private final static QName _TransientAssigneeShowTimeAsCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ShowTimeAsCd");
    private final static QName _TransientAssigneeOwnerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerFlag");
    private final static QName _TransientAssigneePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyId");
    private final static QName _TransientAssigneeActivityId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityId");
    private final static QName _TransientAssigneeAppointmentResponseCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AppointmentResponseCd");
    private final static QName _TransientAssigneeAssigneeRsrcOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AssigneeRsrcOrgId");
    private final static QName _RevenueLineSetRevnLineTypeCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnLineTypeCode");
    private final static QName _RevenueLineSetOptyId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OptyId");
    private final static QName _RevenueLineSetBUOrgId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "BUOrgId");
    private final static QName _RevenueLineSetRevnAmountCurcyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmountCurcyCode");
    private final static QName _RevenueLineSetLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "LastUpdateLogin");
    private final static QName _RevenueLineSetStatusCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "StatusCode");
    private final static QName _RevenueLineSetCustomerAccountId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CustomerAccountId");
    private final static QName _RevenueLineSetOwnerResourceId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerResourceId");
    private final static QName _RevenueLineSetOwnerOrgTreeStructCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeStructCode");
    private final static QName _RevenueLineSetEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "EffectiveDate");
    private final static QName _RevenueLineSetCustomerPartyId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CustomerPartyId");
    private final static QName _RevenueLineSetProdGroupId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "ProdGroupId");
    private final static QName _RevenueLineSetRevnAmount_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmount");
    private final static QName _RevenueLineSetUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "UserLastUpdateDate");
    private final static QName _RevenueLineSetOwnerResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerResourceOrgId");
    private final static QName _RevenueLineSetRevnSequenceNumber_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnSequenceNumber");
    private final static QName _RevenueLineSetOwnerOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeCode");
    private final static QName _RevenueLineSetSalesAccountId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "SalesAccountId");
    private final static QName _CategorySummaryRevenuePrimaryFlag_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "PrimaryFlag");
    private final static QName _CategorySummaryRevenueCrmCategorySummaryRevenue_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCategorySummaryRevenue");
    private final static QName _CategorySummaryRevenueCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRate");
    private final static QName _CategorySummaryRevenueCrmConversionRateType_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRateType");
    private final static QName _CategorySummaryRevenueRevnCategoryCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnCategoryCode");
    private final static QName _CategorySummaryRevenueCrmCurcyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCurcyCode");
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
    private final static QName _NoteDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "_FLEX_NumOfSegments");
    private final static QName _NoteDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "__FLEX_Context");
    private final static QName _RevenueTerritoryForecastParticipationCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ForecastParticipationCode");
    private final static QName _RevenueTerritoryTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TerritoryVersionId");
    private final static QName _OpportunityResourceOwnerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OwnerFlag");
    private final static QName _OpportunityResourceAsgnTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AsgnTerritoryVersionId");
    private final static QName _OpportunityResourcePersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonFirstName");
    private final static QName _OpportunityResourceRoleName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RoleName");
    private final static QName _OpportunityResourceUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UserLastUpdateDate");
    private final static QName _OpportunityResourcePartnerOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartnerOrgId");
    private final static QName _OpportunityResourceOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OrgTreeCode");
    private final static QName _OpportunityResourceMemberFunctionCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MemberFunctionCode");
    private final static QName _OpportunityResourceDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealExpirationDate");
    private final static QName _OpportunityResourceDealProtected_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealProtected");
    private final static QName _OpportunityResourceResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ResourceOrgId");
    private final static QName _OpportunityResourceEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailAddress");
    private final static QName _OpportunityResourceLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdateLogin");
    private final static QName _OpportunityResourceOrgTreeStructureCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OrgTreeStructureCode");
    private final static QName _OpportunityResourceAccessLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AccessLevelCode");
    private final static QName _OpportunityResourceMgrResourceId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MgrResourceId");
    private final static QName _OpportunityResourceLockAssignmentFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LockAssignmentFlag");
    private final static QName _OpportunityResourceFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedPhoneNumber");
    private final static QName _OpportunityResourceDealProtectedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealProtectedDate");
    private final static QName _OpportunityResourceAssignmentType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AssignmentType");
    private final static QName _OpportunityResourcePersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonLastName");
    private final static QName _OpportunityExtnAttributeTimestamp002_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExtnAttributeTimestamp002");
    private final static QName _OpportunityExtnAttributeTimestamp001_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExtnAttributeTimestamp001");
    private final static QName _OpportunityExtnAttributeTimestamp004_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExtnAttributeTimestamp004");
    private final static QName _OpportunityExtnAttributeTimestamp003_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExtnAttributeTimestamp003");
    private final static QName _OpportunityLastAssignedTimestamp_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastAssignedTimestamp");
    private final static QName _OpportunityOpportunityType1C_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityType1_c");
    private final static QName _OpportunitySecondLastUpdateOfCloseDaC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Second_Last_Update_Of_Close_Da_c");
    private final static QName _OpportunityDUNSNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DUNSNumber");
    private final static QName _OpportunityConsumerLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConsumerLastName");
    private final static QName _OpportunityDecisionLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DecisionLevelCode");
    private final static QName _OpportunitySalesAccountUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesAccountUniqueName");
    private final static QName _OpportunityDescriptionText_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DescriptionText");
    private final static QName _OpportunitySalesMethod_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesMethod");
    private final static QName _OpportunityPrimaryCompetitorId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryCompetitorId");
    private final static QName _OpportunityCrmRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CrmRevenue");
    private final static QName _OpportunityStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StatusCode");
    private final static QName _OpportunitySalesStageId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesStageId");
    private final static QName _OpportunityEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EffectiveDate");
    private final static QName _OpportunityPreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PreferredFunctionalCurrency");
    private final static QName _OpportunityPrimaryRevenueId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryRevenueId");
    private final static QName _OpportunityPartyUniqueName1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartyUniqueName1");
    private final static QName _OpportunityRevenueType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevenueType");
    private final static QName _OpportunityPrimaryContactEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactEmailAddress");
    private final static QName _OpportunityPrimaryOrganizationName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryOrganizationName");
    private final static QName _OpportunityLongitudeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Longitude_c");
    private final static QName _OpportunityBdgtAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BdgtAmount");
    private final static QName _OpportunityPrimaryContactFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactFirstName");
    private final static QName _OpportunityRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Revenue");
    private final static QName _OpportunityWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "WinProb");
    private final static QName _OpportunityOptyCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyCreationDate");
    private final static QName _OpportunityLastUpdateOfCloseDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Last_Update_Of_Close_Date_c");
    private final static QName _OpportunityBudgetedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BudgetedFlag");
    private final static QName _OpportunityAccountNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AccountNumber");
    private final static QName _OpportunityCustomerAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CustomerAccountId");
    private final static QName _OpportunityComments_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments");
    private final static QName _OpportunityRiskLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RiskLevelCode");
    private final static QName _OpportunityTargetPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TargetPartyId");
    private final static QName _OpportunityFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedAddress");
    private final static QName _OpportunityCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CrmConversionRate");
    private final static QName _OpportunityAverageDaysAtStage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AverageDaysAtStage");
    private final static QName _OpportunityLatitudeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Latitude_c");
    private final static QName _OpportunityPrConRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrConRelationshipId");
    private final static QName _OpportunityStrategicLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StrategicLevelCode");
    private final static QName _OpportunityUpsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UpsideAmount");
    private final static QName _OpportunityExtnAttributeChar004_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExtnAttributeChar004");
    private final static QName _OpportunityFourthLastUpdateOfCloseDaC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Fourth_Last_Update_Of_Close_Da_c");
    private final static QName _OpportunityLastAssignedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastAssignedDate");
    private final static QName _OpportunityOpportunityTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityType_cMeaning");
    private final static QName _OpportunityOpportunityTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityType_c");
    private final static QName _OpportunityPrimaryContactFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactFormattedPhoneNumber");
    private final static QName _OpportunityThirdLastUpdateOfCloseDatC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Third_Last_Update_Of_Close_Dat_c");
    private final static QName _OpportunityEmployeesTotal_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmployeesTotal");
    private final static QName _OpportunityPartyUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartyUniqueName");
    private final static QName _OpportunityLookupCategory_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LookupCategory");
    private final static QName _OpportunityConsumerFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConsumerFirstName");
    private final static QName _OpportunityOptyLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyLastUpdateDate");
    private final static QName _OpportunityPrSrcNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrSrcNumber");
    private final static QName _OpportunityExtnAttributeChar005_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExtnAttributeChar005");
    private final static QName _OpportunityKeyContactId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "KeyContactId");
    private final static QName _OpportunityReasonWonLostCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ReasonWonLostCode");
    private final static QName _OpportunitySalesMethodId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesMethodId");
    private final static QName _OpportunityState_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "State");
    private final static QName _OpportunityCurrentFyPotentialRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurrentFyPotentialRevenue");
    private final static QName _OpportunityPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PostalCode");
    private final static QName _OpportunityRcmndWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RcmndWinProb");
    private final static QName _OpportunityDealHorizonCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealHorizonCode");
    private final static QName _OpportunitySalesChannelCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesChannelCd");
    private final static QName _OpportunitySalesAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesAccountId");
    private final static QName _OpportunityLineOfBusinessCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LineOfBusinessCode");
    private final static QName _OpportunityOptyLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyLastUpdatedBy");
    private final static QName _OpportunityStageStatusCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StageStatusCd");
    private final static QName _OpportunityDescription_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Description");
    private final static QName _OpportunityDownsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DownsideAmount");
    private final static QName _OpportunityExpectAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExpectAmount");
    private final static QName _OpportunityMaximumDaysInStage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MaximumDaysInStage");
    private final static QName _OpportunityBudgetAvailableDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BudgetAvailableDate");
    private final static QName _OpportunityOpportunityTypeTestC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityTypeTest_c");
    private final static QName _OpportunityCity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "City");
    private final static QName _OpportunityPhonePreferenceExistsFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PhonePreferenceExistsFlag");
    private final static QName _OpportunityRevnLineSetEnabledFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevnLineSetEnabledFlag");
    private final static QName _OpportunityOpportunityTypeTestCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityTypeTest_cMeaning");
    private final static QName _OpportunityPrimaryContactLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactLastName");
    private final static QName _OpportunityOptyCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyCreatedBy");
    private final static QName _TransientAppointmentPartyName1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyName1");
    private final static QName _TransientAppointmentRecurExceptionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurExceptionFlag");
    private final static QName _TransientAppointmentPlannedDurationUOMCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationUOMCd");
    private final static QName _TransientAppointmentOwnerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerId");
    private final static QName _TransientAppointmentActivityLocationTxt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityLocationTxt");
    private final static QName _TransientAppointmentRecurOrigInstDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurOrigInstDt");
    private final static QName _TransientAppointmentRecurFreqNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFreqNumber");
    private final static QName _TransientAppointmentAllDayFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AllDayFlag");
    private final static QName _TransientAppointmentAsgnDenormFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnDenormFlag");
    private final static QName _TransientAppointmentSourceObjectId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectId");
    private final static QName _TransientAppointmentRecurSunFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurSunFlag");
    private final static QName _TransientAppointmentRecurMonth_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurMonth");
    private final static QName _TransientAppointmentRecurApptId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurApptId");
    private final static QName _TransientAppointmentAsgnSystemFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnSystemFlag");
    private final static QName _TransientAppointmentPlannedEndDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedEndDt");
    private final static QName _TransientAppointmentRecurSatFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurSatFlag");
    private final static QName _TransientAppointmentConflictId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ConflictId");
    private final static QName _TransientAppointmentCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CreationDate");
    private final static QName _TransientAppointmentResponse_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "Response");
    private final static QName _TransientAppointmentLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdateLogin");
    private final static QName _TransientAppointmentActivityDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityDescription");
    private final static QName _TransientAppointmentShowTimeAs_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ShowTimeAs");
    private final static QName _TransientAppointmentOwner_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "Owner");
    private final static QName _TransientAppointmentRecurWeekDayCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurWeekDayCd");
    private final static QName _TransientAppointmentRecurPattern_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurPattern");
    private final static QName _TransientAppointmentVisibilityCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "VisibilityCd");
    private final static QName _TransientAppointmentCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CreatedBy");
    private final static QName _TransientAppointmentRecurTueFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurTueFlag");
    private final static QName _TransientAppointmentRecurThuFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurThuFlag");
    private final static QName _TransientAppointmentRecurEndDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurEndDt");
    private final static QName _TransientAppointmentAlarmFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AlarmFlag");
    private final static QName _TransientAppointmentRecurTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurTypeCd");
    private final static QName _TransientAppointmentAsgnManualFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnManualFlag");
    private final static QName _TransientAppointmentRecurFriFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFriFlag");
    private final static QName _TransientAppointmentRecurWedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurWedFlag");
    private final static QName _TransientAppointmentRecurReplaceCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurReplaceCd");
    private final static QName _TransientAppointmentRecurMonFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurMonFlag");
    private final static QName _TransientAppointmentCategoryCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CategoryCd");
    private final static QName _TransientAppointmentLockAsgnFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LockAsgnFlag");
    private final static QName _TransientAppointmentLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdateDate");
    private final static QName _TransientAppointmentCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CustomerId");
    private final static QName _TransientAppointmentApptAlarmTmMinimumNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ApptAlarmTmMinimumNumber");
    private final static QName _TransientAppointmentTemplateFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "TemplateFlag");
    private final static QName _TransientAppointmentPlannedDurationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationNumber");
    private final static QName _TransientAppointmentRecurOccursNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurOccursNumber");
    private final static QName _TransientAppointmentRecurFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFlag");
    private final static QName _TransientAppointmentObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ObjectVersionNumber");
    private final static QName _TransientAppointmentDoNotRouteFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "DoNotRouteFlag");
    private final static QName _TransientAppointmentTemplateId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "TemplateId");
    private final static QName _TransientAppointmentCustomerName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CustomerName");
    private final static QName _TransientAppointmentPlannedStartDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedStartDt");
    private final static QName _TransientAppointmentLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdatedBy");
    private final static QName _TransientAppointmentReferenceCustomerName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ReferenceCustomerName");
    private final static QName _TransientAppointmentPartyId1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyId1");
    private final static QName _TransientAppointmentActivityName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityName");
    private final static QName _TransientAppointmentSourceObjectCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectCd");
    private final static QName _TransientAppointmentReferenceCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ReferenceCustomerId");
    private final static QName _TransientAppointmentRecurDay_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurDay");
    private final static QName _TransientAppointmentEditMode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "EditMode");
    private final static QName _TransientAppointmentCategoryCodeTransient_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CategoryCodeTransient");
    private final static QName _TransientAppointmentOwnerRsrcOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerRsrcOrgId");
    private final static QName _OpportunityCompetitorThreatLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ThreatLevelCode");
    private final static QName _OpportunityCompetitorRevnAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevnAmount");
    private final static QName _OpportunityCompetitorPrimaryFlg_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryFlg");
    private final static QName _OpportunityCompetitorAnnualRevenueAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AnnualRevenueAmount");
    private final static QName _RevenuePartnerDealType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealType");
    private final static QName _RevenuePartnerRevnPartnerNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnPartnerNumber");
    private final static QName _RevenuePartnerPartTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartTypeCd");
    private final static QName _RevenuePartnerDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealExpirationDate");
    private final static QName _RevenuePartnerDealEstCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealEstCloseDate");
    private final static QName _RevenuePartnerPrPartResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrPartResourcePartyId");
    private final static QName _RevenuePartnerPartProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartProgramId");
    private final static QName _RevenuePartnerLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "LastUpdatedBy");
    private final static QName _RevenuePartnerRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RegistrationNumber");
    private final static QName _DeleteErrorErrorMessage_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ErrorMessage");
    private final static QName _DeleteErrorProgramName_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ProgramName");
    private final static QName _DeleteErrorErrorCode_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ErrorCode");
    private final static QName _DeleteErrorDeleteErrorType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteErrorType");
    private final static QName _RevenueItemNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ItemNumber");
    private final static QName _RevenueSalesChannelCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesChannelCd");
    private final static QName _RevenueCrmCurcyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCurcyCode");
    private final static QName _RevenuePrPartOrgPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrPartOrgPartyId");
    private final static QName _RevenueRevnCategoryCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnCategoryCode");
    private final static QName _RevenueParentRevnId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ParentRevnId");
    private final static QName _RevenueRevnCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnCreationDate");
    private final static QName _RevenueDescription_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "Description");
    private final static QName _RevenueActualCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ActualCloseDate");
    private final static QName _RevenueCrmConversionRateType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRateType");
    private final static QName _RevenueNqSplitAllocTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "NqSplitAllocTypeCode");
    private final static QName _RevenueRevnLineTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnLineTypeCode");
    private final static QName _RevenuePartEngagementTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartEngagementTypeCd");
    private final static QName _RevenueRecurUpsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurUpsideAmount");
    private final static QName _RevenueRecurUnitPrice_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurUnitPrice");
    private final static QName _RevenueCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRate");
    private final static QName _RevenueRecurDownsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurDownsideAmount");
    private final static QName _RevenueSalesAccountUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesAccountUniqueName");
    private final static QName _RevenueOptyLeadId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OptyLeadId");
    private final static QName _RevenueRevnSequenceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnSequenceNumber");
    private final static QName _RevenueAttachmentEntityName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AttachmentEntityName");
    private final static QName _RevenueProductType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ProductType");
    private final static QName _RevenueRecurPeriodOrEndDateCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurPeriodOrEndDateCode");
    private final static QName _DeleteEntityDeleteDate_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteDate");
    private final static QName _DeleteEntityEntitySequenceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "EntitySequenceNumber");
    private final static QName _DeleteEntityPk2Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk2Value");
    private final static QName _DeleteEntityPk1Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk1Value");
    private final static QName _DeleteEntityPk5Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk5Value");
    private final static QName _DeleteEntityDeleteStatusType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteStatusType");
    private final static QName _DeleteEntityDeleteEntityType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteEntityType");
    private final static QName _DeleteEntityPk4Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk4Value");
    private final static QName _DeleteEntityPk3Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk3Value");
    private final static QName _OpportunityContactContactedFlg_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContactedFlg");
    private final static QName _OpportunityContactAffinityLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AffinityLvlCd");
    private final static QName _OpportunityContactSalesBuyingRoleCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesBuyingRoleCode");
    private final static QName _OpportunityContactEmailPreferenceExistsFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailPreferenceExistsFlag");
    private final static QName _OpportunityContactSalesInfluenceLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesInfluenceLevelCode");
    private final static QName _OpportunityContactFormattedMultilineAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedMultilineAddress");
    private final static QName _OpportunityContactPersonCentricJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonCentricJobTitle");
    private final static QName _OpportunityContactSalesAffinityCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesAffinityCode");
    private final static QName _OpportunityContactJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobTitle");
    private final static QName _OpportunityContactPreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PreferredContactMethod");
    private final static QName _OpportunityContactRawPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RawPhoneNumber");
    private final static QName _OpportunityContactInfluenceLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "InfluenceLvlCd");
    private final static QName _OpportunityContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RelationshipId");
    private final static QName _OpportunityContactRoleCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RoleCd");
    private final static QName _OpportunityContactDoNotContactFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DoNotContactFlag");
    private final static QName _TransientNoteNoteTxt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteTxt");
    private final static QName _TransientNoteNoteTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteTypeCode");
    private final static QName _TransientNoteNoteId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteId");
    private final static QName _TransientNoteSourceObjectCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectCode");
    private final static QName _TransientNoteVisibilityCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "VisibilityCode");
    private final static QName _TransientContactActivityContactId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityContactId");
    private final static QName _TransientContactPersonTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonTitle");
    private final static QName _TransientContactPersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonLastName");
    private final static QName _TransientContactContactId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ContactId");
    private final static QName _TransientContactPersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonFirstName");
    private final static QName _TransientContactContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ContactRelationshipId");
    private final static QName _TransientContactPartyType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyType");
    private final static QName _TransientContactPersonMiddleName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonMiddleName");
    private final static QName _OpportunityLeadPrDealPartOrgPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrDealPartOrgPartyId");
    private final static QName _OpportunityLeadRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RegistrationNumber");
    private final static QName _OpportunityLeadPartnerTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartnerTypeCd");
    private final static QName _OpportunityLeadDealPartProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealPartProgramId");
    private final static QName _OpportunityLeadPrDealPartResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrDealPartResourcePartyId");
    private final static QName _OpportunityLeadDealEstimatedCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealEstimatedCloseDate");
    private final static QName _OpportunityLeadDealType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealType");
    private final static QName _TransientCategoryActivityCategoryId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityCategoryId");
    private final static QName _OpportunityReferenceCustomerContactRelationId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CustomerContactRelationId");
    private final static QName _OpportunityReferenceComments1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments1");
    private final static QName _OpportunityReferenceDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DUNSNumberC");
    private final static QName _OpportunityReferenceIntContactPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "IntContactPartyId");
    private final static QName _OpportunityReferenceReferenceRankNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ReferenceRankNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.pts.opp.wsclient.generated
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link DeleteOpportunityContactAsync }
     * 
     */
    public DeleteOpportunityContactAsync createDeleteOpportunityContactAsync() {
        return new DeleteOpportunityContactAsync();
    }

    /**
     * Create an instance of {@link OpportunityContact }
     * 
     */
    public OpportunityContact createOpportunityContact() {
        return new OpportunityContact();
    }

    /**
     * Create an instance of {@link FindOpportunity }
     * 
     */
    public FindOpportunity createFindOpportunity() {
        return new FindOpportunity();
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
     * Create an instance of {@link GetOpportunityResponse }
     * 
     */
    public GetOpportunityResponse createGetOpportunityResponse() {
        return new GetOpportunityResponse();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponseAsync }
     * 
     */
    public DeleteOpportunityMktResponseAsync createDeleteOpportunityMktResponseAsync() {
        return new DeleteOpportunityMktResponseAsync();
    }

    /**
     * Create an instance of {@link OpportunityResponse }
     * 
     */
    public OpportunityResponse createOpportunityResponse() {
        return new OpportunityResponse();
    }

    /**
     * Create an instance of {@link CheckConstraintAsync }
     * 
     */
    public CheckConstraintAsync createCheckConstraintAsync() {
        return new CheckConstraintAsync();
    }

    /**
     * Create an instance of {@link DeleteEntity }
     * 
     */
    public DeleteEntity createDeleteEntity() {
        return new DeleteEntity();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunityAsync }
     * 
     */
    public IsSalesAccountUsedInOpportunityAsync createIsSalesAccountUsedInOpportunityAsync() {
        return new IsSalesAccountUsedInOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLead }
     * 
     */
    public DeleteOpportunityLead createDeleteOpportunityLead() {
        return new DeleteOpportunityLead();
    }

    /**
     * Create an instance of {@link OpportunityLead }
     * 
     */
    public OpportunityLead createOpportunityLead() {
        return new OpportunityLead();
    }

    /**
     * Create an instance of {@link DeleteOpportunityContact }
     * 
     */
    public DeleteOpportunityContact createDeleteOpportunityContact() {
        return new DeleteOpportunityContact();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronouslyResponse }
     * 
     */
    public DoAutoAssignmentAsynchronouslyResponse createDoAutoAssignmentAsynchronouslyResponse() {
        return new DoAutoAssignmentAsynchronouslyResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenueResponse }
     * 
     */
    public DeleteOpportunityRevenueResponse createDeleteOpportunityRevenueResponse() {
        return new DeleteOpportunityRevenueResponse();
    }

    /**
     * Create an instance of {@link MergeOpportunityAsync }
     * 
     */
    public MergeOpportunityAsync createMergeOpportunityAsync() {
        return new MergeOpportunityAsync();
    }

    /**
     * Create an instance of {@link FindOpportunityAsyncResponse }
     * 
     */
    public FindOpportunityAsyncResponse createFindOpportunityAsyncResponse() {
        return new FindOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunityAsyncResponse }
     * 
     */
    public IsSalesAccountUsedInOpportunityAsyncResponse createIsSalesAccountUsedInOpportunityAsyncResponse() {
        return new IsSalesAccountUsedInOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link CheckConstraint }
     * 
     */
    public CheckConstraint createCheckConstraint() {
        return new CheckConstraint();
    }

    /**
     * Create an instance of {@link CreateOpportunityAsyncResponse }
     * 
     */
    public CreateOpportunityAsyncResponse createCreateOpportunityAsyncResponse() {
        return new CreateOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunityAsync }
     * 
     */
    public ProcessCSOpportunityAsync createProcessCSOpportunityAsync() {
        return new ProcessCSOpportunityAsync();
    }

    /**
     * Create an instance of {@link ProcessData }
     * 
     */
    public ProcessData createProcessData() {
        return new ProcessData();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenueAsyncResponse }
     * 
     */
    public DeleteOpportunityRevenueAsyncResponse createDeleteOpportunityRevenueAsyncResponse() {
        return new DeleteOpportunityRevenueAsyncResponse();
    }

    /**
     * Create an instance of {@link GetOpportunity }
     * 
     */
    public GetOpportunity createGetOpportunity() {
        return new GetOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReference }
     * 
     */
    public DeleteOpportunityReference createDeleteOpportunityReference() {
        return new DeleteOpportunityReference();
    }

    /**
     * Create an instance of {@link OpportunityReference }
     * 
     */
    public OpportunityReference createOpportunityReference() {
        return new OpportunityReference();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponseResponse }
     * 
     */
    public DeleteOpportunityMktResponseResponse createDeleteOpportunityMktResponseResponse() {
        return new DeleteOpportunityMktResponseResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLeadAsync }
     * 
     */
    public DeleteOpportunityLeadAsync createDeleteOpportunityLeadAsync() {
        return new DeleteOpportunityLeadAsync();
    }

    /**
     * Create an instance of {@link ProcessOpportunityAsyncResponse }
     * 
     */
    public ProcessOpportunityAsyncResponse createProcessOpportunityAsyncResponse() {
        return new ProcessOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponseAsyncResponse }
     * 
     */
    public DeleteOpportunityMktResponseAsyncResponse createDeleteOpportunityMktResponseAsyncResponse() {
        return new DeleteOpportunityMktResponseAsyncResponse();
    }

    /**
     * Create an instance of {@link CheckConstraintResponse }
     * 
     */
    public CheckConstraintResponse createCheckConstraintResponse() {
        return new CheckConstraintResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityAsync }
     * 
     */
    public DeleteOpportunityAsync createDeleteOpportunityAsync() {
        return new DeleteOpportunityAsync();
    }

    /**
     * Create an instance of {@link GetEntityListAsync }
     * 
     */
    public GetEntityListAsync createGetEntityListAsync() {
        return new GetEntityListAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunity }
     * 
     */
    public DeleteOpportunity createDeleteOpportunity() {
        return new DeleteOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitorResponse }
     * 
     */
    public DeleteOpportunityCompetitorResponse createDeleteOpportunityCompetitorResponse() {
        return new DeleteOpportunityCompetitorResponse();
    }

    /**
     * Create an instance of {@link FindOpportunityResponse }
     * 
     */
    public FindOpportunityResponse createFindOpportunityResponse() {
        return new FindOpportunityResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitorAsyncResponse }
     * 
     */
    public DeleteOpportunityCompetitorAsyncResponse createDeleteOpportunityCompetitorAsyncResponse() {
        return new DeleteOpportunityCompetitorAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLeadAsyncResponse }
     * 
     */
    public DeleteOpportunityLeadAsyncResponse createDeleteOpportunityLeadAsyncResponse() {
        return new DeleteOpportunityLeadAsyncResponse();
    }

    /**
     * Create an instance of {@link MergeOpportunity }
     * 
     */
    public MergeOpportunity createMergeOpportunity() {
        return new MergeOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponse }
     * 
     */
    public DeleteOpportunityMktResponse createDeleteOpportunityMktResponse() {
        return new DeleteOpportunityMktResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsync }
     * 
     */
    public GetDfltObjAttrHintsAsync createGetDfltObjAttrHintsAsync() {
        return new GetDfltObjAttrHintsAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitor }
     * 
     */
    public DeleteOpportunityCompetitor createDeleteOpportunityCompetitor() {
        return new DeleteOpportunityCompetitor();
    }

    /**
     * Create an instance of {@link OpportunityCompetitor }
     * 
     */
    public OpportunityCompetitor createOpportunityCompetitor() {
        return new OpportunityCompetitor();
    }

    /**
     * Create an instance of {@link UpdateOpportunityAsync }
     * 
     */
    public UpdateOpportunityAsync createUpdateOpportunityAsync() {
        return new UpdateOpportunityAsync();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunity }
     * 
     */
    public ProcessCSOpportunity createProcessCSOpportunity() {
        return new ProcessCSOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySourceResponse }
     * 
     */
    public DeleteOpportunitySourceResponse createDeleteOpportunitySourceResponse() {
        return new DeleteOpportunitySourceResponse();
    }

    /**
     * Create an instance of {@link GetEntityListResponse }
     * 
     */
    public GetEntityListResponse createGetEntityListResponse() {
        return new GetEntityListResponse();
    }

    /**
     * Create an instance of {@link ServiceViewInfo }
     * 
     */
    public ServiceViewInfo createServiceViewInfo() {
        return new ServiceViewInfo();
    }

    /**
     * Create an instance of {@link UpdateOpportunityAsyncResponse }
     * 
     */
    public UpdateOpportunityAsyncResponse createUpdateOpportunityAsyncResponse() {
        return new UpdateOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySource }
     * 
     */
    public DeleteOpportunitySource createDeleteOpportunitySource() {
        return new DeleteOpportunitySource();
    }

    /**
     * Create an instance of {@link OpportunitySource }
     * 
     */
    public OpportunitySource createOpportunitySource() {
        return new OpportunitySource();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsyncResponse }
     * 
     */
    public GetServiceLastUpdateTimeAsyncResponse createGetServiceLastUpdateTimeAsyncResponse() {
        return new GetServiceLastUpdateTimeAsyncResponse();
    }

    /**
     * Create an instance of {@link CreateOpportunity }
     * 
     */
    public CreateOpportunity createCreateOpportunity() {
        return new CreateOpportunity();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsResponse }
     * 
     */
    public GetDfltObjAttrHintsResponse createGetDfltObjAttrHintsResponse() {
        return new GetDfltObjAttrHintsResponse();
    }

    /**
     * Create an instance of {@link ObjAttrHints }
     * 
     */
    public ObjAttrHints createObjAttrHints() {
        return new ObjAttrHints();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySourceAsyncResponse }
     * 
     */
    public DeleteOpportunitySourceAsyncResponse createDeleteOpportunitySourceAsyncResponse() {
        return new DeleteOpportunitySourceAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityAsyncResponse }
     * 
     */
    public DeleteOpportunityAsyncResponse createDeleteOpportunityAsyncResponse() {
        return new DeleteOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReferenceResponse }
     * 
     */
    public DeleteOpportunityReferenceResponse createDeleteOpportunityReferenceResponse() {
        return new DeleteOpportunityReferenceResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTime }
     * 
     */
    public GetServiceLastUpdateTime createGetServiceLastUpdateTime() {
        return new GetServiceLastUpdateTime();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResource }
     * 
     */
    public DeleteOpportunityResource createDeleteOpportunityResource() {
        return new DeleteOpportunityResource();
    }

    /**
     * Create an instance of {@link OpportunityResource }
     * 
     */
    public OpportunityResource createOpportunityResource() {
        return new OpportunityResource();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsync }
     * 
     */
    public GetServiceLastUpdateTimeAsync createGetServiceLastUpdateTimeAsync() {
        return new GetServiceLastUpdateTimeAsync();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronouslyAsyncResponse }
     * 
     */
    public DoAutoAssignmentAsynchronouslyAsyncResponse createDoAutoAssignmentAsynchronouslyAsyncResponse() {
        return new DoAutoAssignmentAsynchronouslyAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResourceResponse }
     * 
     */
    public DeleteOpportunityResourceResponse createDeleteOpportunityResourceResponse() {
        return new DeleteOpportunityResourceResponse();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunityResponse }
     * 
     */
    public IsSalesAccountUsedInOpportunityResponse createIsSalesAccountUsedInOpportunityResponse() {
        return new IsSalesAccountUsedInOpportunityResponse();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronouslyAsync }
     * 
     */
    public DoAutoAssignmentAsynchronouslyAsync createDoAutoAssignmentAsynchronouslyAsync() {
        return new DoAutoAssignmentAsynchronouslyAsync();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunityAsyncResponse }
     * 
     */
    public ProcessCSOpportunityAsyncResponse createProcessCSOpportunityAsyncResponse() {
        return new ProcessCSOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link UpdateOpportunity }
     * 
     */
    public UpdateOpportunity createUpdateOpportunity() {
        return new UpdateOpportunity();
    }

    /**
     * Create an instance of {@link GetEntityListAsyncResponse }
     * 
     */
    public GetEntityListAsyncResponse createGetEntityListAsyncResponse() {
        return new GetEntityListAsyncResponse();
    }

    /**
     * Create an instance of {@link MergeOpportunityAsyncResponse }
     * 
     */
    public MergeOpportunityAsyncResponse createMergeOpportunityAsyncResponse() {
        return new MergeOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link CreateOpportunityResponse }
     * 
     */
    public CreateOpportunityResponse createCreateOpportunityResponse() {
        return new CreateOpportunityResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitorAsync }
     * 
     */
    public DeleteOpportunityCompetitorAsync createDeleteOpportunityCompetitorAsync() {
        return new DeleteOpportunityCompetitorAsync();
    }

    /**
     * Create an instance of {@link FindOpportunityAsync }
     * 
     */
    public FindOpportunityAsync createFindOpportunityAsync() {
        return new FindOpportunityAsync();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHints }
     * 
     */
    public GetDfltObjAttrHints createGetDfltObjAttrHints() {
        return new GetDfltObjAttrHints();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenueAsync }
     * 
     */
    public DeleteOpportunityRevenueAsync createDeleteOpportunityRevenueAsync() {
        return new DeleteOpportunityRevenueAsync();
    }

    /**
     * Create an instance of {@link Revenue }
     * 
     */
    public Revenue createRevenue() {
        return new Revenue();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsyncResponse }
     * 
     */
    public GetDfltObjAttrHintsAsyncResponse createGetDfltObjAttrHintsAsyncResponse() {
        return new GetDfltObjAttrHintsAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLeadResponse }
     * 
     */
    public DeleteOpportunityLeadResponse createDeleteOpportunityLeadResponse() {
        return new DeleteOpportunityLeadResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResourceAsync }
     * 
     */
    public DeleteOpportunityResourceAsync createDeleteOpportunityResourceAsync() {
        return new DeleteOpportunityResourceAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResponse }
     * 
     */
    public DeleteOpportunityResponse createDeleteOpportunityResponse() {
        return new DeleteOpportunityResponse();
    }

    /**
     * Create an instance of {@link CreateOpportunityAsync }
     * 
     */
    public CreateOpportunityAsync createCreateOpportunityAsync() {
        return new CreateOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenue }
     * 
     */
    public DeleteOpportunityRevenue createDeleteOpportunityRevenue() {
        return new DeleteOpportunityRevenue();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronously }
     * 
     */
    public DoAutoAssignmentAsynchronously createDoAutoAssignmentAsynchronously() {
        return new DoAutoAssignmentAsynchronously();
    }

    /**
     * Create an instance of {@link ProcessOpportunity }
     * 
     */
    public ProcessOpportunity createProcessOpportunity() {
        return new ProcessOpportunity();
    }

    /**
     * Create an instance of {@link ProcessOpportunityAsync }
     * 
     */
    public ProcessOpportunityAsync createProcessOpportunityAsync() {
        return new ProcessOpportunityAsync();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunity }
     * 
     */
    public IsSalesAccountUsedInOpportunity createIsSalesAccountUsedInOpportunity() {
        return new IsSalesAccountUsedInOpportunity();
    }

    /**
     * Create an instance of {@link GetEntityList }
     * 
     */
    public GetEntityList createGetEntityList() {
        return new GetEntityList();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResourceAsyncResponse }
     * 
     */
    public DeleteOpportunityResourceAsyncResponse createDeleteOpportunityResourceAsyncResponse() {
        return new DeleteOpportunityResourceAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySourceAsync }
     * 
     */
    public DeleteOpportunitySourceAsync createDeleteOpportunitySourceAsync() {
        return new DeleteOpportunitySourceAsync();
    }

    /**
     * Create an instance of {@link ProcessOpportunityResponse }
     * 
     */
    public ProcessOpportunityResponse createProcessOpportunityResponse() {
        return new ProcessOpportunityResponse();
    }

    /**
     * Create an instance of {@link GetOpportunityAsyncResponse }
     * 
     */
    public GetOpportunityAsyncResponse createGetOpportunityAsyncResponse() {
        return new GetOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link UpdateOpportunityResponse }
     * 
     */
    public UpdateOpportunityResponse createUpdateOpportunityResponse() {
        return new UpdateOpportunityResponse();
    }

    /**
     * Create an instance of {@link MergeOpportunityResponse }
     * 
     */
    public MergeOpportunityResponse createMergeOpportunityResponse() {
        return new MergeOpportunityResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReferenceAsyncResponse }
     * 
     */
    public DeleteOpportunityReferenceAsyncResponse createDeleteOpportunityReferenceAsyncResponse() {
        return new DeleteOpportunityReferenceAsyncResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeResponse }
     * 
     */
    public GetServiceLastUpdateTimeResponse createGetServiceLastUpdateTimeResponse() {
        return new GetServiceLastUpdateTimeResponse();
    }

    /**
     * Create an instance of {@link CheckConstraintAsyncResponse }
     * 
     */
    public CheckConstraintAsyncResponse createCheckConstraintAsyncResponse() {
        return new CheckConstraintAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReferenceAsync }
     * 
     */
    public DeleteOpportunityReferenceAsync createDeleteOpportunityReferenceAsync() {
        return new DeleteOpportunityReferenceAsync();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunityResponse }
     * 
     */
    public ProcessCSOpportunityResponse createProcessCSOpportunityResponse() {
        return new ProcessCSOpportunityResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityContactAsyncResponse }
     * 
     */
    public DeleteOpportunityContactAsyncResponse createDeleteOpportunityContactAsyncResponse() {
        return new DeleteOpportunityContactAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityContactResponse }
     * 
     */
    public DeleteOpportunityContactResponse createDeleteOpportunityContactResponse() {
        return new DeleteOpportunityContactResponse();
    }

    /**
     * Create an instance of {@link GetOpportunityAsync }
     * 
     */
    public GetOpportunityAsync createGetOpportunityAsync() {
        return new GetOpportunityAsync();
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
     * Create an instance of {@link DataObjectResult }
     * 
     */
    public DataObjectResult createDataObjectResult() {
        return new DataObjectResult();
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
     * Create an instance of {@link MethodResult }
     * 
     */
    public MethodResult createMethodResult() {
        return new MethodResult();
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
     * Create an instance of {@link XMLInfo }
     * 
     */
    public XMLInfo createXMLInfo() {
        return new XMLInfo();
    }

    /**
     * Create an instance of {@link RevenueTerritory }
     * 
     */
    public RevenueTerritory createRevenueTerritory() {
        return new RevenueTerritory();
    }

    /**
     * Create an instance of {@link SplitRevenue }
     * 
     */
    public SplitRevenue createSplitRevenue() {
        return new SplitRevenue();
    }

    /**
     * Create an instance of {@link RecurringRevenue }
     * 
     */
    public RecurringRevenue createRecurringRevenue() {
        return new RecurringRevenue();
    }

    /**
     * Create an instance of {@link RevenuePartner }
     * 
     */
    public RevenuePartner createRevenuePartner() {
        return new RevenuePartner();
    }

    /**
     * Create an instance of {@link DeleteError }
     * 
     */
    public DeleteError createDeleteError() {
        return new DeleteError();
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
     * Create an instance of {@link RevenueLineSet }
     * 
     */
    public RevenueLineSet createRevenueLineSet() {
        return new RevenueLineSet();
    }

    /**
     * Create an instance of {@link CategorySummaryRevenue }
     * 
     */
    public CategorySummaryRevenue createCategorySummaryRevenue() {
        return new CategorySummaryRevenue();
    }

    /**
     * Create an instance of {@link TransientCategory }
     * 
     */
    public TransientCategory createTransientCategory() {
        return new TransientCategory();
    }

    /**
     * Create an instance of {@link TransientNote }
     * 
     */
    public TransientNote createTransientNote() {
        return new TransientNote();
    }

    /**
     * Create an instance of {@link TransientAppointment }
     * 
     */
    public TransientAppointment createTransientAppointment() {
        return new TransientAppointment();
    }

    /**
     * Create an instance of {@link TransientAssignee }
     * 
     */
    public TransientAssignee createTransientAssignee() {
        return new TransientAssignee();
    }

    /**
     * Create an instance of {@link TransientContact }
     * 
     */
    public TransientContact createTransientContact() {
        return new TransientContact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueTerritory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenueTerritory")
    public JAXBElement<RevenueTerritory> createRevenueTerritory(RevenueTerritory value) {
        return new JAXBElement<RevenueTerritory>(_RevenueTerritory_QNAME, RevenueTerritory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityReference")
    public JAXBElement<OpportunityReference> createOpportunityReference(OpportunityReference value) {
        return new JAXBElement<OpportunityReference>(_OpportunityReference_QNAME, OpportunityReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "recurringRevenue")
    public JAXBElement<RecurringRevenue> createRecurringRevenue(RecurringRevenue value) {
        return new JAXBElement<RecurringRevenue>(_RecurringRevenue_QNAME, RecurringRevenue.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/errors/", name = "ServiceErrorMessage")
    public JAXBElement<ServiceErrorMessage> createServiceErrorMessage(ServiceErrorMessage value) {
        return new JAXBElement<ServiceErrorMessage>(_ServiceErrorMessage_QNAME, ServiceErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunitySource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunitySource")
    public JAXBElement<OpportunitySource> createOpportunitySource(OpportunitySource value) {
        return new JAXBElement<OpportunitySource>(_OpportunitySource_QNAME, OpportunitySource.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityLead")
    public JAXBElement<OpportunityLead> createOpportunityLead(OpportunityLead value) {
        return new JAXBElement<OpportunityLead>(_OpportunityLead_QNAME, OpportunityLead.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "deleteError")
    public JAXBElement<DeleteError> createDeleteError(DeleteError value) {
        return new JAXBElement<DeleteError>(_DeleteError_QNAME, DeleteError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityResponse")
    public JAXBElement<OpportunityResponse> createOpportunityResponse(OpportunityResponse value) {
        return new JAXBElement<OpportunityResponse>(_OpportunityResponse_QNAME, OpportunityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityCompetitor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityCompetitor")
    public JAXBElement<OpportunityCompetitor> createOpportunityCompetitor(OpportunityCompetitor value) {
        return new JAXBElement<OpportunityCompetitor>(_OpportunityCompetitor_QNAME, OpportunityCompetitor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueLineSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenueLineSet")
    public JAXBElement<RevenueLineSet> createRevenueLineSet(RevenueLineSet value) {
        return new JAXBElement<RevenueLineSet>(_RevenueLineSet_QNAME, RevenueLineSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "splitRevenue")
    public JAXBElement<SplitRevenue> createSplitRevenue(SplitRevenue value) {
        return new JAXBElement<SplitRevenue>(_SplitRevenue_QNAME, SplitRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "deleteEntity")
    public JAXBElement<DeleteEntity> createDeleteEntity(DeleteEntity value) {
        return new JAXBElement<DeleteEntity>(_DeleteEntity_QNAME, DeleteEntity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Opportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunity")
    public JAXBElement<Opportunity> createOpportunity(Opportunity value) {
        return new JAXBElement<Opportunity>(_Opportunity_QNAME, Opportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientAppointment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientAppointment")
    public JAXBElement<TransientAppointment> createTransientAppointment(TransientAppointment value) {
        return new JAXBElement<TransientAppointment>(_TransientAppointment_QNAME, TransientAppointment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityContact")
    public JAXBElement<OpportunityContact> createOpportunityContact(OpportunityContact value) {
        return new JAXBElement<OpportunityContact>(_OpportunityContact_QNAME, OpportunityContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Revenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenue")
    public JAXBElement<Revenue> createRevenue(Revenue value) {
        return new JAXBElement<Revenue>(_Revenue_QNAME, Revenue.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorySummaryRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "categorySummaryRevenue")
    public JAXBElement<CategorySummaryRevenue> createCategorySummaryRevenue(CategorySummaryRevenue value) {
        return new JAXBElement<CategorySummaryRevenue>(_CategorySummaryRevenue_QNAME, CategorySummaryRevenue.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientCategory")
    public JAXBElement<TransientCategory> createTransientCategory(TransientCategory value) {
        return new JAXBElement<TransientCategory>(_TransientCategory_QNAME, TransientCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientContact")
    public JAXBElement<TransientContact> createTransientContact(TransientContact value) {
        return new JAXBElement<TransientContact>(_TransientContact_QNAME, TransientContact.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientAssignee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientAssignee")
    public JAXBElement<TransientAssignee> createTransientAssignee(TransientAssignee value) {
        return new JAXBElement<TransientAssignee>(_TransientAssignee_QNAME, TransientAssignee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityResource")
    public JAXBElement<OpportunityResource> createOpportunityResource(OpportunityResource value) {
        return new JAXBElement<OpportunityResource>(_OpportunityResource_QNAME, OpportunityResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenuePartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenuePartner")
    public JAXBElement<RevenuePartner> createRevenuePartner(RevenuePartner value) {
        return new JAXBElement<RevenuePartner>(_RevenuePartner_QNAME, RevenuePartner.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientNote")
    public JAXBElement<TransientNote> createTransientNote(TransientNote value) {
        return new JAXBElement<TransientNote>(_TransientNote_QNAME, TransientNote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueSalesAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSalesAccountId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerLockAsgnFlag", scope = SplitRevenue.class)
    public JAXBElement<Boolean> createSplitRevenueOwnerLockAsgnFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueOwnerLockAsgnFlag_QNAME, Boolean.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UOMCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueUOMCode(String value) {
        return new JAXBElement<String>(_SplitRevenueUOMCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRate", scope = SplitRevenue.class)
    public JAXBElement<BigDecimal> createSplitRevenueConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueConversionRate_QNAME, BigDecimal.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CommitFlag", scope = SplitRevenue.class)
    public JAXBElement<Boolean> createSplitRevenueCommitFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueCommitFlag_QNAME, Boolean.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurFrequencyCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueRecurFrequencyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurFrequencyCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurTypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueRecurTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DownsideAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueDownsideAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueExpectAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealProtectedDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueOwnerDealProtectedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealProtectedDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Quantity", scope = SplitRevenue.class)
    public JAXBElement<MeasureType> createSplitRevenueQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueQuantity_QNAME, MeasureType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ResourcePartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueResourcePartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueResourcePartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueOwnerOrgTreeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRateType", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueConversionRateType(String value) {
        return new JAXBElement<String>(_SplitRevenueConversionRateType_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectDlvryDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueExpectDlvryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueExpectDlvryDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealExpirationDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueOwnerDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealExpirationDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitTypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueSplitTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSplitTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueProdGroupId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueProdGroupId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurParentRevnId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueRecurParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueRecurParentRevnId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryOrgId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryOrgId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitPercent", scope = SplitRevenue.class)
    public JAXBElement<BigDecimal> createSplitRevenueSplitPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueSplitPercent_QNAME, BigDecimal.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CloseReasonCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueCloseReasonCode(String value) {
        return new JAXBElement<String>(_SplitRevenueCloseReasonCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurQuantity", scope = SplitRevenue.class)
    public JAXBElement<MeasureType> createSplitRevenueRecurQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueRecurQuantity_QNAME, MeasureType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "WinProb", scope = SplitRevenue.class)
    public JAXBElement<BigDecimal> createSplitRevenueWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueWinProb_QNAME, BigDecimal.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryUpdatedById", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenuePrTerritoryUpdatedById(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryUpdatedById_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastOverrideCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueForecastOverrideCode(String value) {
        return new JAXBElement<String>(_SplitRevenueForecastOverrideCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeStructCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueOwnerOrgTreeStructCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeStructCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UpsideAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUpsideAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UnitPrice", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUnitPrice_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TargetPartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueTargetPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTargetPartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Comments", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueComments(String value) {
        return new JAXBElement<String>(_SplitRevenueComments_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrCmptPartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenuePrCmptPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrCmptPartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryItemId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueInventoryItemId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryItemId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCustomerAccountId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurRevnAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueRecurRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRecurRevnAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOptyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurEndDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueRecurEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurEndDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryVersionId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenuePrTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryVersionId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "MarginAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueMarginAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueMarginAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurNumberPeriods", scope = SplitRevenue.class)
    public JAXBElement<Integer> createSplitRevenueRecurNumberPeriods(Integer value) {
        return new JAXBElement<Integer>(_SplitRevenueRecurNumberPeriods_QNAME, Integer.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOwnerResourceOrgId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRevnAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueEffectiveDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurStartDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueRecurStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurStartDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CostAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueCostAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueCostAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AssignmentType", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueAssignmentType(String value) {
        return new JAXBElement<String>(_SplitRevenueAssignmentType_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CreditRcptPartOrgPartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueCreditRcptPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCreditRcptPartOrgPartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitParentRevnId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueSplitParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSplitParentRevnId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueStatusCode(String value) {
        return new JAXBElement<String>(_SplitRevenueStatusCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = SplitRevenue.class)
    public JAXBElement<Boolean> createSplitRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenuePrimaryFlag_QNAME, Boolean.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesCreditTypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueSalesCreditTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSalesCreditTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRevnAmountCurcyCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueBUOrgId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AssigneeId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeAssigneeId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeAssigneeId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityAssigneeId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeActivityAssigneeId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityAssigneeId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientAssignee.class)
    public JAXBElement<String> createTransientAssigneePartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAsCd", scope = TransientAssignee.class)
    public JAXBElement<String> createTransientAssigneeShowTimeAsCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeShowTimeAsCd_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerFlag", scope = TransientAssignee.class)
    public JAXBElement<Boolean> createTransientAssigneeOwnerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAssigneeOwnerFlag_QNAME, Boolean.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneePartyId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneePartyId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AppointmentResponseCd", scope = TransientAssignee.class, defaultValue = "NOT_RESPONDED")
    public JAXBElement<String> createTransientAssigneeAppointmentResponseCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeAppointmentResponseCd_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AssigneeRsrcOrgId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeAssigneeRsrcOrgId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeAssigneeRsrcOrgId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnLineTypeCode", scope = RevenueLineSet.class, defaultValue = "LINE_SET_REVN")
    public JAXBElement<String> createRevenueLineSetRevnLineTypeCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnLineTypeCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetOptyId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOptyId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetBUOrgId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetBUOrgId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnAmountCurcyCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetLastUpdateLogin(String value) {
        return new JAXBElement<String>(_RevenueLineSetLastUpdateLogin_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetStatusCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetStatusCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetCustomerAccountId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetOwnerResourceId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOwnerResourceId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeStructCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetOwnerOrgTreeStructCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetOwnerOrgTreeStructCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = RevenueLineSet.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueLineSetEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetEffectiveDate_QNAME, XMLGregorianCalendar.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerPartyId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetCustomerPartyId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetCustomerPartyId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetProdGroupId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetProdGroupId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = RevenueLineSet.class)
    public JAXBElement<AmountType> createRevenueLineSetRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueLineSetRevnAmount_QNAME, AmountType.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = RevenueLineSet.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueLineSetUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOwnerResourceOrgId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnSequenceNumber", scope = RevenueLineSet.class)
    public JAXBElement<Integer> createRevenueLineSetRevnSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_RevenueLineSetRevnSequenceNumber_QNAME, Integer.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetOwnerOrgTreeCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetOwnerOrgTreeCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetSalesAccountId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetSalesAccountId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnLineTypeCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueRevnLineTypeCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnLineTypeCode_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = CategorySummaryRevenue.class)
    public JAXBElement<Boolean> createCategorySummaryRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_CategorySummaryRevenuePrimaryFlag_QNAME, Boolean.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = CategorySummaryRevenue.class)
    public JAXBElement<Long> createCategorySummaryRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOptyId_QNAME, Long.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = CategorySummaryRevenue.class)
    public JAXBElement<Long> createCategorySummaryRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetBUOrgId_QNAME, Long.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnAmountCurcyCode_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmCategorySummaryRevenue", scope = CategorySummaryRevenue.class)
    public JAXBElement<BigDecimal> createCategorySummaryRevenueCrmCategorySummaryRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CategorySummaryRevenueCrmCategorySummaryRevenue_QNAME, BigDecimal.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_RevenueLineSetLastUpdateLogin_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRate", scope = CategorySummaryRevenue.class)
    public JAXBElement<BigDecimal> createCategorySummaryRevenueCrmConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CategorySummaryRevenueCrmConversionRate_QNAME, BigDecimal.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = CategorySummaryRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createCategorySummaryRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetEffectiveDate_QNAME, XMLGregorianCalendar.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRateType", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueCrmConversionRateType(String value) {
        return new JAXBElement<String>(_CategorySummaryRevenueCrmConversionRateType_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = CategorySummaryRevenue.class)
    public JAXBElement<AmountType> createCategorySummaryRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueLineSetRevnAmount_QNAME, AmountType.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = CategorySummaryRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createCategorySummaryRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnCategoryCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueRevnCategoryCode(String value) {
        return new JAXBElement<String>(_CategorySummaryRevenueRevnCategoryCode_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmCurcyCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueCrmCurcyCode(String value) {
        return new JAXBElement<String>(_CategorySummaryRevenueCrmCurcyCode_QNAME, String.class, CategorySummaryRevenue.class, value);
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastParticipationCode", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryForecastParticipationCode(String value) {
        return new JAXBElement<String>(_RevenueTerritoryForecastParticipationCode_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AssignmentType", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryAssignmentType(String value) {
        return new JAXBElement<String>(_SplitRevenueAssignmentType_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = RevenueTerritory.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueTerritoryUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TerritoryVersionId", scope = RevenueTerritory.class)
    public JAXBElement<Long> createRevenueTerritoryTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_RevenueTerritoryTerritoryVersionId_QNAME, Long.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OwnerFlag", scope = OpportunityResource.class)
    public JAXBElement<Boolean> createOpportunityResourceOwnerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityResourceOwnerFlag_QNAME, Boolean.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AsgnTerritoryVersionId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceAsgnTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceAsgnTerritoryVersionId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonFirstName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourcePersonFirstName(String value) {
        return new JAXBElement<String>(_OpportunityResourcePersonFirstName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RoleName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceRoleName(String value) {
        return new JAXBElement<String>(_OpportunityResourceRoleName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartnerOrgId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourcePartnerOrgId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourcePartnerOrgId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OrgTreeCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceOrgTreeCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceOrgTreeCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MemberFunctionCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceMemberFunctionCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceMemberFunctionCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealExpirationDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealExpirationDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealProtected", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceDealProtected(String value) {
        return new JAXBElement<String>(_OpportunityResourceDealProtected_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ResourceOrgId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceResourceOrgId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceResourceOrgId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OrgTreeStructureCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceOrgTreeStructureCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceOrgTreeStructureCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AccessLevelCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceAccessLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceAccessLevelCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MgrResourceId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceMgrResourceId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceMgrResourceId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LockAssignmentFlag", scope = OpportunityResource.class)
    public JAXBElement<Boolean> createOpportunityResourceLockAssignmentFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityResourceLockAssignmentFlag_QNAME, Boolean.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedPhoneNumber", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityResourceFormattedPhoneNumber_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealProtectedDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceDealProtectedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealProtectedDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AssignmentType", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceAssignmentType(String value) {
        return new JAXBElement<String>(_OpportunityResourceAssignmentType_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonLastName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourcePersonLastName(String value) {
        return new JAXBElement<String>(_OpportunityResourcePersonLastName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurQuantity", scope = RecurringRevenue.class)
    public JAXBElement<MeasureType> createRecurringRevenueRecurQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueRecurQuantity_QNAME, MeasureType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "WinProb", scope = RecurringRevenue.class)
    public JAXBElement<BigDecimal> createRecurringRevenueWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueWinProb_QNAME, BigDecimal.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueSalesAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSalesAccountId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UOMCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueUOMCode(String value) {
        return new JAXBElement<String>(_SplitRevenueUOMCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRate", scope = RecurringRevenue.class)
    public JAXBElement<BigDecimal> createRecurringRevenueConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueConversionRate_QNAME, BigDecimal.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastOverrideCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueForecastOverrideCode(String value) {
        return new JAXBElement<String>(_SplitRevenueForecastOverrideCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UpsideAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUpsideAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UnitPrice", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUnitPrice_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TargetPartyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueTargetPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTargetPartyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurTypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueRecurTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurFrequencyCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueRecurFrequencyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurFrequencyCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CommitFlag", scope = RecurringRevenue.class)
    public JAXBElement<Boolean> createRecurringRevenueCommitFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueCommitFlag_QNAME, Boolean.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrCmptPartyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenuePrCmptPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrCmptPartyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueExpectAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DownsideAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueDownsideAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Comments", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueComments(String value) {
        return new JAXBElement<String>(_SplitRevenueComments_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCustomerAccountId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryItemId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueInventoryItemId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryItemId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Quantity", scope = RecurringRevenue.class)
    public JAXBElement<MeasureType> createRecurringRevenueQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueQuantity_QNAME, MeasureType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ResourcePartyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueResourcePartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueResourcePartyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurRevnAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueRecurRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRecurRevnAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurEndDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueRecurEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurEndDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOptyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRateType", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueConversionRateType(String value) {
        return new JAXBElement<String>(_SplitRevenueConversionRateType_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "MarginAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueMarginAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueMarginAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectDlvryDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueExpectDlvryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueExpectDlvryDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurNumberPeriods", scope = RecurringRevenue.class)
    public JAXBElement<Integer> createRecurringRevenueRecurNumberPeriods(Integer value) {
        return new JAXBElement<Integer>(_SplitRevenueRecurNumberPeriods_QNAME, Integer.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOwnerResourceOrgId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRevnAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitTypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueSplitTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSplitTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurStartDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueRecurStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurStartDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueEffectiveDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueProdGroupId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueProdGroupId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CostAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueCostAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueCostAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueStatusCode(String value) {
        return new JAXBElement<String>(_SplitRevenueStatusCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitParentRevnId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueSplitParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSplitParentRevnId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurParentRevnId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueRecurParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueRecurParentRevnId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryOrgId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryOrgId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = RecurringRevenue.class)
    public JAXBElement<Boolean> createRecurringRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenuePrimaryFlag_QNAME, Boolean.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitPercent", scope = RecurringRevenue.class)
    public JAXBElement<BigDecimal> createRecurringRevenueSplitPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueSplitPercent_QNAME, BigDecimal.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesCreditTypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueSalesCreditTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSalesCreditTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueBUOrgId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRevnAmountCurcyCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityResponse.class)
    public JAXBElement<String> createOpportunityResponseLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityResponse.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResponseUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExtnAttributeTimestamp002", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityExtnAttributeTimestamp002(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityExtnAttributeTimestamp002_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExtnAttributeTimestamp001", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityExtnAttributeTimestamp001(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityExtnAttributeTimestamp001_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExtnAttributeTimestamp004", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityExtnAttributeTimestamp004(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityExtnAttributeTimestamp004_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExtnAttributeTimestamp003", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityExtnAttributeTimestamp003(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityExtnAttributeTimestamp003_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastAssignedTimestamp", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLastAssignedTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLastAssignedTimestamp_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityType1_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityType1C(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityType1C_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Second_Last_Update_Of_Close_Da_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunitySecondLastUpdateOfCloseDaC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunitySecondLastUpdateOfCloseDaC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DUNSNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDUNSNumber(String value) {
        return new JAXBElement<String>(_OpportunityDUNSNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConsumerLastName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConsumerLastName(String value) {
        return new JAXBElement<String>(_OpportunityConsumerLastName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DecisionLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDecisionLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityDecisionLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountUniqueName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_OpportunitySalesAccountUniqueName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DescriptionText", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDescriptionText(String value) {
        return new JAXBElement<String>(_OpportunityDescriptionText_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesMethod", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesMethod(String value) {
        return new JAXBElement<String>(_OpportunitySalesMethod_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryCompetitorId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryCompetitorId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryCompetitorId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CrmRevenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCrmRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCrmRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StatusCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStatusCode(String value) {
        return new JAXBElement<String>(_OpportunityStatusCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesStageId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesStageId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesStageId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityEffectiveDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PreferredFunctionalCurrency", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_OpportunityPreferredFunctionalCurrency_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryRevenueId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryRevenueId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryRevenueId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityPartyUniqueName1_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevenueType", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRevenueType(String value) {
        return new JAXBElement<String>(_OpportunityRevenueType_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactEmailAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactEmailAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryOrganizationName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryOrganizationName(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryOrganizationName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Longitude_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityLongitudeC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityLongitudeC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BdgtAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityBdgtAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityBdgtAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactFirstName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactFirstName(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactFirstName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Revenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityWinProb_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyCreationDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityOptyCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityOptyCreationDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Last_Update_Of_Close_Date_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLastUpdateOfCloseDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLastUpdateOfCloseDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BudgetedFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityBudgetedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityBudgetedFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AccountNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAccountNumber(String value) {
        return new JAXBElement<String>(_OpportunityAccountNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CustomerAccountId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunityCustomerAccountId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityComments(String value) {
        return new JAXBElement<String>(_OpportunityComments_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RiskLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRiskLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityRiskLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TargetPartyId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityTargetPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityTargetPartyId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityFormattedAddress(String value) {
        return new JAXBElement<String>(_OpportunityFormattedAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CrmConversionRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCrmConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCrmConversionRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AverageDaysAtStage", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityAverageDaysAtStage(Long value) {
        return new JAXBElement<Long>(_OpportunityAverageDaysAtStage_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Latitude_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityLatitudeC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityLatitudeC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrConRelationshipId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrConRelationshipId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrConRelationshipId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StrategicLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStrategicLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityStrategicLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UpsideAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityUpsideAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExtnAttributeChar004", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityExtnAttributeChar004(String value) {
        return new JAXBElement<String>(_OpportunityExtnAttributeChar004_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Fourth_Last_Update_Of_Close_Da_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityFourthLastUpdateOfCloseDaC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityFourthLastUpdateOfCloseDaC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastAssignedDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLastAssignedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLastAssignedDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityType_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityTypeCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityTypeCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityType_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityTypeC(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityTypeC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactFormattedPhoneNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactFormattedPhoneNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Third_Last_Update_Of_Close_Dat_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityThirdLastUpdateOfCloseDatC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityThirdLastUpdateOfCloseDatC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmployeesTotal", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityEmployeesTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityEmployeesTotal_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityPartyUniqueName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LookupCategory", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLookupCategory(String value) {
        return new JAXBElement<String>(_OpportunityLookupCategory_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConsumerFirstName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConsumerFirstName(String value) {
        return new JAXBElement<String>(_OpportunityConsumerFirstName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyLastUpdateDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityOptyLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityOptyLastUpdateDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrSrcNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrSrcNumber(String value) {
        return new JAXBElement<String>(_OpportunityPrSrcNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExtnAttributeChar005", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityExtnAttributeChar005(String value) {
        return new JAXBElement<String>(_OpportunityExtnAttributeChar005_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "KeyContactId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityKeyContactId(Long value) {
        return new JAXBElement<Long>(_OpportunityKeyContactId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ReasonWonLostCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityReasonWonLostCode(String value) {
        return new JAXBElement<String>(_OpportunityReasonWonLostCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesMethodId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesMethodId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesMethodId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "State", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityState(String value) {
        return new JAXBElement<String>(_OpportunityState_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrentFyPotentialRevenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCurrentFyPotentialRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCurrentFyPotentialRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PostalCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPostalCode(String value) {
        return new JAXBElement<String>(_OpportunityPostalCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RcmndWinProb", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityRcmndWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityRcmndWinProb_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealHorizonCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDealHorizonCode(String value) {
        return new JAXBElement<String>(_OpportunityDealHorizonCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesChannelCd", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesChannelCd(String value) {
        return new JAXBElement<String>(_OpportunitySalesChannelCd_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesAccountId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LineOfBusinessCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLineOfBusinessCode(String value) {
        return new JAXBElement<String>(_OpportunityLineOfBusinessCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyLastUpdatedBy", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOptyLastUpdatedBy(String value) {
        return new JAXBElement<String>(_OpportunityOptyLastUpdatedBy_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StageStatusCd", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStageStatusCd(String value) {
        return new JAXBElement<String>(_OpportunityStageStatusCd_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Description", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDescription(String value) {
        return new JAXBElement<String>(_OpportunityDescription_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DownsideAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityDownsideAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExpectAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityExpectAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MaximumDaysInStage", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityMaximumDaysInStage(Long value) {
        return new JAXBElement<Long>(_OpportunityMaximumDaysInStage_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BudgetAvailableDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityBudgetAvailableDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityBudgetAvailableDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityTypeTest_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityTypeTestC(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityTypeTestC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "City", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCity(String value) {
        return new JAXBElement<String>(_OpportunityCity_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PhonePreferenceExistsFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityPhonePreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityPhonePreferenceExistsFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnLineSetEnabledFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityRevnLineSetEnabledFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityRevnLineSetEnabledFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityTypeTest_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityTypeTestCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityTypeTestCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactLastName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactLastName(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactLastName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyCreatedBy", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOptyCreatedBy(String value) {
        return new JAXBElement<String>(_OpportunityOptyCreatedBy_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName1", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPartyName1(String value) {
        return new JAXBElement<String>(_TransientAppointmentPartyName1_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurExceptionFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurExceptionFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationUOMCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPlannedDurationUOMCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentPlannedDurationUOMCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentOwnerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentOwnerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentPartyId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneePartyId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityLocationTxt", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityLocationTxt(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityLocationTxt_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOrigInstDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentRecurOrigInstDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurOrigInstDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFreqNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurFreqNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurFreqNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AllDayFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAllDayFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAllDayFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnDenormFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnDenormFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnDenormFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentSourceObjectId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentSourceObjectId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSunFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurSunFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurSunFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonth", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurMonth(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurMonth_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurApptId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurApptId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurApptId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnSystemFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnSystemFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnSystemFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedEndDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentPlannedEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentPlannedEndDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSatFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurSatFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurSatFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ConflictId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentConflictId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentConflictId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CreationDate", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentCreationDate_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "Response", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentResponse(String value) {
        return new JAXBElement<String>(_TransientAppointmentResponse_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateLogin", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentLastUpdateLogin(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdateLogin_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityDescription", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityDescription(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityDescription_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAs", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentShowTimeAs(String value) {
        return new JAXBElement<String>(_TransientAppointmentShowTimeAs_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "Owner", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentOwner(String value) {
        return new JAXBElement<String>(_TransientAppointmentOwner_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWeekDayCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurWeekDayCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurWeekDayCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurPattern", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurPattern(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurPattern_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "VisibilityCd", scope = TransientAppointment.class, defaultValue = "INTERNAL PARTICIPANT ONLY")
    public JAXBElement<String> createTransientAppointmentVisibilityCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentVisibilityCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CreatedBy", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCreatedBy(String value) {
        return new JAXBElement<String>(_TransientAppointmentCreatedBy_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTueFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurTueFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurTueFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurThuFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurThuFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurThuFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurEndDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentRecurEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurEndDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AlarmFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAlarmFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAlarmFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTypeCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurTypeCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurTypeCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnManualFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnManualFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnManualFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFriFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurFriFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurFriFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWedFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurWedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurWedFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurReplaceCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurReplaceCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurReplaceCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurMonFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurMonFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCategoryCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LockAsgnFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentLockAsgnFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentLockAsgnFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateDate", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentLastUpdateDate_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CustomerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentCustomerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ApptAlarmTmMinimumNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentApptAlarmTmMinimumNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentApptAlarmTmMinimumNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentTemplateFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentTemplateFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationNumber", scope = TransientAppointment.class)
    public JAXBElement<BigDecimal> createTransientAppointmentPlannedDurationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TransientAppointmentPlannedDurationNumber_QNAME, BigDecimal.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOccursNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurOccursNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurOccursNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ObjectVersionNumber", scope = TransientAppointment.class)
    public JAXBElement<Integer> createTransientAppointmentObjectVersionNumber(Integer value) {
        return new JAXBElement<Integer>(_TransientAppointmentObjectVersionNumber_QNAME, Integer.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "DoNotRouteFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentDoNotRouteFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentDoNotRouteFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentTemplateId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentTemplateId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CustomerName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCustomerName(String value) {
        return new JAXBElement<String>(_TransientAppointmentCustomerName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedStartDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentPlannedStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentPlannedStartDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdatedBy", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentLastUpdatedBy(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdatedBy_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReferenceCustomerName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentReferenceCustomerName(String value) {
        return new JAXBElement<String>(_TransientAppointmentReferenceCustomerName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId1", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentPartyId1(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentPartyId1_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityName(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentSourceObjectCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentSourceObjectCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReferenceCustomerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentReferenceCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentReferenceCustomerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurDay", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurDay(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurDay_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "EditMode", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentEditMode(String value) {
        return new JAXBElement<String>(_TransientAppointmentEditMode_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCodeTransient", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCategoryCodeTransient(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCodeTransient_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerRsrcOrgId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentOwnerRsrcOrgId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentOwnerRsrcOrgId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunitySource.class)
    public JAXBElement<String> createOpportunitySourceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunitySource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunitySource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunitySourceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunitySource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityPartyUniqueName_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ThreatLevelCode", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorThreatLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorThreatLevelCode_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnAmount", scope = OpportunityCompetitor.class)
    public JAXBElement<AmountType> createOpportunityCompetitorRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityCompetitorRevnAmount_QNAME, AmountType.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryFlg", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPrimaryFlg(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPrimaryFlg_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityPartyUniqueName1_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorComments(String value) {
        return new JAXBElement<String>(_OpportunityComments_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AnnualRevenueAmount", scope = OpportunityCompetitor.class)
    public JAXBElement<AmountType> createOpportunityCompetitorAnnualRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityCompetitorAnnualRevenueAmount_QNAME, AmountType.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountId", scope = OpportunityCompetitor.class)
    public JAXBElement<Long> createOpportunityCompetitorSalesAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesAccountId_QNAME, Long.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = OpportunityCompetitor.class)
    public JAXBElement<BigDecimal> createOpportunityCompetitorWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityWinProb_QNAME, BigDecimal.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountUniqueName", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorSalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_OpportunitySalesAccountUniqueName_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = OpportunityCompetitor.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityCompetitorEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityEffectiveDate_QNAME, XMLGregorianCalendar.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DealType", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerDealType(String value) {
        return new JAXBElement<String>(_RevenuePartnerDealType_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnPartnerNumber", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerRevnPartnerNumber(String value) {
        return new JAXBElement<String>(_RevenuePartnerRevnPartnerNumber_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartTypeCd", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerPartTypeCd(String value) {
        return new JAXBElement<String>(_RevenuePartnerPartTypeCd_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DealExpirationDate", scope = RevenuePartner.class)
    public JAXBElement<XMLGregorianCalendar> createRevenuePartnerDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenuePartnerDealExpirationDate_QNAME, XMLGregorianCalendar.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DealEstCloseDate", scope = RevenuePartner.class)
    public JAXBElement<XMLGregorianCalendar> createRevenuePartnerDealEstCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenuePartnerDealEstCloseDate_QNAME, XMLGregorianCalendar.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrPartResourcePartyId", scope = RevenuePartner.class)
    public JAXBElement<Long> createRevenuePartnerPrPartResourcePartyId(Long value) {
        return new JAXBElement<Long>(_RevenuePartnerPrPartResourcePartyId_QNAME, Long.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartProgramId", scope = RevenuePartner.class)
    public JAXBElement<Long> createRevenuePartnerPartProgramId(Long value) {
        return new JAXBElement<Long>(_RevenuePartnerPartProgramId_QNAME, Long.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdatedBy", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerLastUpdatedBy(String value) {
        return new JAXBElement<String>(_RevenuePartnerLastUpdatedBy_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RegistrationNumber", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerRegistrationNumber(String value) {
        return new JAXBElement<String>(_RevenuePartnerRegistrationNumber_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ErrorMessage", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorErrorMessage(String value) {
        return new JAXBElement<String>(_DeleteErrorErrorMessage_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ProgramName", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorProgramName(String value) {
        return new JAXBElement<String>(_DeleteErrorProgramName_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ErrorCode", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorErrorCode(String value) {
        return new JAXBElement<String>(_DeleteErrorErrorCode_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteErrorType", scope = DeleteError.class)
    public JAXBElement<Integer> createDeleteErrorDeleteErrorType(Integer value) {
        return new JAXBElement<Integer>(_DeleteErrorDeleteErrorType_QNAME, Integer.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ItemNumber", scope = Revenue.class)
    public JAXBElement<String> createRevenueItemNumber(String value) {
        return new JAXBElement<String>(_RevenueItemNumber_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueSalesAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSalesAccountId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerLockAsgnFlag", scope = Revenue.class)
    public JAXBElement<Boolean> createRevenueOwnerLockAsgnFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueOwnerLockAsgnFlag_QNAME, Boolean.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesChannelCd", scope = Revenue.class)
    public JAXBElement<String> createRevenueSalesChannelCd(String value) {
        return new JAXBElement<String>(_RevenueSalesChannelCd_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmCurcyCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueCrmCurcyCode(String value) {
        return new JAXBElement<String>(_RevenueCrmCurcyCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UOMCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueUOMCode(String value) {
        return new JAXBElement<String>(_SplitRevenueUOMCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrPartOrgPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_RevenuePrPartOrgPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRate", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueConversionRate_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnCategoryCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRevnCategoryCode(String value) {
        return new JAXBElement<String>(_RevenueRevnCategoryCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ParentRevnId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueParentRevnId(Long value) {
        return new JAXBElement<Long>(_RevenueParentRevnId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnCreationDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueRevnCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueRevnCreationDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CommitFlag", scope = Revenue.class)
    public JAXBElement<Boolean> createRevenueCommitFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueCommitFlag_QNAME, Boolean.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurFrequencyCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRecurFrequencyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurFrequencyCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRecurTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealProtectedDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueOwnerDealProtectedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealProtectedDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DownsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueDownsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueExpectAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Description", scope = Revenue.class)
    public JAXBElement<String> createRevenueDescription(String value) {
        return new JAXBElement<String>(_RevenueDescription_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Quantity", scope = Revenue.class)
    public JAXBElement<MeasureType> createRevenueQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueQuantity_QNAME, MeasureType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ActualCloseDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueActualCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueActualCloseDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ResourcePartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueResourcePartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueResourcePartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = Revenue.class)
    public JAXBElement<String> createRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueOwnerOrgTreeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRateType", scope = Revenue.class)
    public JAXBElement<String> createRevenueConversionRateType(String value) {
        return new JAXBElement<String>(_SplitRevenueConversionRateType_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectDlvryDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueExpectDlvryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueExpectDlvryDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealExpirationDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueOwnerDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealExpirationDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueSplitTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSplitTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRateType", scope = Revenue.class)
    public JAXBElement<String> createRevenueCrmConversionRateType(String value) {
        return new JAXBElement<String>(_RevenueCrmConversionRateType_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueProdGroupId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueProdGroupId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "NqSplitAllocTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueNqSplitAllocTypeCode(String value) {
        return new JAXBElement<String>(_RevenueNqSplitAllocTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurParentRevnId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueRecurParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueRecurParentRevnId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnLineTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRevnLineTypeCode(String value) {
        return new JAXBElement<String>(_RevenueRevnLineTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartEngagementTypeCd", scope = Revenue.class)
    public JAXBElement<String> createRevenuePartEngagementTypeCd(String value) {
        return new JAXBElement<String>(_RevenuePartEngagementTypeCd_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryOrgId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryOrgId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitPercent", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueSplitPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueSplitPercent_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CloseReasonCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueCloseReasonCode(String value) {
        return new JAXBElement<String>(_SplitRevenueCloseReasonCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurQuantity", scope = Revenue.class)
    public JAXBElement<MeasureType> createRevenueRecurQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueRecurQuantity_QNAME, MeasureType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "WinProb", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueWinProb_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryUpdatedById", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrTerritoryUpdatedById(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryUpdatedById_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastOverrideCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueForecastOverrideCode(String value) {
        return new JAXBElement<String>(_SplitRevenueForecastOverrideCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeStructCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueOwnerOrgTreeStructCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeStructCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UpsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUpsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurUpsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurUpsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UnitPrice", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUnitPrice_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurUnitPrice", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurUnitPrice_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRate", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueCrmConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenueCrmConversionRate_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TargetPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueTargetPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTargetPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurDownsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurDownsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Comments", scope = Revenue.class)
    public JAXBElement<String> createRevenueComments(String value) {
        return new JAXBElement<String>(_SplitRevenueComments_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrCmptPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrCmptPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrCmptPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryItemId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueInventoryItemId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryItemId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCustomerAccountId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurRevnAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRecurRevnAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOptyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurEndDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueRecurEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurEndDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryVersionId", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryVersionId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountUniqueName", scope = Revenue.class)
    public JAXBElement<String> createRevenueSalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_RevenueSalesAccountUniqueName_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "MarginAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueMarginAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueMarginAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyLeadId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueOptyLeadId(Long value) {
        return new JAXBElement<Long>(_RevenueOptyLeadId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnSequenceNumber", scope = Revenue.class)
    public JAXBElement<Integer> createRevenueRevnSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_RevenueRevnSequenceNumber_QNAME, Integer.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurNumberPeriods", scope = Revenue.class)
    public JAXBElement<Integer> createRevenueRecurNumberPeriods(Integer value) {
        return new JAXBElement<Integer>(_SplitRevenueRecurNumberPeriods_QNAME, Integer.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AttachmentEntityName", scope = Revenue.class, defaultValue = "EGP_SYSTEM_ITEMS")
    public JAXBElement<String> createRevenueAttachmentEntityName(String value) {
        return new JAXBElement<String>(_RevenueAttachmentEntityName_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOwnerResourceOrgId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRevnAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProductType", scope = Revenue.class)
    public JAXBElement<String> createRevenueProductType(String value) {
        return new JAXBElement<String>(_RevenueProductType_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurStartDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueRecurStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurStartDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueEffectiveDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurPeriodOrEndDateCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRecurPeriodOrEndDateCode(String value) {
        return new JAXBElement<String>(_RevenueRecurPeriodOrEndDateCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CostAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueCostAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueCostAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CreditRcptPartOrgPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueCreditRcptPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCreditRcptPartOrgPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitParentRevnId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueSplitParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSplitParentRevnId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueStatusCode(String value) {
        return new JAXBElement<String>(_SplitRevenueStatusCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = Revenue.class)
    public JAXBElement<Boolean> createRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenuePrimaryFlag_QNAME, Boolean.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesCreditTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueSalesCreditTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSalesCreditTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRevnAmountCurcyCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueBUOrgId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteDate", scope = DeleteEntity.class)
    public JAXBElement<XMLGregorianCalendar> createDeleteEntityDeleteDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeleteEntityDeleteDate_QNAME, XMLGregorianCalendar.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "EntitySequenceNumber", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityEntitySequenceNumber(Long value) {
        return new JAXBElement<Long>(_DeleteEntityEntitySequenceNumber_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk2Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk2Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk2Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk1Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk1Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk1Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk5Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk5Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk5Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteStatusType", scope = DeleteEntity.class)
    public JAXBElement<Integer> createDeleteEntityDeleteStatusType(Integer value) {
        return new JAXBElement<Integer>(_DeleteEntityDeleteStatusType_QNAME, Integer.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteEntityType", scope = DeleteEntity.class)
    public JAXBElement<Integer> createDeleteEntityDeleteEntityType(Integer value) {
        return new JAXBElement<Integer>(_DeleteEntityDeleteEntityType_QNAME, Integer.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk4Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk4Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk4Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk3Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk3Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk3Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContactedFlg", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactContactedFlg(String value) {
        return new JAXBElement<String>(_OpportunityContactContactedFlg_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AffinityLvlCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactAffinityLvlCd(String value) {
        return new JAXBElement<String>(_OpportunityContactAffinityLvlCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesBuyingRoleCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesBuyingRoleCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesBuyingRoleCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityPartyUniqueName_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailPreferenceExistsFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactEmailPreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityContactEmailPreferenceExistsFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedPhoneNumber", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityResourceFormattedPhoneNumber_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesInfluenceLevelCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesInfluenceLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesInfluenceLevelCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryFlg", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPrimaryFlg(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPrimaryFlg_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedMultilineAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedMultilineAddress(String value) {
        return new JAXBElement<String>(_OpportunityContactFormattedMultilineAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityContact.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityContactUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonCentricJobTitle", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPersonCentricJobTitle(String value) {
        return new JAXBElement<String>(_OpportunityContactPersonCentricJobTitle_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAffinityCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesAffinityCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesAffinityCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobTitle", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactJobTitle(String value) {
        return new JAXBElement<String>(_OpportunityContactJobTitle_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PreferredContactMethod", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPreferredContactMethod(String value) {
        return new JAXBElement<String>(_OpportunityContactPreferredContactMethod_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactComments(String value) {
        return new JAXBElement<String>(_OpportunityComments_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RawPhoneNumber", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactRawPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityContactRawPhoneNumber_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "InfluenceLvlCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactInfluenceLvlCd(String value) {
        return new JAXBElement<String>(_OpportunityContactInfluenceLvlCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedAddress(String value) {
        return new JAXBElement<String>(_OpportunityFormattedAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TargetPartyId", scope = OpportunityContact.class)
    public JAXBElement<Long> createOpportunityContactTargetPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityTargetPartyId_QNAME, Long.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RelationshipId", scope = OpportunityContact.class)
    public JAXBElement<Long> createOpportunityContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_OpportunityContactRelationshipId_QNAME, Long.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RoleCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactRoleCd(String value) {
        return new JAXBElement<String>(_OpportunityContactRoleCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PhonePreferenceExistsFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactPhonePreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityPhonePreferenceExistsFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DoNotContactFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactDoNotContactFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityContactDoNotContactFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteTxt", scope = TransientNote.class)
    public JAXBElement<byte[]> createTransientNoteNoteTxt(byte[] value) {
        return new JAXBElement<byte[]>(_TransientNoteNoteTxt_QNAME, byte[].class, TransientNote.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteTypeCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteNoteTypeCode(String value) {
        return new JAXBElement<String>(_TransientNoteNoteTypeCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteId", scope = TransientNote.class)
    public JAXBElement<Long> createTransientNoteNoteId(Long value) {
        return new JAXBElement<Long>(_TransientNoteNoteId_QNAME, Long.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientNote.class)
    public JAXBElement<String> createTransientNotePartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientNote.class)
    public JAXBElement<String> createTransientNotePartyId(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyId_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteSourceObjectCode(String value) {
        return new JAXBElement<String>(_TransientNoteSourceObjectCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "VisibilityCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteVisibilityCode(String value) {
        return new JAXBElement<String>(_TransientNoteVisibilityCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectId", scope = TransientNote.class)
    public JAXBElement<Long> createTransientNoteSourceObjectId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentSourceObjectId_QNAME, Long.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityContactId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactActivityContactId(Long value) {
        return new JAXBElement<Long>(_TransientContactActivityContactId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonTitle", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonTitle(String value) {
        return new JAXBElement<String>(_TransientContactPersonTitle_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonLastName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonLastName(String value) {
        return new JAXBElement<String>(_TransientContactPersonLastName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ContactId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactContactId(Long value) {
        return new JAXBElement<Long>(_TransientContactContactId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPartyName(String value) {
        return new JAXBElement<String>(_TransientAssigneePartyName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactPartyId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneePartyId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonFirstName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonFirstName(String value) {
        return new JAXBElement<String>(_TransientContactPersonFirstName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ContactRelationshipId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_TransientContactContactRelationshipId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyType", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPartyType(String value) {
        return new JAXBElement<String>(_TransientContactPartyType_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonMiddleName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonMiddleName(String value) {
        return new JAXBElement<String>(_TransientContactPersonMiddleName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrDealPartOrgPartyId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadPrDealPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadPrDealPartOrgPartyId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RegistrationNumber", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadRegistrationNumber(String value) {
        return new JAXBElement<String>(_OpportunityLeadRegistrationNumber_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartnerTypeCd", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadPartnerTypeCd(String value) {
        return new JAXBElement<String>(_OpportunityLeadPartnerTypeCd_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealPartProgramId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadDealPartProgramId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadDealPartProgramId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealExpirationDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealExpirationDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrDealPartResourcePartyId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadPrDealPartResourcePartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadPrDealPartResourcePartyId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealEstimatedCloseDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadDealEstimatedCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadDealEstimatedCloseDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealType", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadDealType(String value) {
        return new JAXBElement<String>(_OpportunityLeadDealType_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityCategoryId", scope = TransientCategory.class)
    public JAXBElement<Long> createTransientCategoryActivityCategoryId(Long value) {
        return new JAXBElement<Long>(_TransientCategoryActivityCategoryId_QNAME, Long.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCd", scope = TransientCategory.class)
    public JAXBElement<String> createTransientCategoryCategoryCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCd_QNAME, String.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientCategory.class)
    public JAXBElement<Long> createTransientCategoryActivityId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityId_QNAME, Long.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnAmount", scope = OpportunityReference.class)
    public JAXBElement<AmountType> createOpportunityReferenceRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityCompetitorRevnAmount_QNAME, AmountType.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CustomerContactRelationId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceCustomerContactRelationId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceCustomerContactRelationId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferencePartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityPartyUniqueName1_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments1", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceComments1(String value) {
        return new JAXBElement<String>(_OpportunityReferenceComments1_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityReference.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityReferenceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceSalesAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesAccountId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = OpportunityReference.class)
    public JAXBElement<BigDecimal> createOpportunityReferenceWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityWinProb_QNAME, BigDecimal.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DUNSNumberC", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceDUNSNumberC(String value) {
        return new JAXBElement<String>(_OpportunityReferenceDUNSNumberC_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountUniqueName", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceSalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_OpportunitySalesAccountUniqueName_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferencePartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityPartyUniqueName_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IntContactPartyId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceIntContactPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceIntContactPartyId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ReferenceRankNumber", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceReferenceRankNumber(String value) {
        return new JAXBElement<String>(_OpportunityReferenceReferenceRankNumber_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceComments(String value) {
        return new JAXBElement<String>(_OpportunityComments_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = OpportunityReference.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityReferenceEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityEffectiveDate_QNAME, XMLGregorianCalendar.class, OpportunityReference.class, value);
    }

}

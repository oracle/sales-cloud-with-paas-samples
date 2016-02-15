
package com.oracle.xmlns.apps.sales.opptymgmt.revenues.revenueservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;
import com.oracle.xmlns.adf.svc.types.MeasureType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.sales.opptymgmt.revenues.revenueservice package. 
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
    private final static QName _RecurringRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "recurringRevenue");
    private final static QName _SplitRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "splitRevenue");
    private final static QName _Revenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenue");
    private final static QName _RevenuePartner_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenuePartner");
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
    private final static QName _RevenuePartnerDealType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealType");
    private final static QName _RevenuePartnerPartTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartTypeCd");
    private final static QName _RevenuePartnerDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealExpirationDate");
    private final static QName _RevenuePartnerDealEstCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealEstCloseDate");
    private final static QName _RevenuePartnerPrPartResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrPartResourcePartyId");
    private final static QName _RevenuePartnerPartProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartProgramId");
    private final static QName _RevenuePartnerRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RegistrationNumber");
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
    private final static QName _RevenueOptyLeadId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OptyLeadId");
    private final static QName _RevenueRevnSequenceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnSequenceNumber");
    private final static QName _RevenueAttachmentEntityName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AttachmentEntityName");
    private final static QName _RevenueProductType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ProductType");
    private final static QName _RevenueRecurPeriodOrEndDateCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurPeriodOrEndDateCode");
    private final static QName _RevenueTerritoryForecastParticipationCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ForecastParticipationCode");
    private final static QName _RevenueTerritoryTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TerritoryVersionId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.sales.opptymgmt.revenues.revenueservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Revenue }
     * 
     */
    public Revenue createRevenue() {
        return new Revenue();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueTerritory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenueTerritory")
    public JAXBElement<RevenueTerritory> createRevenueTerritory(RevenueTerritory value) {
        return new JAXBElement<RevenueTerritory>(_RevenueTerritory_QNAME, RevenueTerritory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "splitRevenue")
    public JAXBElement<SplitRevenue> createSplitRevenue(SplitRevenue value) {
        return new JAXBElement<SplitRevenue>(_SplitRevenue_QNAME, SplitRevenue.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenuePartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenuePartner")
    public JAXBElement<RevenuePartner> createRevenuePartner(RevenuePartner value) {
        return new JAXBElement<RevenuePartner>(_RevenuePartner_QNAME, RevenuePartner.class, null, value);
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RegistrationNumber", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerRegistrationNumber(String value) {
        return new JAXBElement<String>(_RevenuePartnerRegistrationNumber_QNAME, String.class, RevenuePartner.class, value);
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueEffectiveDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
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

}

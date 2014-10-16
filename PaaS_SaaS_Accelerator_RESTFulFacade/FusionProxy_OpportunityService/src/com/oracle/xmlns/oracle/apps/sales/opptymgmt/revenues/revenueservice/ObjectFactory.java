
package com.oracle.xmlns.oracle.apps.sales.opptymgmt.revenues.revenueservice;

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
 * generated in the com.oracle.xmlns.oracle.apps.sales.opptymgmt.revenues.revenueservice package. 
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

    private final static QName _RevenueLineSet_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "revenueLineSet");
    private final static QName _CategorySummaryRevenue_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "categorySummaryRevenue");
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
    private final static QName _CategorySummaryRevenuePrimaryFlag_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "PrimaryFlag");
    private final static QName _CategorySummaryRevenueCrmCategorySummaryRevenue_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCategorySummaryRevenue");
    private final static QName _CategorySummaryRevenueCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRate");
    private final static QName _CategorySummaryRevenueCrmConversionRateType_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRateType");
    private final static QName _CategorySummaryRevenueRevnCategoryCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnCategoryCode");
    private final static QName _CategorySummaryRevenueCrmCurcyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCurcyCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.oracle.apps.sales.opptymgmt.revenues.revenueservice
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueLineSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenueLineSet")
    public JAXBElement<RevenueLineSet> createRevenueLineSet(RevenueLineSet value) {
        return new JAXBElement<RevenueLineSet>(_RevenueLineSet_QNAME, RevenueLineSet.class, null, value);
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

}

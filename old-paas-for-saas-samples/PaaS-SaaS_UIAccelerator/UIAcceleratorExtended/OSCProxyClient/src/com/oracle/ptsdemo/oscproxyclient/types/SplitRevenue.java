
package com.oracle.ptsdemo.oscproxyclient.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SplitRevenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitRevenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BUOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CommitFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CostAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="DownsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnerResourceOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExpectAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MarginAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="InventoryItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="InventoryOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnAmountCurcyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="UpsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExpectDlvryDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RecurParentRevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurNumberPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurRevnAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RecurQuantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="RecurTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SalesCreditTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SplitParentRevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SplitPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SplitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CloseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrCmptPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConversionRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerDealExpirationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OwnerDealProtectedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OwnerLockAsgnFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrTerritoryVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ForecastOverrideCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerOrgTreeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerOrgTreeStructCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRcptPartOrgPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreditRcptPartOrgPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrTerritoryUpdatedById" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrTerritoryUpdatedByPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitRevenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", propOrder = {
    "targetPartyId",
    "revnId",
    "buOrgId",
    "customerAccountId",
    "commitFlag",
    "comments",
    "resourcePartyId",
    "costAmount",
    "downsideAmount",
    "ownerResourceOrgId",
    "expectAmount",
    "effectiveDate",
    "optyId",
    "marginAmount",
    "inventoryItemId",
    "unitPrice",
    "quantity",
    "inventoryOrgId",
    "revnAmountCurcyCode",
    "revnAmount",
    "upsideAmount",
    "typeCode",
    "primaryFlag",
    "winProb",
    "expectDlvryDate",
    "uomCode",
    "creationDate",
    "createdBy",
    "lastUpdatedBy",
    "conflictId",
    "lastUpdateLogin",
    "lastUpdateDate",
    "userLastUpdateDate",
    "objectVersionNumber",
    "prodGroupId",
    "revnNumber",
    "recurFrequencyCode",
    "recurEndDate",
    "recurParentRevnId",
    "recurNumberPeriods",
    "recurRevnAmount",
    "recurQuantity",
    "recurTypeCode",
    "recurStartDate",
    "salesCreditTypeCode",
    "splitParentRevnId",
    "splitPercent",
    "splitTypeCode",
    "statusCode",
    "closeReasonCode",
    "prCmptPartyId",
    "partyName",
    "partyId",
    "conversionRate",
    "conversionRateType",
    "ownerDealExpirationDate",
    "ownerDealProtectedDate",
    "ownerLockAsgnFlag",
    "name",
    "effectiveStartDate",
    "effectiveEndDate",
    "objectVersionNumber1",
    "prTerritoryVersionId",
    "forecastOverrideCode",
    "ownerOrgTreeCode",
    "ownerOrgTreeStructCode",
    "creditRcptPartOrgPartyId",
    "creditRcptPartOrgPartyName",
    "assignmentType",
    "prTerritoryUpdatedById",
    "prTerritoryUpdatedByPartyName",
    "salesAccountId"
})
public class SplitRevenue {

    @XmlElementRef(name = "TargetPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> targetPartyId;
    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElementRef(name = "BUOrgId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> buOrgId;
    @XmlElementRef(name = "CustomerAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerAccountId;
    @XmlElementRef(name = "CommitFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> commitFlag;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "ResourcePartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> resourcePartyId;
    @XmlElementRef(name = "CostAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> costAmount;
    @XmlElementRef(name = "DownsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> downsideAmount;
    @XmlElementRef(name = "OwnerResourceOrgId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerResourceOrgId;
    @XmlElementRef(name = "ExpectAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> expectAmount;
    @XmlElementRef(name = "EffectiveDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> effectiveDate;
    @XmlElementRef(name = "OptyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> optyId;
    @XmlElementRef(name = "MarginAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> marginAmount;
    @XmlElementRef(name = "InventoryItemId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> inventoryItemId;
    @XmlElementRef(name = "UnitPrice", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> unitPrice;
    @XmlElementRef(name = "Quantity", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<MeasureType> quantity;
    @XmlElementRef(name = "InventoryOrgId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> inventoryOrgId;
    @XmlElementRef(name = "RevnAmountCurcyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> revnAmountCurcyCode;
    @XmlElementRef(name = "RevnAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> revnAmount;
    @XmlElementRef(name = "UpsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> upsideAmount;
    @XmlElementRef(name = "TypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> typeCode;
    @XmlElementRef(name = "PrimaryFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> primaryFlag;
    @XmlElementRef(name = "WinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> winProb;
    @XmlElementRef(name = "ExpectDlvryDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> expectDlvryDate;
    @XmlElementRef(name = "UOMCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> uomCode;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "ProdGroupId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> prodGroupId;
    @XmlElement(name = "RevnNumber")
    protected String revnNumber;
    @XmlElementRef(name = "RecurFrequencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> recurFrequencyCode;
    @XmlElementRef(name = "RecurEndDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> recurEndDate;
    @XmlElementRef(name = "RecurParentRevnId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> recurParentRevnId;
    @XmlElementRef(name = "RecurNumberPeriods", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Integer> recurNumberPeriods;
    @XmlElementRef(name = "RecurRevnAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> recurRevnAmount;
    @XmlElementRef(name = "RecurQuantity", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<MeasureType> recurQuantity;
    @XmlElementRef(name = "RecurTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> recurTypeCode;
    @XmlElementRef(name = "RecurStartDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> recurStartDate;
    @XmlElementRef(name = "SalesCreditTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> salesCreditTypeCode;
    @XmlElementRef(name = "SplitParentRevnId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> splitParentRevnId;
    @XmlElementRef(name = "SplitPercent", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> splitPercent;
    @XmlElementRef(name = "SplitTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> splitTypeCode;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "CloseReasonCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> closeReasonCode;
    @XmlElementRef(name = "PrCmptPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> prCmptPartyId;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "ConversionRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> conversionRate;
    @XmlElementRef(name = "ConversionRateType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> conversionRateType;
    @XmlElementRef(name = "OwnerDealExpirationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> ownerDealExpirationDate;
    @XmlElementRef(name = "OwnerDealProtectedDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> ownerDealProtectedDate;
    @XmlElementRef(name = "OwnerLockAsgnFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> ownerLockAsgnFlag;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "ObjectVersionNumber1")
    protected Integer objectVersionNumber1;
    @XmlElementRef(name = "PrTerritoryVersionId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> prTerritoryVersionId;
    @XmlElementRef(name = "ForecastOverrideCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> forecastOverrideCode;
    @XmlElementRef(name = "OwnerOrgTreeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerOrgTreeCode;
    @XmlElementRef(name = "OwnerOrgTreeStructCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerOrgTreeStructCode;
    @XmlElementRef(name = "CreditRcptPartOrgPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> creditRcptPartOrgPartyId;
    @XmlElement(name = "CreditRcptPartOrgPartyName")
    protected String creditRcptPartOrgPartyName;
    @XmlElementRef(name = "AssignmentType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> assignmentType;
    @XmlElementRef(name = "PrTerritoryUpdatedById", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> prTerritoryUpdatedById;
    @XmlElement(name = "PrTerritoryUpdatedByPartyName")
    protected String prTerritoryUpdatedByPartyName;
    @XmlElementRef(name = "SalesAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> salesAccountId;

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
     * Gets the value of the buOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBUOrgId() {
        return buOrgId;
    }

    /**
     * Sets the value of the buOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBUOrgId(JAXBElement<Long> value) {
        this.buOrgId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the commitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCommitFlag() {
        return commitFlag;
    }

    /**
     * Sets the value of the commitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCommitFlag(JAXBElement<Boolean> value) {
        this.commitFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the resourcePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourcePartyId() {
        return resourcePartyId;
    }

    /**
     * Sets the value of the resourcePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourcePartyId(JAXBElement<Long> value) {
        this.resourcePartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the costAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCostAmount() {
        return costAmount;
    }

    /**
     * Sets the value of the costAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCostAmount(JAXBElement<AmountType> value) {
        this.costAmount = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOptyId(JAXBElement<Long> value) {
        this.optyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the marginAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getMarginAmount() {
        return marginAmount;
    }

    /**
     * Sets the value of the marginAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setMarginAmount(JAXBElement<AmountType> value) {
        this.marginAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the inventoryItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInventoryItemId() {
        return inventoryItemId;
    }

    /**
     * Sets the value of the inventoryItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInventoryItemId(JAXBElement<Long> value) {
        this.inventoryItemId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setUnitPrice(JAXBElement<AmountType> value) {
        this.unitPrice = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<MeasureType> value) {
        this.quantity = ((JAXBElement<MeasureType> ) value);
    }

    /**
     * Gets the value of the inventoryOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInventoryOrgId() {
        return inventoryOrgId;
    }

    /**
     * Sets the value of the inventoryOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInventoryOrgId(JAXBElement<Long> value) {
        this.inventoryOrgId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the revnAmountCurcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevnAmountCurcyCode() {
        return revnAmountCurcyCode;
    }

    /**
     * Sets the value of the revnAmountCurcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevnAmountCurcyCode(JAXBElement<String> value) {
        this.revnAmountCurcyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the revnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRevnAmount() {
        return revnAmount;
    }

    /**
     * Sets the value of the revnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRevnAmount(JAXBElement<AmountType> value) {
        this.revnAmount = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeCode(JAXBElement<String> value) {
        this.typeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrimaryFlag(JAXBElement<Boolean> value) {
        this.primaryFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the expectDlvryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpectDlvryDate() {
        return expectDlvryDate;
    }

    /**
     * Sets the value of the expectDlvryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpectDlvryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expectDlvryDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the uomCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOMCode() {
        return uomCode;
    }

    /**
     * Sets the value of the uomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOMCode(JAXBElement<String> value) {
        this.uomCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the prodGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProdGroupId() {
        return prodGroupId;
    }

    /**
     * Sets the value of the prodGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProdGroupId(JAXBElement<Long> value) {
        this.prodGroupId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the revnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevnNumber() {
        return revnNumber;
    }

    /**
     * Sets the value of the revnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevnNumber(String value) {
        this.revnNumber = value;
    }

    /**
     * Gets the value of the recurFrequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurFrequencyCode() {
        return recurFrequencyCode;
    }

    /**
     * Sets the value of the recurFrequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurFrequencyCode(JAXBElement<String> value) {
        this.recurFrequencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecurEndDate() {
        return recurEndDate;
    }

    /**
     * Sets the value of the recurEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecurEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.recurEndDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the recurParentRevnId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurParentRevnId() {
        return recurParentRevnId;
    }

    /**
     * Sets the value of the recurParentRevnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurParentRevnId(JAXBElement<Long> value) {
        this.recurParentRevnId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the recurNumberPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecurNumberPeriods() {
        return recurNumberPeriods;
    }

    /**
     * Sets the value of the recurNumberPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecurNumberPeriods(JAXBElement<Integer> value) {
        this.recurNumberPeriods = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the recurRevnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRecurRevnAmount() {
        return recurRevnAmount;
    }

    /**
     * Sets the value of the recurRevnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRecurRevnAmount(JAXBElement<AmountType> value) {
        this.recurRevnAmount = ((JAXBElement<AmountType> ) value);
    }

    /**
     * Gets the value of the recurQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getRecurQuantity() {
        return recurQuantity;
    }

    /**
     * Sets the value of the recurQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setRecurQuantity(JAXBElement<MeasureType> value) {
        this.recurQuantity = ((JAXBElement<MeasureType> ) value);
    }

    /**
     * Gets the value of the recurTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurTypeCode() {
        return recurTypeCode;
    }

    /**
     * Sets the value of the recurTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurTypeCode(JAXBElement<String> value) {
        this.recurTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recurStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecurStartDate() {
        return recurStartDate;
    }

    /**
     * Sets the value of the recurStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecurStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.recurStartDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the salesCreditTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesCreditTypeCode() {
        return salesCreditTypeCode;
    }

    /**
     * Sets the value of the salesCreditTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesCreditTypeCode(JAXBElement<String> value) {
        this.salesCreditTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the splitParentRevnId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSplitParentRevnId() {
        return splitParentRevnId;
    }

    /**
     * Sets the value of the splitParentRevnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSplitParentRevnId(JAXBElement<Long> value) {
        this.splitParentRevnId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the splitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSplitPercent() {
        return splitPercent;
    }

    /**
     * Sets the value of the splitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSplitPercent(JAXBElement<BigDecimal> value) {
        this.splitPercent = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the splitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSplitTypeCode() {
        return splitTypeCode;
    }

    /**
     * Sets the value of the splitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSplitTypeCode(JAXBElement<String> value) {
        this.splitTypeCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the closeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCloseReasonCode() {
        return closeReasonCode;
    }

    /**
     * Sets the value of the closeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCloseReasonCode(JAXBElement<String> value) {
        this.closeReasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prCmptPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrCmptPartyId() {
        return prCmptPartyId;
    }

    /**
     * Sets the value of the prCmptPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrCmptPartyId(JAXBElement<Long> value) {
        this.prCmptPartyId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConversionRate(JAXBElement<BigDecimal> value) {
        this.conversionRate = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the conversionRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConversionRateType() {
        return conversionRateType;
    }

    /**
     * Sets the value of the conversionRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConversionRateType(JAXBElement<String> value) {
        this.conversionRateType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerDealExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOwnerDealExpirationDate() {
        return ownerDealExpirationDate;
    }

    /**
     * Sets the value of the ownerDealExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOwnerDealExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ownerDealExpirationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ownerDealProtectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOwnerDealProtectedDate() {
        return ownerDealProtectedDate;
    }

    /**
     * Sets the value of the ownerDealProtectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOwnerDealProtectedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ownerDealProtectedDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ownerLockAsgnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOwnerLockAsgnFlag() {
        return ownerLockAsgnFlag;
    }

    /**
     * Sets the value of the ownerLockAsgnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOwnerLockAsgnFlag(JAXBElement<Boolean> value) {
        this.ownerLockAsgnFlag = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the prTerritoryVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrTerritoryVersionId() {
        return prTerritoryVersionId;
    }

    /**
     * Sets the value of the prTerritoryVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrTerritoryVersionId(JAXBElement<Long> value) {
        this.prTerritoryVersionId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the forecastOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastOverrideCode() {
        return forecastOverrideCode;
    }

    /**
     * Sets the value of the forecastOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastOverrideCode(JAXBElement<String> value) {
        this.forecastOverrideCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerOrgTreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerOrgTreeCode() {
        return ownerOrgTreeCode;
    }

    /**
     * Sets the value of the ownerOrgTreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerOrgTreeCode(JAXBElement<String> value) {
        this.ownerOrgTreeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ownerOrgTreeStructCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerOrgTreeStructCode() {
        return ownerOrgTreeStructCode;
    }

    /**
     * Sets the value of the ownerOrgTreeStructCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerOrgTreeStructCode(JAXBElement<String> value) {
        this.ownerOrgTreeStructCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creditRcptPartOrgPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreditRcptPartOrgPartyId() {
        return creditRcptPartOrgPartyId;
    }

    /**
     * Sets the value of the creditRcptPartOrgPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreditRcptPartOrgPartyId(JAXBElement<Long> value) {
        this.creditRcptPartOrgPartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the creditRcptPartOrgPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRcptPartOrgPartyName() {
        return creditRcptPartOrgPartyName;
    }

    /**
     * Sets the value of the creditRcptPartOrgPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRcptPartOrgPartyName(String value) {
        this.creditRcptPartOrgPartyName = value;
    }

    /**
     * Gets the value of the assignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentType() {
        return assignmentType;
    }

    /**
     * Sets the value of the assignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentType(JAXBElement<String> value) {
        this.assignmentType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prTerritoryUpdatedById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrTerritoryUpdatedById() {
        return prTerritoryUpdatedById;
    }

    /**
     * Sets the value of the prTerritoryUpdatedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrTerritoryUpdatedById(JAXBElement<Long> value) {
        this.prTerritoryUpdatedById = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the prTerritoryUpdatedByPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrTerritoryUpdatedByPartyName() {
        return prTerritoryUpdatedByPartyName;
    }

    /**
     * Sets the value of the prTerritoryUpdatedByPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrTerritoryUpdatedByPartyName(String value) {
        this.prTerritoryUpdatedByPartyName = value;
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

}

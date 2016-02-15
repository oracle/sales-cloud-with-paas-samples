
package com.oracle.pts.opp.wsclient.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CategorySummaryRevenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategorySummaryRevenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BUOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RevnCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnLineTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RevnAmountCurcyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrmCurcyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConversionRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CrmCategorySummaryRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategorySummaryRevenue", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", propOrder = {
    "revnId",
    "revnNumber",
    "optyId",
    "buOrgId",
    "effectiveDate",
    "revnCategoryCode",
    "revnLineTypeCode",
    "revnAmount",
    "revnAmountCurcyCode",
    "primaryFlag",
    "crmCurcyCode",
    "crmConversionRateType",
    "crmConversionRate",
    "createdBy",
    "creationDate",
    "conflictId",
    "lastUpdatedBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "objectVersionNumber",
    "userLastUpdateDate",
    "crmCategorySummaryRevenue"
})
public class CategorySummaryRevenue {

    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElement(name = "RevnNumber")
    protected String revnNumber;
    @XmlElementRef(name = "OptyId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> optyId;
    @XmlElementRef(name = "BUOrgId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> buOrgId;
    @XmlElementRef(name = "EffectiveDate", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> effectiveDate;
    @XmlElementRef(name = "RevnCategoryCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> revnCategoryCode;
    @XmlElementRef(name = "RevnLineTypeCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> revnLineTypeCode;
    @XmlElementRef(name = "RevnAmount", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> revnAmount;
    @XmlElementRef(name = "RevnAmountCurcyCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> revnAmountCurcyCode;
    @XmlElementRef(name = "PrimaryFlag", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> primaryFlag;
    @XmlElementRef(name = "CrmCurcyCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> crmCurcyCode;
    @XmlElementRef(name = "CrmConversionRateType", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> crmConversionRateType;
    @XmlElementRef(name = "CrmConversionRate", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> crmConversionRate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "CrmCategorySummaryRevenue", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> crmCategorySummaryRevenue;

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
     * Gets the value of the revnCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevnCategoryCode() {
        return revnCategoryCode;
    }

    /**
     * Sets the value of the revnCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevnCategoryCode(JAXBElement<String> value) {
        this.revnCategoryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the revnLineTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevnLineTypeCode() {
        return revnLineTypeCode;
    }

    /**
     * Sets the value of the revnLineTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevnLineTypeCode(JAXBElement<String> value) {
        this.revnLineTypeCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the crmCurcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrmCurcyCode() {
        return crmCurcyCode;
    }

    /**
     * Sets the value of the crmCurcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrmCurcyCode(JAXBElement<String> value) {
        this.crmCurcyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crmConversionRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrmConversionRateType() {
        return crmConversionRateType;
    }

    /**
     * Sets the value of the crmConversionRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrmConversionRateType(JAXBElement<String> value) {
        this.crmConversionRateType = ((JAXBElement<String> ) value);
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
     * Gets the value of the crmCategorySummaryRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrmCategorySummaryRevenue() {
        return crmCategorySummaryRevenue;
    }

    /**
     * Sets the value of the crmCategorySummaryRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrmCategorySummaryRevenue(JAXBElement<BigDecimal> value) {
        this.crmCategorySummaryRevenue = ((JAXBElement<BigDecimal> ) value);
    }

}

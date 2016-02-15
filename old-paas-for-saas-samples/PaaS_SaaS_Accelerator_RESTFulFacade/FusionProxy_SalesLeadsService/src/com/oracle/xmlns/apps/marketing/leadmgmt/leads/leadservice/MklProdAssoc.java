
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.adf.svc.types.AmountType;
import com.oracle.xmlns.adf.svc.types.MeasureType;


/**
 * <p>Java class for MklProdAssoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MklProdAssoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeadProductId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedUnitPrice" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="InventoryItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AverageTimeToClose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MklProdAssoc", propOrder = {
    "leadProductId",
    "leadId",
    "organizationId",
    "currencyCode",
    "estimatedUnitPrice",
    "inventoryItemId",
    "primaryFlag",
    "productGroupId",
    "quantity",
    "uomCode",
    "description",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "objectVersionNumber",
    "averageTimeToClose",
    "productGroupName",
    "productGroupDescription",
    "productName",
    "productType",
    "longDescription",
    "amount"
})
public class MklProdAssoc {

    @XmlElement(name = "LeadProductId")
    protected Long leadProductId;
    @XmlElement(name = "LeadId")
    protected Long leadId;
    @XmlElementRef(name = "OrganizationId", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> organizationId;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "EstimatedUnitPrice", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> estimatedUnitPrice;
    @XmlElementRef(name = "InventoryItemId", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> inventoryItemId;
    @XmlElementRef(name = "PrimaryFlag", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> primaryFlag;
    @XmlElementRef(name = "ProductGroupId", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<Long> productGroupId;
    @XmlElement(name = "Quantity")
    protected MeasureType quantity;
    @XmlElementRef(name = "UOMCode", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> uomCode;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "AverageTimeToClose", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> averageTimeToClose;
    @XmlElement(name = "ProductGroupName")
    protected String productGroupName;
    @XmlElement(name = "ProductGroupDescription")
    protected String productGroupDescription;
    @XmlElementRef(name = "ProductName", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "ProductType", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> productType;
    @XmlElementRef(name = "LongDescription", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<String> longDescription;
    @XmlElementRef(name = "Amount", namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> amount;

    /**
     * Gets the value of the leadProductId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeadProductId() {
        return leadProductId;
    }

    /**
     * Sets the value of the leadProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeadProductId(Long value) {
        this.leadProductId = value;
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
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrganizationId(JAXBElement<Long> value) {
        this.organizationId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the estimatedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getEstimatedUnitPrice() {
        return estimatedUnitPrice;
    }

    /**
     * Sets the value of the estimatedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setEstimatedUnitPrice(JAXBElement<AmountType> value) {
        this.estimatedUnitPrice = ((JAXBElement<AmountType> ) value);
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
     * Gets the value of the productGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProductGroupId() {
        return productGroupId;
    }

    /**
     * Sets the value of the productGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProductGroupId(JAXBElement<Long> value) {
        this.productGroupId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setQuantity(MeasureType value) {
        this.quantity = value;
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
     * Gets the value of the averageTimeToClose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAverageTimeToClose() {
        return averageTimeToClose;
    }

    /**
     * Sets the value of the averageTimeToClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAverageTimeToClose(JAXBElement<BigDecimal> value) {
        this.averageTimeToClose = ((JAXBElement<BigDecimal> ) value);
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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductType(JAXBElement<String> value) {
        this.productType = ((JAXBElement<String> ) value);
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setAmount(JAXBElement<AmountType> value) {
        this.amount = ((JAXBElement<AmountType> ) value);
    }

}

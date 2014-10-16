
package com.oracle.xmlns.oracle.apps.sales.opptymgmt.revenues.revenueservice;

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
import com.oracle.xmlns.apps.sales.opptymgmt.revenues.revenueservice.Revenue;


/**
 * <p>Java class for RevenueLineSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenueLineSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnLineTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BUOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerResourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerResourceOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerOrgTreeStructCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerOrgTreeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnAmountCurcyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ProdGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}Revenue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueLineSet", propOrder = {
    "revnId",
    "revnLineTypeCode",
    "revnSequenceNumber",
    "optyId",
    "buOrgId",
    "customerPartyId",
    "customerAccountId",
    "ownerResourceId",
    "ownerResourceOrgId",
    "ownerOrgTreeStructCode",
    "ownerOrgTreeCode",
    "effectiveDate",
    "prodGroupId",
    "revnAmountCurcyCode",
    "revnAmount",
    "statusCode",
    "createdBy",
    "creationDate",
    "conflictId",
    "lastUpdatedBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "objectVersionNumber",
    "userLastUpdateDate",
    "prodGroupName",
    "revenue"
})
public class RevenueLineSet {

    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElementRef(name = "RevnLineTypeCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> revnLineTypeCode;
    @XmlElementRef(name = "RevnSequenceNumber", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Integer> revnSequenceNumber;
    @XmlElementRef(name = "OptyId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> optyId;
    @XmlElementRef(name = "BUOrgId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> buOrgId;
    @XmlElementRef(name = "CustomerPartyId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerPartyId;
    @XmlElementRef(name = "CustomerAccountId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> customerAccountId;
    @XmlElementRef(name = "OwnerResourceId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerResourceId;
    @XmlElementRef(name = "OwnerResourceOrgId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> ownerResourceOrgId;
    @XmlElementRef(name = "OwnerOrgTreeStructCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerOrgTreeStructCode;
    @XmlElementRef(name = "OwnerOrgTreeCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> ownerOrgTreeCode;
    @XmlElementRef(name = "EffectiveDate", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> effectiveDate;
    @XmlElementRef(name = "ProdGroupId", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<Long> prodGroupId;
    @XmlElementRef(name = "RevnAmountCurcyCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> revnAmountCurcyCode;
    @XmlElementRef(name = "RevnAmount", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<AmountType> revnAmount;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class)
    protected JAXBElement<String> statusCode;
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
    @XmlElement(name = "ProdGroupName")
    protected String prodGroupName;
    @XmlElement(name = "Revenue")
    protected List<Revenue> revenue;

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
     * Gets the value of the revnSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRevnSequenceNumber() {
        return revnSequenceNumber;
    }

    /**
     * Sets the value of the revnSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRevnSequenceNumber(JAXBElement<Integer> value) {
        this.revnSequenceNumber = ((JAXBElement<Integer> ) value);
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
     * Gets the value of the customerPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerPartyId() {
        return customerPartyId;
    }

    /**
     * Sets the value of the customerPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerPartyId(JAXBElement<Long> value) {
        this.customerPartyId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the ownerResourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerResourceId() {
        return ownerResourceId;
    }

    /**
     * Sets the value of the ownerResourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerResourceId(JAXBElement<Long> value) {
        this.ownerResourceId = ((JAXBElement<Long> ) value);
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
     * Gets the value of the prodGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdGroupName() {
        return prodGroupName;
    }

    /**
     * Sets the value of the prodGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdGroupName(String value) {
        this.prodGroupName = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Revenue }
     * 
     * 
     */
    public List<Revenue> getRevenue() {
        if (revenue == null) {
            revenue = new ArrayList<Revenue>();
        }
        return this.revenue;
    }

}

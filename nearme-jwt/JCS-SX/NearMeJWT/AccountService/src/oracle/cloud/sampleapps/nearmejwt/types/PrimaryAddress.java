/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */

package oracle.cloud.sampleapps.nearmejwt.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrimaryAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressElementAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FloorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalPlus4Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Mailstop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLinesPhonetic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateValidated" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="HouseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedMultiLineAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", propOrder = {
    "addressId",
    "addressNumber",
    "sourceSystem",
    "sourceSystemReferenceValue",
    "locationId",
    "partyId",
    "addressElementAttribute1",
    "addressElementAttribute2",
    "addressElementAttribute3",
    "addressElementAttribute4",
    "addressElementAttribute5",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "building",
    "city",
    "country",
    "county",
    "floorNumber",
    "postalCode",
    "postalPlus4Code",
    "province",
    "state",
    "latitude",
    "longitude",
    "mailstop",
    "addressLinesPhonetic",
    "comments",
    "description",
    "dateValidated",
    "houseType",
    "locationDirections",
    "validatedFlag",
    "validationStatusCode",
    "formattedAddress",
    "formattedMultiLineAddress",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "deleteFlag",
    "corpCurrencyCode",
    "curcyConvRateType",
    "currencyCode"
})
public class PrimaryAddress {

    @XmlElement(name = "AddressId")
    protected Long addressId;
    @XmlElement(name = "AddressNumber")
    protected String addressNumber;
    @XmlElementRef(name = "SourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystem;
    @XmlElementRef(name = "SourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceSystemReferenceValue;
    @XmlElement(name = "LocationId")
    protected Long locationId;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "AddressElementAttribute1", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressElementAttribute1;
    @XmlElementRef(name = "AddressElementAttribute2", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressElementAttribute2;
    @XmlElementRef(name = "AddressElementAttribute3", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressElementAttribute3;
    @XmlElementRef(name = "AddressElementAttribute4", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressElementAttribute4;
    @XmlElementRef(name = "AddressElementAttribute5", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressElementAttribute5;
    @XmlElementRef(name = "AddressLine1", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "AddressLine4", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressLine4;
    @XmlElementRef(name = "Building", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> building;
    @XmlElementRef(name = "City", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElementRef(name = "County", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "FloorNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> floorNumber;
    @XmlElementRef(name = "PostalCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "PostalPlus4Code", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> postalPlus4Code;
    @XmlElementRef(name = "Province", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> province;
    @XmlElementRef(name = "State", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Latitude", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> longitude;
    @XmlElementRef(name = "Mailstop", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> mailstop;
    @XmlElementRef(name = "AddressLinesPhonetic", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> addressLinesPhonetic;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DateValidated", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateValidated;
    @XmlElementRef(name = "HouseType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> houseType;
    @XmlElementRef(name = "LocationDirections", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> locationDirections;
    @XmlElementRef(name = "ValidatedFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> validatedFlag;
    @XmlElementRef(name = "ValidationStatusCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> validationStatusCode;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "FormattedMultiLineAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> formattedMultiLineAddress;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "DeleteFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<Boolean> deleteFlag;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddressId(Long value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystem(JAXBElement<String> value) {
        this.sourceSystem = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sourceSystemReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemReferenceValue() {
        return sourceSystemReferenceValue;
    }

    /**
     * Sets the value of the sourceSystemReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemReferenceValue(JAXBElement<String> value) {
        this.sourceSystemReferenceValue = ((JAXBElement<String> ) value);
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
     * Gets the value of the addressElementAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute1() {
        return addressElementAttribute1;
    }

    /**
     * Sets the value of the addressElementAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute1(JAXBElement<String> value) {
        this.addressElementAttribute1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressElementAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute2() {
        return addressElementAttribute2;
    }

    /**
     * Sets the value of the addressElementAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute2(JAXBElement<String> value) {
        this.addressElementAttribute2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressElementAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute3() {
        return addressElementAttribute3;
    }

    /**
     * Sets the value of the addressElementAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute3(JAXBElement<String> value) {
        this.addressElementAttribute3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressElementAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute4() {
        return addressElementAttribute4;
    }

    /**
     * Sets the value of the addressElementAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute4(JAXBElement<String> value) {
        this.addressElementAttribute4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressElementAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressElementAttribute5() {
        return addressElementAttribute5;
    }

    /**
     * Sets the value of the addressElementAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressElementAttribute5(JAXBElement<String> value) {
        this.addressElementAttribute5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine4(JAXBElement<String> value) {
        this.addressLine4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuilding(JAXBElement<String> value) {
        this.building = ((JAXBElement<String> ) value);
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
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the floorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFloorNumber() {
        return floorNumber;
    }

    /**
     * Sets the value of the floorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFloorNumber(JAXBElement<String> value) {
        this.floorNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the postalPlus4Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalPlus4Code() {
        return postalPlus4Code;
    }

    /**
     * Sets the value of the postalPlus4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalPlus4Code(JAXBElement<String> value) {
        this.postalPlus4Code = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvince(JAXBElement<String> value) {
        this.province = ((JAXBElement<String> ) value);
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
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<BigDecimal> value) {
        this.latitude = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<BigDecimal> value) {
        this.longitude = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the mailstop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailstop() {
        return mailstop;
    }

    /**
     * Sets the value of the mailstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailstop(JAXBElement<String> value) {
        this.mailstop = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLinesPhonetic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLinesPhonetic() {
        return addressLinesPhonetic;
    }

    /**
     * Sets the value of the addressLinesPhonetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLinesPhonetic(JAXBElement<String> value) {
        this.addressLinesPhonetic = ((JAXBElement<String> ) value);
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
     * Gets the value of the dateValidated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateValidated() {
        return dateValidated;
    }

    /**
     * Sets the value of the dateValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateValidated(JAXBElement<XMLGregorianCalendar> value) {
        this.dateValidated = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the houseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseType() {
        return houseType;
    }

    /**
     * Sets the value of the houseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseType(JAXBElement<String> value) {
        this.houseType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationDirections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDirections() {
        return locationDirections;
    }

    /**
     * Sets the value of the locationDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDirections(JAXBElement<String> value) {
        this.locationDirections = ((JAXBElement<String> ) value);
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
     * Gets the value of the validationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationStatusCode() {
        return validationStatusCode;
    }

    /**
     * Sets the value of the validationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationStatusCode(JAXBElement<String> value) {
        this.validationStatusCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the formattedMultiLineAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedMultiLineAddress() {
        return formattedMultiLineAddress;
    }

    /**
     * Sets the value of the formattedMultiLineAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedMultiLineAddress(JAXBElement<String> value) {
        this.formattedMultiLineAddress = ((JAXBElement<String> ) value);
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
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleteFlag(JAXBElement<Boolean> value) {
        this.deleteFlag = ((JAXBElement<Boolean> ) value);
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

}

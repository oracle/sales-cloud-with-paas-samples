
package com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPersonDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPersonDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Honors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreNameAdjunct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KnownAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneCountryCodeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FaxAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxCountryCodeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPersonDetails", propOrder = {
    "personId",
    "personNameId",
    "title",
    "lastName",
    "firstName",
    "middleNames",
    "displayName",
    "suffix",
    "honors",
    "preNameAdjunct",
    "knownAs",
    "nameType",
    "emailAddressId",
    "emailAddress",
    "phoneId",
    "phoneAreaCode",
    "phoneCountryCodeNumber",
    "phoneNumber",
    "faxId",
    "faxAreaCode",
    "faxCountryCodeNumber",
    "faxNumber"
})
public class UserPersonDetails {

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "PersonNameId")
    protected Long personNameId;
    @XmlElementRef(name = "Title", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> title;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElementRef(name = "FirstName", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "MiddleNames", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> middleNames;
    @XmlElementRef(name = "DisplayName", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "Suffix", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> suffix;
    @XmlElementRef(name = "Honors", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> honors;
    @XmlElementRef(name = "PreNameAdjunct", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> preNameAdjunct;
    @XmlElementRef(name = "KnownAs", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> knownAs;
    @XmlElement(name = "NameType")
    protected String nameType;
    @XmlElement(name = "EmailAddressId")
    protected Long emailAddressId;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> emailAddress;
    @XmlElement(name = "PhoneId")
    protected Long phoneId;
    @XmlElementRef(name = "PhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> phoneAreaCode;
    @XmlElementRef(name = "PhoneCountryCodeNumber", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> phoneCountryCodeNumber;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> phoneNumber;
    @XmlElement(name = "FaxId")
    protected Long faxId;
    @XmlElementRef(name = "FaxAreaCode", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> faxAreaCode;
    @XmlElementRef(name = "FaxCountryCodeNumber", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> faxCountryCodeNumber;
    @XmlElementRef(name = "FaxNumber", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> faxNumber;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the personNameId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonNameId() {
        return personNameId;
    }

    /**
     * Sets the value of the personNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonNameId(Long value) {
        this.personNameId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the middleNames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleNames() {
        return middleNames;
    }

    /**
     * Sets the value of the middleNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleNames(JAXBElement<String> value) {
        this.middleNames = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the honors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHonors() {
        return honors;
    }

    /**
     * Sets the value of the honors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHonors(JAXBElement<String> value) {
        this.honors = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the preNameAdjunct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreNameAdjunct() {
        return preNameAdjunct;
    }

    /**
     * Sets the value of the preNameAdjunct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreNameAdjunct(JAXBElement<String> value) {
        this.preNameAdjunct = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the knownAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKnownAs() {
        return knownAs;
    }

    /**
     * Sets the value of the knownAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKnownAs(JAXBElement<String> value) {
        this.knownAs = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the emailAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmailAddressId() {
        return emailAddressId;
    }

    /**
     * Sets the value of the emailAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmailAddressId(Long value) {
        this.emailAddressId = value;
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
     * Gets the value of the phoneId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhoneId() {
        return phoneId;
    }

    /**
     * Sets the value of the phoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhoneId(Long value) {
        this.phoneId = value;
    }

    /**
     * Gets the value of the phoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneAreaCode() {
        return phoneAreaCode;
    }

    /**
     * Sets the value of the phoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneAreaCode(JAXBElement<String> value) {
        this.phoneAreaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneCountryCodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneCountryCodeNumber() {
        return phoneCountryCodeNumber;
    }

    /**
     * Sets the value of the phoneCountryCodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneCountryCodeNumber(JAXBElement<String> value) {
        this.phoneCountryCodeNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFaxId() {
        return faxId;
    }

    /**
     * Sets the value of the faxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFaxId(Long value) {
        this.faxId = value;
    }

    /**
     * Gets the value of the faxAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxAreaCode() {
        return faxAreaCode;
    }

    /**
     * Sets the value of the faxAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxAreaCode(JAXBElement<String> value) {
        this.faxAreaCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxCountryCodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxCountryCodeNumber() {
        return faxCountryCodeNumber;
    }

    /**
     * Sets the value of the faxCountryCodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxCountryCodeNumber(JAXBElement<String> value) {
        this.faxCountryCodeNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = ((JAXBElement<String> ) value);
    }

}

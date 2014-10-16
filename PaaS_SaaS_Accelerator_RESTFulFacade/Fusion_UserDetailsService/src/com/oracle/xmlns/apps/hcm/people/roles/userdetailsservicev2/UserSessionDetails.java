
package com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserSessionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSessionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupingSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecimalSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientEncoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessibilityMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorContrast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSessionDetails", propOrder = {
    "personId",
    "language",
    "dateFormat",
    "timeFormat",
    "numberFormat",
    "currency",
    "groupingSeparator",
    "decimalSeparator",
    "timeZone",
    "clientEncoding",
    "territory",
    "fontSize",
    "accessibilityMode",
    "colorContrast",
    "serverTime"
})
public class UserSessionDetails {

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElementRef(name = "Language", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "DateFormat", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> dateFormat;
    @XmlElementRef(name = "TimeFormat", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> timeFormat;
    @XmlElementRef(name = "NumberFormat", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> numberFormat;
    @XmlElementRef(name = "Currency", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "GroupingSeparator", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> groupingSeparator;
    @XmlElementRef(name = "DecimalSeparator", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> decimalSeparator;
    @XmlElementRef(name = "TimeZone", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> timeZone;
    @XmlElementRef(name = "ClientEncoding", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> clientEncoding;
    @XmlElementRef(name = "Territory", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> territory;
    @XmlElementRef(name = "FontSize", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> fontSize;
    @XmlElementRef(name = "AccessibilityMode", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> accessibilityMode;
    @XmlElementRef(name = "ColorContrast", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> colorContrast;
    @XmlElementRef(name = "ServerTime", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> serverTime;

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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateFormat(JAXBElement<String> value) {
        this.dateFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeFormat(JAXBElement<String> value) {
        this.timeFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numberFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberFormat() {
        return numberFormat;
    }

    /**
     * Sets the value of the numberFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberFormat(JAXBElement<String> value) {
        this.numberFormat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the groupingSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupingSeparator() {
        return groupingSeparator;
    }

    /**
     * Sets the value of the groupingSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupingSeparator(JAXBElement<String> value) {
        this.groupingSeparator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the decimalSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Sets the value of the decimalSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDecimalSeparator(JAXBElement<String> value) {
        this.decimalSeparator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<String> value) {
        this.timeZone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientEncoding() {
        return clientEncoding;
    }

    /**
     * Sets the value of the clientEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientEncoding(JAXBElement<String> value) {
        this.clientEncoding = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritory(JAXBElement<String> value) {
        this.territory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFontSize(JAXBElement<String> value) {
        this.fontSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the accessibilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccessibilityMode() {
        return accessibilityMode;
    }

    /**
     * Sets the value of the accessibilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccessibilityMode(JAXBElement<String> value) {
        this.accessibilityMode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the colorContrast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColorContrast() {
        return colorContrast;
    }

    /**
     * Sets the value of the colorContrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColorContrast(JAXBElement<String> value) {
        this.colorContrast = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serverTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getServerTime() {
        return serverTime;
    }

    /**
     * Sets the value of the serverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setServerTime(JAXBElement<XMLGregorianCalendar> value) {
        this.serverTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}

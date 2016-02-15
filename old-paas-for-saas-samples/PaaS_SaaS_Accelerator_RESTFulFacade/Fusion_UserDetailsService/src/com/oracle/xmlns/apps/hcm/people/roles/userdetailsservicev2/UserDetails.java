
package com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CredentialsEmailSent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDistinguishedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPersonDetails" type="{http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/}UserPersonDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserSessionDetails" type="{http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/}UserSessionDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserWorkRelationshipDetails" type="{http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/}UserWorkRelationshipDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetails", propOrder = {
    "personId",
    "personNumber",
    "userId",
    "username",
    "userGUID",
    "activeFlag",
    "credentialsEmailSent",
    "userDistinguishedName",
    "userPersonDetails",
    "userSessionDetails",
    "userWorkRelationshipDetails"
})
public class UserDetails {

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "PersonNumber")
    protected String personNumber;
    @XmlElement(name = "UserId")
    protected Long userId;
    @XmlElementRef(name = "Username", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "UserGUID", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> userGUID;
    @XmlElement(name = "ActiveFlag")
    protected Boolean activeFlag;
    @XmlElementRef(name = "CredentialsEmailSent", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> credentialsEmailSent;
    @XmlElementRef(name = "UserDistinguishedName", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", type = JAXBElement.class)
    protected JAXBElement<String> userDistinguishedName;
    @XmlElement(name = "UserPersonDetails")
    protected List<UserPersonDetails> userPersonDetails;
    @XmlElement(name = "UserSessionDetails")
    protected List<UserSessionDetails> userSessionDetails;
    @XmlElement(name = "UserWorkRelationshipDetails")
    protected List<UserWorkRelationshipDetails> userWorkRelationshipDetails;

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
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNumber(String value) {
        this.personNumber = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserGUID() {
        return userGUID;
    }

    /**
     * Sets the value of the userGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserGUID(JAXBElement<String> value) {
        this.userGUID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveFlag(Boolean value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the credentialsEmailSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredentialsEmailSent() {
        return credentialsEmailSent;
    }

    /**
     * Sets the value of the credentialsEmailSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredentialsEmailSent(JAXBElement<String> value) {
        this.credentialsEmailSent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userDistinguishedName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDistinguishedName() {
        return userDistinguishedName;
    }

    /**
     * Sets the value of the userDistinguishedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDistinguishedName(JAXBElement<String> value) {
        this.userDistinguishedName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userPersonDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPersonDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPersonDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserPersonDetails }
     * 
     * 
     */
    public List<UserPersonDetails> getUserPersonDetails() {
        if (userPersonDetails == null) {
            userPersonDetails = new ArrayList<UserPersonDetails>();
        }
        return this.userPersonDetails;
    }

    /**
     * Gets the value of the userSessionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSessionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSessionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserSessionDetails }
     * 
     * 
     */
    public List<UserSessionDetails> getUserSessionDetails() {
        if (userSessionDetails == null) {
            userSessionDetails = new ArrayList<UserSessionDetails>();
        }
        return this.userSessionDetails;
    }

    /**
     * Gets the value of the userWorkRelationshipDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userWorkRelationshipDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserWorkRelationshipDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserWorkRelationshipDetails }
     * 
     * 
     */
    public List<UserWorkRelationshipDetails> getUserWorkRelationshipDetails() {
        if (userWorkRelationshipDetails == null) {
            userWorkRelationshipDetails = new ArrayList<UserWorkRelationshipDetails>();
        }
        return this.userWorkRelationshipDetails;
    }

}

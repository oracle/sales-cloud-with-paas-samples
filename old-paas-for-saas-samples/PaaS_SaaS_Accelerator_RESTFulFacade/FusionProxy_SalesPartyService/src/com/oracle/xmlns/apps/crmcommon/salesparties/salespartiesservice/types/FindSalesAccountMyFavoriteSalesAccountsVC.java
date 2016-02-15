
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="findCriteria" type="{http://xmlns.oracle.com/adf/svc/types/}FindCriteria"/>
 *         &lt;element name="BindPartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindResourcePartyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindTerritory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="findControl" type="{http://xmlns.oracle.com/adf/svc/types/}FindControl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "findCriteria",
    "bindPartyUniqueName",
    "bindOwner",
    "bindPartyNumber",
    "bindAddress1",
    "bindAddress2",
    "bindCity",
    "bindState",
    "bindPostalCode",
    "bindCountry",
    "bindResourcePartyName",
    "bindTerritory",
    "findControl"
})
@XmlRootElement(name = "findSalesAccountMyFavoriteSalesAccountsVC")
public class FindSalesAccountMyFavoriteSalesAccountsVC {

    @XmlElement(required = true)
    protected FindCriteria findCriteria;
    @XmlElement(name = "BindPartyUniqueName", required = true)
    protected String bindPartyUniqueName;
    @XmlElement(name = "BindOwner", required = true)
    protected String bindOwner;
    @XmlElement(name = "BindPartyNumber", required = true)
    protected String bindPartyNumber;
    @XmlElement(name = "BindAddress1", required = true)
    protected String bindAddress1;
    @XmlElement(name = "BindAddress2", required = true)
    protected String bindAddress2;
    @XmlElement(name = "BindCity", required = true)
    protected String bindCity;
    @XmlElement(name = "BindState", required = true)
    protected String bindState;
    @XmlElement(name = "BindPostalCode", required = true)
    protected String bindPostalCode;
    @XmlElement(name = "BindCountry", required = true)
    protected String bindCountry;
    @XmlElement(name = "BindResourcePartyName", required = true)
    protected String bindResourcePartyName;
    @XmlElement(name = "BindTerritory", required = true)
    protected String bindTerritory;
    @XmlElement(required = true)
    protected FindControl findControl;

    /**
     * Gets the value of the findCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FindCriteria }
     *     
     */
    public FindCriteria getFindCriteria() {
        return findCriteria;
    }

    /**
     * Sets the value of the findCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCriteria }
     *     
     */
    public void setFindCriteria(FindCriteria value) {
        this.findCriteria = value;
    }

    /**
     * Gets the value of the bindPartyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindPartyUniqueName() {
        return bindPartyUniqueName;
    }

    /**
     * Sets the value of the bindPartyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindPartyUniqueName(String value) {
        this.bindPartyUniqueName = value;
    }

    /**
     * Gets the value of the bindOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindOwner() {
        return bindOwner;
    }

    /**
     * Sets the value of the bindOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindOwner(String value) {
        this.bindOwner = value;
    }

    /**
     * Gets the value of the bindPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindPartyNumber() {
        return bindPartyNumber;
    }

    /**
     * Sets the value of the bindPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindPartyNumber(String value) {
        this.bindPartyNumber = value;
    }

    /**
     * Gets the value of the bindAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindAddress1() {
        return bindAddress1;
    }

    /**
     * Sets the value of the bindAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindAddress1(String value) {
        this.bindAddress1 = value;
    }

    /**
     * Gets the value of the bindAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindAddress2() {
        return bindAddress2;
    }

    /**
     * Sets the value of the bindAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindAddress2(String value) {
        this.bindAddress2 = value;
    }

    /**
     * Gets the value of the bindCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindCity() {
        return bindCity;
    }

    /**
     * Sets the value of the bindCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindCity(String value) {
        this.bindCity = value;
    }

    /**
     * Gets the value of the bindState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindState() {
        return bindState;
    }

    /**
     * Sets the value of the bindState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindState(String value) {
        this.bindState = value;
    }

    /**
     * Gets the value of the bindPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindPostalCode() {
        return bindPostalCode;
    }

    /**
     * Sets the value of the bindPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindPostalCode(String value) {
        this.bindPostalCode = value;
    }

    /**
     * Gets the value of the bindCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindCountry() {
        return bindCountry;
    }

    /**
     * Sets the value of the bindCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindCountry(String value) {
        this.bindCountry = value;
    }

    /**
     * Gets the value of the bindResourcePartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindResourcePartyName() {
        return bindResourcePartyName;
    }

    /**
     * Sets the value of the bindResourcePartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindResourcePartyName(String value) {
        this.bindResourcePartyName = value;
    }

    /**
     * Gets the value of the bindTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindTerritory() {
        return bindTerritory;
    }

    /**
     * Sets the value of the bindTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindTerritory(String value) {
        this.bindTerritory = value;
    }

    /**
     * Gets the value of the findControl property.
     * 
     * @return
     *     possible object is
     *     {@link FindControl }
     *     
     */
    public FindControl getFindControl() {
        return findControl;
    }

    /**
     * Sets the value of the findControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindControl }
     *     
     */
    public void setFindControl(FindControl value) {
        this.findControl = value;
    }

}

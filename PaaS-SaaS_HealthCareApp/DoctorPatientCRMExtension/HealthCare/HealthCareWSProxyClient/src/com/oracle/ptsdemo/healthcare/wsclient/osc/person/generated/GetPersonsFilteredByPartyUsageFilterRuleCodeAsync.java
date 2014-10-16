
package com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="bindPartyUsageFrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bindEffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date"/>
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
    "bindPartyUsageFrCode",
    "bindEffectiveDate",
    "findControl"
})
@XmlRootElement(name = "getPersonsFilteredByPartyUsageFilterRuleCodeAsync")
public class GetPersonsFilteredByPartyUsageFilterRuleCodeAsync {

    @XmlElement(required = true)
    protected FindCriteria findCriteria;
    @XmlElement(required = true)
    protected String bindPartyUsageFrCode;
    @XmlElement(required = true)
    protected XMLGregorianCalendar bindEffectiveDate;
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
     * Gets the value of the bindPartyUsageFrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindPartyUsageFrCode() {
        return bindPartyUsageFrCode;
    }

    /**
     * Sets the value of the bindPartyUsageFrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindPartyUsageFrCode(String value) {
        this.bindPartyUsageFrCode = value;
    }

    /**
     * Gets the value of the bindEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBindEffectiveDate() {
        return bindEffectiveDate;
    }

    /**
     * Sets the value of the bindEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBindEffectiveDate(XMLGregorianCalendar value) {
        this.bindEffectiveDate = value;
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

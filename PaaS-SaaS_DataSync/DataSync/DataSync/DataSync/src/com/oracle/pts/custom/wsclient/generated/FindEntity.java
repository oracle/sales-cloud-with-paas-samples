
package com.oracle.pts.custom.wsclient.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="findControl" type="{http://xmlns.oracle.com/adf/svc/types/}FindControl"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "findControl",
    "objectName"
})
@XmlRootElement(name = "findEntity", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/")
public class FindEntity {

    @XmlElement(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/", required = true)
    protected FindCriteria findCriteria;
    @XmlElement(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/", required = true)
    protected FindControl findControl;
    @XmlElement(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/", required = true)
    protected String objectName;

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

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

}

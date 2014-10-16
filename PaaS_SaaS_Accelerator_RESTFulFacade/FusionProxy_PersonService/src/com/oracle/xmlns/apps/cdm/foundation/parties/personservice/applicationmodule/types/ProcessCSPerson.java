
package com.oracle.xmlns.apps.cdm.foundation.parties.personservice.applicationmodule.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.types.ProcessControl;
import com.oracle.xmlns.adf.svc.types.ProcessData;


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
 *         &lt;element name="processData" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessData"/>
 *         &lt;element name="processControl" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessControl"/>
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
    "processData",
    "processControl"
})
@XmlRootElement(name = "processCSPerson")
public class ProcessCSPerson {

    @XmlElement(required = true)
    protected ProcessData processData;
    @XmlElement(required = true)
    protected ProcessControl processControl;

    /**
     * Gets the value of the processData property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessData }
     *     
     */
    public ProcessData getProcessData() {
        return processData;
    }

    /**
     * Sets the value of the processData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessData }
     *     
     */
    public void setProcessData(ProcessData value) {
        this.processData = value;
    }

    /**
     * Gets the value of the processControl property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessControl }
     *     
     */
    public ProcessControl getProcessControl() {
        return processControl;
    }

    /**
     * Sets the value of the processControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessControl }
     *     
     */
    public void setProcessControl(ProcessControl value) {
        this.processControl = value;
    }

}

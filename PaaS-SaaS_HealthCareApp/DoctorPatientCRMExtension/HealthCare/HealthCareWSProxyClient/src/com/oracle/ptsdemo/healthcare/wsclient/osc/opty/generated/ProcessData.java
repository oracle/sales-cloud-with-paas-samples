
package com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/types/}MethodResult">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangeSummary" type="{commonj.sdo}ChangeSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessData", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "value",
    "changeSummary"
})
public class ProcessData
    extends MethodResult
{

    @XmlElement(name = "Value")
    protected List<Object> value;
    @XmlElement(name = "ChangeSummary")
    protected ChangeSummaryType changeSummary;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    /**
     * Gets the value of the changeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSummaryType }
     *     
     */
    public ChangeSummaryType getChangeSummary() {
        return changeSummary;
    }

    /**
     * Sets the value of the changeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSummaryType }
     *     
     */
    public void setChangeSummary(ChangeSummaryType value) {
        this.changeSummary = value;
    }

}

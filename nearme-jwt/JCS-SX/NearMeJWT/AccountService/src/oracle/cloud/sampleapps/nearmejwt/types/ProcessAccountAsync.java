/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */

package oracle.cloud.sampleapps.nearmejwt.types;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="changeOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/accountService/}Account" maxOccurs="unbounded" minOccurs="0"/>
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
    "changeOperation",
    "account",
    "processControl"
})
@XmlRootElement(name = "processAccountAsync")
public class ProcessAccountAsync {

    @XmlElement(required = true)
    protected String changeOperation;
    protected List<Account> account;
    @XmlElement(required = true)
    protected ProcessControl processControl;

    /**
     * Gets the value of the changeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeOperation() {
        return changeOperation;
    }

    /**
     * Sets the value of the changeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeOperation(String value) {
        this.changeOperation = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
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

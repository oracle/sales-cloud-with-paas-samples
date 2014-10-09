
package com.oracle.ptsdemo.oscproxyclient.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeleteEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteEntitySequenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeleteGroupSequenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EntitySequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeleteEntityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pk1Value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pk2Value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pk3Value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pk4Value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pk5Value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeleteStatusType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeleteDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="DeleteErrorVO" type="{http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/}DeleteError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteEntity", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", propOrder = {
    "deleteEntitySequenceId",
    "deleteGroupSequenceId",
    "entitySequenceNumber",
    "deleteEntityType",
    "pk1Value",
    "pk2Value",
    "pk3Value",
    "pk4Value",
    "pk5Value",
    "deleteStatusType",
    "deleteDate",
    "deleteErrorVO"
})
public class DeleteEntity {

    @XmlElement(name = "DeleteEntitySequenceId")
    protected Long deleteEntitySequenceId;
    @XmlElement(name = "DeleteGroupSequenceId")
    protected Long deleteGroupSequenceId;
    @XmlElementRef(name = "EntitySequenceNumber", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Long> entitySequenceNumber;
    @XmlElementRef(name = "DeleteEntityType", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Integer> deleteEntityType;
    @XmlElementRef(name = "Pk1Value", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Long> pk1Value;
    @XmlElementRef(name = "Pk2Value", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Long> pk2Value;
    @XmlElementRef(name = "Pk3Value", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Long> pk3Value;
    @XmlElementRef(name = "Pk4Value", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Long> pk4Value;
    @XmlElementRef(name = "Pk5Value", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Long> pk5Value;
    @XmlElementRef(name = "DeleteStatusType", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Integer> deleteStatusType;
    @XmlElementRef(name = "DeleteDate", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> deleteDate;
    @XmlElement(name = "DeleteErrorVO")
    protected List<DeleteError> deleteErrorVO;

    /**
     * Gets the value of the deleteEntitySequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeleteEntitySequenceId() {
        return deleteEntitySequenceId;
    }

    /**
     * Sets the value of the deleteEntitySequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeleteEntitySequenceId(Long value) {
        this.deleteEntitySequenceId = value;
    }

    /**
     * Gets the value of the deleteGroupSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeleteGroupSequenceId() {
        return deleteGroupSequenceId;
    }

    /**
     * Sets the value of the deleteGroupSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeleteGroupSequenceId(Long value) {
        this.deleteGroupSequenceId = value;
    }

    /**
     * Gets the value of the entitySequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEntitySequenceNumber() {
        return entitySequenceNumber;
    }

    /**
     * Sets the value of the entitySequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEntitySequenceNumber(JAXBElement<Long> value) {
        this.entitySequenceNumber = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the deleteEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeleteEntityType() {
        return deleteEntityType;
    }

    /**
     * Sets the value of the deleteEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeleteEntityType(JAXBElement<Integer> value) {
        this.deleteEntityType = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the pk1Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPk1Value() {
        return pk1Value;
    }

    /**
     * Sets the value of the pk1Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPk1Value(JAXBElement<Long> value) {
        this.pk1Value = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the pk2Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPk2Value() {
        return pk2Value;
    }

    /**
     * Sets the value of the pk2Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPk2Value(JAXBElement<Long> value) {
        this.pk2Value = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the pk3Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPk3Value() {
        return pk3Value;
    }

    /**
     * Sets the value of the pk3Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPk3Value(JAXBElement<Long> value) {
        this.pk3Value = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the pk4Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPk4Value() {
        return pk4Value;
    }

    /**
     * Sets the value of the pk4Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPk4Value(JAXBElement<Long> value) {
        this.pk4Value = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the pk5Value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPk5Value() {
        return pk5Value;
    }

    /**
     * Sets the value of the pk5Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPk5Value(JAXBElement<Long> value) {
        this.pk5Value = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the deleteStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeleteStatusType() {
        return deleteStatusType;
    }

    /**
     * Sets the value of the deleteStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeleteStatusType(JAXBElement<Integer> value) {
        this.deleteStatusType = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the deleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeleteDate() {
        return deleteDate;
    }

    /**
     * Sets the value of the deleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeleteDate(JAXBElement<XMLGregorianCalendar> value) {
        this.deleteDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the deleteErrorVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteErrorVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteErrorVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteError }
     * 
     * 
     */
    public List<DeleteError> getDeleteErrorVO() {
        if (deleteErrorVO == null) {
            deleteErrorVO = new ArrayList<DeleteError>();
        }
        return this.deleteErrorVO;
    }

}

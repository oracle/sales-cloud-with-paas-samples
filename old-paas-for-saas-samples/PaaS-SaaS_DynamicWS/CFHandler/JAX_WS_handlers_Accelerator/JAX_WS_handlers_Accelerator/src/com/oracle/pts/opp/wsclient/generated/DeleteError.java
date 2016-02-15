
package com.oracle.pts.opp.wsclient.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteEntitySequenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ErrorSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeleteErrorType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteError", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", propOrder = {
    "deleteEntitySequenceId",
    "errorSequenceNumber",
    "deleteErrorType",
    "errorCode",
    "errorMessage",
    "objectVersionNumber",
    "programName"
})
public class DeleteError {

    @XmlElement(name = "DeleteEntitySequenceId")
    protected Long deleteEntitySequenceId;
    @XmlElement(name = "ErrorSequenceNumber")
    protected Long errorSequenceNumber;
    @XmlElementRef(name = "DeleteErrorType", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<Integer> deleteErrorType;
    @XmlElementRef(name = "ErrorCode", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "ProgramName", namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", type = JAXBElement.class)
    protected JAXBElement<String> programName;

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
     * Gets the value of the errorSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getErrorSequenceNumber() {
        return errorSequenceNumber;
    }

    /**
     * Sets the value of the errorSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setErrorSequenceNumber(Long value) {
        this.errorSequenceNumber = value;
    }

    /**
     * Gets the value of the deleteErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeleteErrorType() {
        return deleteErrorType;
    }

    /**
     * Sets the value of the deleteErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeleteErrorType(JAXBElement<Integer> value) {
        this.deleteErrorType = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<String> value) {
        this.errorCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgramName(JAXBElement<String> value) {
        this.programName = ((JAXBElement<String> ) value);
    }

}

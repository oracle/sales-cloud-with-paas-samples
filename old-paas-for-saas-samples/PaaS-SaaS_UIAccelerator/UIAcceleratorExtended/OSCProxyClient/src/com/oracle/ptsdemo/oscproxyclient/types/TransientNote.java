
package com.oracle.ptsdemo.oscproxyclient.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransientNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransientNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteTxt" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="VisibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransientNote", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", propOrder = {
    "noteId",
    "sourceObjectId",
    "sourceObjectCode",
    "noteTypeCode",
    "noteTxt",
    "visibilityCode",
    "partyName",
    "partyId"
})
public class TransientNote {

    @XmlElementRef(name = "NoteId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> noteId;
    @XmlElementRef(name = "SourceObjectId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<Long> sourceObjectId;
    @XmlElementRef(name = "SourceObjectCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> sourceObjectCode;
    @XmlElementRef(name = "NoteTypeCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> noteTypeCode;
    @XmlElementRef(name = "NoteTxt", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<byte[]> noteTxt;
    @XmlElementRef(name = "VisibilityCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> visibilityCode;
    @XmlElementRef(name = "PartyName", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyName;
    @XmlElementRef(name = "PartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", type = JAXBElement.class)
    protected JAXBElement<String> partyId;

    /**
     * Gets the value of the noteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNoteId(JAXBElement<Long> value) {
        this.noteId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the sourceObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSourceObjectId() {
        return sourceObjectId;
    }

    /**
     * Sets the value of the sourceObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSourceObjectId(JAXBElement<Long> value) {
        this.sourceObjectId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the sourceObjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceObjectCode() {
        return sourceObjectCode;
    }

    /**
     * Sets the value of the sourceObjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceObjectCode(JAXBElement<String> value) {
        this.sourceObjectCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noteTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteTypeCode() {
        return noteTypeCode;
    }

    /**
     * Sets the value of the noteTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteTypeCode(JAXBElement<String> value) {
        this.noteTypeCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noteTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getNoteTxt() {
        return noteTxt;
    }

    /**
     * Sets the value of the noteTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setNoteTxt(JAXBElement<byte[]> value) {
        this.noteTxt = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the visibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisibilityCode() {
        return visibilityCode;
    }

    /**
     * Sets the value of the visibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisibilityCode(JAXBElement<String> value) {
        this.visibilityCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyName(JAXBElement<String> value) {
        this.partyName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyId(JAXBElement<String> value) {
        this.partyId = ((JAXBElement<String> ) value);
    }

}

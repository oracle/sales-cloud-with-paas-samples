
package com.oracle.ptsdemo.oscproxyclient.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Note complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteTxt" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="NoteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatorPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NoteAttributeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteAttributeUid5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Dff" type="{http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/}NoteDFF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", propOrder = {
    "noteId",
    "sourceObjectCode",
    "sourceObjectId",
    "partyName",
    "noteTxt",
    "noteTypeCode",
    "visibilityCode",
    "creatorPartyId",
    "noteAttributeCategory",
    "noteAttributeUid1",
    "noteAttributeUid2",
    "noteAttributeUid3",
    "noteAttributeUid4",
    "noteAttributeUid5",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "partyId",
    "corpCurrencyCode",
    "curcyConvRateType",
    "currencyCode",
    "contactRelationshipId",
    "dff"
})
public class Note {

    @XmlElement(name = "NoteId")
    protected Long noteId;
    @XmlElement(name = "SourceObjectCode")
    protected String sourceObjectCode;
    @XmlElement(name = "SourceObjectId")
    protected String sourceObjectId;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "NoteTxt")
    protected byte[] noteTxt;
    @XmlElement(name = "NoteTypeCode")
    protected String noteTypeCode;
    @XmlElement(name = "VisibilityCode")
    protected String visibilityCode;
    @XmlElementRef(name = "CreatorPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<Long> creatorPartyId;
    @XmlElementRef(name = "NoteAttributeCategory", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> noteAttributeCategory;
    @XmlElementRef(name = "NoteAttributeUid1", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> noteAttributeUid1;
    @XmlElementRef(name = "NoteAttributeUid2", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> noteAttributeUid2;
    @XmlElementRef(name = "NoteAttributeUid3", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> noteAttributeUid3;
    @XmlElementRef(name = "NoteAttributeUid4", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> noteAttributeUid4;
    @XmlElementRef(name = "NoteAttributeUid5", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> noteAttributeUid5;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "ContactRelationshipId", namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", type = JAXBElement.class)
    protected JAXBElement<Long> contactRelationshipId;
    @XmlElement(name = "Dff")
    protected NoteDFF dff;

    /**
     * Gets the value of the noteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoteId(Long value) {
        this.noteId = value;
    }

    /**
     * Gets the value of the sourceObjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceObjectCode() {
        return sourceObjectCode;
    }

    /**
     * Sets the value of the sourceObjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceObjectCode(String value) {
        this.sourceObjectCode = value;
    }

    /**
     * Gets the value of the sourceObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceObjectId() {
        return sourceObjectId;
    }

    /**
     * Sets the value of the sourceObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceObjectId(String value) {
        this.sourceObjectId = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the noteTxt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNoteTxt() {
        return noteTxt;
    }

    /**
     * Sets the value of the noteTxt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNoteTxt(byte[] value) {
        this.noteTxt = ((byte[]) value);
    }

    /**
     * Gets the value of the noteTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTypeCode() {
        return noteTypeCode;
    }

    /**
     * Sets the value of the noteTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTypeCode(String value) {
        this.noteTypeCode = value;
    }

    /**
     * Gets the value of the visibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityCode() {
        return visibilityCode;
    }

    /**
     * Sets the value of the visibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityCode(String value) {
        this.visibilityCode = value;
    }

    /**
     * Gets the value of the creatorPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreatorPartyId() {
        return creatorPartyId;
    }

    /**
     * Sets the value of the creatorPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreatorPartyId(JAXBElement<Long> value) {
        this.creatorPartyId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the noteAttributeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeCategory() {
        return noteAttributeCategory;
    }

    /**
     * Sets the value of the noteAttributeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeCategory(JAXBElement<String> value) {
        this.noteAttributeCategory = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noteAttributeUid1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid1() {
        return noteAttributeUid1;
    }

    /**
     * Sets the value of the noteAttributeUid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid1(JAXBElement<String> value) {
        this.noteAttributeUid1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noteAttributeUid2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid2() {
        return noteAttributeUid2;
    }

    /**
     * Sets the value of the noteAttributeUid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid2(JAXBElement<String> value) {
        this.noteAttributeUid2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noteAttributeUid3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid3() {
        return noteAttributeUid3;
    }

    /**
     * Sets the value of the noteAttributeUid3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid3(JAXBElement<String> value) {
        this.noteAttributeUid3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noteAttributeUid4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid4() {
        return noteAttributeUid4;
    }

    /**
     * Sets the value of the noteAttributeUid4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid4(JAXBElement<String> value) {
        this.noteAttributeUid4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the noteAttributeUid5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteAttributeUid5() {
        return noteAttributeUid5;
    }

    /**
     * Sets the value of the noteAttributeUid5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteAttributeUid5(JAXBElement<String> value) {
        this.noteAttributeUid5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContactRelationshipId() {
        return contactRelationshipId;
    }

    /**
     * Sets the value of the contactRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContactRelationshipId(JAXBElement<Long> value) {
        this.contactRelationshipId = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the dff property.
     * 
     * @return
     *     possible object is
     *     {@link NoteDFF }
     *     
     */
    public NoteDFF getDff() {
        return dff;
    }

    /**
     * Sets the value of the dff property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteDFF }
     *     
     */
    public void setDff(NoteDFF value) {
        this.dff = value;
    }

}

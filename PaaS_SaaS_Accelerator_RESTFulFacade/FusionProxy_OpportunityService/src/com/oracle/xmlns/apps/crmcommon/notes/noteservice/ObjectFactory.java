
package com.oracle.xmlns.apps.crmcommon.notes.noteservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.notes.noteservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Note_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "note");
    private final static QName _NoteNoteAttributeUid2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid2");
    private final static QName _NoteNoteAttributeUid3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid3");
    private final static QName _NoteNoteAttributeUid4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid4");
    private final static QName _NoteNoteAttributeUid5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid5");
    private final static QName _NoteNoteAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeCategory");
    private final static QName _NoteContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "ContactRelationshipId");
    private final static QName _NoteNoteAttributeUid1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid1");
    private final static QName _NoteCreatorPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CreatorPartyId");
    private final static QName _NoteCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CurcyConvRateType");
    private final static QName _NoteCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CurrencyCode");
    private final static QName _NoteCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CorpCurrencyCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.notes.noteservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid2", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid2(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid2_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid3", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid3(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid3_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid4", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid4(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid4_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid5", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid5(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid5_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeCategory", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeCategory(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeCategory_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "ContactRelationshipId", scope = Note.class)
    public JAXBElement<Long> createNoteContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_NoteContactRelationshipId_QNAME, Long.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid1", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid1(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid1_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CreatorPartyId", scope = Note.class)
    public JAXBElement<Long> createNoteCreatorPartyId(Long value) {
        return new JAXBElement<Long>(_NoteCreatorPartyId_QNAME, Long.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CurcyConvRateType", scope = Note.class)
    public JAXBElement<String> createNoteCurcyConvRateType(String value) {
        return new JAXBElement<String>(_NoteCurcyConvRateType_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CurrencyCode", scope = Note.class)
    public JAXBElement<String> createNoteCurrencyCode(String value) {
        return new JAXBElement<String>(_NoteCurrencyCode_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CorpCurrencyCode", scope = Note.class)
    public JAXBElement<String> createNoteCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_NoteCorpCurrencyCode_QNAME, String.class, Note.class, value);
    }

}

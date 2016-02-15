
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.notes.noteservice.Note;


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
 *         &lt;element name="notes" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note"/>
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
    "notes"
})
@XmlRootElement(name = "createNotes")
public class CreateNotes {

    @XmlElement(required = true)
    protected Note notes;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Note }
     *     
     */
    public Note getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Note }
     *     
     */
    public void setNotes(Note value) {
        this.notes = value;
    }

}

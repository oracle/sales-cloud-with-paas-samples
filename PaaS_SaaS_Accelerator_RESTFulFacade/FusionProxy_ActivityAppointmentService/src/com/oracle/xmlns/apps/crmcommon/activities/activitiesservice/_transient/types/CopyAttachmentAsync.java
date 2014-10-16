
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.objects.objectsservice.CommonAttachments;


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
 *         &lt;element name="attachmentVORows" type="{http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/}CommonAttachments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commitData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "attachmentVORows",
    "commitData"
})
@XmlRootElement(name = "copyAttachmentAsync")
public class CopyAttachmentAsync {

    protected List<CommonAttachments> attachmentVORows;
    @XmlElement(required = true)
    protected String commitData;

    /**
     * Gets the value of the attachmentVORows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentVORows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentVORows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonAttachments }
     * 
     * 
     */
    public List<CommonAttachments> getAttachmentVORows() {
        if (attachmentVORows == null) {
            attachmentVORows = new ArrayList<CommonAttachments>();
        }
        return this.attachmentVORows;
    }

    /**
     * Gets the value of the commitData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitData() {
        return commitData;
    }

    /**
     * Sets the value of the commitData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitData(String value) {
        this.commitData = value;
    }

}

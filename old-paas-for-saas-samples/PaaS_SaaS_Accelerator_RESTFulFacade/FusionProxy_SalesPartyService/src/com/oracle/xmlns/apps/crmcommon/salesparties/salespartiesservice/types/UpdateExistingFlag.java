
package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="startId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="endId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="schTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "startId",
    "endId",
    "schTime"
})
@XmlRootElement(name = "updateExistingFlag")
public class UpdateExistingFlag {

    protected long startId;
    protected long endId;
    protected long schTime;

    /**
     * Gets the value of the startId property.
     * 
     */
    public long getStartId() {
        return startId;
    }

    /**
     * Sets the value of the startId property.
     * 
     */
    public void setStartId(long value) {
        this.startId = value;
    }

    /**
     * Gets the value of the endId property.
     * 
     */
    public long getEndId() {
        return endId;
    }

    /**
     * Sets the value of the endId property.
     * 
     */
    public void setEndId(long value) {
        this.endId = value;
    }

    /**
     * Gets the value of the schTime property.
     * 
     */
    public long getSchTime() {
        return schTime;
    }

    /**
     * Sets the value of the schTime property.
     * 
     */
    public void setSchTime(long value) {
        this.schTime = value;
    }

}

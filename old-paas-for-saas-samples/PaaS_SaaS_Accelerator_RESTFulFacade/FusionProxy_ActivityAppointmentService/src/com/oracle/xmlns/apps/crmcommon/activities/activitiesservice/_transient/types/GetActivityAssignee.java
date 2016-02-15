
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

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
 *         &lt;element name="activityAssigneeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "activityAssigneeId"
})
@XmlRootElement(name = "getActivityAssignee")
public class GetActivityAssignee {

    protected long activityAssigneeId;

    /**
     * Gets the value of the activityAssigneeId property.
     * 
     */
    public long getActivityAssigneeId() {
        return activityAssigneeId;
    }

    /**
     * Sets the value of the activityAssigneeId property.
     * 
     */
    public void setActivityAssigneeId(long value) {
        this.activityAssigneeId = value;
    }

}

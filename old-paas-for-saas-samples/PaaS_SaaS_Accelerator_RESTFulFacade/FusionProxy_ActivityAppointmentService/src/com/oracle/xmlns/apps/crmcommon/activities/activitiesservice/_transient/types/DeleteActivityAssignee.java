
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.activities.activitiesservice.ActivityAssignee;


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
 *         &lt;element name="activityAssignee" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}ActivityAssignee"/>
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
    "activityAssignee"
})
@XmlRootElement(name = "deleteActivityAssignee")
public class DeleteActivityAssignee {

    @XmlElement(required = true)
    protected ActivityAssignee activityAssignee;

    /**
     * Gets the value of the activityAssignee property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAssignee }
     *     
     */
    public ActivityAssignee getActivityAssignee() {
        return activityAssignee;
    }

    /**
     * Sets the value of the activityAssignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAssignee }
     *     
     */
    public void setActivityAssignee(ActivityAssignee value) {
        this.activityAssignee = value;
    }

}

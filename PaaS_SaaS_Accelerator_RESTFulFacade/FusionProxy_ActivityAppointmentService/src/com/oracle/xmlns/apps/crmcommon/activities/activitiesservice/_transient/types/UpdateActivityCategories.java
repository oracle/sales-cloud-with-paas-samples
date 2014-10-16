
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.activities.activitiesservice.ActivityCategory;


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
 *         &lt;element name="activityCategories" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}ActivityCategory"/>
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
    "activityCategories"
})
@XmlRootElement(name = "updateActivityCategories")
public class UpdateActivityCategories {

    @XmlElement(required = true)
    protected ActivityCategory activityCategories;

    /**
     * Gets the value of the activityCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityCategory }
     *     
     */
    public ActivityCategory getActivityCategories() {
        return activityCategories;
    }

    /**
     * Sets the value of the activityCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityCategory }
     *     
     */
    public void setActivityCategories(ActivityCategory value) {
        this.activityCategories = value;
    }

}


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
 *         &lt;element name="activityCategoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "activityCategoryId"
})
@XmlRootElement(name = "getActivityCategoriesAsync")
public class GetActivityCategoriesAsync {

    protected long activityCategoryId;

    /**
     * Gets the value of the activityCategoryId property.
     * 
     */
    public long getActivityCategoryId() {
        return activityCategoryId;
    }

    /**
     * Sets the value of the activityCategoryId property.
     * 
     */
    public void setActivityCategoryId(long value) {
        this.activityCategoryId = value;
    }

}

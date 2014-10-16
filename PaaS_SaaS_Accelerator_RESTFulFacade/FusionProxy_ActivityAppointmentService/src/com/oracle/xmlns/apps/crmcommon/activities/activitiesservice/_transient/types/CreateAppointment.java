
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.activities.activitiesservice.TransientAppointment;


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
 *         &lt;element name="appointment" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientAppointment"/>
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
    "appointment"
})
@XmlRootElement(name = "createAppointment")
public class CreateAppointment {

    @XmlElement(required = true)
    protected TransientAppointment appointment;

    /**
     * Gets the value of the appointment property.
     * 
     * @return
     *     possible object is
     *     {@link TransientAppointment }
     *     
     */
    public TransientAppointment getAppointment() {
        return appointment;
    }

    /**
     * Sets the value of the appointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransientAppointment }
     *     
     */
    public void setAppointment(TransientAppointment value) {
        this.appointment = value;
    }

}

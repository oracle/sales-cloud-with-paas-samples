
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
 *         &lt;element name="appointmentRow" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientAppointment"/>
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
    "appointmentRow"
})
@XmlRootElement(name = "mergeAppointmentAsync")
public class MergeAppointmentAsync {

    @XmlElement(required = true)
    protected TransientAppointment appointmentRow;

    /**
     * Gets the value of the appointmentRow property.
     * 
     * @return
     *     possible object is
     *     {@link TransientAppointment }
     *     
     */
    public TransientAppointment getAppointmentRow() {
        return appointmentRow;
    }

    /**
     * Sets the value of the appointmentRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransientAppointment }
     *     
     */
    public void setAppointmentRow(TransientAppointment value) {
        this.appointmentRow = value;
    }

}

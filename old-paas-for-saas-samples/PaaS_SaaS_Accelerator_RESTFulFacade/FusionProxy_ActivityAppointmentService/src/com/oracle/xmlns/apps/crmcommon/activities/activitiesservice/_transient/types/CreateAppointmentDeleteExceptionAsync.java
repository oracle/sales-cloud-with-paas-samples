
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.activities.activitiesservice.AppointmentDeleteException;


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
 *         &lt;element name="appointmentDeleteException" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}AppointmentDeleteException"/>
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
    "appointmentDeleteException"
})
@XmlRootElement(name = "createAppointmentDeleteExceptionAsync")
public class CreateAppointmentDeleteExceptionAsync {

    @XmlElement(required = true)
    protected AppointmentDeleteException appointmentDeleteException;

    /**
     * Gets the value of the appointmentDeleteException property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentDeleteException }
     *     
     */
    public AppointmentDeleteException getAppointmentDeleteException() {
        return appointmentDeleteException;
    }

    /**
     * Sets the value of the appointmentDeleteException property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentDeleteException }
     *     
     */
    public void setAppointmentDeleteException(AppointmentDeleteException value) {
        this.appointmentDeleteException = value;
    }

}

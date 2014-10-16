
package com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.scm.productmodel.deletegroups.publicmodel.DeleteEntity;


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
 *         &lt;element name="deleteEntities" type="{http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/}DeleteEntity" maxOccurs="unbounded" minOccurs="0"/>
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
    "deleteEntities"
})
@XmlRootElement(name = "checkConstraintAsync")
public class CheckConstraintAsync {

    protected List<DeleteEntity> deleteEntities;

    /**
     * Gets the value of the deleteEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteEntity }
     * 
     * 
     */
    public List<DeleteEntity> getDeleteEntities() {
        if (deleteEntities == null) {
            deleteEntities = new ArrayList<DeleteEntity>();
        }
        return this.deleteEntities;
    }

}


package com.oracle.pts.opp.wsclient.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeOperation", namespace = "http://xmlns.oracle.com/adf/svc/types/")
@XmlEnum
public enum ChangeOperation {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    ChangeOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeOperation fromValue(String v) {
        for (ChangeOperation c: ChangeOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

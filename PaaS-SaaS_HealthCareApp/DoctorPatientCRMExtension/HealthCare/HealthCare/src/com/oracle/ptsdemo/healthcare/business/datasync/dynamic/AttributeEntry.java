package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;


/**
 */
public class AttributeEntry {
    private String label;
    private String name;
    private String value;
    private String type;

    /**
     */
    public AttributeEntry() {
        super();
    }

    /**
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @return
     */
    public String toString(){
        String returnString = "name " + getName() + " label " + getLabel() + " value " + getValue();
        return returnString;

    }
}

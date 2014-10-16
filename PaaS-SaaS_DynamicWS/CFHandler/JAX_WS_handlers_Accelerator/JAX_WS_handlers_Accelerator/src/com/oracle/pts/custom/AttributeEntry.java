package com.oracle.pts.custom;


public class AttributeEntry {
    private String label;
    private String name;
    private String value;
    private String type;
    public AttributeEntry() {
        super();
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public String toString(){
        String returnString = "name " + getName() + " label " + getLabel() + " value " + getValue();
        return returnString;

    }
}

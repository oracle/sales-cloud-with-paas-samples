package com.oracle.pts.vo;

public class MappingAttr {
    String targetObj;
    String sourceObj;
    String targetAttr;
    String sourceAttr;
    String defaultValue;
    public MappingAttr() {
        super();
    }

    public void setTargetObj(String targetObj) {
        this.targetObj = targetObj;
    }

    public String getTargetObj() {
        return targetObj;
    }

    public void setSourceObj(String sourceObj) {
        this.sourceObj = sourceObj;
    }

    public String getSourceObj() {
        return sourceObj;
    }

    public void setTargetAttr(String targetAttr) {
        this.targetAttr = targetAttr;
    }

    public String getTargetAttr() {
        return targetAttr;
    }

    public void setSourceAttr(String sourceAttr) {
        this.sourceAttr = sourceAttr;
    }

    public String getSourceAttr() {
        return sourceAttr;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }
    public void print(){
        System.out.println("targetObj " + targetObj);
        System.out.println("sourceObj " + sourceObj);
        System.out.println("targetAttr " + targetAttr);
        System.out.println("sourceAttr " + sourceAttr);
        System.out.println("defaultValue " + defaultValue);
    }
}

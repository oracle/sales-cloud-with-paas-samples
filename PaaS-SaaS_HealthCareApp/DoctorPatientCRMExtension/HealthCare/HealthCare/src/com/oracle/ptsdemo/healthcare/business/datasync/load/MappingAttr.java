package com.oracle.ptsdemo.healthcare.business.datasync.load;

/**
 */
public class MappingAttr {
    String targetObj;
    String sourceObj;
    String targetAttr;
    String sourceAttr;
    String defaultValue;

    /**
     */
    public MappingAttr() {
        super();
    }

    /**
     * @param targetObj
     */
    public void setTargetObj(String targetObj) {
        this.targetObj = targetObj;
    }

    /**
     * @return
     */
    public String getTargetObj() {
        return targetObj;
    }

    /**
     * @param sourceObj
     */
    public void setSourceObj(String sourceObj) {
        this.sourceObj = sourceObj;
    }

    /**
     * @return
     */
    public String getSourceObj() {
        return sourceObj;
    }

    /**
     * @param targetAttr
     */
    public void setTargetAttr(String targetAttr) {
        this.targetAttr = targetAttr;
    }

    /**
     * @return
     */
    public String getTargetAttr() {
        return targetAttr;
    }

    /**
     * @param sourceAttr
     */
    public void setSourceAttr(String sourceAttr) {
        this.sourceAttr = sourceAttr;
    }

    /**
     * @return
     */
    public String getSourceAttr() {
        return sourceAttr;
    }

    /**
     * @param defaultValue
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * @return
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     */
    public void print(){
        System.out.println("targetObj " + targetObj);
        System.out.println("sourceObj " + sourceObj);
        System.out.println("targetAttr " + targetAttr);
        System.out.println("sourceAttr " + sourceAttr);
        System.out.println("defaultValue " + defaultValue);
    }
}

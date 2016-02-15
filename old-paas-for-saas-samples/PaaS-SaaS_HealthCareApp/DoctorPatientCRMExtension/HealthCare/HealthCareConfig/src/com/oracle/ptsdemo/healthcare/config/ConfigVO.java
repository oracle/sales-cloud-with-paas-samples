package com.oracle.ptsdemo.healthcare.config;

import java.util.HashMap;

/**
 */
public class ConfigVO {
    private HashMap<String,String> nameValueList = new HashMap<String,String>();

    /**
     */
    public ConfigVO() {
        super();
    }

    /**
     * @param nameValueList
     */
    public void setNameValueList(HashMap<String, String> nameValueList) {
        this.nameValueList = nameValueList;
    }

    /**
     * @return
     */
    public HashMap<String, String> getNameValueList() {
        return nameValueList;
    }
}

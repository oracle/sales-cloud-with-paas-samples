package com.oracle.pts.vo;


import java.util.HashMap;

public class ConfigVO {
    private HashMap<String,String> nameValueList = new HashMap<String,String>();
    public ConfigVO() {
        super();
    }

    public void setNameValueList(HashMap<String, String> nameValueList) {
        this.nameValueList = nameValueList;
    }

    public HashMap<String, String> getNameValueList() {
        return nameValueList;
    }
}

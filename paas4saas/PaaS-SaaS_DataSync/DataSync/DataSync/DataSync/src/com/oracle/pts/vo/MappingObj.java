package com.oracle.pts.vo;

import java.util.ArrayList;
import java.util.List;

public class MappingObj {
    private String target;
    private String source;
    List<MappingAttr> mappingAttrList;
    public MappingObj() {
        super();
       mappingAttrList = new ArrayList<MappingAttr>();

    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setMappingAttrList(List<MappingAttr> mappingAttrList) {
        this.mappingAttrList = mappingAttrList;
    }

    public List<MappingAttr> getMappingAttrList() {
        return mappingAttrList;
    }
}

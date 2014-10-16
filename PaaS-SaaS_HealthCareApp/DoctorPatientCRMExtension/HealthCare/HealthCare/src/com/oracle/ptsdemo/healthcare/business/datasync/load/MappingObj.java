package com.oracle.ptsdemo.healthcare.business.datasync.load;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class MappingObj {
    private String target;
    private String source;
    List<MappingAttr> mappingAttrList;

    /**
     */
    public MappingObj() {
        super();
       mappingAttrList = new ArrayList<MappingAttr>();

    }

    /**
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * @return
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * @param mappingAttrList
     */
    public void setMappingAttrList(List<MappingAttr> mappingAttrList) {
        this.mappingAttrList = mappingAttrList;
    }

    /**
     * @return
     */
    public List<MappingAttr> getMappingAttrList() {
        return mappingAttrList;
    }
}

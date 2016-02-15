package com.oracle.ptsdemo.healthcare.view.vo;

import java.util.List;

public class MappingVOHolder {
    String name;
    String sourceObjectName;
    String targetObjectName;
    List<MappingVO> mappingVOList;
    int autoHeightRows;
   public MappingVOHolder() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMappingVOList(List<MappingVO> mappingVOList) {
        this.mappingVOList = mappingVOList;
    }

    public List<MappingVO> getMappingVOList() {
        return mappingVOList;
    }


    public void setSourceObjectName(String sourceObjectName) {
        this.sourceObjectName = sourceObjectName;
    }

    public String getSourceObjectName() {
        return sourceObjectName;
    }

    public void setTargetObjectName(String targetObjectName) {
        this.targetObjectName = targetObjectName;
    }

    public String getTargetObjectName() {
        return targetObjectName;
    }

    public void setAutoHeightRows(int autoHeightRows) {
        this.autoHeightRows = autoHeightRows;
    }

    public int getAutoHeightRows() {
        return autoHeightRows;
    }
}

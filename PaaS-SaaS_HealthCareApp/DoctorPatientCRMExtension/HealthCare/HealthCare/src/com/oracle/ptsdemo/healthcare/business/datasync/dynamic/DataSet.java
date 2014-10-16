package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;

import java.util.ArrayList;
import java.util.List;


/**
 */
public class DataSet {
    private String name;
    private List<AttributeEntry> attributeList;

    private List<DataSet> childDataSet;

    private DataSet parentDataSet;

    private String operation;
    private String type;
    private String subType;
    private String id;

    private int depth;

    protected String outputString;

    /**
     */
    public DataSet() {
        super();
        attributeList = new ArrayList<AttributeEntry>();
        childDataSet = new ArrayList<DataSet>();
        depth = 0;
    }

    /**
     * @param attrName
     * @return
     */
    public AttributeEntry getAttributeEntry(String attrName) {
        AttributeEntry rAttributeEntry = null;

        for (AttributeEntry attributeEntry : attributeList) {
            if (attributeEntry.getName().equals(attrName)) {
                rAttributeEntry = attributeEntry;
                break;
            }
        }
        return rAttributeEntry;
    }

    /**
     * @param objName
     * @param attrName
     * @return
     */
    public AttributeEntry getAttributeEntry(String objName, String attrName) {
        AttributeEntry rAttributeEntry = null;
        if (parentDataSet != null) {
            if (parentDataSet.getName().equals(objName)) {
                rAttributeEntry =
                        readAttributeEntry(parentDataSet.getAttributeList(),
                                           attrName);
            }
        }
        if (objName.equals(name)) {
            rAttributeEntry = readAttributeEntry(attributeList, attrName);

        } else {
            for (DataSet datSet : childDataSet) {
                if (datSet.getName().equals(objName)) {
                    rAttributeEntry =
                            readAttributeEntry(datSet.getAttributeList(),
                                               attrName);
                }
            }
        }
        return rAttributeEntry;
    }

    /**
     *
     * @param attributeEntryList
     * @param attrName
     * @return
     */
    private AttributeEntry readAttributeEntry(List<AttributeEntry> attributeEntryList,
                                              String attrName) {
        for (AttributeEntry aAttributeEntry : attributeEntryList) {
            if (aAttributeEntry.getName().equals(attrName)) {
                return aAttributeEntry;
            }
        }
        return null;
    }


    /**
     * @param name
     * @return
     */
    public DataSet getChildDataSetByName(String name) {
        DataSet cDataSet = new DataSet();
        cDataSet.setParentDataSet(this);
        cDataSet.setName(name);
        this.getChildDataSet().add(cDataSet);
        cDataSet.setParentDataSet(this);


        return cDataSet;
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
     * @param attributeList
     */
    public void setAttributeList(List<AttributeEntry> attributeList) {
        this.attributeList = attributeList;
    }

    /**
     * @return
     */
    public List<AttributeEntry> getAttributeList() {
        return attributeList;
    }

    /**
     * @param childDataSet
     */
    public void setChildDataSet(List<DataSet> childDataSet) {
        this.childDataSet = childDataSet;
    }


    /**
     * @return
     */
    public List<DataSet> getChildDataSet() {
        return childDataSet;
    }


    /**
     * @param parentDataSet
     */
    public void setParentDataSet(DataSet parentDataSet) {
        this.parentDataSet = parentDataSet;
    }

    /**
     * @return
     */
    public DataSet getParentDataSet() {
        return parentDataSet;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return
     */
    public String getOperation() {
        return operation;
    }


    /**
     * @param outputString
     */
    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    /**
     * @return
     */
    public String getOutputString() {
        return outputString;
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
     * @param subType
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * @return
     */
    public String getSubType() {
        return subType;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * @param depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * @return
     */
    public int getDepth() {
        return depth;
    }
}

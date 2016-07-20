package com.oracle.pts.custom;

import java.util.ArrayList;
import java.util.List;


public class DataSet {
    String name;
     List<AttributeEntry> attributeList;
    protected List<DataSet> childDataSet;
    protected DataSet parentDataSet;
    protected String operation;
    private String type;
    private String subType;
    private String id ;

    private int depth=0;

    protected String outputString;

    public DataSet() {
        super();
        attributeList = new  ArrayList<AttributeEntry>();
        childDataSet = new ArrayList<DataSet>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttributeList(List<AttributeEntry> attributeList) {
        this.attributeList = attributeList;
    }

    public List<AttributeEntry> getAttributeList() {
        return attributeList;
    }

    public void setChildDataSet(List<DataSet> childDataSet) {
        this.childDataSet = childDataSet;
    }
    public DataSet getChildDataSetByName(String name){
        DataSet cDataSet = null;
        if(cDataSet==null){
            cDataSet = new DataSet();
            cDataSet.setParentDataSet(this);
            cDataSet.setName(name);
            this.getChildDataSet().add(cDataSet);
            cDataSet.setParentDataSet(this);
            
        }
        return cDataSet;
    }
    public List<DataSet> getChildDataSet() {
        return childDataSet;
    }
    public AttributeEntry getAttributeEntry(String attrName){
        AttributeEntry rAttributeEntry = null;
        
        for(AttributeEntry attributeEntry:attributeList){
            if(attributeEntry.getName().equals(attrName)){
                rAttributeEntry = attributeEntry;
                break;
            }
        }
        return rAttributeEntry;
    }
    public AttributeEntry getAttributeEntry(String objName,String attrName){
  
        AttributeEntry rAttributeEntry = null;
        if(parentDataSet!=null){
            if(parentDataSet.getName().equals(objName)){
                for(AttributeEntry aAttributeEntry:parentDataSet.getAttributeList()){
                    if(aAttributeEntry.getName().equals(attrName)){
                        rAttributeEntry = aAttributeEntry;
                        break;
                    }
                }
            }
        }
         if(objName.equals(name)){
            for(AttributeEntry aAttributeEntry:attributeList){
                if(aAttributeEntry.getName().equals(attrName)){
                    rAttributeEntry = aAttributeEntry;
                    break;
                }
            }
        }
        else{
            for(DataSet datSet:childDataSet){
                if(datSet.getName().equals(objName)){
                    for(AttributeEntry aAttributeEntry:datSet.getAttributeList()){
                        if(aAttributeEntry.getName().equals(attrName)){
                            rAttributeEntry = aAttributeEntry;
                            break;
                        }
                    }
                    
                }
            }
        }
        return rAttributeEntry;
    }
    public void setParentDataSet(DataSet parentDataSet) {
        this.parentDataSet = parentDataSet;
    }

    public DataSet getParentDataSet() {
        return parentDataSet;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }




    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    public String getOutputString() {
        return outputString;
    }
    public void print(){
        print(this,0);
    }
    private  void print(DataSet dataSet,int depth){
        System.out.println(getDepthString(depth) +"Object Name: " + dataSet.getName());
        if(dataSet.getParentDataSet()==null){
            System.out.println(getDepthString(depth) + "Parent/Child: Parent");
        }
        else{
            System.out.println(getDepthString(depth) + "Parent/Child: Child");
        }
        if(dataSet.getId()!=null){
            System.out.println("Id " + dataSet.getId() + "--");
        }
        for(AttributeEntry attributeEntry:dataSet.getAttributeList()){
            System.out.println(getDepthString(depth) + "name: " + attributeEntry.getName());
            System.out.println(getDepthString(depth) + "value: " + attributeEntry.getValue());
        }
        
            for(DataSet cDataSet:dataSet.getChildDataSet()){
                print(cDataSet,depth+1);
                
            }
                                                        
    }   
    private String getDepthString(int depth){
        String returnString = "";
        for(int i=0;i<depth;i++){
            returnString += "        ";
        }
        return returnString;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }
}

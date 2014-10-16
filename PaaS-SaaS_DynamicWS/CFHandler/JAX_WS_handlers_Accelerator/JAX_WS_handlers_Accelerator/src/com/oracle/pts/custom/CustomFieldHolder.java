package com.oracle.pts.custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


public class CustomFieldHolder {
    private Map<String,Object> customFieldList;
    private Map<String,HashMap<String,Object>> objectsCustomFieldList;
    private static final ThreadLocal<CustomFieldHolder> threadLocal = new ThreadLocal<CustomFieldHolder>();
    String objectName;
  //   Map<String,Objec>t customfields
    private List<DataSet> dataSetList;
    private DataSet dataSet;
    Logger logger = Logger.getLogger("CRM");   
    private static Map<String,String> keyNameMap = new HashMap();
    public CustomFieldHolder() {
        super();
    }
    private void setThreadCustomMap(Map<String,Object> map){
        if(threadLocal.get()==null){
            threadLocal.set(this);
        }
        
    }


    public void setCustomFieldList(Map<String, Object> customFieldList) {
        this.customFieldList = customFieldList;
     //   if(threadLocal.get()==null){
            threadLocal.set(this);
       // }
    }

    public Map<String, Object> getCustomFieldList() {
        if(customFieldList==null){
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            customFieldList = tCustomFieldHolder.getCustomFieldList();
        }
        return customFieldList;
    }
    public void setDataSet(DataSet dataSet) {
        this.dataSet =dataSet;
     //   if(threadLocal.get()==null){
            threadLocal.set(this);
       // }
    }

    public DataSet getDataSet() {
        if(dataSet==null){
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            dataSet = tCustomFieldHolder.getDataSet();
        }
        return dataSet;
    }
    
    
    public void setObjectName(String  objectName) {
        this.objectName = objectName;
     //   if(threadLocal.get()==null){
            threadLocal.set(this);
       // }
    }

    public String getObjectName() {
        if(objectName==null){
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            objectName = tCustomFieldHolder.getObjectName();
        }
        return objectName;
    }

    public void setObjectsCustomFieldList(Map<String, HashMap<String, Object>> objectsCustomFieldList) {
        this.objectsCustomFieldList = objectsCustomFieldList;
        if(threadLocal.get()==null){
            threadLocal.set(this);
        }
        else{
            threadLocal.get().setObjectsCustomFieldList(objectsCustomFieldList);
        }
    }

    public Map<String, HashMap<String, Object>> getObjectsCustomFieldList() {
        if(objectsCustomFieldList==null){
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            if(tCustomFieldHolder==null){
                threadLocal.set(this);
            }
                objectsCustomFieldList = new HashMap<String,HashMap<String,Object>>(); 
                tCustomFieldHolder = threadLocal.get();
            
            objectsCustomFieldList = tCustomFieldHolder.getObjectsCustomFieldList();
        }
         return objectsCustomFieldList;
    }
    public void setDataSetList(List<DataSet> dataSetList) {
        this.dataSetList = dataSetList;
        if(threadLocal.get()==null){
            threadLocal.set(this);
        }
        else{
            threadLocal.get().setObjectsCustomFieldList(objectsCustomFieldList);
        }
    }

    public List<DataSet> getDataSetList() {
        if(dataSetList==null){
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            if(tCustomFieldHolder==null){
                threadLocal.set(this);
            }
                dataSetList = new ArrayList<DataSet>(); 
                tCustomFieldHolder = threadLocal.get();
            
            dataSetList = tCustomFieldHolder.getDataSetList();
        }
         return dataSetList;
    }
       public void printCustomFieldHolder(){
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        List<DataSet> dataSetList = customFieldHolder.getDataSetList();
        for(DataSet dataSet:dataSetList){
            dataSet.print();
        }
    }
       public DataSet getDecendentDataSet(String objectName){
           logger.info("getDecendentDataSet " + objectName);
           DataSet rDataSet = null;
           CustomFieldHolder customFieldHolder = new CustomFieldHolder();
           List<DataSet> dataSetList = customFieldHolder.getDataSetList();
           for(DataSet dataSet:dataSetList){
               rDataSet = dataSet.getDecendentDataSet(objectName);
               if(rDataSet!=null){
                   break;
               }
           }
           return rDataSet;
          
       }
    public static void setKeyName(String objectName,String keyName){
        keyNameMap.put(objectName, keyName);
    }
    public static String getKeyName(String objectName){
        String returnValue = keyNameMap.get(objectName);
        if(returnValue==null){
            returnValue = "";
        }
        return returnValue;
    }
 
}

package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 */
public class CustomFieldHolder {
    private Map<String, Object> customFieldList;
    private Map<String, HashMap<String, Object>> objectsCustomFieldList;
    private static final ThreadLocal<CustomFieldHolder> threadLocal =
        new ThreadLocal<CustomFieldHolder>();
    String objectName;
    //   Map<String,Objec>t customfields
    private List<DataSet> dataSetList;
    private DataSet dataSet;

    private static Map<String, String> keyNameMap = new ConcurrentHashMap<String, String>();

    /**
     */
    public CustomFieldHolder() {
        super();
    }


    /**
     * @param customFieldList
     */
    public void setCustomFieldList(Map<String, Object> customFieldList) {
        this.customFieldList = customFieldList;
        //   if(threadLocal.get()==null){
        threadLocal.set(this);
        // }
    }

    /**
     * @return
     */
    public Map<String, Object> getCustomFieldList() {
        if (customFieldList == null) {
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            customFieldList = tCustomFieldHolder.getCustomFieldList();
        }
        return customFieldList;
    }

    /**
     * @param dataSet
     */
    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
        //   if(threadLocal.get()==null){
        threadLocal.set(this);
        // }
    }

    /**
     * @return
     */
    public DataSet getDataSet() {
        if (dataSet == null) {
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            dataSet = tCustomFieldHolder.getDataSet();
        }
        return dataSet;
    }


    /**
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
        //   if(threadLocal.get()==null){
        threadLocal.set(this);
        // }
    }

    /**
     * @return
     */
    public String getObjectName() {
        if (objectName == null) {
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            objectName = tCustomFieldHolder.getObjectName();
        }
        return objectName;
    }

    /**
     * @param objectsCustomFieldList
     */
    public void setObjectsCustomFieldList(Map<String, HashMap<String, Object>> objectsCustomFieldList) {
        this.objectsCustomFieldList = objectsCustomFieldList;
        if (threadLocal.get() == null) {
            threadLocal.set(this);
        } else {
            threadLocal.get().setObjectsCustomFieldList(objectsCustomFieldList);
        }
    }

    /**
     * @return
     */
    public Map<String, HashMap<String, Object>> getObjectsCustomFieldList() {
        if (objectsCustomFieldList == null) {
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            if (tCustomFieldHolder == null) {
                threadLocal.set(this);
            }
            objectsCustomFieldList =
                    new HashMap<String, HashMap<String, Object>>();
            tCustomFieldHolder = threadLocal.get();

            objectsCustomFieldList =
                    tCustomFieldHolder.getObjectsCustomFieldList();
        }
        return objectsCustomFieldList;
    }

    /**
     * @param dataSetList
     */
    public void setDataSetList(List<DataSet> dataSetList) {
        this.dataSetList = dataSetList;
        if (threadLocal.get() == null) {
            threadLocal.set(this);
        } else {
            threadLocal.get().setObjectsCustomFieldList(objectsCustomFieldList);
        }
    }

    /**
     * @return
     */
    public List<DataSet> getDataSetList() {
        if (dataSetList == null) {
            CustomFieldHolder tCustomFieldHolder = threadLocal.get();
            if (tCustomFieldHolder == null) {
                threadLocal.set(this);
            }
            dataSetList = new ArrayList<DataSet>();
            tCustomFieldHolder = threadLocal.get();

            dataSetList = tCustomFieldHolder.getDataSetList();
        }
        return dataSetList;
    }


    /**
     * @param objectName
     * @param keyName
     */
    public static void setKeyName(String objectName, String keyName) {
        keyNameMap.put(objectName, keyName);
    }

    /**
     * @param objectName
     * @return
     */
    public static String getKeyName(String objectName) {
        String returnValue = keyNameMap.get(objectName);
        if (returnValue == null) {
            returnValue = "";
        }
        return returnValue;
    }

}

package com.oracle.pts.config;

import com.oracle.pts.db.ConfigDB;

import java.util.ResourceBundle;



public class FusionConfig {
    private ResourceBundle resouceBoundle;    
   private static FusionConfig fusionConfig;
    public FusionConfig() {
        super();
        init();
        
    }
    private void init(){
        try{
        resouceBoundle =ResourceBundle.getBundle("crm");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getProperty(String name){
        return resouceBoundle.getString(name);
    }
    public String getPropertyFromDB(String name){
        ConfigDB configDB = new ConfigDB();
        return configDB.getValue(name);
    }
    public static FusionConfig getInstance(){
        if(fusionConfig==null){
            fusionConfig = new FusionConfig();
        }
        return fusionConfig;
    }
}

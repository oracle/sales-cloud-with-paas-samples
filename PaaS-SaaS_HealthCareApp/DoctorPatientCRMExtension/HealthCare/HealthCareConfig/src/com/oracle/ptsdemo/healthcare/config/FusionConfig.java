package com.oracle.ptsdemo.healthcare.config;


import java.util.ResourceBundle;


/**
 */
public class FusionConfig {
    private ResourceBundle resouceBoundle;    
   private static FusionConfig fusionConfig;

    /**
     */
    public FusionConfig() {
        super();
        init();
        
    }
    private void init(){
        resouceBoundle =ResourceBundle.getBundle("crm");
    }

    /**
     * @param name
     * @return
     */
    public String getProperty(String name){
        return resouceBoundle.getString(name);
    }

    /**
     * @param name
     * @return
     */
    public String getPropertyFromDB(String name){
        ConfigDB configDB = new ConfigDB();
        return resouceBoundle.getString(name);
    }

    /**
     * @return
     */
    public static FusionConfig getInstance(){
        if(fusionConfig==null){
            fusionConfig = new FusionConfig();
        }
        return fusionConfig;
    }
}

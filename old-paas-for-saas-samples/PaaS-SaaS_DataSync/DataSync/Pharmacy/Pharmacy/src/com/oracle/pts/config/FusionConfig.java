package com.oracle.pts.config;

import java.util.ResourceBundle;



public class FusionConfig {
    private ResourceBundle resouceBoundle;    
   private static FusionConfig fusionConfig;
    public FusionConfig() {
        super();
        init();
    }
    private void init(){
        resouceBoundle =ResourceBundle.getBundle("crm");
    }
    public String getProperty(String name){
        return resouceBoundle.getString(name);
    }
    public static FusionConfig getInstance(){
        if(fusionConfig==null){
            fusionConfig = new FusionConfig();
        }
        return fusionConfig;
    }
}

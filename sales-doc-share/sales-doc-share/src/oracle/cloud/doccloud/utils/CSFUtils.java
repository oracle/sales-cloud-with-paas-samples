package oracle.cloud.doccloud.utils;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved */


import oracle.security.jps.service.credstore.CredentialStore;
import oracle.security.jps.service.credstore.PasswordCredential;

/**
 * This class is utility class for Credential Store related functionality
 */

public class CSFUtils {
    
    
   /**
     * This method will return the credential in the format [username]:[password] for the 
     * given csfkey and map in CSF Store. If csfkey does not exist in the map, it will 
     * return null.
     * @param map
     * @param csfkey
     * @return username:password
     */
   public static String getCredentialUsername(String map, String csfkey){
        String credString = null;
        try{
            
            CredentialStore store = oracle.security.jps.service
                .JpsServiceLocator.getServiceLocator()
                .lookup(oracle.security.jps.service.credstore
                        .CredentialStore.class);
         
            PasswordCredential pc = null;
            pc = (PasswordCredential) store.getCredential(map, csfkey);
            if (pc == null) {
                System.out.println("Credential not found for map " + map + " and key " + csfkey + ".");
            } 
         
             credString = pc.getName();
        }catch(Exception e){
                e.printStackTrace();
        }
    
        return credString;
        
    }
   
    public static String getCredentialPassword(String map, String csfkey){
         String credString = null;
         try{
             CredentialStore store = oracle.security.jps.service
                 .JpsServiceLocator.getServiceLocator()
                 .lookup(oracle.security.jps.service.credstore
                         .CredentialStore.class);
          
             PasswordCredential pc = null;
             pc = (PasswordCredential) store.getCredential(map, csfkey);
             if (pc == null) {
                 System.out.println("Credential not found for map " + map + " and key " + csfkey + ".");
             } 
          
              credString = new String(pc.getPassword());
         }catch(Exception e){
                 e.printStackTrace();
         }
     
         return credString;
         
     }
    
   
}
	   
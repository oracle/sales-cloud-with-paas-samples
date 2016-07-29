package oracle.cloud.doccloud.exception;

/* Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved. */


import com.sun.jersey.api.client.ClientResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Exception class to be used in the application.
 *
 */

public class RESTException extends RuntimeException{
    
    private static final long serialVersionUID = -111111111111111L;
    private Map error;
  
    /**
     * Constructor 
     * @param response  ClientResponse object
     */
    public RESTException(ClientResponse response){
        try{
            error = (Map)response.getEntity(Map.class);
        } catch (Exception e){
            error = new HashMap();
            error.put("errorCode", new Integer(0));
            error.put("errorMessage", "HTTP error, no JSON payload");
        }
        error.put("statusCode", new Integer(response.getStatus()));
    }
  
    /**
     * Return String representation of the Object
     * @return string 
     */
    public String toString(){
        String s = "Exception " + this.getClass().getName() + "\nPayload:\n";
        s += "  statusCode: " + Integer.toString(this.getStatusCode()) + "\n";
        for (Object k: error.keySet()){
            String key = (String) k;
            if (!"statusCode".equals(key))
                s += "  "+ key + ": " + error.get(key) + "\n";
        }
        return s;
    }
    
    /**
     * Returns status code as int
     * @return statuscode of the error
     */
    public int getStatusCode(){
        return ((Integer)error.get("statusCode")).intValue();
    }
    
    /**
     * Return a Map object representing error details
     * @return error - Map object containing error
     */
    public Map getError (){
        return error;
    }
    
    
}

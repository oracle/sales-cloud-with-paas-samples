package com.oracle.ptsdemo.healthcare.wsclient.osc;


import javax.xml.ws.BindingProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.handler.MessageContext;

/**
 * General use class with static utilities for working with Oracle Sales Cloud Web Services.
 *
 *
 * @author Lucas Gomes
 * @since Jan-2014
 *
 */
public class OSCWSUtil {



    /**
     * Method for setting SOAP Header based on username/password or jwtUserToken
     * @param bp WSBindingProvider
     * @param username
     * @param password
     * @param jwtUserToken
     * @param endpointURL Full address of the service.
     *
     */
    public static void setSOAPHeader(BindingProvider bp, String username,
                                     String password, String jwtUserToken,
                                     String endpointURL) {

        if (bp != null) {

            Map<String, Object> requestContext = bp.getRequestContext();
            requestContext.put(BindingProvider.SOAPACTION_USE_PROPERTY, Boolean.TRUE);
            requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                               endpointURL);
            
            udpateHeaderWithTokenOrUserPasswordAuthentication(username, password, jwtUserToken, requestContext);

        }

    }
    
    
    
    /**
     * Method for setting SOAP Header based on username/password or jwtUserToken
     * @param bp BindingProvider
     * @param username
     * @param password
     * @param jwtUserToken
     * @param servicePortURL Full address of the service (Service Port)
     * @param soapActionURI URI used to identify soap action on SOAP Header
     *
     */
    public static void setSOAPHeader(BindingProvider bp, String username,
                                     String password, String jwtUserToken,
                                     String servicePortURL, String soapActionURI) {

        if (bp != null) {

            Map<String, Object> requestContext = bp.getRequestContext();
            
            
            requestContext.put(BindingProvider.SOAPACTION_USE_PROPERTY, Boolean.TRUE);
            requestContext.put(BindingProvider.SOAPACTION_URI_PROPERTY,
                   soapActionURI);

            requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                               servicePortURL);


            udpateHeaderWithTokenOrUserPasswordAuthentication(username, password, jwtUserToken, requestContext);
        }

    }

    private static void udpateHeaderWithTokenOrUserPasswordAuthentication(String username,
                                                                          String password,
                                                                          String jwtUserToken,
                                                                          Map<String, Object> requestContext) {
        
        requestContext.put(BindingProvider.USERNAME_PROPERTY,
                           username);
        
        if (jwtUserToken != null && jwtUserToken.length() > 0) {

            String authZParameterValue = "Bearer " + jwtUserToken;
            
            Map<String, List<String>> authMap =
                new HashMap<String, List<String>>();
            List<String> authZList = new ArrayList<String>();
            authZList.add(authZParameterValue);

            authMap.put("Authorization", authZList);
            requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, authMap);
            
            //The code below raises UnsupportedOperationException in JCS 13.2            
            //                requestContext.put(MessageContext.HTTP_REQUEST_HEADERS,
            //                                   Collections.singletonMap("Authorization",
            //                                                            Collections.singletonList(authZParameterValue)));
        } else {
            // Use the username and password for authentication
            requestContext.put(BindingProvider.USERNAME_PROPERTY,
                               username);
            requestContext.put(BindingProvider.PASSWORD_PROPERTY,
                               password);

        }
    }    
}

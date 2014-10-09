package com.oracle.ptsdemo.uiaccelerator.bean;


import com.oracle.ptsdemo.utils.JSFUtils;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import oracle.adf.share.logging.ADFLogger;

/**
 * All sample code is provided by Oracle for illustrative purposes only.
 * These sample code examples have not been thoroughly tested under all conditions. 
 * Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code.
 * All sample code contained herein are provided to you "AS IS" without any warranties of any kind. 
 * The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.
 */
public class FusionConfigBean {

    private ADFLogger logger;

    public FusionConfigBean() {
        super();
        logger = ADFLogger.createADFLogger(this.getClass());
    }

    public void loadFusionProperties() throws IOException {
        logger.info("loading properties");

        ResourceBundle resourceBundle =
            ResourceBundle.getBundle("fusionconfig");
        loadPropertiesForWebServiceCalls(resourceBundle);


        //JWT Token Authentication endpoint for UI validation
        JSFUtils.setExpressionValue("#{pageFlowScope.fusionJWTTokenEndpoint}",
                                    resourceBundle.getString("fusionJWTTokenEndpoint"));
        
    }
    
    
    private void loadPropertiesForWebServiceCalls(ResourceBundle resourceBundle) {
        //properties: fusionUsername, fusionPassword, fusionEndpointURL, fusionFetchSize

        Map<String, String> pHeader = new HashMap<String, String>();
        pHeader.put("fusionUsername",
                    resourceBundle.getString("fusionUsername"));
        pHeader.put("fusionPassword",
                    resourceBundle.getString("fusionPassword"));
        pHeader.put("fusionEndpointURL",
                    resourceBundle.getString("fusionEndpointURL"));
        
        pHeader.put("fusionCRMOpportunityEndpoint",
                    resourceBundle.getString("fusionCRMOpportunityEndpoint"));
        
        pHeader.put("fusionFetchSize",
                    resourceBundle.getString("fusionFetchSize"));
        

        String jwt =
            JSFUtils.resolveExpressionAsString("#{pageFlowScope.jwt}");

        if (jwt != null) {
            pHeader.put("fusionJWTToken", jwt);
        }

        logger.fine("pHeader=" + pHeader);
        JSFUtils.setExpressionValue("#{pageFlowScope.pHeader}", pHeader);
        
    }
}

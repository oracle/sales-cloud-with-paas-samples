
package oracle.demo.pts.fusionservices;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;

import com.oracle.xmlns.apps.cdm.foundation.resources.resourceservice.ResourceResult;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;


import javax.xml.namespace.QName;

import oracle.demo.pts.fusionproxy.resource.ResourceService;
import oracle.demo.pts.fusionproxy.resource.ResourceService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;


public class FusionResourceService extends FusionService {

    @javax.annotation.Resource(name = "ResourceService_Service")
    ResourceService_Service resourceService_Service;
    ResourceService resourceService;
    FindCriteria fc = null;

    public void initialiseConnection(String pJWTToken, String pUsername,
                                     String pPassword,
                                     String pFusionEndpointURL, int pFetchSize,
                                     int pFetchStart) {
        // This method initialises the connection to the FusionCRM WS
        // Currently does it every time, but one could/should be able to cache if needed
        System.setProperty("javax.xml.transform.TransformerFactory",
                "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");


        URL wsdlLocationURL = null;
        try {
            wsdlLocationURL = new URL(pFusionEndpointURL + "?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            logger.log(Level.ALL, e.getLocalizedMessage());

        }
        if (resourceService_Service == null)
            resourceService_Service =
                    new ResourceService_Service(wsdlLocationURL,
                                                new QName("http://xmlns.oracle.com/apps/cdm/foundation/resources/resourceService/applicationModule/",
                                                          "ResourceService"));

        resourceService =
                resourceService_Service.getResourceServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL,
                                                                                               pJWTToken));
        // Call Helper Function
        initFusionEndpoint(pJWTToken, pUsername, pPassword,
                           (WSBindingProvider)resourceService,
                           pFusionEndpointURL, pFetchSize, pFetchStart);
    }

    public ResourceService getResourceService() {
        return this.resourceService;
    }


    public List<com.oracle.xmlns.apps.cdm.foundation.resources.resourceservice.Resource> findResource(String pSOAPMessageString,
                                                                                                      String pAttributes,
                                                                                                      String pQuery,
                                                                                                      String pConjunction) throws Exception {
        // Initialise the connections
        checkIfInitialised();


        fc =
 (FindCriteria)FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString,
                                                     pAttributes, pQuery,
                                                     pConjunction,
                                                     getFetchSize(),
                                                     getFetchStart());
        ResourceResult pr = null;
        List<com.oracle.xmlns.apps.cdm.foundation.resources.resourceservice.Resource> resources =
            null;
        try {
            // Call Fusion findOpportunity

            pr = resourceService.findResource(fc, new FindControl());
            if (pr != null)
                resources = pr.getValue();
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findPerson");
            e.printStackTrace();
            throw e;
        }
        logMessage("Number of Resources found " + resources.size());
        // Add the resulting List of opportunities to the RESTOpportunityList object
        // this will ensure the JAX-WS JAXB parser will produce a nice list

        return resources;
    }

}

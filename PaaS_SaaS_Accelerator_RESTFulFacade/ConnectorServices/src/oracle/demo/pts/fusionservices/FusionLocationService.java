
package oracle.demo.pts.fusionservices;

// Important : LocationService is slightly different than other services in that the general objects are "different"
// You must use locationService's types not the general xmlns ones


import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;

import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.Location;

import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult;

import com.sun.xml.ws.developer.WSBindingProvider;


import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

import oracle.demo.pts.fusionproxy.location.LocationService;
import oracle.demo.pts.fusionproxy.location.LocationService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;

import oracle.demo.pts.fusionservices.utils.FusionService;


public class FusionLocationService extends FusionService {

    @Resource(name = "LocationService_Service")
    LocationService_Service locationService_Service;
    LocationService locationService;
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
        if (locationService_Service == null)
            locationService_Service =
                    new LocationService_Service(wsdlLocationURL,
                                                new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/",
                                                          "LocationService"));
        locationService =
                locationService_Service.getLocationServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL,
                                                                                               pJWTToken));
        // Call Helper Function
        initFusionEndpoint(pJWTToken, pUsername, pPassword,
                           (WSBindingProvider)locationService,
                           pFusionEndpointURL, pFetchSize, pFetchStart);
    }


    public List<Location> findLocation(String pSOAPMessageString,
                                       String pAttributes, String pQuery,
                                       String pConjunction) throws Exception {
        // Initialise the connections
        checkIfInitialised();

        fc =
 FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString, pAttributes,
                                       pQuery, pConjunction, getFetchSize(),
                                       getFetchStart());
        // Because LocationService

        LocationResult locationResult = null;
        try {
            // Call Fusion findOpportunity
            locationResult =
                    locationService.findLocation(fc, new FindControl());

        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findMkLead");
            e.printStackTrace();
            throw e;
        }

        return (locationResult.getValue());
    }


    public LocationService getLocationService() {
        return locationService;
    }


}



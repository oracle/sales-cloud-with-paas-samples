
package oracle.demo.pts.fusionservices;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;


import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.Location;
import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult;
import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.Person;
import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.PersonProfile;

import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.PersonResult;
import com.oracle.xmlns.apps.hcm.people.roles.userdetailsservicev2.UserDetailsResult;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;


import oracle.demo.pts.fusionproxy.person.PersonService_Service;
import oracle.demo.pts.fusionproxy.userservice.UserDetailsService;
import oracle.demo.pts.fusionproxy.userservice.UserDetailsService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;


public class FusionUserDetailsService extends FusionService {
   
    @Resource(name = "UserDetailsService_Service")    
    UserDetailsService_Service userDetailsService_Service;
    UserDetailsService userDetailsService;
    FindCriteria fc=null;
    
    public void initialiseConnection(String pJWTToken,String pUsername,String pPassword,String pFusionEndpointURL,int pFetchSize,int pFetchStart) {
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
         if (userDetailsService_Service==null)  userDetailsService_Service = new UserDetailsService_Service(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/",
                    "UserDetailsService"));
        userDetailsService =
                userDetailsService_Service.getUserDetailsServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL,pJWTToken));
        // Call Helper Function
        initFusionEndpoint(pJWTToken, pUsername, pPassword,(WSBindingProvider)userDetailsService,
                           pFusionEndpointURL, pFetchSize, pFetchStart);
    }
    
    public UserDetailsService getUserDetailsService() {
        return this.userDetailsService;
    }
    
    public UserDetailsResult findSelfUserDetails(String pSOAPMessageString,String pAttributes,String pQuery,String pConjunction) throws Exception {
        
        checkIfInitialised();
        
        UserDetailsResult userDetailsResult = null;
        try {
            userDetailsResult = userDetailsService.findSelfUserDetails();
            
        }
        catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
                    throw ctae;
                } catch (Exception e) {
                    logMessage("Generic exception @ findPerson");
                    e.printStackTrace();
                    throw e;
                }
        
        // Done, return result
        return userDetailsResult;
        
    }
    
}



package oracle.demo.pts.fusionservices;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;


import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.Person;

import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.PersonResult;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;


import oracle.demo.pts.fusionproxy.person.PersonService;
import oracle.demo.pts.fusionproxy.person.PersonService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;


public class FusionPersonService extends FusionService {

    @Resource(name = "PersonService_Service")
    PersonService_Service personService_Service;
    PersonService personService;
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
        if (personService_Service == null)
            personService_Service =
                    new PersonService_Service(wsdlLocationURL,           new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/applicationModule/",
                    "PersonService"));
        personService =
                personService_Service.getPersonServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL,
                                                                                           pJWTToken));
        // Call Helper Function
        initFusionEndpoint(pJWTToken, pUsername, pPassword,
                           (WSBindingProvider)personService,
                           pFusionEndpointURL, pFetchSize, pFetchStart);
    }

    public PersonService getPersonService() {
        return this.personService;
    }


    public List<Person> findPerson(String pSOAPMessageString,
                                   String pAttributes, String pQuery,
                                   String pConjunction) throws Exception {
        // Initialise the connections
        checkIfInitialised();


        fc =
 (FindCriteria)FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString,
                                                     pAttributes, pQuery,
                                                     pConjunction,
                                                     getFetchSize(),
                                                     getFetchStart());
        PersonResult pr = null;
        List<Person> persons = null;
        try {
            // Call Fusion findOpportunity

            pr = personService.findPerson(fc, new FindControl());
            if (pr != null)
                persons = pr.getValue();
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findPerson");
            e.printStackTrace();
            throw e;
        }
        logMessage("Number of Persons found " + persons.size());
        // Add the resulting List of opportunities to the RESTOpportunityList object
        // this will ensure the JAX-WS JAXB parser will produce a nice list

        return persons;
    }


}

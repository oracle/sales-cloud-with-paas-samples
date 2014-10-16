
package oracle.demo.pts.fusionservices;

import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;

import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.Interaction;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;

import java.util.logging.Level;

import javax.annotation.Resource;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;


import oracle.demo.pts.fusionproxy.interaction.InteractionService;
import oracle.demo.pts.fusionproxy.interaction.InteractionService_Service;
import oracle.demo.pts.fusionservices.utils.FusionHelper;
import oracle.demo.pts.fusionservices.utils.FusionService;
import oracle.demo.pts.fusionservices.utils.fusionServiceNotInitialised;


public class FusionInteractionService extends FusionService {


    @Resource(name = "InteractionService_Service")
    InteractionService_Service interactionService_Service;
    InteractionService interactionService;
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
        if (interactionService_Service == null)
            interactionService_Service =
                    new InteractionService_Service(wsdlLocationURL,
                                                   new QName("http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/",
                                                             "InteractionService"));
        interactionService =
                interactionService_Service.getInteractionServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL,
                                                                                                     pJWTToken));

        // Call Helper Function
        initFusionEndpoint(pJWTToken, pUsername, pPassword,
                           (WSBindingProvider)interactionService,
                           pFusionEndpointURL, pFetchSize, pFetchStart);

    }

    /**
     * Returns list of visible opportunities
     * @param pAttributes : level 1 Attributes to be retrieved
     * @param pQuery      : level 1 Attrubutes to be queried by, See FusionHelper.java for format
     * @return List<Opportunity> Objects from WS JAXB format
     */
    public List<Interaction> findInteraction(String pSOAPMessageString,
                                             String pAttributes, String pQuery,
                                             String pConjunction) throws Exception {
        checkIfInitialised();

        fc =
 (FindCriteria)FusionHelper.createCustomFindCriteria(fc, pSOAPMessageString,
                                                     pAttributes, pQuery,
                                                     pConjunction,
                                                     getFetchSize(),
                                                     getFetchStart());


        List<Interaction> interactions = null;
        try {
            // Call Fusion findOpportunity
            interactions =
                    this.interactionService.findInteraction(fc, new FindControl());
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw ctae;
        } catch (Exception e) {
            logMessage("Generic exception @ findInteractions");
            e.printStackTrace();
            throw e;
        }
        logMessage("Number of Interactions found " + interactions.size());
        return interactions;
    }


    // TODO
    /*  createInteraction
        createAppointment
    */


    public InteractionService getInteractionService() {
        return interactionService;
    }


}

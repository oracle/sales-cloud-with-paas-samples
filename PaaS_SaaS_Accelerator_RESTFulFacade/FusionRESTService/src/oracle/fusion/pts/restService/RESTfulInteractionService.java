
package oracle.fusion.pts.restService;


import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.Interaction;

import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.InteractionAssociation;
import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.ObjectFactory;

import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import javax.xml.bind.JAXBException;

//import oracle.demo.pts.fusionproxy.opportunities.ServiceException;
import oracle.demo.pts.fusionproxy.interaction.ServiceException;
import oracle.demo.pts.fusionservices.FusionInteractionService;

import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.DMLOperation;
import oracle.fusion.pts.restService.types.RESTInteractionList;
import oracle.fusion.pts.restService.types.RESTOpportunityList;
import oracle.fusion.pts.restService.utils.RESTfulFusionService;


@Path("/interaction")
public class RESTfulInteractionService extends RESTfulFusionService {
    FusionInteractionService fusionInteractionService =
        new FusionInteractionService();
    String fusionEndpointName = "fusionCRMInteractionsEndpoint";
    ObjectFactory intObjFactory = new ObjectFactory();

   /**
     * This method creates a new interaction for the opportunity
     * 
     * @param pHttpHeaders
     * @param optyId
     * @param startDate
     * @param customerId
     * @param description
     * @param outcomeCode
     * @param typeCode
     * @param directionCode
     * @return
     */
   
    
   
    public RESTInteractionList createInteraction4Opportunity(HttpHeaders pHttpHeaders,
                                                             Long optyId,
                                                             Date startDate,
                                                             Long customerId,
                                                             String description,
                                                             String outcomeCode,
                                                             String typeCode,
                                                             String directionCode) {
        this.logMessage("createInteraction4Opportunity called for " + optyId);
        Interaction newInteraction = intObjFactory.createInteraction();
        newInteraction.setInteractionDescription(intObjFactory.createInteractionInteractionDescription(description));
        //newInteraction.setInteractionStartDate(intObjFactory.createInteractionInteractionStartDate(startDate));
        newInteraction.setCustomerId(customerId);
        newInteraction.setOutcomeCode(intObjFactory.createInteractionOutcomeCode(outcomeCode));
        //newInteraction.setInteractionTypeCode(intObjFactory.createInteractionTypeCode(typeCode));
        //newInteraction.setDirectionCode(intObjFactory.create);

        InteractionAssociation interAsso =
            intObjFactory.createInteractionAssociation();
        interAsso.setAssociatedObjectUid(optyId.toString());
        interAsso.setAssociatedObjectCode("OPPORTUNITY");
        newInteraction.getInteractionAssociation().add(interAsso);

        ArrayList<Interaction> aoo = new ArrayList<Interaction>();
        aoo.add(newInteraction);
        RESTInteractionList rol2 = new RESTInteractionList();
        rol2.setInteractionList(aoo);
        RESTInteractionList result;
        result =
                this.doDMLInteractionXML(pHttpHeaders, rol2, DMLOperation.CREATE);
        return result;
    }

    /**
     * Handles CRUD for Interaction Service
     * 
     * @param pHttpHeaders
     * @param interactionList
     * @param operation
     * @return
     */
    private RESTInteractionList doDMLInteractionXML(HttpHeaders pHttpHeaders,
                                                    RESTInteractionList interactionList,
                                                    DMLOperation operation) {
        // Initialise Proxy endpoint
        processRESTServiceHeaders(pHttpHeaders);
        fusionInteractionService.initialiseConnection(this.getFusionJWTToken(),
                                                      getFusionUsername(),
                                                      getFusionPassword(),
                                                      getFusionEndpointURL(fusionEndpointName),
                                                      this.getFetchSize(),
                                                      this.getFetchStart());

        Interaction interaction;
        if (interactionList.getInteractionList() == null) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
        // Extract out the opportunity, assume its the first one
        interaction = interactionList.getInteractionList().iterator().next();
        Interaction result = null;

        try {
            if (operation == DMLOperation.CREATE)
                result =
                        fusionInteractionService.getInteractionService().createInteraction(interaction);
            else if (operation == DMLOperation.MERGE)
                // must be UPDATE
                result =
                        fusionInteractionService.getInteractionService().mergeInteraction(interaction);
            else if (operation == DMLOperation.DELETE) {
                fusionInteractionService.getInteractionService().deleteInteraction(interaction);
            } else
                throw new WebApplicationException(Response.Status.BAD_REQUEST);

        } catch (ServiceException e) {
            throw new FusionGenericException(e.getLocalizedMessage());

        }
        // Wrap it up so JAX-RS is happy
        ArrayList<Interaction> aoo = new ArrayList<Interaction>();
        aoo.add((Interaction)result);
        RESTInteractionList rol2 = new RESTInteractionList();
        rol2.setInteractionList(aoo);
        return rol2;

    }

    @GET
    @Path("{interactionid}")
    @Produces( { "application/xml", "application/json" })
    public RESTInteractionList getInteraction(@Context
        HttpHeaders pHttpHeaders, @PathParam("interactionid")
        Long pInteractionId, @QueryParam("attributes") String pAttributes) throws JAXBException {
        // Init
        processRESTServiceHeaders(pHttpHeaders);
        fusionInteractionService.initialiseConnection(this.getFusionJWTToken(),
                                                      this.getFusionUsername(),
                                                      this.getFusionPassword(),
                                                      this.getFusionEndpointURL(fusionEndpointName),
                                                      this.getFetchSize(),
                                                      this.getFetchStart());
        this.logMessage("getInteraction called for " + pInteractionId);
        List<Interaction> result = null;
        try {
            String seperator=fusionInteractionService.getDefaultMinorQuerySeperator();
            result =
                    fusionInteractionService.findInteraction("", pAttributes, 
                                            "InteractionId"+seperator+"="+seperator+pInteractionId, "");
                
                
        } catch (NumberFormatException e) {
            throw new FusionGenericException("NumberFormatException, received " +
                                             pInteractionId +
                                             " for interactionId");
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        } catch (Exception e) {


            logMessage("exception @ getInteraction");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());

        }
        if (result.size()<1) {
            // No interaction found
            logMessage("No Interaction " + pInteractionId + " found");
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        logMessage("Result of getInteraction "+result.get(0).getInteractionId());
      
        // Wrap it up so JAX-RS is happy
        RESTInteractionList li2 = new RESTInteractionList();
        li2.setInteractionList(result);
        return li2;
    }


    // Queries all Interactions for a given opportunity
    // function not exposed by rest but used by other methods

    public RESTInteractionList getInteraction4Opportunity(HttpHeaders pHttpHeaders,
                                                          Long pOpportunityId,
                                                          String pAttributes) {
        logMessage("getInteraction4Opportunity for " + pOpportunityId);
        processRESTServiceHeaders(pHttpHeaders);
        fusionInteractionService.initialiseConnection(this.getFusionJWTToken(),
                                                      getFusionUsername(),
                                                      getFusionPassword(),
                                                      getFusionEndpointURL(fusionEndpointName),
                                                      this.getFetchSize(),
                                                      this.getFetchStart());


        List<Interaction> interactions = null;
        String pSOAPMessageString =
            "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:typ=\"http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/types/\" xmlns:typ1=\"http://xmlns.oracle.com/adf/svc/types/\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <typ:findInteraction>\n" +
            "         <typ:findCriteria>\n" +
            "            <typ1:fetchStart>0</typ1:fetchStart>\n" +
            "            <typ1:fetchSize>-1</typ1:fetchSize>\n" +
            "           <typ1:filter>\n" +
            "               <typ1:group>\n" +
            "                  <typ1:upperCaseCompare/>\n" +
            "                  <typ1:item>\n" +
            "                     <typ1:upperCaseCompare>false</typ1:upperCaseCompare>\n" +
            "                     <typ1:attribute>InteractionAssociation</typ1:attribute>\n" +
            "                     <typ1:operator>=</typ1:operator>\n" +
            "                     <typ1:nested>\n" +
            "                        <typ1:group>\n" +
            "                           <typ1:item>\n" +
            "                              <typ1:conjunction>And</typ1:conjunction>\n" +
            "                              <typ1:attribute>AssociatedObjectCode</typ1:attribute>\n" +
            "                              <typ1:operator>=</typ1:operator>\n" +
            "                              <typ1:value>OPPORTUNITY</typ1:value>\n" +
            "                           </typ1:item>\n" +
            "                           <typ1:item>\n" +
            "                              <typ1:conjunction>And</typ1:conjunction>\n" +
            "                              <typ1:attribute>AssociatedObjectUid</typ1:attribute>\n" +
            "                              <typ1:operator>=</typ1:operator>\n" +
            "                              <typ1:value>" +
            pOpportunityId.toString() + "</typ1:value>\n" +
            "                           </typ1:item>\n" +
            "                        </typ1:group>\n" +
            "                     </typ1:nested>\n" +
            "                  </typ1:item>\n" +
            "               </typ1:group>\n" +
            "            </typ1:filter><typ1:excludeAttribute/>\n" +
            "\n" +
            "         </typ:findCriteria>\n" +
            "         <typ:findControl>\n" +
            "            <typ1:retrieveAllTranslations>false</typ1:retrieveAllTranslations>\n" +
            "         </typ:findControl>\n" +
            "      </typ:findInteraction>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";

        try {
            interactions =
     
                    fusionInteractionService.findInteraction(pSOAPMessageString,pAttributes, null, null);
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        } catch (Exception e) {
            logMessage("exception @ findInteraction");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());

        }
        logMessage("Number of Interactions found " + interactions.size());
        RESTInteractionList li2 = new RESTInteractionList();
        li2.setInteractionList(interactions);
        return li2;
    }


}

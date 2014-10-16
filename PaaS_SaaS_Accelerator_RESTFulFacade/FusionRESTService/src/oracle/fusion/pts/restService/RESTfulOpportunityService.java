
package oracle.fusion.pts.restService;


import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.ObjectFactory;
import com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice.Opportunity;

import com.sun.xml.bind.v2.runtime.XMLSerializer;
import com.sun.xml.ws.developer.WSBindingProvider;

import java.io.File;
import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;

import java.io.StringWriter;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.QueryParam;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import javax.xml.bind.JAXBException;


import oracle.demo.pts.fusionproxy.opportunities.ServiceException;
import oracle.demo.pts.fusionservices.FusionOpportunityService;

import oracle.fusion.pts.restService.exceptions.FusionGenericException;
import oracle.fusion.pts.restService.types.DMLOperation;
import oracle.fusion.pts.restService.types.RESTInteractionList;
import oracle.fusion.pts.restService.types.RESTOpportunityList;


import oracle.fusion.pts.restService.utils.RESTfulFusionService;


@Path("/opportunity")

public class RESTfulOpportunityService extends RESTfulFusionService {
    FusionOpportunityService fusionOpportunityService =
        new FusionOpportunityService();
    String fusionEndpointName = "fusionCRMOpportunityEndpoint";
    ObjectFactory oppObjFactory = new ObjectFactory();


    /**
     * @param pHttpHeaders
     * @param pInputStream
     * @return
     * @throws JAXBException
     */
    @POST
    @Path("/xmlquery")
    @Produces( { "application/xml", "application/json" })
    public RESTOpportunityList findXMLQuery(@Context
        HttpHeaders pHttpHeaders,
        InputStream pInputStream) throws JAXBException {
        return (findOpportunities(pHttpHeaders, "", "", "", pInputStream));
    }

    // FIND Methods

    /**
     * @param pHttpHeaders
     * @param pAttributes
     * @param pQuery
     * @param pInputStream
     * @return
     * @throws JAXBException
     */
    @GET
    @Produces( { "application/xml", "application/json" })
    public RESTOpportunityList findOpportunities(@Context
        HttpHeaders pHttpHeaders, @QueryParam("attributes")
        String pAttributes, @QueryParam("query")
        String pQuery, @QueryParam("conjunction") String pConjunction,InputStream pInputStream) throws JAXBException {
        String xmlQuery = convertStreamToString(pInputStream);
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);
        this.logMessage("findOpportunities called attributes[" + pAttributes +
                        "] query=[" + pQuery + "]");
        fusionOpportunityService.initialiseConnection(this.getFusionJWTToken(),
                                                      getFusionUsername(),
                                                      getFusionPassword(),
                                                      getFusionEndpointURL(fusionEndpointName),
                                                      this.getFetchSize(),
                                                      this.getFetchStart());

        List<Opportunity> ops = null;
        try {

            ops =
fusionOpportunityService.findOpportunity(xmlQuery, pAttributes, pQuery, pConjunction);
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        } catch (Exception e) {
            logMessage("exception @ findOpportunity");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());
        }
        logMessage("Number of Opportunities found " + ops.size());
        // Add the resulting List of opportunities to the RESTOpportunityList object
        // this will ensure the JAX-WS JAXB parser will produce a nice list
        RESTOpportunityList ro2 = new RESTOpportunityList();
        ro2.setOpportunityList(ops);
        return ro2;
    }

    // Get Methods

    /**
     * @param pHttpHeaders
     * @param pId
     * @return
     * @throws JAXBException
     */
    @GET
    @Path("{id}")
    @Produces( { "application/xml", "application/json" })
    public RESTOpportunityList getOpportunity(@Context
        HttpHeaders pHttpHeaders, @PathParam("id")
        Long pId, @QueryParam("attributes")
        String pAttributes) throws JAXBException {
        this.logMessage("getOpportunity called id[" + pId + "]");
        // Initialise the connections
        processRESTServiceHeaders(pHttpHeaders);

        fusionOpportunityService.initialiseConnection(this.getFusionJWTToken(),
                                                      this.getFusionUsername(),
                                                      this.getFusionPassword(),
                                                      this.getFusionEndpointURL(fusionEndpointName),
                                                      this.getFetchSize(),
                                                      this.getFetchStart());
        // Find specific opportunity

        List<Opportunity> ops = null;
        try {
            String seperator=fusionOpportunityService.getDefaultMinorQuerySeperator();
            ops =
fusionOpportunityService.findOpportunity("", pAttributes, "OptyId"+seperator+"="+seperator+ + pId,
                                         "");

        } catch (NumberFormatException e) {
            // Error in opportunityid?
            throw new FusionGenericException("NumberFormatException, received " +
                                             pId + " for OptyId");
        } catch (com.sun.xml.ws.client.ClientTransportAccessException ctae) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        } catch (Exception e) {
            logMessage("exception @ getOpportunity");
            e.printStackTrace();
            throw new FusionGenericException(e.getLocalizedMessage());

        }
        if (ops.size() < 1) {
            // No opportunity found
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        logMessage("Result of getOpportunity " + ops.get(0).getName());
        // Wrap it up so JAX-RS is happy
        // ArrayList<Opportunity> aoo = new ArrayList<Opportunity>();

        RESTOpportunityList rol2 = new RESTOpportunityList();
        rol2.setOpportunityList(ops);
        return rol2;
    }


    // Find Opp Interaactions

    /**
     * @param pHttpHeaders
     * @param pOptyId
     * @param pAttributes
     * @return
     * @throws JAXBException
     */
    @GET
    @Path("{optyid}/interaction")
    @Produces( { "application/xml", "application/json" })
    public RESTInteractionList findOppInteraction(@Context
        HttpHeaders pHttpHeaders, @PathParam("optyid")
        Long pOptyId, @QueryParam("attributes")
        String pAttributes) throws JAXBException {
        // Find Specific Opportunity Interactions
        this.logMessage("findOppInteraction [" + pOptyId + "]");
        RESTfulInteractionService r = new RESTfulInteractionService();
        return r.getInteraction4Opportunity(pHttpHeaders, pOptyId,
                                            pAttributes);
    }

    /**
     * This method creates a simple opportunity interaction
     
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
    @POST
    @Path("{optyid}/interaction/simplecreate")
    @Produces( { "application/xml", "application/json" })
    public RESTInteractionList createSimpleInteraction(@Context
        HttpHeaders pHttpHeaders, @PathParam("optyid")
        Long optyId, @QueryParam("startDate")
        Date startDate, @QueryParam("customerId")
        Long customerId, @QueryParam("description")
        String description, @QueryParam("outcomeCode")
        String outcomeCode, @QueryParam("typeCode")
        String typeCode, @QueryParam("directionCode")
        String directionCode) {

        // Check all mandatory parameters are present
        if (optyId == null || description == null) {
            throw new FusionGenericException("createInteraction : optyId, description are mandatory");
        }

        RESTfulInteractionService r = new RESTfulInteractionService();
        return r.createInteraction4Opportunity(pHttpHeaders, optyId, startDate,
                                               customerId, description,
                                               outcomeCode, typeCode,
                                               directionCode);
    }

    /**
     * findOppInteraction
     *
     * @param pHttpHeaders
     * @param pOptyId
     * @param pInteractionid
     * @return
     * @throws JAXBException
     */
    @GET
    @Path("{optyid}/interaction/{interactionid}")
    @Produces( { "application/xml", "application/json" })
    public RESTInteractionList findOppInteraction(@Context
        HttpHeaders pHttpHeaders, @PathParam("optyid")
        Long pOptyId, @PathParam("interactionid")
        Long pInteractionid, @QueryParam("attrbutes")
        String pAttributes) throws JAXBException {
        // Find Specific Opportunity Interactions
        this.logMessage("findSpecificOppInteraction [" + pInteractionid + "]");
        RESTfulInteractionService r = new RESTfulInteractionService();
        return r.getInteraction(pHttpHeaders, pInteractionid, pAttributes);
    }


    /**
     * createSimpleOpportunity
     *
     * @param pHttpHeaders
     * @param simpleOpportunity
     * @return
     *
     * TODO : Needs to be expanded to include real life usecases of creating opportunity
     */
    @POST
    @Path("/simplecreate")
    @Produces( { "application/xml", "application/json" })
    public RESTOpportunityList createSimpleOpportunity(@Context
        HttpHeaders pHttpHeaders, @QueryParam("name")
        String pName, @QueryParam("salesaccountid")
        Long pSalesAccountPartyId, @QueryParam("keycontactid")
        Long pKeyContactPartyId, @QueryParam("winprob")
        BigDecimal winProb, @QueryParam("currencycode")
        String pCurrencyCode) {

        // Check all mandatory parameters are present
        if (pName == null || pKeyContactPartyId == null ||
            pSalesAccountPartyId == null) {
            throw new FusionGenericException("createOpportunity : Name,PrimaryContact, SalesAccountPartyId are mandatory");
        }


        Opportunity newOpportunity = oppObjFactory.createOpportunity();
        newOpportunity.setName(pName);
        newOpportunity.setTargetPartyId(oppObjFactory.createOpportunityTargetPartyId(pSalesAccountPartyId));
        newOpportunity.setKeyContactId(oppObjFactory.createOpportunityKeyContactId(pKeyContactPartyId));
        newOpportunity.setWinProb(oppObjFactory.createOpportunityWinProb(winProb));
        newOpportunity.setCurrencyCode(pCurrencyCode);
        // Wrap it up
        ArrayList<Opportunity> aoo = new ArrayList<Opportunity>();
        aoo.add((Opportunity)newOpportunity);
        RESTOpportunityList rol2 = new RESTOpportunityList();
        rol2.setOpportunityList(aoo);
        RESTOpportunityList result;
        result =
                this.doDMLOpportunityXML(pHttpHeaders, rol2, DMLOperation.CREATE);

        return result;

    }


    // Create Opportunity using simple XML payLoad


    /**
     * createOpportunityXML
     * @param pHttpHeaders
     * @param p_newOpp
     * @param operation
     * @return
     */
    @POST
    @Produces( { "application/xml", "application/json" })
    @Consumes( { "application/xml" })
    public RESTOpportunityList createOpportunityXML(@Context
        HttpHeaders pHttpHeaders, RESTOpportunityList p_newOpp) {
        return (this.doDMLOpportunityXML(pHttpHeaders, p_newOpp,
                                         DMLOperation.CREATE));
    }


    /**
     * mergeOpportunityXML
     *
     * @param pHttpHeaders
     * @param p_opportunity
     * @param operation
     * @return
     */
    @PUT
    @Produces( { "application/xml", "application/json" })
    @Consumes( { "application/xml" })
    public RESTOpportunityList mergeOpportunityXML(@Context
        HttpHeaders pHttpHeaders, RESTOpportunityList p_opportunity) {
        return (this.doDMLOpportunityXML(pHttpHeaders, p_opportunity,
                                         DMLOperation.MERGE));
    }


    /**
     * deleteOpportunity
     *
     * @param pHttpHeaders
     * @param pOptyId
     */
    @Path("{optyid}")
    @DELETE
    @Produces( { "application/xml", "application/json" })
    public void deleteOpportunity(@Context
        HttpHeaders pHttpHeaders, @PathParam("optyid")
        Long pOptyId) {
        if (pOptyId == null || pOptyId < 1)
            throw new FusionGenericException("OptyId not set");


        Opportunity deleteOpp = this.oppObjFactory.createOpportunity();
        deleteOpp.setOptyId(pOptyId);
        // Wrap it up
        ArrayList<Opportunity> aoo = new ArrayList<Opportunity>();
        aoo.add((Opportunity)deleteOpp);
        RESTOpportunityList rol2 = new RESTOpportunityList();
        rol2.setOpportunityList(aoo);
        this.doDMLOpportunityXML(pHttpHeaders, rol2, DMLOperation.DELETE);
    }


    // Generic function to do DML operations on Opportunity

    /**
     * doDMLOpportunityXML
     *
     * Main Guts for Create/Merge Opportunity
     *
     * @param pHttpHeaders
     * @param pOptyId
     */
    private RESTOpportunityList doDMLOpportunityXML(HttpHeaders pHttpHeaders,
                                                    RESTOpportunityList p_opportunity,
                                                    DMLOperation operation) {
        // Initialise Proxy endpoint
        processRESTServiceHeaders(pHttpHeaders);
        fusionOpportunityService.initialiseConnection(this.getFusionJWTToken(),
                                                      getFusionUsername(),
                                                      getFusionPassword(),
                                                      getFusionEndpointURL(fusionEndpointName),
                                                      this.getFetchSize(),
                                                      this.getFetchStart());

        Opportunity opportunity;
        if (p_opportunity.getOpportunityList() == null) {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
        // Extract out the opportunity, assume its the first one
        opportunity = p_opportunity.getOpportunityList().iterator().next();
        Opportunity result = null;

        try {
            if (operation == DMLOperation.CREATE)
                result =
                        fusionOpportunityService.getOpportunityService().createOpportunity(opportunity);
            else if (operation == DMLOperation.MERGE)
                // must be UPDATE
                result =
                        fusionOpportunityService.getOpportunityService().mergeOpportunity(opportunity);
            else if (operation == DMLOperation.DELETE) {
                fusionOpportunityService.getOpportunityService().deleteOpportunity(opportunity);
            } else
                throw new WebApplicationException(Response.Status.BAD_REQUEST);

        } catch (ServiceException e) {
            throw new FusionGenericException(e.getLocalizedMessage());

        }
        // Wrap it up so JAX-RS is happy
        ArrayList<Opportunity> aoo = new ArrayList<Opportunity>();
        aoo.add((Opportunity)result);
        RESTOpportunityList rol2 = new RESTOpportunityList();
        rol2.setOpportunityList(aoo);

        return rol2;

    }


    /**
     * createChildRevenueItem
     *
     * @param pHttpHeaders
     * @param pOptyId
     */
    @Path("{optyid}/childRevenue")
    @POST
    @Produces( { "application/xml", "application/json" })
    public Long createChildRevenueItem(@Context
        HttpHeaders pHttpHeaders, @PathParam("optyid")
        Long pOptyId, @QueryParam("inventoryItemId")
        Long pInventoryItemId, @QueryParam("inventoryorgid")
        Long pInventoryOrgId, @QueryParam("quantity")
        Long pQuantity, @QueryParam("revenueAmount")
        Long pRevenueAmount, @QueryParam("revenueAmountCurrenyCode")
        String prevenueAmountCurrenyCode) {
        // TODO
        return 0L;
    }

    /**
     * deleteChildRevenueItem
     *
     * @param pHttpHeaders
     * @param pOptyId
     */
    @Path("{optyid}/childRevenue/{revnid}")
    @DELETE
    @Produces( { "application/xml", "application/json" })
    public Long deleteChildRevenueItem(@Context
        HttpHeaders pHttpHeaders, @PathParam("optyid")
        Long pOptyId, @PathParam("revnid")
        Long pRevnId) {
        // TODO
        return 0L;
    }


}

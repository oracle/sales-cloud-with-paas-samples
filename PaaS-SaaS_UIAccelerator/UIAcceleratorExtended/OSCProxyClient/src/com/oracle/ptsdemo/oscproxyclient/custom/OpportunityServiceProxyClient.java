package com.oracle.ptsdemo.oscproxyclient.custom;

import com.oracle.ptsdemo.jwtaccelerator.service.FusionHTTPAuthorizationHeader;

import com.oracle.ptsdemo.oscproxyclient.OpportunityService;
import com.oracle.ptsdemo.oscproxyclient.OpportunityService_Service;

import com.oracle.ptsdemo.oscproxyclient.types.Conjunction;
import com.oracle.ptsdemo.oscproxyclient.types.FindControl;
import com.oracle.ptsdemo.oscproxyclient.types.FindCriteria;

import com.oracle.ptsdemo.oscproxyclient.types.FindOpportunity;
import com.oracle.ptsdemo.oscproxyclient.types.FindOpportunityResponse;
import com.oracle.ptsdemo.oscproxyclient.types.Opportunity;
import com.oracle.ptsdemo.oscproxyclient.types.SortAttribute;
import com.oracle.ptsdemo.oscproxyclient.types.SortOrder;
import com.oracle.ptsdemo.oscproxyclient.types.ViewCriteria;

import com.oracle.ptsdemo.oscproxyclient.types.ViewCriteriaItem;
import com.oracle.ptsdemo.oscproxyclient.types.ViewCriteriaRow;

import com.sun.xml.ws.developer.WSBindingProvider;

import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
  
  
 /**
  * All sample code is provided by Oracle for illustrative purposes only.
  * These sample code examples have not been thoroughly tested under all conditions. 
  * Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code.
  * All sample code contained herein are provided to you "AS IS" without any warranties of any kind. 
  * The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.
  */
public class OpportunityServiceProxyClient extends FusionHTTPAuthorizationHeader {

    @WebServiceRef
    private static OpportunityService_Service opportunityService_Service;
    
    private OpportunityService opportunityService;


    public OpportunityServiceProxyClient() {
        super();
    }

    /**
     * This method should be used to initialize HTTP Authorization Header
     * @param pJWTToken
     * @param pUsername
     * @param pPassword
     * @param pFusionEndpointURL
     * @param pFetchSize
     * @param pFetchStart
     */
    public void initialiseConnection(String pJWTToken, String pUsername, 
                                     String pPassword, String pFusionEndpointURL, 
                                     int pFetchSize, int pFetchStart)  {
        
        //1.Only Construct it if it needs constructing
        if (opportunityService_Service==null)  {
                opportunityService_Service = new OpportunityService_Service();
        }
        
        //1. Retrieve Security Policy (based on JWT User Token or username/password)
        opportunityService =
                opportunityService_Service.getOpportunityServiceSoapHttpPort(this.getSecurityFeature(pFusionEndpointURL, pJWTToken));
        
        // Call Helper Function    
        initFusionEndpoint(pJWTToken, pUsername, pPassword, (WSBindingProvider)opportunityService, pFusionEndpointURL, pFetchSize, pFetchStart);        
        
    }
    
    
    /**
     * Returns a list of WIN-CLOSED Opportunities
     * @param partyUniqueName
     * @throws Exception
     */
    public List<Opportunity> findClosedWonOpportunities(String partyUniqueName) throws Exception {
        if (!isInitialised()) {
            throw new Exception("Opportunity Service not initialized");
        }
        
        //if no value specified, bring all Opportunities
        if (partyUniqueName == null || "".equals(partyUniqueName)) {
            
            partyUniqueName = "%";
        }

        FindOpportunity request = new FindOpportunity();
        request.setFindCriteria(buildFindClosedWonOpportunitiesCriteria(partyUniqueName, getFetchStart(), getFetchSize()));
        request.setFindControl(buildFindClosedWonOpportunitiesControl());
            
        FindOpportunityResponse response = 
          opportunityService.findOpportunity(request);

         return response.getResult();
    }
    
    /**
     * Build FindControl payload section for FindClosedWonOpportunities
     * @return
     */
    private static FindControl buildFindClosedWonOpportunitiesControl() {
        FindControl fControl = new FindControl();
        fControl.setRetrieveAllTranslations(false);
        return fControl;
    }
    
    /**
     * Build FindCriteria payload section for FindClosedWonOpportunities.
     * @param partyUniqueName
     * @param fetchStart
     * @param fetchSize
     * @return
     * @see "SOAP_payload_find_CLOSED_WON_opty_by_SalesParty.xml"
     */
    private static FindCriteria buildFindClosedWonOpportunitiesCriteria(String partyUniqueName, int fetchStart, int fetchSize) {
        FindCriteria findCriteria = new FindCriteria();
        findCriteria.setFetchStart(fetchStart);
        findCriteria.setFetchSize(fetchSize);
        
        
        //fiter definition
        ViewCriteria filter = new ViewCriteria();
        filter.setConjunction(Conjunction.AND);

        //group definition
        ViewCriteriaRow group = new ViewCriteriaRow();
        group.setUpperCaseCompare(false);
        group.setConjunction(Conjunction.AND);

        //item
        ViewCriteriaItem partyUniqueNameItem = new ViewCriteriaItem();
        partyUniqueNameItem.setConjunction(Conjunction.AND);
        partyUniqueNameItem.setUpperCaseCompare(false);
        partyUniqueNameItem.setAttribute("PartyUniqueName");
        partyUniqueNameItem.setOperator("STARTSWITH");
        partyUniqueNameItem.getValue().add(partyUniqueName);

        ViewCriteriaItem stageStatusCdItem = new ViewCriteriaItem();
        stageStatusCdItem.setConjunction(Conjunction.AND);
        stageStatusCdItem.setUpperCaseCompare(false);
        stageStatusCdItem.setAttribute("StageStatusCd");
        stageStatusCdItem.setOperator("=");
        stageStatusCdItem.getValue().add("WON");


        //findAttribute
        findCriteria.getFindAttribute().add("PartyUniqueName");
        findCriteria.getFindAttribute().add("Name");
        findCriteria.getFindAttribute().add("OptyId");
        findCriteria.getFindAttribute().add("Revenue");
        findCriteria.getFindAttribute().add("OptyCreationDate");
        findCriteria.getFindAttribute().add("OptyLastUpdateDate");
        
        
        //sortOrder
        SortAttribute partyUniqueNameSortAttr = new SortAttribute();
        partyUniqueNameSortAttr.setName("PartyUniqueName");
        partyUniqueNameSortAttr.setDescending(false);

        SortAttribute optyLastUpdateDateSortAttr = new SortAttribute();
        optyLastUpdateDateSortAttr.setName("OptyLastUpdateDate");
        optyLastUpdateDateSortAttr.setDescending(true);
            
        SortOrder sortOrder = new SortOrder();
        sortOrder.getSortAttribute().add(partyUniqueNameSortAttr);
        sortOrder.getSortAttribute().add(optyLastUpdateDateSortAttr);
                
                
        //assign items to group
        group.getItem().add(partyUniqueNameItem);
        group.getItem().add(stageStatusCdItem);
        
        //assign group to filter
        filter.getGroup().add(group);
        
        //assign filter and sort order to findCriteria
        findCriteria.setFilter(filter);                
        findCriteria.setSortOrder(sortOrder);
        findCriteria.setExcludeAttribute(false);
        
        return findCriteria;
    }
    
}

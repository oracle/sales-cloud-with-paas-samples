package com.oracle.ptsdemo.uiaccelerator.service;

import com.oracle.ptsdemo.oscproxyclient.custom.OpportunityServiceProxyClient;

import com.oracle.ptsdemo.oscproxyclient.types.Opportunity;

import com.oracle.ptsdemo.uiaccelerator.vo.OpportunityVO;
import com.oracle.ptsdemo.utils.JSFUtils;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * All sample code is provided by Oracle for illustrative purposes only.
 * These sample code examples have not been thoroughly tested under all conditions. 
 * Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code.
 * All sample code contained herein are provided to you "AS IS" without any warranties of any kind. 
 * The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.
 */


/**
 * Wrapper/Façade class used to expose web service calls through the View layer. This class should be exposed as a Bean Data Control.
 */
public class FusionOpportunityService {
    
    private OpportunityServiceProxyClient proxyClient;
    
    private List<OpportunityVO> opportunityList;

    /**
     * Bean Constructor, responsible by reading all parameters from the page flow scope and then initialize the connection with the web service. This means
     * that the http header is setup during this method call. All subsequent method calls should use the same setting setup in constructor.
     */
    public FusionOpportunityService() {
        proxyClient = new OpportunityServiceProxyClient();
        
        //read page flow scope variables values
        Map<String, String> pHeader = (Map<String, String>)JSFUtils.resolveExpression("#{pageFlowScope.pHeader}");
        
        String pJWTToken = pHeader.get("fusionJWTToken");
        String pUsername = pHeader.get("fusionUsername");
        String pPassword = pHeader.get("fusionPassword");

        String pFusionOptyEndpoint = pHeader.get("fusionEndpointURL") + pHeader.get("fusionCRMOpportunityEndpoint");
        
        int pFetchSize = -1;
        if (!"".equals(pHeader.get("fusionFetchSize")) && pHeader.get("fusionFetchSize") != null) {
            pFetchSize = Integer.parseInt(pHeader.get("fusionFetchSize")) ;
        }
        
        int pFetchStart = 0;
        if (!"".equals(pHeader.get("fusionFetchStart")) && pHeader.get("fusionFetchStart") != null) {
            pFetchStart = Integer.parseInt(pHeader.get("fusionFetchStart")) ;
        }
                      
        
        proxyClient.initialiseConnection(pJWTToken, pUsername, pPassword, pFusionOptyEndpoint, pFetchSize, pFetchStart);
        
        opportunityList = new ArrayList<OpportunityVO>();
    }
    
    
    /**
     * Business method responsible to find closed and won opportunities from an specific Party Name
     * @param partyUniqueName
     * @return
     * @throws Exception
     */
    public List<OpportunityVO> findClosedWonOpportunity(String partyUniqueName) throws Exception {
        List<Opportunity> list = proxyClient.findClosedWonOpportunities(partyUniqueName);
        List<OpportunityVO> response = new ArrayList<OpportunityVO>();
        
        for (Opportunity optyBind : list) {
        //The following attributes are returned in the xml payload
//            findCriteria.getFindAttribute().add("PartyUniqueName");
//            findCriteria.getFindAttribute().add("Name");
//            findCriteria.getFindAttribute().add("OptyId");
//            findCriteria.getFindAttribute().add("Revenue");
//            findCriteria.getFindAttribute().add("OptyCreationDate");
//            findCriteria.getFindAttribute().add("OptyLastUpdateDate");            
            
            String partyReturnedUniqueName = optyBind.getPartyUniqueName().getValue();
            String optyName =  optyBind.getName();
            Long optyId = optyBind.getOptyId();
            BigDecimal revenueValue = optyBind.getRevenue().getValue();
            Calendar optyCreationDate = optyBind.getOptyCreationDate().getValue().toGregorianCalendar();
            Calendar optyLastUpdateDate = optyBind.getOptyLastUpdateDate().getValue().toGregorianCalendar();
            
            OpportunityVO optyVO = new OpportunityVO();
            
            optyVO.setPartyUniqueName(partyReturnedUniqueName);
            optyVO.setOptyName(optyName);
            optyVO.setOptyId(optyId);
            optyVO.setRevenueValue(revenueValue);
            optyVO.setOptyCreationDate(optyCreationDate);
            optyVO.setOptyLastUpdateDate(optyLastUpdateDate);
            
            response.add(optyVO);
        }
        this.opportunityList = response;
        return this.opportunityList;
        
        
    }

    /**
     *
     * @param opportunityList
     */
    public void setOpportunityList(List<OpportunityVO> opportunityList) {
        this.opportunityList = opportunityList;
    }

    /**
     *
     * @return
     */
    public List<OpportunityVO> getOpportunityList() {
        return opportunityList;
    }
}

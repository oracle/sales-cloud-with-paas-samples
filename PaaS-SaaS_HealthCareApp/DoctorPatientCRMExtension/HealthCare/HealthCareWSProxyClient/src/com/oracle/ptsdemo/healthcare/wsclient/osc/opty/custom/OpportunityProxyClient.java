package com.oracle.ptsdemo.healthcare.wsclient.osc.opty.custom;


import com.oracle.ptsdemo.healthcare.config.FusionConfig;
import com.oracle.ptsdemo.healthcare.usertoken.exception.GeneralException;
import com.oracle.ptsdemo.healthcare.usertoken.service.UserTokenValidationService;
import com.oracle.ptsdemo.healthcare.usertoken.vo.UserInfo;
import com.oracle.ptsdemo.healthcare.wsclient.osc.OSCWSUtil;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.OpportunityService;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.OpportunityService_Service;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.ServiceException;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated.Conjunction;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated.FindControl;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated.FindCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated.Opportunity;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated.ViewCriteria;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated.ViewCriteriaItem;
import com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated.ViewCriteriaRow;


import com.sun.xml.ws.developer.WSBindingProvider;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


public class OpportunityProxyClient {
    
    
  @WebServiceRef
  private static OpportunityService_Service opportunityService_Service;
  
  private static QName NAMESPACE = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/","OpportunityService");


    private String opportunityWSDL;
    private String opportunityPort;
    private String username;
    private String password;
    private String jwtUserToken;
    private String securityPolicy;
    
  
  private String doctorName;
  private String patientName;
  private String visitDescription;
  
  private String userServicePort;
  

  public OpportunityProxyClient() {
      opportunityPort = FusionConfig.getInstance().getProperty("OPPORTUNITY_SERVICE");

      opportunityWSDL = opportunityPort + "?WSDL";
      this.username = FusionConfig.getInstance().getProperty("FUSION_USER");
      this.password = FusionConfig.getInstance().getProperty("FUSION_PASSWORD");
      this.securityPolicy = FusionConfig.getInstance().getProperty("SECURITY_POLICY");
      this.userServicePort = FusionConfig.getInstance().getProperty("FUSION_HCM_SERVER");
      

      this.jwtUserToken = null;
      
      
  }

  public void getOpportunityDescription (String opptyId, String jwtToken) throws ServiceException {
      Logger logger = Logger.getLogger(OpportunityProxyClient.class.getName());
      
      //reset attributes
      this.doctorName = null;
      this.patientName = null;
      this.visitDescription = null;
      
      if (jwtToken != null) {
        this.jwtUserToken = jwtToken;
        
        UserTokenValidationService userTokenValidationSvc = new UserTokenValidationService(this.jwtUserToken, this.userServicePort);
        UserInfo userInfo;
            try {
                userInfo = userTokenValidationSvc.validateUserToken(true, true);
            } catch (GeneralException e) {
                throw new ServiceException("Invalid token value.", null, e);
            }
            this.username = userInfo.getUsername();
        
        //security policy must be removed in case we are using JWT token!
        this.securityPolicy = "";
      }
      

    URL wsdlLocationURL = null;
        try {
            wsdlLocationURL = new URL(opportunityWSDL);
        } catch (MalformedURLException e) {
            logger.log(Level.ALL, e.getMessage());
        }
        opportunityService_Service = new OpportunityService_Service(wsdlLocationURL, NAMESPACE );
        
    SecurityPoliciesFeature securityFeatures =
      new SecurityPoliciesFeature(new String[] { securityPolicy });

    OpportunityService opportunityService =
      opportunityService_Service.getOpportunityServiceSoapHttpPort(securityFeatures);

    
    // Get the request context to set the outgoing addressing properties
    WSBindingProvider wsbp = (WSBindingProvider)opportunityService;

    // Add your code to call the desired methods.

    OSCWSUtil.setSOAPHeader(wsbp, username, password, jwtUserToken, opportunityPort);
    

    FindCriteria fCriteria = new FindCriteria();

    fCriteria.getFindAttribute().add("Name");
    fCriteria.getFindAttribute().add("PartyName1");
    fCriteria.getFindAttribute().add("PrimaryContactPartyName");
    
    ViewCriteria vc = new ViewCriteria();

    vc.setConjunction(Conjunction.AND);

    ViewCriteriaRow vcr = new ViewCriteriaRow();
    vcr.setUpperCaseCompare(false);

    ViewCriteriaItem vci = new ViewCriteriaItem();
    vci.setAttribute("OptyId");
    vci.setOperator("=");
    vci.setUpperCaseCompare(false);
    vci.getValue().add(opptyId);

    vcr.getItem().add(vci);
    vc.getGroup().add(vcr);

    fCriteria.setFilter(vc);
    fCriteria.setFetchSize(-1);
    fCriteria.setFetchStart(0);

    FindControl fControl = new FindControl();
    fControl.setRetrieveAllTranslations(false);

    try {
      List<Opportunity> list =
        opportunityService.findOpportunity(fCriteria, fControl);
      
      if (list != null && !list.isEmpty()) {
        
        //return first opty          
        Opportunity oppty = list.get(0);
        this.setVisitDescription (oppty.getName());
        this.setDoctorName (oppty.getPartyName1());
        this.setPatientName (oppty.getPrimaryContactPartyName());

      }
     
    } catch (ServiceException e) {
            
      throw e;
    }

  }

  public String getDoctorName () {
    return doctorName;
  }

  public void setDoctorName (String doctorName) {
    this.doctorName = doctorName;
  }

  public String getPatientName () {
    return patientName;
  }

  public void setPatientName (String patientName) {
    this.patientName = patientName;
  }

  public String getVisitDescription() {
    return visitDescription;
  }

  public void setVisitDescription(String visitDescription) {
    this.visitDescription = visitDescription;
  }

  
}

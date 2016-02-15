package oracle.cloud.sampleapps.salesmerchtracker.model.proxy;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.AssignSalesAccountChkProfile;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.AssignSalesAccountChkProfileAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.AssignSalesAccountChkProfileResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateOrganizationParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateOrganizationPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateOrganizationPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreatePartyUsage;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreatePartyUsageAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreatePartyUsageResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreatePersonParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreatePersonPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreatePersonPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesAccount;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesAccountAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesAccountResource;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesAccountResourceAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesAccountResourceResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesAccountResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.CreateSalesPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.DeleteSalesAccountResource;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.DeleteSalesAccountResourceAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.DeleteSalesAccountResourceResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.DeleteSalesParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.DeleteSalesPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.DeleteSalesPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccount;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountMyTeamVC;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountMyTeamVCAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountMyTeamVCResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountMyVC;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountMyVCAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountMyVCResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindMySalesAccountResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccount;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountMyFavoriteSalesAccountsVC;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountMyFavoriteSalesAccountsVCResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountResource;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountResourceAccess;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountResourceAccessAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountResourceAccessResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountResourceAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountResourceResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesAccountResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.FindSalesPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetDfltObjAttrHints;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetDfltObjAttrHintsAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetDfltObjAttrHintsResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetEntityList;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetEntityListAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetEntityListResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesAccount;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesAccountAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesAccountResource;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesAccountResourceAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesAccountResourceResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesAccountResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetSalesPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetServiceLastUpdateTime;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetServiceLastUpdateTimeAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.GetServiceLastUpdateTimeResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergeOrganizationParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergeOrganizationPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergeOrganizationPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergePersonParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergePersonPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergePersonPartyResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergeSalesAccount;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergeSalesAccountAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.MergeSalesAccountResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.ObjectFactory;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateExistingFlag;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateExistingFlagAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateExistingFlagResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesAccount;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesAccountAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesAccountResource;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesAccountResourceAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesAccountResourceResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesAccountResponse;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesParty;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesPartyAsync;
import oracle.cloud.sampleapps.salesmerchtracker.model.proxy.types.UpdateSalesPartyResponse;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="https://your_sales_cloud_URL/crmCommonSalesParties/SalesPartyService?WSDL",
  targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/",
  name="SalesPartyService")
@XmlSeeAlso(
  { ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface SalesPartyService
{
  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/assignSalesAccountChkProfile")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/assignSalesAccountChkProfile", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/assignSalesAccountChkProfile/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/assignSalesAccountChkProfileResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="assignSalesAccountChkProfileResponse")
  public AssignSalesAccountChkProfileResponse assignSalesAccountChkProfile(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="assignSalesAccountChkProfile")
    AssignSalesAccountChkProfile parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateExistingFlag")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateExistingFlag", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateExistingFlag/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateExistingFlagResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="updateExistingFlagResponse")
  public UpdateExistingFlagResponse updateExistingFlag(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateExistingFlag")
    UpdateExistingFlag parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createOrganizationParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createOrganizationParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createOrganizationParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createOrganizationPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="createOrganizationPartyResponse")
  public CreateOrganizationPartyResponse createOrganizationParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createOrganizationParty")
    CreateOrganizationParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeOrganizationParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeOrganizationParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/mergeOrganizationParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/mergeOrganizationPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="mergeOrganizationPartyResponse")
  public MergeOrganizationPartyResponse mergeOrganizationParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="mergeOrganizationParty")
    MergeOrganizationParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPersonParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPersonParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createPersonParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createPersonPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="createPersonPartyResponse")
  public CreatePersonPartyResponse createPersonParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createPersonParty")
    CreatePersonParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergePersonParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergePersonParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/mergePersonParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/mergePersonPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="mergePersonPartyResponse")
  public MergePersonPartyResponse mergePersonParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="mergePersonParty")
    MergePersonParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccount")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccount", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getSalesAccount/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getSalesAccountResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="getSalesAccountResponse")
  public GetSalesAccountResponse getSalesAccount(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getSalesAccount")
    GetSalesAccount parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccount")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccount", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createSalesAccount/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createSalesAccountResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="createSalesAccountResponse")
  public CreateSalesAccountResponse createSalesAccount(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createSalesAccount")
    CreateSalesAccount parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccount")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccount", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateSalesAccount/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateSalesAccountResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="updateSalesAccountResponse")
  public UpdateSalesAccountResponse updateSalesAccount(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateSalesAccount")
    UpdateSalesAccount parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeSalesAccount")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeSalesAccount", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/mergeSalesAccount/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/mergeSalesAccountResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="mergeSalesAccountResponse")
  public MergeSalesAccountResponse mergeSalesAccount(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="mergeSalesAccount")
    MergeSalesAccount parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccount")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccount", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccount/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccountResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findSalesAccountResponse")
  public FindSalesAccountResponse findSalesAccount(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccount")
    FindSalesAccount parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccountResource")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccountResource", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createSalesAccountResource/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createSalesAccountResourceResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="createSalesAccountResourceResponse")
  public CreateSalesAccountResourceResponse createSalesAccountResource(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createSalesAccountResource")
    CreateSalesAccountResource parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccountResource")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccountResource", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateSalesAccountResource/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateSalesAccountResourceResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="updateSalesAccountResourceResponse")
  public UpdateSalesAccountResourceResponse updateSalesAccountResource(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateSalesAccountResource")
    UpdateSalesAccountResource parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesAccountResource")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesAccountResource", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/deleteSalesAccountResource/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/deleteSalesAccountResourceResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="deleteSalesAccountResourceResponse")
  public DeleteSalesAccountResourceResponse deleteSalesAccountResource(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="deleteSalesAccountResource")
    DeleteSalesAccountResource parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResource")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResource", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccountResource/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccountResourceResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findSalesAccountResourceResponse")
  public FindSalesAccountResourceResponse findSalesAccountResource(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccountResource")
    FindSalesAccountResource parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResourceAccess")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResourceAccess", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccountResourceAccess/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccountResourceAccessResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findSalesAccountResourceAccessResponse")
  public FindSalesAccountResourceAccessResponse findSalesAccountResourceAccess(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccountResourceAccess")
    FindSalesAccountResourceAccess parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getSalesParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getSalesPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="getSalesPartyResponse")
  public GetSalesPartyResponse getSalesParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getSalesParty")
    GetSalesParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createSalesParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createSalesPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="createSalesPartyResponse")
  public CreateSalesPartyResponse createSalesParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createSalesParty")
    CreateSalesParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateSalesParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/updateSalesPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="updateSalesPartyResponse")
  public UpdateSalesPartyResponse updateSalesParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateSalesParty")
    UpdateSalesParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findSalesPartyResponse")
  public FindSalesPartyResponse findSalesParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesParty")
    FindSalesParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccountResourceAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccountResourceAsync")
  @Oneway
  public void updateSalesAccountResourceAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateSalesAccountResourceAsync")
    UpdateSalesAccountResourceAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResourceAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResourceAsync")
  @Oneway
  public void findSalesAccountResourceAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccountResourceAsync")
    FindSalesAccountResourceAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createOrganizationPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createOrganizationPartyAsync")
  @Oneway
  public void createOrganizationPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createOrganizationPartyAsync")
    CreateOrganizationPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesPartyAsync")
  @Oneway
  public void getSalesPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getSalesPartyAsync")
    GetSalesPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeOrganizationPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeOrganizationPartyAsync")
  @Oneway
  public void mergeOrganizationPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="mergeOrganizationPartyAsync")
    MergeOrganizationPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateExistingFlagAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateExistingFlagAsync")
  @Oneway
  public void updateExistingFlagAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateExistingFlagAsync")
    UpdateExistingFlagAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccountResourceAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccountResourceAsync")
  @Oneway
  public void createSalesAccountResourceAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createSalesAccountResourceAsync")
    CreateSalesAccountResourceAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountAsync")
  @Oneway
  public void findSalesAccountAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccountAsync")
    FindSalesAccountAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergePersonPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergePersonPartyAsync")
  @Oneway
  public void mergePersonPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="mergePersonPartyAsync")
    MergePersonPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/assignSalesAccountChkProfileAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/assignSalesAccountChkProfileAsync")
  @Oneway
  public void assignSalesAccountChkProfileAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="assignSalesAccountChkProfileAsync")
    AssignSalesAccountChkProfileAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPersonPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPersonPartyAsync")
  @Oneway
  public void createPersonPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createPersonPartyAsync")
    CreatePersonPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccountAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesAccountAsync")
  @Oneway
  public void createSalesAccountAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createSalesAccountAsync")
    CreateSalesAccountAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccountAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesAccountAsync")
  @Oneway
  public void updateSalesAccountAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateSalesAccountAsync")
    UpdateSalesAccountAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesAccountResourceAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesAccountResourceAsync")
  @Oneway
  public void deleteSalesAccountResourceAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="deleteSalesAccountResourceAsync")
    DeleteSalesAccountResourceAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeSalesAccountAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/mergeSalesAccountAsync")
  @Oneway
  public void mergeSalesAccountAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="mergeSalesAccountAsync")
    MergeSalesAccountAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createSalesPartyAsync")
  @Oneway
  public void createSalesPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createSalesPartyAsync")
    CreateSalesPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/updateSalesPartyAsync")
  @Oneway
  public void updateSalesPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="updateSalesPartyAsync")
    UpdateSalesPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResourceAccessAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountResourceAccessAsync")
  @Oneway
  public void findSalesAccountResourceAccessAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccountResourceAccessAsync")
    FindSalesAccountResourceAccessAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesPartyAsync")
  @Oneway
  public void findSalesPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesPartyAsync")
    FindSalesPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccountAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccountAsync")
  @Oneway
  public void getSalesAccountAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getSalesAccountAsync")
    GetSalesAccountAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccountResource")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccountResource", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getSalesAccountResource/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getSalesAccountResourceResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="getSalesAccountResourceResponse")
  public GetSalesAccountResourceResponse getSalesAccountResource(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getSalesAccountResource")
    GetSalesAccountResource parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccountResourceAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getSalesAccountResourceAsync")
  @Oneway
  public void getSalesAccountResourceAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getSalesAccountResourceAsync")
    GetSalesAccountResourceAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPartyUsage")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPartyUsage", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createPartyUsage/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/createPartyUsageResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="createPartyUsageResponse")
  public CreatePartyUsageResponse createPartyUsage(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createPartyUsage")
    CreatePartyUsage parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPartyUsageAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/createPartyUsageAsync")
  @Oneway
  public void createPartyUsageAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="createPartyUsageAsync")
    CreatePartyUsageAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccount")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccount", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findMySalesAccount/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findMySalesAccountResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findMySalesAccountResponse")
  public FindMySalesAccountResponse findMySalesAccount(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findMySalesAccount")
    FindMySalesAccount parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountAsync")
  @Oneway
  public void findMySalesAccountAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findMySalesAccountAsync")
    FindMySalesAccountAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyTeamVC")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyTeamVC", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findMySalesAccountMyTeamVC/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findMySalesAccountMyTeamVCResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findMySalesAccountMyTeamVCResponse")
  public FindMySalesAccountMyTeamVCResponse findMySalesAccountMyTeamVC(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findMySalesAccountMyTeamVC")
    FindMySalesAccountMyTeamVC parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyVC")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyVC", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findMySalesAccountMyVC/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findMySalesAccountMyVCResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findMySalesAccountMyVCResponse")
  public FindMySalesAccountMyVCResponse findMySalesAccountMyVC(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findMySalesAccountMyVC")
    FindMySalesAccountMyVC parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyVCAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyVCAsync")
  @Oneway
  public void findMySalesAccountMyVCAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findMySalesAccountMyVCAsync")
    FindMySalesAccountMyVCAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyTeamVCAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findMySalesAccountMyTeamVCAsync")
  @Oneway
  public void findMySalesAccountMyTeamVCAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findMySalesAccountMyTeamVCAsync")
    FindMySalesAccountMyTeamVCAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountMyFavoriteSalesAccountsVC")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountMyFavoriteSalesAccountsVC", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccountMyFavoriteSalesAccountsVC/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/findSalesAccountMyFavoriteSalesAccountsVCResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="findSalesAccountMyFavoriteSalesAccountsVCResponse")
  public FindSalesAccountMyFavoriteSalesAccountsVCResponse findSalesAccountMyFavoriteSalesAccountsVC(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccountMyFavoriteSalesAccountsVC")
    FindSalesAccountMyFavoriteSalesAccountsVC parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountMyFavoriteSalesAccountsVCAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findSalesAccountMyFavoriteSalesAccountsVCAsync")
  @Oneway
  public void findSalesAccountMyFavoriteSalesAccountsVCAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="findSalesAccountMyFavoriteSalesAccountsVC")
    FindSalesAccountMyFavoriteSalesAccountsVC parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesParty")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesParty", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/deleteSalesParty/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/deleteSalesPartyResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="deleteSalesPartyResponse")
  public DeleteSalesPartyResponse deleteSalesParty(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="deleteSalesParty")
    DeleteSalesParty parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesPartyAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/deleteSalesPartyAsync")
  @Oneway
  public void deleteSalesPartyAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="deleteSalesPartyAsync")
    DeleteSalesPartyAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getDfltObjAttrHints")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getDfltObjAttrHints", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getDfltObjAttrHints/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getDfltObjAttrHintsResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="getDfltObjAttrHintsResponse")
  public GetDfltObjAttrHintsResponse getDfltObjAttrHints(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getDfltObjAttrHints")
    GetDfltObjAttrHints parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getServiceLastUpdateTime")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getServiceLastUpdateTime", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getServiceLastUpdateTime/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getServiceLastUpdateTimeResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="getServiceLastUpdateTimeResponse")
  public GetServiceLastUpdateTimeResponse getServiceLastUpdateTime(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getServiceLastUpdateTime")
    GetServiceLastUpdateTime parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getEntityList")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getEntityList", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getEntityList/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/SalesPartyService/getEntityListResponse")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
    partName="parameters", name="getEntityListResponse")
  public GetEntityListResponse getEntityList(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getEntityList")
    GetEntityList parameters)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getDfltObjAttrHintsAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getDfltObjAttrHintsAsync")
  @Oneway
  public void getDfltObjAttrHintsAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getDfltObjAttrHintsAsync")
    GetDfltObjAttrHintsAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getEntityListAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getEntityListAsync")
  @Oneway
  public void getEntityListAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getEntityListAsync")
    GetEntityListAsync parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getServiceLastUpdateTimeAsync")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/getServiceLastUpdateTimeAsync")
  @Oneway
  public void getServiceLastUpdateTimeAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/types/",
      partName="parameters", name="getServiceLastUpdateTimeAsync")
    GetServiceLastUpdateTimeAsync parameters);
}

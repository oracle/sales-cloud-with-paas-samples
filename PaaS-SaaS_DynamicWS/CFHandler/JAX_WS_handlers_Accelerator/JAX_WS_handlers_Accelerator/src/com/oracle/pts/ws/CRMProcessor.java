package com.oracle.pts.ws;

import com.oracle.pts.custom.AttributeEntry;

import com.oracle.pts.custom.CustomFieldHolder;
import com.oracle.pts.custom.DataSet;
import com.oracle.pts.custom.MetaInfo;

import com.oracle.pts.custom.MetaInfoFactory;


import com.oracle.pts.custom.OptyMetaInfoFactory;
import com.oracle.pts.custom.SalesPartyMetaInfoFactory;

import com.oracle.pts.util.XMLUtil;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import java.util.Map;

import javax.xml.soap.SOAPBody;

import javax.xml.soap.SOAPElement;

import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class CRMProcessor {
  //  private String objName;
    private MetaInfoFactory metaInfoFactory;
    private MetaInfo metaInfo;
   // private List<DataSet> dataSetList;
   public static final int DEPTH = 1;
    
    private XMLUtil xmlUtil;
    
    public static boolean disable;
    

    private String objectName = null;
    
    public static final String OPPORTUNITY = "OPPORTUNITY";
    public static final String SALEA_PARTY = "SALEA_PARTY";
    
    public CRMProcessor() {
        super();
        init();
    }
    public CRMProcessor(String objectName) {
        super();

        this.objectName=objectName;
        init();
    }
    private void init(){
        
        
        if(objectName!=null){
            if(objectName.equalsIgnoreCase(SALEA_PARTY)){
                metaInfoFactory = new SalesPartyMetaInfoFactory();
                
                metaInfo = metaInfoFactory.getMetaInfo();
                
            }
            else if(objectName.equalsIgnoreCase(OPPORTUNITY)){
                metaInfoFactory = new OptyMetaInfoFactory();
                
                metaInfo = metaInfoFactory.getMetaInfo();
                
            }
            
        }
        else{
            metaInfoFactory = new SalesPartyMetaInfoFactory();
            
           metaInfo = metaInfoFactory.getMetaInfo();
                   xmlUtil = new XMLUtil();
        }
    }
    public boolean handleMessage(SOAPMessageContext ctx) {
        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        String objectName = customFieldHolder.getObjectName();
        System.out.println("objectName ************** " + objectName);
        SOAPBody soapBody;
        SOAPHeader soapHeader;
        SOAPPart soapPart;
        try {
            soapBody = ctx.getMessage().getSOAPBody();
            soapHeader = ctx.getMessage().getSOAPHeader();
            soapPart = ctx.getMessage().getSOAPPart();
            
            XMLUtil xmlUtil = new XMLUtil();
            NodeList nodeList = soapBody.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                String nodeName = node.getNodeName();
                nodeName =
                        nodeName.substring(node.getNodeName().indexOf(":") + 1,
                                           nodeName.length());

                System.out.println("name *************** " + nodeName);

                if (nodeName.equals("create"+objectName)) {
                    handleCreateEntity(node);
                    xmlUtil.print(soapBody);
                    
                } else if (nodeName.equals("delete"+objectName)) {
                    // no need modification for delete

                } else if (nodeName.equals("update" + objectName)) {
                    System.out.println("findUpdate" + objectName + "*******************");
                    xmlUtil.print(soapBody);
                    handleupdateEntity(node);
                    

                } else if (nodeName.equals("get"+objectName)) {

                } else if (nodeName.equals("find" + objectName + "Response")) {
                    System.out.println("find" + objectName + "Response*******************");
                    handlefindEntityResponse(node);
                    xmlUtil.print(soapBody);
                }
                else if (nodeName.equals("create" + objectName + "Response")) {
                    System.out.println("create" + objectName + "Response*******************");
                   
                    xmlUtil.print(soapBody);
                }
                else if (nodeName.equals("get" + objectName + "Response")) {
                    System.out.println("get" + objectName + "Response*******************");
                   // xmlUtil.print(soapBody);
                    handlegetEntityResponse(node);
                }

            }

            System.out.println("mBody****");
         //   xmlUtil.print(soapBody);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return true;
    }
    public void handleCreateEntity(Node node) {
         CustomFieldHolder customFieldHolder = new CustomFieldHolder();
         String objectName = customFieldHolder.getObjectName();
          try {
            String prefix = "";
            NodeList cNodeList = node.getChildNodes();
            for (int j = 0; j < cNodeList.getLength(); j++) {
                Node cNode = cNodeList.item(j);
                String cNodeName = cNode.getNodeName();
                cNodeName =
                        cNodeName.substring(cNode.getNodeName().indexOf(":") +
                                            1, cNodeName.length());
                System.out.println("cName *********** " + cNodeName);
                if (cNodeName.equalsIgnoreCase(objectName)) {

                    NodeList ccNodeList = cNode.getChildNodes();
                    for (int k = 0; k < ccNodeList.getLength(); k++) {
                        Node ccNode = ccNodeList.item(k);
                        String ccNodeName = ccNode.getNodeName();
                        ccNodeName =
                                ccNodeName.substring(ccNode.getNodeName().indexOf(":") +
                                                     1, ccNodeName.length());
                    
                       
                            prefix =
                                    ccNode.getNodeName().substring(0, ccNode.getNodeName().indexOf(":"));
                            break;

                       
                    }
                    System.out.println("prefix ********* " + prefix);
                    SOAPElement soapElement = (SOAPElement)cNode;
                    
                    List<AttributeEntry> attrList = customFieldHolder.getDataSet().getAttributeList();
                    for(AttributeEntry attr:attrList){
                       String fieldName = attr.getName();
                        String fieldValue = attr.getValue();
                        SOAPElement customElement = soapElement.addChildElement(fieldName, prefix);
                        customElement.addTextNode(fieldValue);
                    }
                    List<DataSet> cDataSetList = customFieldHolder.getDataSet().getChildDataSet();
                    for(DataSet cDataSet:cDataSetList){
                        SOAPElement customElement = soapElement.addChildElement(cDataSet.getName(), prefix);
                        for(AttributeEntry attr:cDataSet.getAttributeList()){
                            SOAPElement cCustomElement = customElement.addChildElement(attr.getName(),prefix);
                            cCustomElement.addTextNode(attr.getValue());
                        }
                    }


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void handleupdateEntity(Node node) {
        handleCreateEntity(node);
    }
  
    public void handlefindEntityResponse(Node node) {
        try {
            String prefix = "";
            NodeList cNodeList = node.getChildNodes();
            for (int j = 0; j < cNodeList.getLength(); j++) {
                Node cNode = cNodeList.item(j);
                String cNodeName = cNode.getNodeName();
                cNodeName =
                        cNodeName.substring(cNode.getNodeName().indexOf(":") +
                                            1, cNodeName.length());
                if (cNodeName.equals("result")) {
                    CustomFieldHolder customFieldHolder = new CustomFieldHolder();
                    List<DataSet> dataSetList = customFieldHolder.getDataSetList();
                    DataSet dataSet = new DataSet();
                    dataSet.setName(customFieldHolder.getObjectName());
                    String keyName = CustomFieldHolder.getKeyName(dataSet.getName());
                    NodeList ccNodeList = cNode.getChildNodes();
                    for (int k = 0; k < ccNodeList.getLength(); k++) {
                        Node ccNode = ccNodeList.item(k);
                        String ccNodeName = ccNode.getNodeName();
                        ccNodeName =
                                ccNodeName.substring(ccNode.getNodeName().indexOf(":") +
                                                     1, ccNodeName.length());
                         
                        
                        
                     
                            MetaInfo cMetaInfo =   metaInfo.getChildMetaInfo(ccNodeName);
                            if (cMetaInfo!=null ) {// child
                           
                                  DataSet cDataSet = dataSet.getChildDataSetByName(ccNodeName);
                                  processData(cDataSet,ccNode,cMetaInfo);
                            }
                            else{ // attribute
                             
                            if(keyName.equals(ccNodeName)){
                           
                                dataSet.setId(ccNode.getTextContent());
                            }
                               
                                if (ccNodeName.contains("_c")) {
                          
                                    
                                    AttributeEntry attr = new AttributeEntry();
                                    attr.setName(ccNodeName);
                                    attr.setValue(ccNode.getTextContent());
                                    dataSet.getAttributeList().add(attr);
                                }
                            }
                                             
                    }
                    dataSetList.add(dataSet);
                    SOAPElement soapElement = (SOAPElement)cNode;


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void handlegetEntityResponse(Node node) {
        handlefindEntityResponse(node);
    }
    
    
    

    public void processData(DataSet dataSet,Node node,MetaInfo metaInfo) {
        
        String keyName = CustomFieldHolder.getKeyName(dataSet.getName());
       
        NodeList cNodeList = node.getChildNodes();
        for (int i = 0; i < cNodeList.getLength(); i++) {
            Node cNode = cNodeList.item(i);
            String cNodeName =
                cNode.getNodeName().substring(cNode.getNodeName().lastIndexOf(':') +
                                              1,
                                              cNode.getNodeName().length());
            
          
            MetaInfo cMetaInfo =   metaInfo.getChildMetaInfo(cNodeName);
            if (cMetaInfo!=null ) {
                String type = metaInfo.getChildListType().get(cNodeName);
               
                DataSet cDataSet = dataSet.getChildDataSetByName(cNodeName);      
                String subType = metaInfo.getChildListSubType().get(cNodeName);
                cDataSet.setType(type);
                cDataSet.setSubType(subType);
                cDataSet.setParentDataSet(dataSet);
                
                
                cDataSet.setDepth(dataSet.getDepth()+1);
                
                if(cDataSet.getDepth()<CRMProcessor.DEPTH){
                    processData(cDataSet,cNode,cMetaInfo);
                }
            }
            else{
                if(cNodeName.equals("#text")==false){
                    
                    if(keyName.equals(cNodeName)){
                        dataSet.setId(cNode.getTextContent());
                    }
                    
                    
                    if (cNodeName.contains("_c")) {
                        AttributeEntry attributeEntry = new AttributeEntry();
                       
                        attributeEntry.setLabel(cNodeName);
                        attributeEntry.setName(cNodeName);
                        attributeEntry.setValue(cNode.getTextContent());
                        dataSet.getAttributeList().add(attributeEntry);
                    }
                }
            }
        }
    }


}

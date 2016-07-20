package com.oracle.pts.custom;

import com.oracle.pts.config.FusionConfig;
import com.oracle.pts.schema.SchemaDownloader;
import com.oracle.pts.util.XMLUtil;

import com.oracle.pts.ws.CRMProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MetaInfo {
    protected List<AttributeEntry> attributeNameList;
    protected String objectName;
    protected String type;
    protected List<String> childList;
    protected HashMap<String,String> childListType;
    protected String xmlData;
    protected Map<String,MetaInfo> childXmlDataMap;
    protected XMLUtil xmlUtil;
    protected  HashMap<String,String> childListSubType;


    private Map<String,String> schemaLocationList;
    
    private List<MetaInfo> childMetaInfoList;
    
    private String parentObjectName;
    
    public static final String SUB_TYPE_ATTRIBUTE = "SUB_TYPE_ATTRIBUTE";
    public static final String SUB_TYPE_CHILD =  "SUB_TYPE_CHILD";
    public static final String SUB_TYPE_CHILD_REFERENCE =  "SUB_TYPE_CHILD_REFERENCE";

    private int depth = 0; 
    
   
    private Logger logger = Logger.getLogger("CRM");

    
    public MetaInfo() {
        super();
        init();
    }

    private void init() {
        xmlUtil = new XMLUtil();
        childXmlDataMap = new HashMap<String,MetaInfo>();
        childList = new ArrayList<String>();
        childListType = new HashMap<String,String>();
        childListSubType = new HashMap<String,String>();
        
        schemaLocationList = new HashMap<String,String>();
        childMetaInfoList = new ArrayList<MetaInfo>();
    }

    public void setAttributeList(List<AttributeEntry> attributeNameList) {
        this.attributeNameList = attributeNameList;
    }

    public List<AttributeEntry> getAttributeList() {
        return attributeNameList;
    }
    public AttributeEntry getAttribute(String name){
        AttributeEntry attributeEntry = null;
        for(AttributeEntry cAttributeEntry:attributeNameList){
            if(cAttributeEntry.getName().equals(name)){
                attributeEntry = cAttributeEntry;
                break;
            }
        }
        return attributeEntry;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setChildList(List<String> childList) {
        this.childList = childList;
    }

    public List<String> getChildList() {
        return childList;
    }

    public void setXmlSchema(String objectName,String xmlData) {
        this.objectName=objectName;
          this.xmlData = xmlData;
          
    }
    public void setChildXmlData(String objectName,String xmlData) {
        
        MetaInfo childMetaInfo = new MetaInfo();
        childMetaInfo.setXmlSchema(objectName, xmlData);
        childXmlDataMap.put(objectName,childMetaInfo);
    }
        
    public void process() {
        
        
        
        setSchemaLocationList();
        if(parentObjectName != null){
            System.out.println("Parent: " + parentObjectName);
        }
        System.out.println("objectName " + objectName);
        attributeNameList = new ArrayList<AttributeEntry>();
        childList = new ArrayList<String>();
            try {
                
       Document document = xmlUtil.parseXmlFile(xmlData);
 
            NodeList sequenceChildList= null;
                for(int i=0;i<document.getFirstChild().getChildNodes().getLength();i++){
                    Node node = document.getFirstChild().getChildNodes().item(i);
                    if(node.getNodeName().contains("complexType")){
                        
                        for(int j=0;j<node.getChildNodes().getLength();j++){
                            Node cNode = node.getChildNodes().item(j);
                             if(cNode.getNodeName().contains("sequence")){
                                sequenceChildList = cNode.getChildNodes();
                                break;
                            }
                        }
                        if(sequenceChildList!=null){
                            break;
                        }
                    }
                }
                for(int i=0;i<sequenceChildList.getLength();i++){
                    Node node = sequenceChildList.item(i);
                    
                   
                    if(node.getNodeType()==Node.ELEMENT_NODE){
                    String attrName = node.getAttributes().getNamedItem("name").getNodeValue();
                    Node maxOccursNode = node.getAttributes().getNamedItem("maxOccurs");
                    if(node.getAttributes().getNamedItem("maxOccurs")!=null && node.getAttributes().getNamedItem("maxOccurs").getNodeValue().equals("unbounded")){
                    String maxOccurs = node.getAttributes().getNamedItem("maxOccurs").getNodeValue();
                        String type = node.getAttributes().getNamedItem("type").getNodeValue();
                        if(type.indexOf(':')!=-1){
                        type = type.substring(type.indexOf(':')+1,type.length());
                        }
                        System.out.println("MetaInfo.processData.name**************************************child************* " +attrName );
                        System.out.println("MetaInfo.processData.type**************************************child************* " +type );
                         
                         
                         
                         
                        SchemaDownloader schemaDownloader = new SchemaDownloader();
                        
                        String urlString = schemaLocationList.get(type);
                        
                        String xmlSchema = schemaDownloader.download(urlString);
                        MetaInfo childMetaInfo = new MetaInfo();
                        childMetaInfo.setObjectName(attrName);
                        childMetaInfo.setType(type);
                        childMetaInfo.setXmlSchema(attrName, xmlSchema);
                        childMetaInfo.setParentObjectName(objectName);
                        
                        
                        childMetaInfo.setDepth(depth+1);
                        if(depth<CRMProcessor.DEPTH){
                            childMetaInfo.process();
                        }

                        
                        
                         childMetaInfoList.add(childMetaInfo);
                       
                    }
                    else{
                    
                            AttributeEntry attributeEntry = new AttributeEntry();
                            attributeNameList.add(attributeEntry);
                            attributeEntry.setLabel(attrName);
                            attributeEntry.setName(attrName);
                         
                       
                    }
                   
                    String attributeValue = null;
               
                }
                }
        } 
            catch(Exception e){
                e.printStackTrace();
            }
     
    }    
    private void setSchemaLocationList(){
              try {
         Document document = xmlUtil.parseXmlFile(xmlData);
        
              NodeList childList = document.getFirstChild().getChildNodes();
                  for(int i=0;i<childList.getLength();i++){
                      Node childNode = childList.item(i);
                       if(childNode.getNodeName().contains("import") || childNode.getNodeName().contains("include")){
                            String schemaLocation = childNode.getAttributes().getNamedItem("schemaLocation").getTextContent();
                            logger.info("schemaLocation:  " + schemaLocation);
                            String schemaName = schemaLocation.substring(schemaLocation.lastIndexOf('/')+1,schemaLocation.lastIndexOf('.'));
                            logger.info("schemaName " + schemaName);
                            
                          schemaLocationList.put(schemaName,schemaLocation);
                      }
                  }
          } 
              catch(Exception e){
                  e.printStackTrace();
              }        
    }
    private void printAttributeList(){
        for(AttributeEntry attributeEntry:attributeNameList){
            System.out.println("attributeEntry.name " + attributeEntry.getName());
            System.out.println("attributeEntry.label " + attributeEntry.getLabel());
        }
    }
    private void printChildList(){
        for(String name:childList){
            System.out.println("child.name " + name);
        }
    }
    public void setObjectName(String objectName){
        this.objectName = objectName;
    }

    public HashMap<String, String> getChildListType() {
        return childListType;
    }

    public Map<String, MetaInfo> getChildXmlDataMap() {
        return childXmlDataMap;
    }

    public HashMap<String, String> getChildListSubType() {
        return childListSubType;
    }
    public XMLUtil getXMLUtil(){
        if(xmlUtil==null){
            xmlUtil = new XMLUtil();
        }
        return xmlUtil;
    }

    public void setParentObjectName(String parentObjectName) {
        this.parentObjectName = parentObjectName;
    }

    public String getParentObjectName() {
        return parentObjectName;
    }
    public void printAllAttributes(){
        printAllAttributes(0);
    }
    private void printAllAttributes(int depth){
        for(int j=0;j<depth;j++){
            System.out.print(" ");
        }
       if(parentObjectName!=null){
            System.out.print("parentObjectName " + parentObjectName + " ");
        }
        System.out.println("objectName " + objectName);
        for(AttributeEntry attributeEntry:attributeNameList){
            for(int j=0;j<depth;j++){
                System.out.print(" ");
            }
            System.out.println("name: " + attributeEntry.getName() + " ");
        }
        for(MetaInfo childMetaInfo:childMetaInfoList){
            childMetaInfo.printAllAttributes(depth+10);
        }
        
    }
    public MetaInfo getChildMetaInfo(String name){
        MetaInfo rMetaInfo = null;
        for(MetaInfo cMetaInfo:childMetaInfoList){
            String cName = cMetaInfo.getObjectName();
            if(name.equals(cName)){
                rMetaInfo = cMetaInfo;
                break;
            }
        }
        return rMetaInfo;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }
}

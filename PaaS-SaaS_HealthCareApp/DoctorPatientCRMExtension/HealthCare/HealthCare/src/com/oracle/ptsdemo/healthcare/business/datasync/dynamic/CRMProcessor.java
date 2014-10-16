package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;


import com.oracle.ptsdemo.healthcare.business.HealthCareException;

import java.util.List;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 */
public final class CRMProcessor {


    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(CRMProcessor.class);


    private MetaInfo metaInfo;

    /**
     */
    public static final int DEPTH = 1;

    //    private XMLUtil xmlUtil;

    /**
     */
    protected static boolean disable;

    /**
     */
    public CRMProcessor() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(CRMProcessor.class.getName() + " : constructor");
        }

        init();
    }

    private void init() {
        if (logger.isDebugEnabled()) {
            logger.debug("void init()");
        }

        MetaInfoFactory metaInfoFactory = new SalesPartyMetaInfoFactory();
        metaInfo = metaInfoFactory.getMetaInfo();
        //        xmlUtil = new XMLUtil();

    }

    /**
     *
     */
    public static void disable() {
        disable = true;
    }

    /**
     *
     * @return
     */
    public static boolean isDisabled() {
        return disable;
    }

    /**
     * @param ctx
     * @return
     * @throws Exception
     */
    public boolean handleMessage(SOAPMessageContext ctx) throws HealthCareException {
        if (logger.isDebugEnabled()) {
            logger.debug("boolean handleMessage(SOAPMessageContext ctx)");
        }

        Boolean isRequest =
            (Boolean)ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        logger.info("Message type: " + (isRequest ? "REQUEST" : "RESPONSE"));


        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        String objectName = customFieldHolder.getObjectName();
        
       try {
        SOAPBody soapBody = ctx.getMessage().getSOAPBody();
//        SOAPHeader soapHeader = ctx.getMessage().getSOAPHeader();
//        SOAPPart soapPart = ctx.getMessage().getSOAPPart();

            //            xmlUtil.print(soapHeader);
            //            xmlUtil.print(soapPart);
            //            xmlUtil.print(soapBody);

            NodeList nodeList = soapBody.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                String nodeName = node.getNodeName();
                nodeName =
                        nodeName.substring(node.getNodeName().indexOf(":") + 1,
                                           nodeName.length());


                if (logger.isDebugEnabled()) {
                    logger.debug("Parsing node name: " + nodeName);
                }

                handleMessageOperation(objectName, node, nodeName);
            }

            if (logger.isDebugEnabled()) {
                logger.debug("Finished handling message");
            }

        } catch (Exception e) {
            logger.error("boolean handleMessage(SOAPMessageContext ctx): Error parsing soapMessage.",
                         e);
            throw new HealthCareException(e);
        }


        return true;
    }

    /**
     *
     * @param objectName
     * @param node
     * @param nodeName
     * @throws Exception
     */
    private void handleMessageOperation(String objectName, Node node,
                                        String nodeName) throws HealthCareException {
        if (nodeName.equals("create" + objectName)) {
            handleCreateEntity(node);
            //                    xmlUtil.print(soapBody);

            } else if (nodeName.equals("update" + objectName)) {
            //                    xmlUtil.print(soapBody);
            handleupdateEntity(node);


        } else if (nodeName.equals("get" + objectName)) {
            if (logger.isDebugEnabled()) {
                logger.debug("get" + objectName +
                             " - there is nothing to do");
            }
        } else if (nodeName.equals("find" + objectName + "Response")) {
            if (logger.isDebugEnabled()) {
                logger.debug("find" + objectName +
                             "Response*******************");
            }
            handlefindEntityResponse(node);                    
        } else if (nodeName.equals("create" + objectName +
                                   "Response")) {
            logger.debug("create" + objectName +
                         "Response*******************");
        } else if (nodeName.equals("get" + objectName + "Response")) {
            logger.debug("get" + objectName +
                         "Response*******************");
            handlegetEntityResponse(node);
        } else if (logger.isDebugEnabled()) {
            logger.debug("No operation related to this node: " +
                         nodeName);
        }
    }

    /**
     * @param node
     */
    public void handleCreateEntity(Node node) {
        if (logger.isDebugEnabled()) {
            logger.debug("void handleCreateEntity(Node node)");
        }


        CustomFieldHolder customFieldHolder = new CustomFieldHolder();
        String objectName = customFieldHolder.getObjectName();
        try {
            
            NodeList cNodeList = node.getChildNodes();
            for (int j = 0; j < cNodeList.getLength(); j++) {
                Node cNode = cNodeList.item(j);
                String cNodeName = cNode.getNodeName();
                cNodeName =
                        cNodeName.substring(cNode.getNodeName().indexOf(":") +
                                            1, cNodeName.length());
                logger.debug("cName *********** " + cNodeName);
                if (cNodeName.equalsIgnoreCase(objectName)) {
                    String prefix = readPrefixValue(cNode);
                    
                    logger.debug("prefix ********* " + prefix);
                    SOAPElement soapElement = (SOAPElement)cNode;

                    createTextField(customFieldHolder, prefix, soapElement);                                        
                    createTextNode(customFieldHolder, prefix, soapElement);


                }
            }
        } catch (Exception e) {
            logger.error("void handleCreateEntity(Node node): Error parsing createEntity node",
                         e);
        }

    }

    /**
     *
     * @param customFieldHolder
     * @param prefix
     * @param soapElement
     * @throws Exception
     */
    private void createTextNode(CustomFieldHolder customFieldHolder,
                                String prefix,
                                SOAPElement soapElement) throws HealthCareException {
        try {
        List<DataSet> cDataSetList =
            customFieldHolder.getDataSet().getChildDataSet();
        for (DataSet cDataSet : cDataSetList) {
            SOAPElement customElement =
                soapElement.addChildElement(cDataSet.getName(),
                                            prefix);
            for (AttributeEntry attr :
                 cDataSet.getAttributeList()) {
                SOAPElement cCustomElement =
                    customElement.addChildElement(attr.getName(),
                                                  prefix);
                cCustomElement.addTextNode(attr.getValue());
            }
        }
        }catch(Exception e) {
            throw new HealthCareException(e);
        }
    }

/**
     *
     * @param customFieldHolder
     * @param prefix
     * @param soapElement
     * @throws Exception
     */
    private void createTextField(CustomFieldHolder customFieldHolder,
                                 String prefix,
                                 SOAPElement soapElement) throws Exception {
        List<AttributeEntry> attrList =
            customFieldHolder.getDataSet().getAttributeList();
        for (AttributeEntry attr : attrList) {
            String fieldName = attr.getName();
            String fieldValue = attr.getValue();
            SOAPElement customElement =
                soapElement.addChildElement(fieldName, prefix);
            customElement.addTextNode(fieldValue);
        }
    }

    private String readPrefixValue(Node cNode) {
        String prefix = ""; 
        NodeList ccNodeList = cNode.getChildNodes();
        for (int k = 0; k < ccNodeList.getLength(); k++) {
            Node ccNode = ccNodeList.item(k);
            String ccNodeName = ccNode.getNodeName();
            ccNodeName =
                    ccNodeName.substring(ccNode.getNodeName().indexOf(":") +
                                         1, ccNodeName.length());

            prefix =
                    ccNode.getNodeName().substring(0, ccNode.getNodeName().indexOf(":"));
        }
        return prefix;
    }

    /**
     * @param node
     */
    public void handleupdateEntity(Node node) {
        if (logger.isDebugEnabled()) {
            logger.debug("void handleupdateEntity(Node node)");
        }

        handleCreateEntity(node);
    }


    /**
     * @param node
     * @throws Exception
     */
    public void handlefindEntityResponse(Node node) throws HealthCareException {
        if (logger.isDebugEnabled()) {
            logger.debug("void handlefindEntityResponse(Node node)");
        }


        try {
            NodeList cNodeList = node.getChildNodes();

            if (logger.isDebugEnabled()) {
                logger.debug("cNodeList = " + cNodeList);
            }

            if (cNodeList != null) {
                int totalChilds = cNodeList.getLength();
                for (int j = 0; j < totalChilds; j++) {


                    Node cNode = cNodeList.item(j);
                    if (logger.isDebugEnabled()) {
                        logger.debug("cNode = " + cNode);
                    }

                    if (cNode != null) {

                        String cNodeName = cNode.getNodeName();
                        if (logger.isDebugEnabled()) {
                            logger.debug("Parsing node: " + cNodeName);
                        }

                        cNodeName =
                                cNodeName.substring(cNode.getNodeName().indexOf(":") +
                                                    1, cNodeName.length());

                        if ("result".equals(cNodeName)) {
                            parseResponseResultNode(cNode);
                        }
                    }
                }
            }

        } catch (Exception e) {
            logger.error("void handlefindEntityResponse(Node node): Error parsing findEntityResponse node",
                         e);
            throw new HealthCareException(e);
        }

    }

    /**
     *
     * @param cNode
     */
    private void parseResponseResultNode(Node cNode) {
        CustomFieldHolder customFieldHolder =
            new CustomFieldHolder();
        List<DataSet> dataSetList =
            customFieldHolder.getDataSetList();
        DataSet dataSet = new DataSet();
        dataSet.setName(customFieldHolder.getObjectName());
        String keyName =
            CustomFieldHolder.getKeyName(dataSet.getName());
        NodeList ccNodeList = cNode.getChildNodes();
        
        for (int k = 0; k < ccNodeList.getLength(); k++) {
            Node ccNode = ccNodeList.item(k);
            String ccNodeName = ccNode.getNodeName();

            if (logger.isDebugEnabled()) {
                logger.debug("Parsing Child node: " +
                             ccNodeName);
            }


            ccNodeName =
                    ccNodeName.substring(ccNode.getNodeName().indexOf(":") +
                                         1,
                                         ccNodeName.length());

            MetaInfo cMetaInfo =
                metaInfo.getChildMetaInfo(ccNodeName);
            if (cMetaInfo != null) { // child
                DataSet cDataSet =
                    dataSet.getChildDataSetByName(ccNodeName);
                processData(customFieldHolder, cDataSet,
                            ccNode, cMetaInfo);
            } else { // attribute
                if (keyName.equals(ccNodeName)) {
                    dataSet.setId(ccNode.getTextContent());
                }

                if (ccNodeName.contains("_c")) {
                    AttributeEntry attr =
                        new AttributeEntry();
                    attr.setName(ccNodeName);
                    attr.setValue(ccNode.getTextContent());
                    dataSet.getAttributeList().add(attr);
                }
            }
        }
        dataSetList.add(dataSet);
    }

    /**
     * @param node
     * @throws Exception
     */
    public void handlegetEntityResponse(Node node) throws HealthCareException {
        if (logger.isDebugEnabled()) {
            logger.debug("void handlegetEntityResponse(Node node)");
        }

        handlefindEntityResponse(node);
    }


    /**
     * @param customFieldHolder
     * @param dataSet
     * @param node
     * @param metaInfo
     */
    public void processData(CustomFieldHolder customFieldHolder,
                            DataSet dataSet, Node node, MetaInfo metaInfo) {
        if (logger.isDebugEnabled()) {
            logger.debug("void processData(DataSet dataSet,Node node,MetaInfo metaInfo)");
        }

        String keyName = CustomFieldHolder.getKeyName(dataSet.getName());
        NodeList cNodeList = node.getChildNodes();
        for (int i = 0; i < cNodeList.getLength(); i++) {
            Node cNode = cNodeList.item(i);
            String cNodeName =
                cNode.getNodeName().substring(cNode.getNodeName().lastIndexOf(':') +
                                              1, cNode.getNodeName().length());

            MetaInfo cMetaInfo = metaInfo.getChildMetaInfo(cNodeName);
            if (cMetaInfo != null) {
                String type = metaInfo.getChildListType().get(cNodeName);

                DataSet cDataSet = dataSet.getChildDataSetByName(cNodeName);
                String subType = metaInfo.getChildListSubType().get(cNodeName);
                cDataSet.setType(type);
                cDataSet.setSubType(subType);
                cDataSet.setParentDataSet(dataSet);


                cDataSet.setDepth(dataSet.getDepth() + 1);

                if (cDataSet.getDepth() < CRMProcessor.DEPTH) {
                    processData(customFieldHolder, cDataSet, cNode, cMetaInfo);
                }
            } else {
                if (!"#text".equals(cNodeName)) {

                    if (keyName.equals(cNodeName)) {
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

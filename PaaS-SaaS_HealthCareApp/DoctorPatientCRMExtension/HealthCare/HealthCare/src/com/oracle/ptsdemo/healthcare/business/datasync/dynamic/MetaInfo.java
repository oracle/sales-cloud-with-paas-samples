package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;


import com.oracle.ptsdemo.healthcare.business.util.XMLUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 */
public class MetaInfo {

    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(MetaInfo.class);

    /**
     */
    private List<AttributeEntry> attributeNameList;

    /**
     */
    private String objectName;

    /**
     */
    private String type;

    /**
     */
    private List<String> childList;

    /**
     */
    private Map<String, String> childListType;

    /**
     */
    private String xmlData;

    /**
     */
    private Map<String, MetaInfo> childXmlDataMap;

    /**
     */
    private XMLUtil xmlUtil;

    /**
     */
    private Map<String, String> childListSubType;


    private Map<String, String> schemaLocationList;

    private List<MetaInfo> childMetaInfoList;

    private String parentObjectName;

    /**
     */
    public static final String SUB_TYPE_ATTRIBUTE = "SUB_TYPE_ATTRIBUTE";

    /**
     */
    public static final String SUB_TYPE_CHILD = "SUB_TYPE_CHILD";

    /**
     */
    public static final String SUB_TYPE_CHILD_REFERENCE =
        "SUB_TYPE_CHILD_REFERENCE";

    private int depth = 0;


    /**
     */
    public MetaInfo() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(MetaInfo.class.getName() + " : constructor");
        }

        init();
    }

    private void init() {
        if (logger.isDebugEnabled()) {
            logger.debug("init()");
        }


        xmlUtil = new XMLUtil();
        childXmlDataMap = new HashMap<String, MetaInfo>();
        childList = new ArrayList<String>();
        childListType = new HashMap<String, String>();
        childListSubType = new HashMap<String, String>();

        schemaLocationList = new HashMap<String, String>();
        childMetaInfoList = new ArrayList<MetaInfo>();
    }


    /**
     * @param name
     * @return
     */
    public AttributeEntry getAttribute(String name) {
        AttributeEntry attributeEntry = null;
        for (AttributeEntry cAttributeEntry : attributeNameList) {
            if (cAttributeEntry.getName().equals(name)) {
                attributeEntry = cAttributeEntry;
                break;
            }
        }
        return attributeEntry;
    }


    /**
     * @param objectName
     * @param xmlData
     */
    public void setXmlSchema(String objectName, String xmlData) {
        this.objectName = objectName;
        this.xmlData = xmlData;
    }

    /**
     * @param objectName
     * @param xmlData
     */
    public void setChildXmlData(String objectName, String xmlData) {

        MetaInfo childMetaInfo = new MetaInfo();
        childMetaInfo.setXmlSchema(objectName, xmlData);
        childXmlDataMap.put(objectName, childMetaInfo);
    }


    /**
     */
    public void process() {
        if (logger.isDebugEnabled()) {
            logger.debug("void process()");
        }

        setSchemaLocationList();

        if (logger.isDebugEnabled()) {

            if (parentObjectName != null) {
                logger.debug("Parent: " + parentObjectName);
            }
            logger.debug("objectName " + objectName);
        }

        attributeNameList = new ArrayList<AttributeEntry>();
        childList = new ArrayList<String>();

        try {
            Document document = xmlUtil.parseXmlFile(xmlData);

            NodeList sequenceChildList = extractSequenceNode(document);

            for (int i = 0; i < sequenceChildList.getLength(); i++) {
                Node node = sequenceChildList.item(i);

                parseElementNode(node);
            }
        } catch (Exception e) {
            logger.error(MetaInfo.class.getName() +
                         ": void process() - error processing metainfo", e);
        }

    }

    /**
     *
     * @param node
     */
    private void parseElementNode(Node node) {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            String attrName =
                node.getAttributes().getNamedItem("name").getNodeValue();
            Node maxOccursNode =
                node.getAttributes().getNamedItem("maxOccurs");

            if (maxOccursNode != null && "unbounded".equals(maxOccursNode)) {
                String type =
                    node.getAttributes().getNamedItem("type").getNodeValue();
                if (type.indexOf(':') != -1) {
                    type =
type.substring(type.indexOf(':') + 1, type.length());
                }

                logger.debug("MetaInfo.processData.name**************************************child************* " +
                             attrName);

                SchemaDownloader schemaDownloader = new SchemaDownloader();

                String urlString = schemaLocationList.get(type);

                String xmlSchema = schemaDownloader.download(urlString);

                MetaInfo childMetaInfo = new MetaInfo();
                childMetaInfo.setObjectName(attrName);
                childMetaInfo.setType(type);
                childMetaInfo.setXmlSchema(attrName, xmlSchema);
                childMetaInfo.setParentObjectName(objectName);


                childMetaInfo.setDepth(depth + 1);
                if (depth < CRMProcessor.DEPTH) {
                    childMetaInfo.process();
                }


                childMetaInfoList.add(childMetaInfo);

            } else {

                AttributeEntry attributeEntry = new AttributeEntry();
                attributeEntry.setLabel(attrName);
                attributeEntry.setName(attrName);

                attributeNameList.add(attributeEntry);
            }
        }
    }

    /**
     *
     * @param document
     * @return
     */
    private NodeList extractSequenceNode(Document document) {
        NodeList sequenceChildList = null;
        for (int i = 0;
             i < document.getFirstChild().getChildNodes().getLength(); i++) {
            Node node = document.getFirstChild().getChildNodes().item(i);

            if (node.getNodeName().contains("complexType")) {

                for (int j = 0; j < node.getChildNodes().getLength(); j++) {
                    Node cNode = node.getChildNodes().item(j);

                    if (cNode.getNodeName().contains("sequence")) {
                        sequenceChildList = cNode.getChildNodes();
                        break;
                    }
                }
                if (sequenceChildList != null) {
                    break;
                }
            }
        }
        return sequenceChildList;
    }

    /**
     *
     */
    private void setSchemaLocationList() {
        if (logger.isDebugEnabled()) {
            logger.debug("void setSchemaLocationList()");
        }


        try {
            Document document = xmlUtil.parseXmlFile(xmlData);

            NodeList childList = document.getFirstChild().getChildNodes();
            for (int i = 0; i < childList.getLength(); i++) {
                Node childNode = childList.item(i);

                if (childNode.getNodeName().contains("import") ||
                    childNode.getNodeName().contains("include")) {
                    String schemaLocation =
                        childNode.getAttributes().getNamedItem("schemaLocation").getTextContent();

                    logger.info("schemaLocation:  " + schemaLocation);
                    String schemaName =
                        schemaLocation.substring(schemaLocation.lastIndexOf('/') +
                                                 1,
                                                 schemaLocation.lastIndexOf('.'));

                    logger.info("schemaName " + schemaName);

                    schemaLocationList.put(schemaName, schemaLocation);
                }
            }

        } catch (Exception e) {
            logger.error(MetaInfo.class.getName() +
                         ": void setSchemaLocationList() - error parsing xml schemaLocation",
                         e);
        }
    }


    /**
     * @return
     */
    public XMLUtil getXMLUtil() {
        if (xmlUtil == null) {
            xmlUtil = new XMLUtil();
        }
        return xmlUtil;
    }


    /**
     * @param name
     * @return
     */
    public MetaInfo getChildMetaInfo(String name) {
        MetaInfo rMetaInfo = null;
        for (MetaInfo cMetaInfo : childMetaInfoList) {
            String cName = cMetaInfo.getObjectName();
            if (name.equals(cName)) {
                rMetaInfo = cMetaInfo;
                break;
            }
        }
        return rMetaInfo;
    }

    /**
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * @return
     */
    public Map<String, String> getChildListType() {
        return childListType;
    }

    /**
     * @return
     */
    public Map<String, MetaInfo> getChildXmlDataMap() {
        return childXmlDataMap;
    }

    /**
     * @return
     */
    public Map<String, String> getChildListSubType() {
        return childListSubType;
    }


    /**
     * @param parentObjectName
     */
    public void setParentObjectName(String parentObjectName) {
        this.parentObjectName = parentObjectName;
    }

    /**
     * @return
     */
    public String getParentObjectName() {
        return parentObjectName;
    }

    /**
     * @param depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * @return
     */
    public int getDepth() {
        return depth;
    }

    /**
     * @param attributeNameList
     */
    public void setAttributeList(List<AttributeEntry> attributeNameList) {
        this.attributeNameList = attributeNameList;
    }

    /**
     * @return
     */
    public List<AttributeEntry> getAttributeList() {
        return attributeNameList;
    }

    /**
     * @return
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @param childList
     */
    public void setChildList(List<String> childList) {
        this.childList = childList;
    }

    /**
     * @return
     */
    public List<String> getChildList() {
        return childList;
    }

}

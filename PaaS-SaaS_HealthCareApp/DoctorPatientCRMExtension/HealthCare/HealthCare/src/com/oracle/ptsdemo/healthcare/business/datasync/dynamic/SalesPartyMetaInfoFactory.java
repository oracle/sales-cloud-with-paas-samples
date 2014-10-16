package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;


import com.oracle.ptsdemo.healthcare.config.FusionConfig;
import com.oracle.ptsdemo.healthcare.business.util.HttpUtil;


/**
 */
public class SalesPartyMetaInfoFactory extends MetaInfoFactory {
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(SalesPartyMetaInfoFactory.class);


    /**
     */
    public SalesPartyMetaInfoFactory() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(SalesPartyMetaInfoFactory.class.getName() + " : constructor");
        }        
        init();
       
    }

    private synchronized void init() {
        HttpUtil.removeProxy();
     //   logger.info("SalesPartyMetaInfoFactory is called*******************");
        if(this.metaInfo == null){
            createSalesPartyMetaInfo();
        }
    }
    
    
    private void createSalesPartyMetaInfo(){
        if (logger.isDebugEnabled()) {
            logger.debug("createSalesPartyMetaInfo()");
        }     
        
        String objectName = "SalesParty";
        this.metaInfo = new MetaInfo();

        metaInfo.setObjectName(objectName);
        metaInfo.setType(objectName);

        logger.info("SalesPartyMetaInfoFactory.createSalesPartyMetaInfo() is called");

        SchemaDownloader schemaDownloader = new SchemaDownloader();
 
        String urlString = FusionConfig.getInstance().getProperty("FUSION_SalesPartyService_SCHEMA");
        
        String xmlSchema = schemaDownloader.download(urlString);
        metaInfo.setXmlSchema(objectName, xmlSchema);
        metaInfo.process();
      
    }


    /**
     * @return
     */
    public MetaInfo getMetaInfo() {
        return metaInfo;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        MetaInfoFactory metaInfoFactory =  new SalesPartyMetaInfoFactory();
        
        for(AttributeEntry attrEntry:metaInfoFactory.getMetaInfo().getChildMetaInfo("SalesAccount").getAttributeList()){
            System.out.println("name " + attrEntry.getName());
        }
    }
}

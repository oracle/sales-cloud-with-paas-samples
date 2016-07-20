package com.oracle.pts.custom;

import com.oracle.pts.config.FusionConfig;

import com.oracle.pts.schema.SchemaDownloader;

import com.oracle.pts.util.HttpUtil;
import com.oracle.pts.util.XMLUtil;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.math.BigDecimal;

import java.net.ProxySelector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

public class SalesPartyMetaInfoFactory extends MetaInfoFactory {
    private Logger logger = Logger.getLogger("CRM");
    private ResourceBundle resouceBoundle;    

    public static void main(String[] args) {
        MetaInfoFactory metaInfoFactory =  new SalesPartyMetaInfoFactory();
        
        for(AttributeEntry attrEntry:metaInfoFactory.getMetaInfo().getChildMetaInfo("SalesAccount").getAttributeList()){
            System.out.println("name " + attrEntry.getName());
        }
    }

    public SalesPartyMetaInfoFactory() {
        super();
        init();
       
    }

    private void init() {
        HttpUtil.removeProxy();
    
        if(metaInfo==null){
            createSalesPartyMetaInfo();
        }
    }
    private MetaInfo createSalesPartyMetaInfo(){
        String objectName = "SalesParty";
        metaInfo = new MetaInfo();

        metaInfo.setObjectName(objectName);
        metaInfo.setType(objectName);

        logger.info("SalesPartyMetaInfoFactory.createSalesPartyMetaInfo() is called");

        SchemaDownloader schemaDownloader = new SchemaDownloader();
 
        String urlString = FusionConfig.getInstance().getPropertyFromDB("FUSION_SalesPartyService_SCHEMA");
        
        String xmlSchema = schemaDownloader.download(urlString);
        metaInfo.setXmlSchema(objectName, xmlSchema);
        metaInfo.process();
        
        
      
        
        return metaInfo;
        
    }


    public MetaInfo getMetaInfo() {
        return metaInfo;
    }
}

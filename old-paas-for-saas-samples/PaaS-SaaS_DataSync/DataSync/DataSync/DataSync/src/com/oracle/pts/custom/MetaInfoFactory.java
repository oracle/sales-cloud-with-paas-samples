package com.oracle.pts.custom;



import com.oracle.pts.schema.SchemaDownloader;


import com.oracle.pts.util.XMLUtil;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MetaInfoFactory {
    static MetaInfo metaInfo;
    private Logger logger = Logger.getLogger("CRM");

    public MetaInfoFactory() {
        super();
        init();
    }

    private void init() {

    }
    public MetaInfo getMetaInfo(){
        return metaInfo;
    }

}

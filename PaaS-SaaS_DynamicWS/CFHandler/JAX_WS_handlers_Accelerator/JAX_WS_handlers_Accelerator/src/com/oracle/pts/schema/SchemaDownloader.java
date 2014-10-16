package com.oracle.pts.schema;

import com.oracle.pts.custom.MetaInfo;

import com.oracle.pts.util.XMLUtil;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import java.security.cert.Certificate;

import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;


public class SchemaDownloader {

    private Logger logger = Logger.getLogger("CRM");

    public SchemaDownloader() {
        super();
    }

    public String download(String urlString) {
        URL url;
        String outputString = null;
        try {

            url = new URL(urlString);
           HttpURLConnection con = (HttpURLConnection)url.openConnection();
 
             outputString = getContent(con);


        } catch (MalformedURLException e) {
            logger.info("MalformedURLException");
            logger.info(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            logger.info("IOException");
            logger.info(e.getMessage());
                        e.printStackTrace();
        }
        catch (Exception e) {
                   logger.info("Exception");
                   logger.info(e.getMessage());
                                      e.printStackTrace();
               }
       return outputString;
    }
    public String getUrlString(String type,String content){
        String returnString = null;
        String[] subContentList = content.split("\"");
        for(int i=0;i<subContentList.length;i++){
            if(subContentList[i].contains("/" + type+".xsd")){
                returnString =    subContentList[i];
            }
        }
        return returnString;
    }

    private String getContent(HttpURLConnection con) {
        String returnString = "";
        if (con != null) {

            try {

                BufferedReader br =
                    new BufferedReader(new InputStreamReader(con.getInputStream()));

                String input;

                while ((input = br.readLine()) != null) {
                    returnString += input;
                }
                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return returnString;
    }
    
}

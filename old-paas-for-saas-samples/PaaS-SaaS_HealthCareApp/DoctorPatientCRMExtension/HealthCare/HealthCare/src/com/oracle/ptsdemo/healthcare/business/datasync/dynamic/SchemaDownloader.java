package com.oracle.ptsdemo.healthcare.business.datasync.dynamic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import java.util.logging.Level;
import java.util.logging.Logger;


/**
 */
public class SchemaDownloader {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     */
    public SchemaDownloader() {
        super();
    }

    /**
     * @param urlString
     * @return
     */
    public String download(String urlString) {
       // System.out.println("************************download is called");
        URL url;
        String outputString = null;
        try {

            url = new URL(urlString);
        //   HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
           HttpURLConnection con = (HttpURLConnection)url.openConnection();
  //          weblogic.net.http.SOAPHttpsURLConnection con = (weblogic.net.http.SOAPHttpsURLConnection)url.openConnection();
        
        
        
        //    url = new URL(null, urlString,new sun.net.www.protocol.https.Handler());
        //    HttpsURLConnection  con = (HttpsURLConnection) url.openConnection();
        
        
        
          //  System.out.println("************************downloading");
         //      printCertificate(con);

             outputString = getContent(con);


        } catch (MalformedURLException e) {
            logger.info("MalformedURLException");
            logger.info(e.getMessage());
           
        } catch (IOException e) {
            logger.info("IOException");
            logger.info(e.getMessage());
           
        }
        catch (Exception e) {
                   logger.info("Exception");
                   logger.info(e.getMessage());
           
               }

        return outputString;
    }

    /**
     * @param type
     * @param content
     * @return
     */
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

                String input = br.readLine();

                while (input != null) {
                    returnString += input;
                    input = br.readLine();
                }
                br.close();

            } catch (IOException e) {
                 logger.log(Level.SEVERE, e.getMessage());
            }

        }
        return returnString;
    }
    
}

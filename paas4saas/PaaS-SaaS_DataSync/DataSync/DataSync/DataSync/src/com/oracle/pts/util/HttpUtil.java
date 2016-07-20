package com.oracle.pts.util;

import java.util.Properties;

public class HttpUtil {
    public HttpUtil() {
        super();
    }
    public static void removeProxy() {
    }    
    public static void removeMyProxy() {
        
        Properties p = System.getProperties();
        p.remove("https.proxyHost");
        p.remove("https.proxyPort");
        p.remove("http.proxyHost");
        p.remove("http.proxyPort");
    
    }    
}

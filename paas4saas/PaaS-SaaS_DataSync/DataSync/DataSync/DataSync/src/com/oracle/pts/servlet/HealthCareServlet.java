package com.oracle.pts.servlet;

import com.oracle.pts.custom.load.DataLoad;


import java.io.IOException;
import java.io.PrintWriter;

import java.util.logging.Logger;

import javax.servlet.*;
import javax.servlet.http.*;

public class HealthCareServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";
    private static final Logger logger =
        Logger.getLogger("CRM");

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        logger.info("HealthCareServlet Servlet init()");
    }

    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException,
                                                             IOException {
        logger.info("HealthCareServlet Servlet service()");
      
        
        
        String action = (String)request.getParameter("action");
        if(action!=null){
            if(action.equalsIgnoreCase("loadPrescription")){
                String prescriptionId = (String)request.getParameter("prescriptionId");
                if(prescriptionId!=null){
                    DataLoad dataLoad = new DataLoad();
                    String orderId = dataLoad.loadPrescription(prescriptionId);
                    
                }
            }
            else if(action.equalsIgnoreCase("stop")){
                System.out.println("stop*****************");
                
            }
        }
        
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>HealthCareServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST or GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
}

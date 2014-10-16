package com.oracle.ptsdemo.healthcare.view.servlet;

import com.oracle.ptsdemo.healthcare.business.datasync.load.DataLoad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 */
public class TestServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";
    @SuppressWarnings("compatibility:-2624303474533654864")
    private static final long serialVersionUID = 1L;

    /**
     * @param config
     * @throws ServletException
     */
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException,
                                                             IOException {
        
        
        String action = request.getParameter("action");
        String error = null;
        String orderId = null;
        if(action!=null){
            if(action.equalsIgnoreCase("loadPrescription")){
                String prescriptionId = request.getParameter("prescriptionId");
                if(prescriptionId!=null){
                    DataLoad dataLoad = new DataLoad();
 
                    try {
                        orderId =
                                dataLoad.loadPrescriptionAndSendToPharmacy(prescriptionId,"doctorName");
                    } catch (Exception e) {
                        error = e.getMessage();
                    }
                }
            }
        }

        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>TestServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST or GET. This is the reply.</p>");
        if(error!=null){
            out.println("<p>Error: " + error + "</p>");
        }
        else if(orderId!=null){
            out.println("<p>orderId: " + orderId + "</p>");
        }
        out.println("</body></html>");
        out.close();
    }
}

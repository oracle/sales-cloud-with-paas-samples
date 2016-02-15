package com.oracle.ptsdemo.healthcare.view.servlet;


import com.oracle.ptsdemo.healthcare.business.datasync.schedule.Scheduler;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SchedulerServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";
   
    @SuppressWarnings("compatibility:5012616205558817588")
    private static final long serialVersionUID = 1L;
    private Scheduler scheduler;
    private  final Logger logger =
        Logger.getLogger(SchedulerServlet.class.getName());

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        logger.info("Scheduler Servlet init()");
        scheduler = new Scheduler();
        scheduler.start();
    }

    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException,
                                                             IOException {
        logger.info("Scheduler Servlet service()");
        System.out.println("*********************");
     //   scheduler = new Scheduler();
        
        
        String action = (String)request.getParameter("action");
        if(action!=null){
            if(action.equalsIgnoreCase("start")){
                if(scheduler.isAlive()==false){
                    scheduler = new Scheduler();
                    scheduler.start();
                }
            }
            else if(action.equalsIgnoreCase("stop")){
                System.out.println("stop*****************");
                scheduler.interrupt();
                
            }
        }
        
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>SchedulerServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST or GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
}

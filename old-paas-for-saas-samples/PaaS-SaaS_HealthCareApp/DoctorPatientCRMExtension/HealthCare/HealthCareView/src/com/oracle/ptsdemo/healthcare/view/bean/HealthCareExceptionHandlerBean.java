package com.oracle.ptsdemo.healthcare.view.bean;


import com.oracle.ptsdemo.healthcare.view.utils.JSFUtils;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.controller.ControllerContext;
import oracle.adf.controller.ViewPortContext;

import org.apache.log4j.Logger;


public class HealthCareExceptionHandlerBean {
    
    static Logger logger = Logger.getLogger(HealthCareExceptionHandlerBean.class);
    
    public HealthCareExceptionHandlerBean() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
    }
    
    /**
     * Capture an exception and display into the current view page.
     */
    public void onExceptions() {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".onExceptions()");
        }
      
        logger.info("Handler Exception method called. Check error log");
        
        try {
            
        
        
        ControllerContext context = ControllerContext.getInstance();
        ViewPortContext currentRootViewPort = context.getCurrentRootViewPort();
        
        if (currentRootViewPort.isExceptionPresent()) {
            Exception exData = currentRootViewPort.getExceptionData();
            if (exData == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("RootView exception data returned null. Checking view exception.");
                }
              
                if (context.getCurrentViewPort().isExceptionPresent()) {
                    exData = context.getCurrentViewPort().getExceptionData();
                }
            }
            
            if (exData != null) {
                logger.error("Exception Captured. Type: "+ exData.getClass(), exData);
                if (logger.isDebugEnabled()) {
                    logger.debug(exData.getStackTrace().toString());
                }
                                               
                currentRootViewPort.clearException();     
                    
                FacesContext fc = FacesContext.getCurrentInstance();    
                fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", exData.getMessage()));
                
                StringWriter sw = new StringWriter();  
                PrintWriter pw = new PrintWriter(sw);
                exData.printStackTrace(pw);
                JSFUtils.setExpressionValue("#{pageFlowScope.detailedException}", sw.toString());
                               
            }
            else {
                if (logger.isDebugEnabled()) {
                    logger.debug("Could not capture the exception");
                }
            }
        }
        }catch(Exception e) {
            logger.error("Error while printing excepitons", e);            
        }
    }   
    
    

}

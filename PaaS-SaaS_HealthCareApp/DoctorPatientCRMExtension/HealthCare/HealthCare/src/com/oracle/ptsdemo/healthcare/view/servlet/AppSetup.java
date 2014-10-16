/**
* Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved. 
 */
package com.oracle.ptsdemo.healthcare.view.servlet;

import java.net.MalformedURLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.PropertyConfigurator;


/**
 */
public class AppSetup extends HttpServlet {

    @SuppressWarnings("compatibility:1112416090541122105")
    private static final long serialVersionUID = 1995766274680617205L;

    /**
     * Method to configure log4j when servlet instance is loaded.
     * @param config
     * @throws ServletException
     */
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        java.net.URL log4jProperties = null;
        try {
          log4jProperties = getServletConfig().getServletContext().getResource("/WEB-INF/classes/log4j.properties");
          PropertyConfigurator.configure(log4jProperties);
        } catch (MalformedURLException e) {
           throw new ServletException(e);
        }

    }
    }

/**
* Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 */

package com.oracle.ptsdemo.healthcare.usertoken.servlet;

import javax.servlet.http.HttpServlet;


import java.net.MalformedURLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;


import org.apache.log4j.PropertyConfigurator;

public class AppSetup extends HttpServlet {

    @SuppressWarnings("compatibility:-446221911492205574")
    private static final long serialVersionUID = -1197323961135842691L;

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
           
        }

    }
    }

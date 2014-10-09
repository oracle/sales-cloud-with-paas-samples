package com.oracle.ptsdemo.uiaccelerator.servlet;

import java.net.MalformedURLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.PropertyConfigurator;

/**
 * All sample code is provided by Oracle for illustrative purposes only.
 * These sample code examples have not been thoroughly tested under all conditions. 
 * Oracle, therefore, cannot guarantee or imply security, reliability, serviceability, or function of the sample code.
 * All sample code contained herein are provided to you "AS IS" without any warranties of any kind. 
 * The implied warranties of non-infringement, merchantability and fitness for a particular purpose are expressly disclaimed.
 */
public class AppSetup extends HttpServlet {

    @SuppressWarnings("compatibility:3020692720701377196")
    private static final long serialVersionUID = -684690412850009728L;

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

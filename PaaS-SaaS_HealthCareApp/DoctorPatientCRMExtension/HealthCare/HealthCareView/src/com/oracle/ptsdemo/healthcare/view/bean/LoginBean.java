package com.oracle.ptsdemo.healthcare.view.bean;


import com.oracle.ptsdemo.healthcare.usertoken.exception.GeneralException;
import com.oracle.ptsdemo.healthcare.usertoken.exception.UserTokenAuthenticationException;
import com.oracle.ptsdemo.healthcare.usertoken.service.UserTokenValidationService;

import org.apache.log4j.Logger;


public class LoginBean {
    
    private String username;
    private String password;
    private String jwtToken;
    private String endpointURL;
    
    static Logger logger = Logger.getLogger(LoginBean.class);
    
    public LoginBean() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
    }

    
    
    public String doLogin() throws UserTokenAuthenticationException, GeneralException{
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".doLogin()");
            
            logger.debug("username: "+getUsername());
            logger.debug("jwt: "+getJwtToken());
            logger.debug("endpoint: " + getEndpointURL());
        }
        
        UserTokenValidationService utvs = new UserTokenValidationService(this.getJwtToken(), this.getEndpointURL());

        utvs.validateUserToken(true, true);
        return "success";
    }
    
    


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setEndpointURL(String endpointURL) {
        this.endpointURL = endpointURL;
    }

    public String getEndpointURL() {
        return endpointURL;
    }
}

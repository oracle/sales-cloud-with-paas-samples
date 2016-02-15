package com.oracle.ptsdemo.healthcare.view.bean;


import com.oracle.ptsdemo.healthcare.config.FusionConfig;
import com.oracle.ptsdemo.healthcare.usertoken.exception.UserTokenAuthenticationException;
import com.oracle.ptsdemo.healthcare.usertoken.service.UserTokenValidationService;
import com.oracle.ptsdemo.healthcare.usertoken.vo.UserInfo;
import com.oracle.ptsdemo.healthcare.view.utils.JSFUtils;

import org.apache.log4j.Logger;


public class UserServiceBean {

    static Logger logger = Logger.getLogger(UserServiceBean.class);

    public UserServiceBean() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
    }

    public void validateUser() throws UserTokenAuthenticationException,
                                      Exception {

        String jwtUserToken =
            (String)JSFUtils.resolveExpression("#{pageFlowScope.jwt}");
        
        String endPoint = FusionConfig.getInstance().getProperty("FUSION_HCM_SERVER");
            
        boolean replayProtection = true;
        boolean authenticatedUserIdcheck = true;

        UserTokenValidationService validator =
            new UserTokenValidationService(jwtUserToken, endPoint);
        UserInfo userInfo = validator.validateUserToken(replayProtection,
                                    authenticatedUserIdcheck);
        JSFUtils.setExpressionValue("#{pageFlowScope.username}", userInfo.getUsername());
        if (logger.isDebugEnabled()) {
            logger.debug("Username: "+userInfo.getUsername());
            logger.debug("Email: "+userInfo.getEmailAddress());
        }
        
    }


}

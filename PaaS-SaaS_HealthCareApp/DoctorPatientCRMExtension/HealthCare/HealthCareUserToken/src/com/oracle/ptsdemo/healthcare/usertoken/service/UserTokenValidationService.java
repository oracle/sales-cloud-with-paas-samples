package com.oracle.ptsdemo.healthcare.usertoken.service;


import com.oracle.ptsdemo.healthcare.usertoken.exception.GeneralException;
import com.oracle.ptsdemo.healthcare.usertoken.exception.UserTokenAuthenticationException;
import com.oracle.ptsdemo.healthcare.usertoken.vo.UserInfo;

import org.apache.log4j.Logger;


public class UserTokenValidationService {

    static Logger logger = Logger.getLogger(UserTokenValidationService.class);

    private String jwtUserToken;
    private String endPoint;

    /**
     *
     * @param jwtUserToken
     * @param endPoint
     */
    public UserTokenValidationService(String jwtUserToken, String endPoint) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }

        this.jwtUserToken = jwtUserToken;

        if (endPoint != null && endPoint.contains("https://")) {
            this.endPoint = endPoint;
        } else {
            // we only got the domain and subdomain - so we add the rest to derive the end point of the UserDetailsService
            this.endPoint =
                    "https://" + endPoint + "/hcmPeopleRolesV2/UserDetailsService";
        }
    }


    /**
     * Validate the user token
     * @param replayProtection
     * @param authenticatedUserIdcheck
     * @return
     * @throws UserTokenAuthenticationException
     */
    public UserInfo validateUserToken(boolean replayProtection,
                                      boolean authenticatedUserIdcheck) throws UserTokenAuthenticationException, GeneralException  {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".validateUserToken()");
        }


        if (replayProtection) {
            logger.info("Replay protection enabled. Checking against replay attack");
            // Put Replay Protection logic here

        }

        UserInfo currentUserFromToken = new UserInfo();
        UserService usersvc =
            new UserService(this.endPoint, this.jwtUserToken);
        currentUserFromToken = usersvc.findSelfUserDetails();


        if (authenticatedUserIdcheck) {
            logger.info("Checking authenticated user id is valid");
            // Put in code to check currentUserFromToken against authenticated Subject

        }

        return (currentUserFromToken);
    }

}



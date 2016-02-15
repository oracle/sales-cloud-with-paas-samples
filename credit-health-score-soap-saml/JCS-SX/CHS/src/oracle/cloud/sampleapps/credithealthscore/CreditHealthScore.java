/* Copyright © 2015, Oracle and/or its affiliates. All rights reserved */

package oracle.cloud.sampleapps.credithealthscore;

import java.util.Random;
import javax.jws.WebService;
import weblogic.wsee.jws.jaxws.owsm.SecurityPolicy;


@WebService
@SecurityPolicy(uri = "oracle/wss_saml_token_bearer_over_ssl_service_policy")

public class CreditHealthScore {
    public CreditHealthScore() {
        super();
    }
    
    public int getCreditHealthScore(String name) {
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        return randomNum;
    }
}

/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleapps.nearmejwt.view.bean;

import oracle.cloud.sampleapps.nearmejwt.model.util.AccountServiceUtil;
import oracle.cloud.sampleapps.nearmejwt.model.util.JSFUtils;

public class UrlParams {
    
    private boolean jwtOk;
    private boolean latOk;
    private boolean longOk;
    
    public UrlParams() {
        super();
        setParamStatus();
    }

    public void setJwtOk(boolean jwtOk) {
        this.jwtOk = jwtOk;
    }

    public boolean isJwtOk() {
        return jwtOk;
    }

    public void setLatOk(boolean latOk) {
        this.latOk = latOk;
    }

    public boolean isLatOk() {
        return latOk;
    }

    public void setLongOk(boolean longOk) {
        this.longOk = longOk;
    }

    public boolean isLongOk() {
        return longOk;
    }
    
    private void setParamStatus() {
        String jwt = (String) JSFUtils.resolveExpression("#{pageFlowScope.jwt}");
        String latitude = (String) JSFUtils.resolveExpression("#{pageFlowScope.lat}");
        String longitude =(String) JSFUtils.resolveExpression("#{pageFlowScope.long}");
        // TODO:  need better check here for valid JWT
        setJwtOk(jwt.length() > 0);
        setLatOk(AccountServiceUtil.isNumber(latitude));
        setLongOk(AccountServiceUtil.isNumber(longitude));
    }
}

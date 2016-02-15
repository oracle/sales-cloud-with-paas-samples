package com.oracle.ptsdemo.healthcare.usertoken.exception;

import oracle.jbo.ValidationException;
import oracle.jbo.common.ResourceBundleDef;

/**
 */
public class UserTokenAuthenticationException extends ValidationException {

    @SuppressWarnings("compatibility:2921510401375228200")
    private static final long serialVersionUID = 1L;

    /**
     * @param resourceBundleDef
     * @param string
     * @param object
     */
    public UserTokenAuthenticationException(ResourceBundleDef resourceBundleDef,
                                            String string, Object[] object) {
        super(resourceBundleDef, string, object);
    }

    /**
     * @param string
     * @param string2
     * @param object
     */
    public UserTokenAuthenticationException(String string, String string2,
                                            Object[] object) {
        super(string, string2, object);
    }

    /**
     * @param string
     */
    public UserTokenAuthenticationException(String string) {
        super(string);
    }

    /**
     * @param c
     * @param string
     * @param object
     */
    public UserTokenAuthenticationException(Class c, String string,
                                            Object[] object) {
        super(c, string, object);
    }
}

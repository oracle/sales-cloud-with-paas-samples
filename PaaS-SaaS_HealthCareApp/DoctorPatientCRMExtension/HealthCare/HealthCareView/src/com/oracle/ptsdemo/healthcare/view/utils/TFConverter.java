package com.oracle.ptsdemo.healthcare.view.utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Converter class - utilitary class used to convert boolean values in 'T' (true) or 'F' (false)
 * which are the expected values to be stored/retrieved from View Objects.
 * 
 * Reference:
 * Oracle® Fusion Middleware Web User Interface Developer's Guide for Oracle Application Development Framework
 * Chapter 6 - Validating and Converting Input
 * URL http://docs.oracle.com/cd/E28280_01/web.1111/b31973/af_validate.htm#CIAJCIFG
 * 
 *  
 */
public class TFConverter implements Converter {
    public TFConverter() {
        super();
    }

    public Object getAsObject(FacesContext facesContext,
                              UIComponent uIComponent, String string) {
        return "true".equals(string) ? "T" : "F";
    }

    public String getAsString(FacesContext facesContext,
                              UIComponent uIComponent, Object object) {
        return "T".equals(object) ? "true" : "false";
    }
}

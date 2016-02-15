package com.oracle.fuse.util;

import javax.faces.component.UIComponent;

import oracle.adf.view.rich.component.rich.RichPopup;

public class ADFPopupUtils {
    public ADFPopupUtils() {
        super();
    }
    public static boolean hideParentPopup(UIComponent component){
        RichPopup parentPopUp=retriveParentPopUp(component);
        if(parentPopUp==null){
            return false;
            }
            parentPopUp.cancel();
            return true;
        
        }
    private static RichPopup retriveParentPopUp(UIComponent component){
        
        if(component==null){
        
        return null;
        }
         if(component instanceof RichPopup){
             
             
            return (RichPopup)component; 
             }
         return retriveParentPopUp(component.getParent());
    }
}

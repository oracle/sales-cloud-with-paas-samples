package com.oracle.fuse.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.model.QueryDescriptor;
import oracle.adf.view.rich.model.QueryModel;

public class UtilLibrary {
    /*public UtilLibrary() {
        super();
    }*/
    
    public void cancelButton(ActionEvent actionEvent) {
       ADFPopupUtils.hideParentPopup(actionEvent.getComponent());
    }
    
    
    /* Delet */
    boolean reander = true;
    boolean rennder2 = true;
    
    public String clickButton() {
        setReander(false);
        return null;
    }

    public void setReander(boolean reander) {
        this.reander = reander;
    }

    public boolean isReander() {
        return reander;
    }
}

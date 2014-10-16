package com.oracle.ptsdemo.healthcare.view.bean;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.layout.RichPanelSpringboard;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import org.apache.log4j.Logger;
import org.apache.myfaces.trinidad.event.DisclosureEvent;


public class SessionStateBean {

    static Logger logger = Logger.getLogger(SessionStateBean.class);
    private RichPanelSpringboard springboard_component;
    
    
    public SessionStateBean() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }

    }
  
    
    
    public void setSpringboard_component(RichPanelSpringboard springboard_component) {
        this.springboard_component = springboard_component;
    }

    public RichPanelSpringboard getSpringboard_component() {
        return springboard_component;
    }

    private String objectNavigatorItem = "";

    public String getObjectNavigatorItem() {
        return objectNavigatorItem;
    }

    public void setObjectNavigatorItem(String s) {
        this.objectNavigatorItem=s;
    }

    private String objectNavigatorIconStripMode = "no";
    

    public String getObjectNavigatorIconStripMode() {
        return objectNavigatorIconStripMode;
    }
    
    public void setObjectNavigatorIconStripMode(String s) {
        this.objectNavigatorIconStripMode=s;
    }

    private String objectNavigatorMode = "grid";
    

    public String getObjectNavigatorMode() {
        return objectNavigatorMode;
    }
    
    public void setObjectNavigatorMode(String s) {
        this.objectNavigatorMode=s;
    }

    /* delays task flow load to allow springboard animation to complete*/

    public void delay(DisclosureEvent disclosureEvent) {
        RichShowDetailItem sdi =
            (RichShowDetailItem)disclosureEvent.getSource();
        objectNavigatorItem = sdi.getText();
        objectNavigatorIconStripMode = "yes";
        objectNavigatorMode = "strip";
        

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
        }
    }
    
//    public void objectNavigator_SetGridMode(ActionEvent actionEvent) 
//    {
//        objectNavigatorIconStripMode="no";
//        objectNavigatorMode="strip";
//        springboard_component.setDisplayMode("grid");
//    }
    
    public void objectNavigator_SetGridMode(ActionEvent actionEvent) 
    {
        objectNavigatorIconStripMode="no";
        objectNavigatorMode="grid";
        springboard_component.setDisplayMode("grid");
    }
  
}

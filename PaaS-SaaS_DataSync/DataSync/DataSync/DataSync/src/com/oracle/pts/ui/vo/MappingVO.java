package com.oracle.pts.ui.vo;

import com.oracle.pts.custom.AttributeEntry;
import com.oracle.pts.custom.MetaInfo;
import com.oracle.pts.custom.MetaInfoFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.model.ListOfValuesModel;



public class MappingVO {
    
    
    
    String target;
    String object;
    String attribute;
    String mapping;
    String defaultValue;

    List<SelectItem> objectSelection;
    List<SelectItem> attributeSelection;

    RichForm form;

    public MappingVO(RichForm form) {
        super();
        this.form = form;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setMappingAttr(String mapping) {
        this.mapping = mapping;
    }

    public String getMappingAttr() {
        return mapping;
    }

    public void setObjectSelection(List<SelectItem> objectSelection) {
        this.objectSelection = objectSelection;
    }

    public List<SelectItem> getObjectSelection() {
        return objectSelection;
    }

    public void setAttributeSelection(List<SelectItem> attributeSelection) {
        this.attributeSelection = attributeSelection;
    }

    public List<SelectItem> getAttributeSelection() {
        return attributeSelection;
    }

    public void objectChangeListener(ValueChangeEvent valueChangeEvent) {

    }


    public void attributeChangeListener(ValueChangeEvent valueChangeEvent) {
        attribute = (String)valueChangeEvent.getNewValue();
        System.out.println("attribute change listener "  +
                           attribute);

    }
}

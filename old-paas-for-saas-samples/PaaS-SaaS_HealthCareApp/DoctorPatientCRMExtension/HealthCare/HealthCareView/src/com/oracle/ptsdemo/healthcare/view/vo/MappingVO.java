package com.oracle.ptsdemo.healthcare.view.vo;


import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import oracle.adf.view.rich.component.rich.RichForm;


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
        /*
        object = (String)valueChangeEvent.getNewValue();
        System.out.println("object change listener !" + object + " " +
                           attribute);


        if (object != null) {
            MetaInfoFactory metaInfoFactory = new TransMetaInfoFactory();
            MetaInfo metaInfo = metaInfoFactory.getObjectMetaInfo(object);
            List<AttributeEntry> attributeList = metaInfo.getAttributeList();
            attributeSelection = new ArrayList<SelectItem>();
            for (AttributeEntry entry : attributeList) {

System.out.println("attribute label **** " + entry.getLabel());
                System.out.println("attribute name **** " + entry.getName());
                String label = entry.getLabel();
                String value = entry.getName();
                SelectItem attrEntry = new SelectItem(value, label);
                attributeSelection.add(attrEntry);


            }
        }


        if(object!=null && attribute!=null){
                mapping = object + "." + attribute;
        }
        else{
            mapping = "";
        }
                AdfFacesContext adfFacesCtx = AdfFacesContext.getCurrentInstance();
        adfFacesCtx.addPartialTarget(form);
        //
*/
    }


    public void attributeChangeListener(ValueChangeEvent valueChangeEvent) {
        attribute = (String)valueChangeEvent.getNewValue();
        System.out.println("attribute change listener "  +
                           attribute);
        /*
        if(attribute!=null){
                mapping = object + "." + attribute;
        }
        else{
            mapping = "";
        }
        AdfFacesContext adfFacesCtx = AdfFacesContext.getCurrentInstance();
        adfFacesCtx.addPartialTarget(form);
*/
    }
}

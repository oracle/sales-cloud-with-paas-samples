package com.oracle.pts.ui.bean;

import com.oracle.pts.custom.AttributeEntry;
import com.oracle.pts.custom.MetaInfo;
import com.oracle.pts.custom.MetaInfoFactory;
import com.oracle.pts.custom.PharmacyMetaInfoFactory;
import com.oracle.pts.custom.SalesPartyMetaInfoFactory;
import com.oracle.pts.db.MappingObjDB;
import com.oracle.pts.ui.vo.MappingVO;


import com.oracle.pts.ui.vo.MappingVO;
import com.oracle.pts.ui.vo.MappingVOHolder;

import com.oracle.pts.vo.MappingAttr;
import com.oracle.pts.vo.MappingObj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.logging.Logger;

import javax.faces.model.SelectItem;

import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.context.AdfFacesContext;

public class CrmMapping {
    private static final Logger logger = Logger.getLogger("CRM");
    RichForm form;
    private List<MappingVOHolder> mappingVOHolderList;

    public CrmMapping() {
        super();
        
    }

    public String reset() {
        logger.info("reset is called****************");
        
        AdfFacesContext adfFacesCtx = AdfFacesContext.getCurrentInstance();
        adfFacesCtx.addPartialTarget(form);
        return "success";
    }

    public String save() {
        logger.info("save is called****************");


        for (MappingVOHolder mappingHolder : mappingVOHolderList) {
            MappingObj mappingObj = new MappingObj();


            mappingObj.setTarget(mappingHolder.getTargetObjectName());
            mappingObj.setSource(mappingHolder.getSourceObjectName());

            List<MappingAttr> mappingAttrList = new ArrayList<MappingAttr>();
            mappingObj.setMappingAttrList(mappingAttrList);

            for (MappingVO mappingVO : mappingHolder.getMappingVOList()) {

                System.out.println("mappingVO.targetObj " +
                                   mappingVO.getTarget());


                

                MappingAttr mappingAttr = new MappingAttr();
                mappingAttrList.add(mappingAttr);

                String targetObj = mappingObj.getTarget();
                mappingAttr.setTargetObj(targetObj);

                String targetAttr = mappingVO.getTarget();
                mappingAttr.setTargetAttr(targetAttr);

    
                String sourceObj = mappingObj.getSource();
                mappingAttr.setSourceObj(sourceObj);

                String sourceAttr = mappingVO.getAttribute();
                mappingAttr.setSourceAttr(sourceAttr);

                String defaultValue = mappingVO.getDefaultValue();
                mappingAttr.setDefaultValue(defaultValue);
            }

            MappingObjDB mappingObjDB = new MappingObjDB();
            mappingObjDB.save(mappingObj);
        }


        return "success";
    }


    public void setForm(RichForm form) {
        this.form = form;
        setTableData();
    }

    private void setTableData() {

     

        mappingVOHolderList = new ArrayList<MappingVOHolder>();

        setTableData("Pharmacy Doctor Object", "CRMDoctor", "PharmacyDoctor",3);
        setTableData("Pharmacy Patient Object", "CRMPatient",
                     "PharmacyPatient",3);
        setTableData("Pharmacy Prescription Object", "CRMPresctiption",
                     "PharmacyPresctiption",7);
    }

    private void setTableData(String descriptionName, String sourceObjectName,
                              String targetObjectName,int autoHeightRows) {

   
            logger.info("init mappingVOList*************");
            MappingVOHolder mappingVOHolder = new MappingVOHolder();
            mappingVOHolder.setAutoHeightRows(autoHeightRows);
            mappingVOHolder.setName(descriptionName);
            mappingVOHolder.setTargetObjectName(targetObjectName);
            mappingVOHolder.setSourceObjectName(sourceObjectName);
            List<MappingVO> mappingVOList = new ArrayList<MappingVO>();
            mappingVOHolder.setMappingVOList(mappingVOList);
            mappingVOHolderList.add(mappingVOHolder);
            PharmacyMetaInfoFactory metaInfoFactory =
                new PharmacyMetaInfoFactory();


            MetaInfo targetObjectMetaInfo =
                metaInfoFactory.getTargetObjectMetaInfo(targetObjectName);

            MetaInfo sourceObjectMetaInfo =
                metaInfoFactory.getSourceObjectMetaInfo(sourceObjectName);

            for (AttributeEntry targetObjectAttributeEntry :
                 targetObjectMetaInfo.getAttributeList()) {
                MappingVO mappingVO = new MappingVO(form);
                mappingVOList.add(mappingVO);
                mappingVO.setTarget(targetObjectAttributeEntry.getLabel());
                List<SelectItem> attributeList = new ArrayList<SelectItem>();

                mappingVO.setAttributeSelection(attributeList);

                for (AttributeEntry sourceObjectAttributeEntry :
                     sourceObjectMetaInfo.getAttributeList()) {
                    String name = sourceObjectAttributeEntry.getName();
                    String label = sourceObjectAttributeEntry.getLabel();

                    SelectItem entry = new SelectItem(name, label);
                    attributeList.add(entry);

                }


                loadMappingAttr(mappingVOHolder);

            
        }
    }

    private void loadMappingAttr(MappingVOHolder mappingVOHolder) {


        String targetObjectName = mappingVOHolder.getTargetObjectName();
        if (targetObjectName != null) {


            MappingObjDB mappingObjDB = new MappingObjDB();
            MappingObj mappingObj =
                mappingObjDB.getMappingObj(targetObjectName);

            for (MappingVO mappingVO : mappingVOHolder.getMappingVOList()) {

                String targetAttrName = mappingVO.getTarget();

                for (MappingAttr mappingAttr :
                     mappingObj.getMappingAttrList()) {

                    if (mappingAttr.getTargetAttr().equals(targetAttrName)) {
                        mappingVO.setAttribute(mappingAttr.getSourceAttr());
                        mappingVO.setDefaultValue(mappingAttr.getDefaultValue());
                        break;
                    }
                }
            }


        }


    }

    public RichForm getForm() {
        return form;
    }


    public List<MappingVOHolder> getMappingVOHolderList() {
        return mappingVOHolderList;
    }

    public void setMappingVOHolderList(List<MappingVOHolder> mappingVOHolderList) {
        this.mappingVOHolderList = mappingVOHolderList;
    }
}

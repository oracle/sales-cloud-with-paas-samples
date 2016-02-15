package com.oracle.ptsdemo.healthcare.view.bean;


import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.AttributeEntry;
import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.MetaInfo;
import com.oracle.ptsdemo.healthcare.business.datasync.dynamic.PharmacyMetaInfoFactory;
import com.oracle.ptsdemo.healthcare.business.datasync.load.MappingAttr;
import com.oracle.ptsdemo.healthcare.business.datasync.load.MappingObj;
import com.oracle.ptsdemo.healthcare.business.datasync.load.db.MappingObjDB;
import com.oracle.ptsdemo.healthcare.view.vo.MappingVO;
import com.oracle.ptsdemo.healthcare.view.vo.MappingVOHolder;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.context.AdfFacesContext;


public class CrmMapping {
    RichForm form;
    //   private List<MappingVO> mappingVOList;

    ///   private HashMap<String,List<MappingVO>> objectTableMappingList= null;
    //   private HashMap<String,List<MappingVO>> objectTableMappingList;
    private List<MappingVOHolder> mappingVOHolderList;

    public CrmMapping() {
        super();
        
    }

    public String reset() {
        System.out.println("reset is called****************");
        //     loadMappingAttr(topPartnerObject);
        AdfFacesContext adfFacesCtx = AdfFacesContext.getCurrentInstance();
        adfFacesCtx.addPartialTarget(form);
        return "success";
    }

    public String save() {
        System.out.println("save is called****************");


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

    //            String sourceObj = mappingVO.getObject();
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

        // objectTableMappingList = new HashMap<String,List<MappingVO>>();

        mappingVOHolderList = new ArrayList<MappingVOHolder>();

        setTableData("Pharmacy Doctor Object", "CRMDoctor", "PharmacyDoctor",3);
        setTableData("Pharmacy Patient Object", "CRMPatient",
                     "PharmacyPatient",3);
        setTableData("Pharmacy Prescription Object", "CRMPresctiption",
                     "PharmacyPresctiption",7);
    }

    private void setTableData(String descriptionName, String sourceObjectName,
                              String targetObjectName,int autoHeightRows) {


            System.out.println("init mappingVOList*************");
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

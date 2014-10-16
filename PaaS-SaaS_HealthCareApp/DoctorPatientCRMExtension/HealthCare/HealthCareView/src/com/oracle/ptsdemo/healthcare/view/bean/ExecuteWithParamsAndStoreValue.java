package com.oracle.ptsdemo.healthcare.view.bean;

import com.oracle.ptsdemo.healthcare.view.utils.ADFUtils;

import com.oracle.ptsdemo.healthcare.view.utils.JSFUtils;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;

import org.apache.log4j.Logger;

public class ExecuteWithParamsAndStoreValue {
    
    static Logger logger = Logger.getLogger(ExecuteWithParamsAndStoreValue.class);
    
    public ExecuteWithParamsAndStoreValue() {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }

    }
    
    public void countPrescriptionRows(){ 
         if (logger.isDebugEnabled()) {
             logger.debug(this.getClass().getName() + ".countPrescriptionRows()");
         }
       
            DCIteratorBinding itBinding = 
                ADFUtils.findIterator("PrescriptionViewIterator");
            if (itBinding != null) {
                ViewObject prescriptionVO = itBinding.getViewObject();
                ViewCriteria vc = prescriptionVO.getViewCriteriaManager().getViewCriteria("PrescriptionByVisitIdViewCriteria");
                prescriptionVO.applyViewCriteria(vc);
                String visitId = JSFUtils.resolveExpressionAsString("#{pageFlowScope.visitId}");
                
                prescriptionVO.ensureVariableManager().setVariableValue("visitIdVar",  visitId == null ? "-1":visitId );
                
                prescriptionVO.executeQuery();
                long count = prescriptionVO.getEstimatedRowCount();
                
                if (logger.isDebugEnabled()) {
                    logger.debug("Query returned '"+String.valueOf(count)+"' rows for visitId '"+visitId+"'");
                }

                JSFUtils.setExpressionValue("#{pageFlowScope.estimatedPrescriptionRowCont}", count);
            }
        
     }

}
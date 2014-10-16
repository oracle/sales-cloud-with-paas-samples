package com.oracle.ptsdemo.healthcare.view.bean;


import com.oracle.ptsdemo.healthcare.view.utils.ADFUtils;
import com.oracle.ptsdemo.healthcare.view.utils.JSFUtils;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;

import org.apache.log4j.Logger;


public class OfficeVisitBean {
    
    static Logger logger = Logger.getLogger(OfficeVisitBean.class);
    
    private PrescriptionReport report;
    
    public OfficeVisitBean() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
        
        report = new PrescriptionReport();
    }
    

    public void updateDoctorAndPatientNames() {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".updateDoctorAndPatientNames()");
        }
        
        DCIteratorBinding itBinding = 
            ADFUtils.findIterator("PrescriptionViewIterator");
        
        if (itBinding != null) {
            ViewObject prescriptionVO = itBinding.getViewObject();
            ViewCriteria vc = prescriptionVO.getViewCriteriaManager().getViewCriteria("PrescriptionByVisitIdViewCriteria");
            prescriptionVO.applyViewCriteria(vc);

            
            Object visitId_ = JSFUtils.resolveExpression("#{pageFlowScope.visitId}");
            String visitId = visitId_.toString();           
            
            prescriptionVO.ensureVariableManager().setVariableValue("visitIdVar",  visitId == null ? "-1":visitId );
                        
            prescriptionVO.executeQuery();
            Row r = prescriptionVO.first();
            
            r.setAttribute("DoctorName", JSFUtils.resolveExpressionAsString("#{pageFlowScope.doctorName}"));
            r.setAttribute("PatientName",JSFUtils.resolveExpressionAsString("#{pageFlowScope.patientName}")); 
            r.setAttribute("PatientEmail", JSFUtils.resolveExpressionAsString("#{pageFlowScope.patientEmail}")); 
            
        }
    }    
    
    
    public void findPrescriptionForDVT() {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + ".findPrescriptionForDVT()");
        }
              
        
        DCIteratorBinding itBinding = 
            ADFUtils.findIterator("PrescriptionGanttViewIterator");
        
        if (itBinding != null) {
            ViewObject prescriptionVO = itBinding.getViewObject();
            ViewCriteria vc = prescriptionVO.getViewCriteriaManager().getViewCriteria("FindByVisitIdCriteria");
            prescriptionVO.applyViewCriteria(vc);

            
            Object visitId_ = JSFUtils.resolveExpression("#{pageFlowScope.visitId}");
            String visitId = visitId_.toString();           
            
            prescriptionVO.ensureVariableManager().setVariableValue("visitIdVar",  visitId == null ? "-1":visitId );
                        
            prescriptionVO.executeQuery();
            
            prescriptionVO.first();
    
                
                

            
            
//            r.setAttribute("DoctorName", JSFUtils.resolveExpressionAsString("#{pageFlowScope.doctorName}"));
//            r.setAttribute("PatientName",JSFUtils.resolveExpressionAsString("#{pageFlowScope.patientName}"));        
        }
    }

    public void setReport(PrescriptionReport report) {
        this.report = report;
    }

    public PrescriptionReport getReport() {
        return report;
    }
}

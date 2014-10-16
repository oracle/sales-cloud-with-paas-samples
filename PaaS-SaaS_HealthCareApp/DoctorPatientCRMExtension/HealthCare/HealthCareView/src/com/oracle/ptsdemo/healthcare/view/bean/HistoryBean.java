package com.oracle.ptsdemo.healthcare.view.bean;

import com.oracle.ptsdemo.healthcare.view.utils.ADFUtils;

import com.oracle.ptsdemo.healthcare.view.utils.JSFUtils;

import oracle.adf.controller.TaskFlowId;

import oracle.jbo.Row;

import org.apache.log4j.Logger;
import org.apache.myfaces.trinidad.event.SelectionEvent;

public class HistoryBean {

    static Logger logger = Logger.getLogger(HistoryBean.class);
    private final String taskFlowId = "/WEB-INF/viewPrescriptionGanttTF.xml#viewPrescriptionGanttTF";


    public HistoryBean() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }
    }

    public void historyPrescriptionTableSelectionListener(SelectionEvent selectionEvent) {
        if (logger.isDebugEnabled()) {
            logger.debug("historyPrescriptionTableSelectionListener");
        }        
        
        JSFUtils.resolveMethodExpression("#{bindings.PrescriptionView.collectionModel.makeCurrent}", 
                                         null, 
                                         new Class[] { SelectionEvent.class },
                                         new Object[] { selectionEvent });
        logger.debug("makeCurrent");
        
        Row r = (Row)JSFUtils.resolveExpression("#{bindings.PrescriptionViewIterator.currentRow}");
        Object visitId = r.getAttribute("VisitId");
        Object doctorName = r.getAttribute("DoctorName");
        Object patientName = r.getAttribute("PatientName");
        
        
        logger.debug("VisitId = "+String.valueOf(visitId));
        logger.debug("DoctorName = "+String.valueOf(doctorName));
        logger.debug("PatientName = "+String.valueOf(patientName));
        
        //{bindings.PrescriptionView.collectionModel.selectedRow}
        //{row.VisitId}

        JSFUtils.setExpressionValue("#{pageFlowScope.visitId}", 
                                    visitId);        

        JSFUtils.setExpressionValue("#{pageFlowScope.doctorName}", 
                                    doctorName);    
        

        JSFUtils.setExpressionValue("#{pageFlowScope.patientName}", 
                                    patientName);    
        
        
        
         oracle.jbo.domain.Number visitIdString = (oracle.jbo.domain.Number)JSFUtils.resolveExpression("#{pageFlowScope.visitId}");
        logger.debug("#{pageFlowScope.visitId} = "+visitIdString);
        
    }

    public TaskFlowId getDynamicTaskFlowId() {
        logger.debug("getDynamicTaskFlowId = "+taskFlowId);
        return TaskFlowId.parse(taskFlowId);
    }
}

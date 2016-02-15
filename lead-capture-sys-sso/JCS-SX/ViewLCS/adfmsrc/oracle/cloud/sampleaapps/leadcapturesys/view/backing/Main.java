/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleaapps.leadcapturesys.view.backing;

import javax.faces.event.ValueChangeEvent;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;


public class Main {
   
    public void editDialogListener(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("Commit");
            operationBinding.execute();
        } 
        else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
            operationBinding.execute();
        }
        AdfFacesContext afContext = AdfFacesContext.getCurrentInstance();
        afContext.returnFromDialog(null, null);
    }

    public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        operationBinding.execute();
    }

    public void editPopupFetchListener(PopupFetchEvent popupFetchEvent) {
        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
        }
    }

    /* Some sample I found on internet ...
    public void radioChange(ValueChangeEvent valueChangeEvent) {
        if(valueChangeEvent.getNewValue()!=null)
        {
            //get NewValue Index and parse to integrer
            int selectIndex = Integer.parseInt(valueChangeEvent.getNewValue().toString()) ;

            DCBindingContainer dcBindings =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

            // Get a attribute value of the current row of iterator
            DCIteratorBinding iterBind =
            (DCIteratorBinding)dcBindings.get("VOUserBranchList1Iterator"); //VOUserBranchList1Iterator is iteration name what I used

            //get row of current index
            Row selectedRow =iterBind.getRowAtRangeIndex(selectIndex);

            if (selectedRow != null)
            {
              //get Row value
                Object selectValue = (String)selectedRow.getAttribute("RtNo"); //RtNo is AttributeName what I used
            }
        }
    }*/
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
}

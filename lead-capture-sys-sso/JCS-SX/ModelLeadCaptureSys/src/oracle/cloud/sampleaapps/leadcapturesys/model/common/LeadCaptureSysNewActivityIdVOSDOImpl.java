/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleaapps.leadcapturesys.model.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class LeadCaptureSysNewActivityIdVOSDOImpl extends SDODataObject implements LeadCaptureSysNewActivityIdVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 0;

   public LeadCaptureSysNewActivityIdVOSDOImpl() {}

   public java.math.BigDecimal getMaxActivityId1() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setMaxActivityId1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }


}


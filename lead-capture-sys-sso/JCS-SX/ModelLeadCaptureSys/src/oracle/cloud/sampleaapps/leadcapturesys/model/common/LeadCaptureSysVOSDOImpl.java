/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
package oracle.cloud.sampleaapps.leadcapturesys.model.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class LeadCaptureSysVOSDOImpl extends SDODataObject implements LeadCaptureSysVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 7;

   public LeadCaptureSysVOSDOImpl() {}

   public java.math.BigDecimal getActivityId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setActivityId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getProspectName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setProspectName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getDemoCompleted() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setDemoCompleted(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getLeadRecUpdated() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setLeadRecUpdated(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Timestamp getVisitDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 4);
   }

   public void setVisitDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getStartTime() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setStartTime(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getEndTime() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setEndTime(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getNotes() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setNotes(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }


}


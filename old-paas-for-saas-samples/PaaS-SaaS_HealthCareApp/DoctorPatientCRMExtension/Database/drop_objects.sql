--------------------------------------------------------
--  File created - December-26-2013   
-----------------------------------
DROP TABLE "MEDICATION" cascade constraints;
DROP TABLE "PHARMACY" cascade constraints;
DROP TABLE "PHARMACY_MEDICATION" cascade constraints;
DROP TABLE "PRESCRIPTION" cascade constraints;
DROP TABLE "PRESCRIPTION_MEDICATION" cascade constraints;
DROP TABLE "DOCTOR" cascade constraints;
DROP TABLE "FUSION_CONFIG" cascade constraints;
DROP TABLE "MAPPING_OBJ" cascade constraints;
DROP TABLE "FUSION_SCHEDULER_JOB" cascade constraints;
DROP table "P_PRESCRIPTION" cascade constraints;
DROP table "P_HEALTHCARE_PROVIDER" cascade constraints;
DROP table "P_DRUG" cascade constraints;  
DROP table "P_DOCTOR" cascade constraints;
DROP table "P_PATIENT" cascade constraints;
DROP SEQUENCE "PRESCRIPTION_MEDICATION_SEQ";
DROP SEQUENCE "MEDICATION_SEQ";
DROP SEQUENCE "PHARMACY_SEQ";
DROP SEQUENCE "PRESCRIPTION_SEQ";
DROP PROCEDURE "HEALTHCAREBISCHEDULER";

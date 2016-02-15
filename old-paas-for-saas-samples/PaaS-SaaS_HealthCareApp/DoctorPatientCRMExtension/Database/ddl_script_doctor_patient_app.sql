--------------------------------------------------------
--  File created - December-26-2013   
--------------------------------------------------------

--------------------------------------------------------
--  DDL for Table PRESCRIPTION_MEDICATION
--------------------------------------------------------

  CREATE TABLE "PRESCRIPTION_MEDICATION" 
   (	"PRESCRIPTION_MEDICATION_ID" NUMBER, 
	"PRESCRIPTION_ID" NUMBER, 
	"MEDICATION_ID" NUMBER, 
	"QUANTITY" NUMBER, 
	"REFILLS" NUMBER, 
	"DIRECTIONS_FOR_USE" VARCHAR2(2000 CHAR), 
	"EXPIRE_DATE" DATE, 
	"SENT_TO_PHARMACY_FL" CHAR(1 CHAR) DEFAULT 'F', 
	"SENT_TO_PHARMACY_DATE" DATE, 
	"ORDER_NUMBER" VARCHAR2(20 CHAR), 
	"PHARMACY_ID" NUMBER, 
	"IS_READY_TO_PICKUP_FL" CHAR(1 CHAR) DEFAULT 'F'
   ) ;
--------------------------------------------------------
--  DDL for Table PRESCRIPTION
--------------------------------------------------------

  CREATE TABLE "PRESCRIPTION" 
   (	"PRESCRIPTION_ID" NUMBER, 
	"DOCTOR_ID" NUMBER, 
	"PATIENT_ID" NUMBER, 
	"VISIT_ID" NUMBER, 
	"PRESCRIPTION_DATE" DATE, 
	"EXPIRE_DATE" DATE,
	"PATIENT_EMAIL" VARCHAR2(200 CHAR)
   )  ;
--------------------------------------------------------
--  DDL for Table PHARMACY_MEDICATION
--------------------------------------------------------

  CREATE TABLE "PHARMACY_MEDICATION" 
   (	"PHARMACY_ID" NUMBER, 
	"MEDICATION_ID" NUMBER, 
	"IN_STOCK_FL" CHAR(1 CHAR) DEFAULT 'F'
   ) ;
--------------------------------------------------------
--  DDL for Table PHARMACY
--------------------------------------------------------

  CREATE TABLE "PHARMACY" 
   (	"PHARMACY_ID" NUMBER, 
	"NAME" VARCHAR2(100 CHAR), 
	"WS_URL" VARCHAR2(200 CHAR)
   );
--------------------------------------------------------
--  DDL for Table MEDICATION
--------------------------------------------------------

  CREATE TABLE "MEDICATION" 
   (	"MEDICATION_ID" NUMBER, 
	"NAME" VARCHAR2(200 CHAR), 
	"NDC_CODE" NUMBER
   );
   
   
   
 --------------------------------------------------------
--  DDL for Table DOCTOR - used in mobile app
--------------------------------------------------------  
CREATE TABLE DOCTOR 
(
  "DOCTOR_ID" NUMBER, 
  "DOCTOR_NAME" VARCHAR2(2000 BYTE),
  "DOCTOR_USERNAME" VARCHAR2 (200 BYTE),
  "SPECIALITY" VARCHAR2(2000 BYTE), 
  "PHONE" VARCHAR2(200 BYTE), 
  "ADDRESS" VARCHAR2(2000 BYTE), 
  "CITY" VARCHAR2(2000 BYTE)
  );

   
--------------------------------------------------------
--  DDL for Index PRESCRIPTION_MEDICATION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PRESCRIPTION_MEDICATION_PK" ON "PRESCRIPTION_MEDICATION" ("PRESCRIPTION_MEDICATION_ID")   ;
--------------------------------------------------------
--  DDL for Index PRESCRIPTION_MEDICATION_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "PRESCRIPTION_MEDICATION_UK1" ON "PRESCRIPTION_MEDICATION" ("PRESCRIPTION_ID", "MEDICATION_ID") ;
--------------------------------------------------------
--  DDL for Index PRESCRIPTION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PRESCRIPTION_PK" ON "PRESCRIPTION" ("PRESCRIPTION_ID")  ;
--------------------------------------------------------
--  DDL for Index PHARMACY_MEDICATION_PK
-------------------------------------------------------
  CREATE UNIQUE INDEX "PHARMACY_MEDICATION_PK" ON "PHARMACY_MEDICATION" ("PHARMACY_ID", "MEDICATION_ID")  ;
--------------------------------------------------------
--  DDL for Index PHARMACY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PHARMACY_PK" ON "PHARMACY" ("PHARMACY_ID")   ;
--------------------------------------------------------
--  DDL for Index MEDICATION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MEDICATION_PK" ON "MEDICATION" ("MEDICATION_ID")  ;
--------------------------------------------------------
--  Constraints for Table PRESCRIPTION_MEDICATION
--------------------------------------------------------

  ALTER TABLE "PRESCRIPTION_MEDICATION" MODIFY ("MEDICATION_ID" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION_MEDICATION" MODIFY ("QUANTITY" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION_MEDICATION" MODIFY ("REFILLS" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION_MEDICATION" MODIFY ("DIRECTIONS_FOR_USE" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION_MEDICATION" MODIFY ("PRESCRIPTION_ID" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION_MEDICATION" MODIFY ("PRESCRIPTION_MEDICATION_ID" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION_MEDICATION" MODIFY ("SENT_TO_PHARMACY_FL" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION_MEDICATION" ADD CONSTRAINT "PRESCRIPTION_MEDICATION_PK" PRIMARY KEY ("PRESCRIPTION_MEDICATION_ID") ;
  ALTER TABLE "PRESCRIPTION_MEDICATION" ADD CONSTRAINT "PRESCRIPTION_MEDICATION_UK1" UNIQUE ("PRESCRIPTION_ID", "MEDICATION_ID") ;
--------------------------------------------------------
--  Constraints for Table PRESCRIPTION
--------------------------------------------------------

  ALTER TABLE "PRESCRIPTION" MODIFY ("PRESCRIPTION_DATE" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION" ADD CONSTRAINT "PRESCRIPTION_PK" PRIMARY KEY ("PRESCRIPTION_ID") ;
  ALTER TABLE "PRESCRIPTION" MODIFY ("PRESCRIPTION_ID" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION" MODIFY ("VISIT_ID" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION" MODIFY ("PATIENT_ID" NOT NULL ENABLE);
  ALTER TABLE "PRESCRIPTION" MODIFY ("DOCTOR_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PHARMACY_MEDICATION
--------------------------------------------------------

  ALTER TABLE "PHARMACY_MEDICATION" ADD CONSTRAINT "PHARMACY_MEDICATION_PK" PRIMARY KEY ("PHARMACY_ID", "MEDICATION_ID") ;
  ALTER TABLE "PHARMACY_MEDICATION" MODIFY ("MEDICATION_ID" NOT NULL ENABLE);
  ALTER TABLE "PHARMACY_MEDICATION" MODIFY ("PHARMACY_ID" NOT NULL ENABLE);
  ALTER TABLE "PHARMACY_MEDICATION" MODIFY ("IN_STOCK_FL" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PHARMACY
--------------------------------------------------------

  ALTER TABLE "PHARMACY" ADD CONSTRAINT "PHARMACY_PK" PRIMARY KEY ("PHARMACY_ID")  ;
  ALTER TABLE "PHARMACY" MODIFY ("PHARMACY_ID" NOT NULL ENABLE);
  ALTER TABLE "PHARMACY" MODIFY ("NAME" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MEDICATION
--------------------------------------------------------

  ALTER TABLE "MEDICATION" ADD CONSTRAINT "MEDICATION_PK" PRIMARY KEY ("MEDICATION_ID")  ;
  ALTER TABLE "MEDICATION" MODIFY ("MEDICATION_ID" NOT NULL ENABLE);
  ALTER TABLE "MEDICATION" MODIFY ("NAME" NOT NULL ENABLE);
  
  
--------------------------------------------------------
--  Constraints for Table DOCTOR
--------------------------------------------------------

  ALTER TABLE "DOCTOR" MODIFY ("DOCTOR_ID" NOT NULL ENABLE);
  ALTER TABLE "DOCTOR" MODIFY ("DOCTOR_NAME" NOT NULL ENABLE);
  ALTER TABLE "DOCTOR" ADD CONSTRAINT "DOCTOR_PK" PRIMARY KEY ("DOCTOR_ID") ;  
  
--------------------------------------------------------
--  Ref Constraints for Table PRESCRIPTION_MEDICATION
--------------------------------------------------------

  ALTER TABLE "PRESCRIPTION_MEDICATION" ADD CONSTRAINT "MEDICATION_FK" FOREIGN KEY ("MEDICATION_ID")
	  REFERENCES "MEDICATION" ("MEDICATION_ID") ENABLE;
  ALTER TABLE "PRESCRIPTION_MEDICATION" ADD CONSTRAINT "PRESCRIPTION_FK" FOREIGN KEY ("PRESCRIPTION_ID")
	  REFERENCES "PRESCRIPTION" ("PRESCRIPTION_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PHARMACY_MEDICATION
--------------------------------------------------------

  ALTER TABLE "PHARMACY_MEDICATION" ADD CONSTRAINT "MEDICATION_FK1" FOREIGN KEY ("MEDICATION_ID")
	  REFERENCES "MEDICATION" ("MEDICATION_ID") ENABLE;
  ALTER TABLE "PHARMACY_MEDICATION" ADD CONSTRAINT "PHARMACY_ID_FK1" FOREIGN KEY ("PHARMACY_ID")
	  REFERENCES "PHARMACY" ("PHARMACY_ID") ENABLE;

--------------------------------------------------------
--  Sequences
--------------------------------------------------------

 CREATE SEQUENCE  "PRESCRIPTION_MEDICATION_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
 CREATE SEQUENCE  "PRESCRIPTION_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
 CREATE SEQUENCE  "MEDICATION_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
 CREATE SEQUENCE  "PHARMACY_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE ;
 
 
 
 ----------------------------------------------------------------------
 --- MAPPING UI/BI Scheduler DDL ---------------------------
 ----------------------------------------------------------------------
  
CREATE TABLE FUSION_CONFIG (
   CONF_NAME	VARCHAR2(50)	NOT NULL,
   CONF_VALUE	VARCHAR2(50)	NOT NULL,
   CONSTRAINT PK_FUSION_CONFIG PRIMARY KEY (CONF_NAME)
);
CREATE TABLE MAPPING_OBJ  (
   TARGET_OBJ	VARCHAR2(50)	NOT NULL,
   SOURCE_OBJ	VARCHAR2(50)	,
   TARGET_ATTR	VARCHAR2(50)	NOT NULL,
   SOURCE_ATTR	VARCHAR2(50)	,
   DEFAULT_VALUE	VARCHAR2(50),
   CONSTRAINT PK_MAPPING_OBJ PRIMARY KEY (TARGET_OBJ,TARGET_ATTR)
);
 
CREATE TABLE FUSION_SCHEDULER_JOB (
   JOB_NAME	VARCHAR2(50)	NOT NULL,
   JOB_STATUS	VARCHAR2(50),
   JOB_STARTTIME TIMESTAMP,
   JOB_INTERVAL NUMBER(10,0),
   JOB_INTERVAL_UNIT VARCHAR2(50),
   CONSTRAINT PK_FUSION_SCHEDULER_JOB PRIMARY KEY (JOB_NAME)
);


--------------------------------------W----------------------------------------------------
----- PHARMACY Application  - 3rd party app ---------------------------------------------------
---------------------------------------------------------------------------------------


CREATE TABLE P_HEALTHCARE_PROVIDER
   (	HEALTHCARE_PROVIDER_ID NUMBER, 
   	NAME VARCHAR2(200 CHAR), 
   	LOCATION VARCHAR2(200 CHAR),
   	TEL VARCHAR2(200 CHAR),
  	FAX VARCHAR2(200 CHAR),
	CONSTRAINT PK_P_HEALTHCARE_PROVIDER primary key (HEALTHCARE_PROVIDER_ID)
   );  
  
 
CREATE TABLE P_DRUG
   (	NDC_CODE NUMBER,
        NAME VARCHAR2(200 CHAR),	
	CONSTRAINT PK_P_NDC_CODE primary key (NDC_CODE)
   ); 
  
CREATE TABLE P_PATIENT
   (	PATIENT_ID NUMBER,
        FIRST_NAME VARCHAR2(50),	
        LAST_NAME VARCHAR2(50),	
        NAME VARCHAR2(50),	
        BIRTH DATE,
	EXISTING_PATIENT CHAR(1 CHAR) DEFAULT 'F',
	INSURANCE_STATUS VARCHAR2(50),
	CONSTRAINT PK_P_PATIENT primary key (PATIENT_ID)
   );   
CREATE TABLE P_DOCTOR
(	DOCTOR_ID NUMBER,
   	FIRST_NAME VARCHAR2(50),	
   	LAST_NAME VARCHAR2(50),
        NAME VARCHAR2(50),	
	CONSTRAINT PK_P_DOCTOR primary key (DOCTOR_ID)
);
 
CREATE TABLE P_PRESCRIPTION
   (	ORDER_NUMBER VARCHAR2(20 CHAR),
   	NDC_CODE NUMBER,
   	PATIENT_ID NUMBER,
   	DOCTOR_ID NUMBER,
	HEALTHCARE_PROVIDER_ID NUMBER, 
	QUANTITY NUMBER, 
	REFILLS NUMBER, 
	PHARMACY_ID NUMBER, 
	DIRECTIONS_FOR_USE VARCHAR2(2000 CHAR), 
	IS_READY_TO_PICKUP_FL CHAR(1 CHAR) DEFAULT 'F',
	EXPIRE_DATE DATE, 
	ORDER_DATE DATE,
	CONSTRAINT PK_P_PRESCRIPTION primary key (ORDER_NUMBER),
	CONSTRAINT FK_P_DOCTOR FOREIGN KEY (DOCTOR_ID) REFERENCES P_DOCTOR(DOCTOR_ID),
	CONSTRAINT FK_P_PATIENT FOREIGN KEY (PATIENT_ID) REFERENCES P_PATIENT(PATIENT_ID),
	CONSTRAINT FK_P_NDC_CODE FOREIGN KEY (NDC_CODE) REFERENCES P_DRUG(NDC_CODE),
	CONSTRAINT FK_P_HEALTHCARE_PROVIDER FOREIGN KEY (HEALTHCARE_PROVIDER_ID) REFERENCES P_HEALTHCARE_PROVIDER(HEALTHCARE_PROVIDER_ID)
   );

--------------------------------------------------------------
---- PROCEDURE -----------------------------------------------
--------------------------------------------------------------

create or replace procedure HealthCareBIScheduler
is
  l_clob         clob;
  l_buffer          varchar2(32767);
 
 begin
  l_clob := apex_web_service.make_rest_request(
              p_url => 'https://my-jcs-server/HealthCare/jersey/BISchedulerJob',
              p_http_method => 'GET',
              p_username => 'my-jcs-user',
              p_password => 'my-password'
             );
            
            l_buffer := dbms_lob.substr(l_clob, 32000, 1 );
            dbms_output.put_line(l_buffer);
end; 


-- *****************************************************************------
-- Comment the code below to run it locally. It's only available on DBCS  --
---*****************************************************************--------
/*
BEGIN
   CLOUD_SCHEDULER.CREATE_JOB (
   job_name             => 'HealthCareBISchedulerJob',
   job_type             => 'STORED_PROCEDURE',
   job_action           => 'HealthCareBIScheduler',
   start_date           => sysdate,
   repeat_interval      => 'FREQ=MINUTELY;INTERVAL=5', 
   end_date             => sysdate+365,
   enabled              =>  TRUE,
   comments             => 'Push custom object data back to OSC for BI reports');
END;
*/
/
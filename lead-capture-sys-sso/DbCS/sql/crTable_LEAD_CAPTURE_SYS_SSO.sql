/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
drop SEQUENCE LEAD_CAPTURE_ACTIVITY_ID_SEQ;
CREATE SEQUENCE LEAD_CAPTURE_ACTIVITY_ID_SEQ INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 10 ;

drop table LEAD_CAPTURE_SYS_SSO;
--SET DEFINE OFF

create TABLE LEAD_CAPTURE_SYS_SSO
(
  activity_id		  number		   Not Null,
  prospect_name           varchar2(200)            Not Null,
  demo_completed          varchar2(1)		   CONSTRAINT YesNo1 CHECK (demo_completed IN ('Y', 'N')),
  lead_rec_updated        varchar2(1)		   CONSTRAINT YesNo2 CHECK (lead_rec_updated IN ('Y', 'N')),
  visit_date              date                     Not Null,
  start_time              timestamp                Not Null,
  end_time                timestamp                Not Null,
  notes                   varchar2(4000),
  CONSTRAINT activity_key UNIQUE (activity_id)
);

insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Super Power Ltd', 'Y', 'Y', to_date('2015/03/25', 'yyyy/mm/dd'), to_date('2015/03/25 11:30:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/25 12:30:00', 'yyyy/mm/dd hh24:mi:ss'), 'Very successful meeting. Super Power Ltd agreed for another meeting in next 2 weeks where we discuss project details');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Super Power Ltd', 'Y', 'N', to_date('2015/03/23', 'yyyy/mm/dd'), to_date('2015/03/23 09:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/23 10:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'No feedback from Super Power Ltd yet');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Super Power Ltd', 'N', 'N', to_date('2015/03/25', 'yyyy/mm/dd'), to_date('2015/03/25 16:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/25 17:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Super Power Ltd agreed for installion of a prototype');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Dadadoo Corp', 'Y', 'N', to_date('2015/03/16', 'yyyy/mm/dd'), to_date('2015/03/16 11:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/16 12:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Dadadoo asked for more info');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Dadadoo Corp', 'N', 'Y', to_date('2015/03/20', 'yyyy/mm/dd'), to_date('2015/03/20 08:30:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/20 10:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Need to call customer contact within next 7 days');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Bluff Light Corp', 'N', 'N', to_date('2015/03/24', 'yyyy/mm/dd'), to_date('2015/03/24 14:30:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/24 16:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Not very successful meeting. Bluff Light tends to purchase products from competition');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Bluff Light Corp', 'Y', 'N', to_date('2015/03/20', 'yyyy/mm/dd'), to_date('2015/03/20 17:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/20 18:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Successful meeting. Agree about next steps within 10 days');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Foo Corp', 'Y', 'Y', to_date('2015/03/13', 'yyyy/mm/dd'), to_date('2015/03/13 13:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/13 14:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'First meeting. Will give a demo in 2 weeks');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Foo Corp', 'Y', 'N', to_date('2015/03/9', 'yyyy/mm/dd'), to_date('2015/03/9 10:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/9 12:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Foo wants to have a prototype');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Foo Corp', 'Y', 'N', to_date('2015/03/27', 'yyyy/mm/dd'), to_date('2015/03/27 11:30:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/27 13:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Foo requested contractual details');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Bar Corp', 'N', 'Y', to_date('2015/03/26', 'yyyy/mm/dd'), to_date('2015/03/26 15:30:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/26 16:30:00', 'yyyy/mm/dd hh24:mi:ss'), 'We are first choice for Bar');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Bar Corp', 'Y', 'N', to_date('2015/03/11', 'yyyy/mm/dd'), to_date('2015/03/11 10:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/11 12:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Would fit with product line and strategy');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Bar Corp', 'Y', 'Y', to_date('2015/03/30', 'yyyy/mm/dd'), to_date('2015/03/30 14:30:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/30 15:30:00', 'yyyy/mm/dd hh24:mi:ss'), 'Bar wants to discuss project details');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Bling Corp', 'Y', 'N', to_date('2015/03/12', 'yyyy/mm/dd'), to_date('2015/03/12 16:00:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/12 18:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Bling was thankful about our presentation as we explained the solution for some nasty side-effect');
insert into LEAD_CAPTURE_SYS_SSO values ( LEAD_CAPTURE_ACTIVITY_ID_SEQ.nextVal, 'Foo Corp', 'Y', 'Y', to_date('2015/03/31', 'yyyy/mm/dd'), to_date('2015/03/31 13:30:00', 'yyyy/mm/dd hh24:mi:ss'), to_date('2015/03/31 16:00:00', 'yyyy/mm/dd hh24:mi:ss'), 'Very successful meeting. Foo is definitely interested');
commit;

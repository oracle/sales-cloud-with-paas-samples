/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
set define off
set verify off
set feedback off
WHENEVER SQLERROR EXIT SQL.SQLCODE ROLLBACK
begin wwv_flow.g_import_in_progress := true; end;
/
 
--       AAAA       PPPPP   EEEEEE  XX      XX
--      AA  AA      PP  PP  EE       XX    XX
--     AA    AA     PP  PP  EE        XX  XX
--    AAAAAAAAAA    PPPPP   EEEE       XXXX
--   AA        AA   PP      EE        XX  XX
--  AA          AA  PP      EE       XX    XX
--  AA          AA  PP      EEEEEE  XX      XX
prompt  Set Credentials...
 
begin
 
  -- Assumes you are running the script connected to SQL*Plus as the Oracle user APEX_040200 or as the owner (parsing schema) of the application.
  wwv_flow_api.set_security_group_id(p_security_group_id=>nvl(wwv_flow_application_install.get_workspace_id,4367107765177276));
 
end;
/

begin wwv_flow.g_import_in_progress := true; end;
/
begin 

select value into wwv_flow_api.g_nls_numeric_chars from nls_session_parameters where parameter='NLS_NUMERIC_CHARACTERS';

end;

/
begin execute immediate 'alter session set nls_numeric_characters=''.,''';

end;

/
begin wwv_flow.g_browser_language := 'en'; end;
/
prompt  Check Compatibility...
 
begin
 
-- This date identifies the minimum version required to import this file.
wwv_flow_api.set_version(p_version_yyyy_mm_dd=>'2012.01.01');
 
end;
/

prompt  Set Application Offset...
 
begin
 
   -- SET APPLICATION OFFSET
   wwv_flow_api.g_id_offset := nvl(wwv_flow_application_install.get_offset,0);
null;
 
end;
/

 
begin
 
wwv_flow_api.remove_restful_service (
  p_id => 93518811249188527 + wwv_flow_api.g_id_offset
 ,p_name => 'oracle.cloud.sampleapps.dealerfeedback'
  );
 
null;
 
end;
/

prompt  ...restful service
--
--application/restful_services/oracle_cloud_sampleapps_dealerfeedback
 
begin
 
wwv_flow_api.create_restful_module (
  p_id => 93518811249188527 + wwv_flow_api.g_id_offset
 ,p_name => 'oracle.cloud.sampleapps.dealerfeedback'
 ,p_uri_prefix => 'dealerfeedback/'
 ,p_parsing_schema => 'BEYHDJCNZTNF'
 ,p_items_per_page => 25
 ,p_status => 'PUBLISHED'
  );
 
wwv_flow_api.create_restful_template (
  p_id => 93716825001170101 + wwv_flow_api.g_id_offset
 ,p_module_id => 93518811249188527 + wwv_flow_api.g_id_offset
 ,p_uri_template => 'dealerfeedback/{dealer_name}'
 ,p_priority => 0
 ,p_etag_type => 'HASH'
  );
 
wwv_flow_api.create_restful_handler (
  p_id => 93716914396176535 + wwv_flow_api.g_id_offset
 ,p_template_id => 93716825001170101 + wwv_flow_api.g_id_offset
 ,p_source_type => 'PLSQL'
 ,p_format => 'DEFAULT'
 ,p_method => 'PUT'
 ,p_require_https => 'YES'
 ,p_source => 
'update dealer_feedback set'||unistr('\000a')||
'FOLLOWED_UP = :followed_up,'||unistr('\000a')||
'FOLLOWED_UP_BY = :followed_up_by'||unistr('\000a')||
'where DEALER_NAME = :dealer_name'
  );
 
wwv_flow_api.create_restful_template (
  p_id => 93518909144188528 + wwv_flow_api.g_id_offset
 ,p_module_id => 93518811249188527 + wwv_flow_api.g_id_offset
 ,p_uri_template => 'dealerfeedbacks/'
 ,p_priority => 0
 ,p_etag_type => 'HASH'
  );
 
wwv_flow_api.create_restful_handler (
  p_id => 93519003737188528 + wwv_flow_api.g_id_offset
 ,p_template_id => 93518909144188528 + wwv_flow_api.g_id_offset
 ,p_source_type => 'QUERY'
 ,p_format => 'DEFAULT'
 ,p_method => 'GET'
 ,p_require_https => 'YES'
 ,p_source => 
'select * from dealer_feedback'
  );
 
wwv_flow_api.create_restful_handler (
  p_id => 93519132729270378 + wwv_flow_api.g_id_offset
 ,p_template_id => 93518909144188528 + wwv_flow_api.g_id_offset
 ,p_source_type => 'PLSQL'
 ,p_format => 'DEFAULT'
 ,p_method => 'POST'
 ,p_require_https => 'YES'
 ,p_source => 
'insert into dealer_feedback('||unistr('\000a')||
'DEALER_NAME,FEEDBACK,DATE_GIVEN,IMPACT,FOLLOW_UP_WITH,PHONE_NUMBER, FOLLOWED_UP,FOLLOWED_UP_BY) values('||unistr('\000a')||
':dealer_name,:feedback,to_date(:date_given,''YYYY-MM-DD"T"hh24:mi:ss''),:impact,:follow_up_with,:phone_number,:followed_up,:followed_up_by) '
  );
 
null;
 
end;
/

commit;
begin
execute immediate 'begin sys.dbms_session.set_nls( param => ''NLS_NUMERIC_CHARACTERS'', value => '''''''' || replace(wwv_flow_api.g_nls_numeric_chars,'''''''','''''''''''') || ''''''''); end;';
end;
/
set verify on
set feedback on
set define on
prompt  ...done

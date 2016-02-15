-- Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved
drop table s2_merchandise;
create table s2_merchandise (merchandise_code varchar2(32) not null, merchandise_description varchar2(255) not null, merchandise_type varchar2(32), unit_price number, availability char(1));
drop table s2_merchandise_txn;
create table s2_merchandise_txn (account_name varchar2(255) not null, merchandise_code varchar2(32) not null, quantity number not null, total_cost number, date_delivered date not null, ISSUING_SALES_REP VARCHAR2(60) not null);

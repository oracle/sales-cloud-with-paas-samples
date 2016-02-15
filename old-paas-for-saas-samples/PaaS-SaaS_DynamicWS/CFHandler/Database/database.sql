create table fusion_config (
   conf_name	VARCHAR2(50)	not null,
   conf_value	VARCHAR2(1000)	not null,
   constraint PK_FUSION_CONFIG primary key (conf_name)
);



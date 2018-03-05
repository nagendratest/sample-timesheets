alter table TS_PROJECT add constraint FK_TS_PROJECT_PARENT foreign key (PARENT_ID) references TS_PROJECT(ID);

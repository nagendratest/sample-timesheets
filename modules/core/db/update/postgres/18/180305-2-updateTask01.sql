alter table TS_TASK add constraint FK_TS_TASK_PROJECT foreign key (PROJECT_ID) references TS_PROJECT(ID);

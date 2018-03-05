alter table TS_TIME_ENTRY add constraint FK_TS_TIME_ENTRY_TASK foreign key (TASK_ID) references TS_TASK(ID);

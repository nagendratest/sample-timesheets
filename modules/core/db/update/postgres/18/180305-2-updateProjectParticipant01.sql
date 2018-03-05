alter table TS_PROJECT_PARTICIPANT add constraint FK_TS_PROJECT_PARTICIPANT_USER foreign key (USER_ID) references SEC_USER(ID);

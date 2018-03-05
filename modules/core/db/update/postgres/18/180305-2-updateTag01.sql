alter table TS_TAG add constraint FK_TS_TAG_TAG_TYPE foreign key (TAG_TYPE_ID) references TS_TAG_TYPE(ID);

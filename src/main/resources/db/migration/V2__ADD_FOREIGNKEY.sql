alter table ledger add column catagory_id int(10); 
alter table ledger add constraint FK_CATAGORY_LEDGER foreign key (catagory_id) references catagory(Id);
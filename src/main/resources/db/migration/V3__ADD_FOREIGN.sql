alter table ledger add column account_id int(10); 
alter table ledger add constraint FK_ACCOUNT_LEDGER foreign key (account_id) references account(Id);
CREATE DATABASE IF NOT EXISTS personalfinance;
create table ledger(
	LedgerID 			int(10),
	Transaction_type 	char(3),
    Money 				decimal,
    `description` 		varchar(255),
    `created_at`		timestamp not null default current_timestamp,
    `updated_at`		timestamp not null default current_timestamp,
    `modified_at`		timestamp not null default current_timestamp,
    primary key (LedgerID)
);

create table catagory(
	Id					int(10),
    `name`				varchar(50),
    icon				varchar(255),
    budget				decimal,
	`created_at`		timestamp not null default current_timestamp,
    `updated_at`		timestamp not null default current_timestamp,
    `modified_at`		timestamp not null default current_timestamp,
    primary key (Id)
);

create table `account`(
	Id					int(10),
    `name`				varchar(255),
    initial_balance		decimal,
	dob					timestamp,
	`created_at`		timestamp not null default current_timestamp,
    `updated_at`		timestamp not null default current_timestamp,
    `modified_at`		timestamp not null default current_timestamp,
    primary key(Id)				
)

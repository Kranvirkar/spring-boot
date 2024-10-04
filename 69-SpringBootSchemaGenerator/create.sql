create table account_settings (id bigint not null, name varchar(255) not null, value varchar(255) not null, account_id bigint not null, primary key (id)) engine=InnoDB
create table accounts (id bigint not null, email_address varchar(255), name varchar(100) not null, primary key (id)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
alter table account_settings add constraint FK54uo82jnot7ye32pyc8dcj2eh foreign key (account_id) references accounts (id)
create table account_settings (id bigint not null, name varchar(255) not null, value varchar(255) not null, account_id bigint not null, primary key (id)) engine=InnoDB
create table accounts (id bigint not null, email_address varchar(255), name varchar(100) not null, primary key (id)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
alter table account_settings add constraint FK54uo82jnot7ye32pyc8dcj2eh foreign key (account_id) references accounts (id)

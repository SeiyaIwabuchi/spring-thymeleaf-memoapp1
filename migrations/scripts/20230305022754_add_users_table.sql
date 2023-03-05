-- // add users table
-- Migration SQL that makes the change goes here.
create table users(
	username varchar(50) not null primary key,
	password varchar(500) not null,
	enabled boolean
);


-- //@UNDO
-- SQL to undo the change goes here.



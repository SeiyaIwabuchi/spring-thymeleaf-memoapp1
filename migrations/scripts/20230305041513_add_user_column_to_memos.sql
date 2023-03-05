-- // add user column to memos
-- Migration SQL that makes the change goes here.
alter table memos
add column user varchar(50);


-- //@UNDO
-- SQL to undo the change goes here.



-- // add memos teble
-- Migration SQL that makes the change goes here.
create table memos(
id int auto_increment primary key,
title varchar(255),
body varchar(255)
)


-- //@UNDO
-- SQL to undo the change goes here.



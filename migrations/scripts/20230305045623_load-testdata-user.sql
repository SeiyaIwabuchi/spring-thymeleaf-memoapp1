-- // load-testdata
-- Migration SQL that makes the change goes here.
--
-- テーブルのデータのダンプ `users`
--

INSERT INTO `users` (`username`, `password`) VALUES
('fuga', '$2a$04$J9d/pRVBw4pQQ/8zV4uQD.mbs63YdmOtiNnl.kPpWS6gq9mV2wYoC'),
('hoge', '$2a$04$J9d/pRVBw4pQQ/8zV4uQD.mbs63YdmOtiNnl.kPpWS6gq9mV2wYoC');

-- //@UNDO
-- SQL to undo the change goes here.



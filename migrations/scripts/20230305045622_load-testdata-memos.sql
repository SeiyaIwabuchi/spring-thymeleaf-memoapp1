-- // load-testdata
-- Migration SQL that makes the change goes here.
--
-- テーブルのデータのダンプ `memos`
--
INSERT INTO `memos` (`title`, `body`, `user`) VALUES
('買うもの', '・カレールう\r\n・玉ねぎ\r\n・鶏もも肉\r\n・じゃがいも\r\n・人参\r\n・チョコレート', 'hoge'),
('予定', '成田君の家でカレーパーティ：3/5 19:00～', 'hoge'),
('あ', 'あ', 'hoge'),
('い', 'い', 'hoge'),
('う', 'う', 'fuga'),
('え', 'え', 'fuga'),
('お', 'お', 'fuga'),
('成田君転職先', '・ZOZO\r\n・東京', 'fuga'),
('あああ', 'ああああ', 'fuga');

-- //@UNDO
-- SQL to undo the change goes here.



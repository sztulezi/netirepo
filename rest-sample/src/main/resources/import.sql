-- ugy tunik a schema.sql sehogy sem akar megfutni, hat ide tettem a kezi megoldast
drop table book if exists;
create table book (id bigint primary key not null, isbn varchar(255), title varchar(255), kamu varchar(100) default 'K' not null);

-- load some data
insert into book (id, title, isbn) values(10001, 'Spring in Action', '123456789321');
insert into book (id, title, isbn) values(10002, 'Clean Code', '987654321789');

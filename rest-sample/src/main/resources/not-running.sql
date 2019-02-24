drop table book if exists;
drop sequence if exists hibernate_sequence;

create sequence hibernate_sequence start with 1 increment by 1;

create table book (
	id bigint primary key not null,
	isbn varchar(255),
	title varchar(255),
	kamu varchar(100) DEFAULT 'K'
);
--ALTER TABLE book ALTER COLUMN kamu SET DEFAULT 'K';

--Start with dropping the database and the user
drop database firstapidb;
drop user firstapi;

--Create the user
create user firstapi with password 'password';

--Create the database
create database firstapidb with template=template0 owner=firstapi;
--Establish the connection and access
\connect firstapidb;
alter default privileges grant all on tables to firstapi;
alter default privileges grant all on sequences to firstapi;

--Create Table
-- public.customer definition

-- Drop table

-- DROP TABLE public.customer;

CREATE TABLE public.customer (
	id varchar NOT NULL,
	firstname varchar NULL,
	lastname varchar NULL,
	address1 varchar NULL,
	address2 varchar NULL,
	city varchar NULL,
	state varchar NULL,
	zip varchar NULL,
	country varchar NULL
);



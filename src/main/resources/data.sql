create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON  
 (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10001, 'Antonella', 'Detroit', sysdate());

INSERT INTO PERSON  
 (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10002, 'test2', 'Detroit', sysdate());

INSERT INTO PERSON  
 (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10003, 'test3', 'Detroit', sysdate());

INSERT INTO PERSON  
 (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10004, 'test4', 'Detroit', sysdate());

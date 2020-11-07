create database 28oct;

use 28oct;

create table Employeee(
id int PRIMARY KEY,
firstname varchar(20),
lastname varchar(20),
dob date,
gender char(1)
);

select * from Employeee;
truncate table Employeee;

insert into Employeee(id,firstname,lastname,dob,gender) values(1,'Seshu','mani','2020-06-01','f');


use tabledb;

drop table if exists usertbl,buytbl;

create table usertbl(
userid char(8) not null primary key,
name varchar(10) not null,
birthyear int not null
);

create table buytbl(
num int not null auto_increment primary key,
userid char(8) not null,
prodname char(6) not null);

alter table buytbl
add constraint fk_usertbl_buytbl
foreign key(userid)
references usertbl(userid);

alter table usertbl
add column email
char(30)
not null unique;

alter table usertbl
drop column email;

alter table usertbl
add column mobile
char(3) not null;

alter table usertbl
add constraint check(birthyear >= 1900 and birthyear <=2023);

drop table if exists buytbl;
drop table if exists usertbl;

create table usertbl(
userid char(8) not null primary key,
name varchar(10) not null,
birthyear int not null default -1,
addr char(2) not null default '서울',
mobile1 char(3) null,
mobile2 char(8) null,
height smallint null,
mdate datetime null
);

insert into usertbl Values('JSW' , '정선웅', default, default,'011','1234567',default,'2025-05-22');
insert into usertbl (userid,name) values ('kay','김아영');
insert into usertbl values('wb','원빈',1986,'대전','010','12345678',76,'2025.05.22');
select * from usertbl;

alter table usertbl
drop column mobile1;

alter table usertbl
change name uname varchar(10);

show columns from usertbl;

alter table usertbl
drop primary key;

show columns from usertbl;

use employees;

select * from current_dept_emp;

create or replace view employees_info as 
select e.*, t.title,t.from_date t_from, t.to_date t_to,
s.salary,s.from_date s_from, s.to_date s_to
from employees e inner join titles t on e.emp_no = t.emp_no
inner join salaries s on e.emp_no = s.emp_no;

select * from employees_info where s_to = '9999-01-01' ;

create or replace view emp_dept_info AS
select  de.emp_no emp_no,d.*,de.from_date from_date, de.to_date to_date
from departments d inner join dept_emp de on de.dept_no = d. dept_no;

select * from emp_dept_info;

select * from emp_dept_info where to_date = '9999-01-01';


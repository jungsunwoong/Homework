use sqldb;

create table tbl1 (
a int primary key,
b int,
c int
); -- primary 인덱스 목록 자동생성 확인

show index from tbl1;

create table tbl2 (
a int primary key,
b int unique,
c int unique,
d int
); -- primary b c 인덱스 목록 자동생성 확인
show index from tbl2;

create table tbl3 (
a int unique,
b int unique,
c int unique,
d int
); -- a b c 인덱스 목록 자동생성 확인
show index from tbl3;

create table tbl4 (
a int unique not null,
b int unique,
c int unique,
d int
); -- a b c 인덱스 목록 자동생성 확인
show index from tbl4;

create table tbl5 (
a int unique not null,
b int unique,
c int unique,
d int primary key
); -- primary a b c 인덱스 목록 자동생성 확인
show index from tbl5;

CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;
DROP TABLE IF EXISTS usertbl;
CREATE TABLE usertbl(
userID CHAR(8) NOT NULL PRIMARY KEY,
name VARCHAR(10) NOT NULL,
birthYear INT NOT NULL,
addr NCHAR(2) NOT NULL
);

INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남');
INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기');
INSERT INTO usertbl VALUES('S나', '성시경', 1979, '서울');
SELECT * FROM usertbl;

ALTER TABLE usertbl DROP PRIMARY KEY;
ALTER TABLE usertbl
ADD CONSTRAINT pk_name PRIMARY KEY(name);
SELECT * FROM usertbl;

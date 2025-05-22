-- sqldb 데이터베이스에서 다음 조건을 처리하세요.
use sqldb;
select * from buytbl;
select * from usertbl;
select * from buytbl b inner join usertbl u on b.userid = u.userid;

-- 앞의 결과에서 userID가 'JYP'인 데이터만 출력하세요.
select * from buytbl b inner join usertbl u on b.userid = u.userid where b.userid = 'jyp';

-- sqldb 데이터베이스에서 다음 조건을 처리하세요.
-- 각 사용자별로 구매 이력을 출력하세요.
select * from buytbl;
-- 연결 컬럼은 userID로 함
select * from buytbl b inner join usertbl u on b.userid = u.userid; 
-- 결과를 userID를 기준으로 오름차순으로 정렬함
-- 구매이력이 없는 사용자도 출력하세요.
-- userID, name, prodName, addr, 연락처를 다음과 같이 출력함
select u.userid,u.name,b.prodname,u.addr,concat(mobile1,mobile2) as 연락처 from usertbl u left join buytbl b on u.userid = b.userid order by u.userid; 

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력하세요.
select * from usertbl;
select name, concat(mobile1,mobile2) from usertbl where mobile1 is not null;

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람만 출력하세요.
select name, concat(mobile1,mobile2) from usertbl where mobile1 is null;

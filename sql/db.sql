-- member 테이블 생성
drop table if exists member CASCADE;
create table member
(
 id bigint generated by default as identity,
 name varchar(225),
 primary key(id)
);

-- member 테이블 데이터 삽입
insert into member(name) values('test0001');

-- member 테이블 데이터 확인
select * from member;
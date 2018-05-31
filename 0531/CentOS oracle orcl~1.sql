CREATE TABLE Member
(
userid    VARCHAR2(14),
name    VARCHAR2(20) NOT NULL,
gender    VARCHAR2(10) NOT NULL,
city    VARCHAR2(20),
constraint member_userid_pk PRIMARY KEY(userid),
constraint member_gender_ck CHECK(gender in ('남성','여성'))
);
drop table Member;
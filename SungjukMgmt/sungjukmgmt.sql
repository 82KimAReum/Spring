#sqlplus /nolog
>startup
#lsnrctl start
-----------------
alter session set "_oracle_script"=true;
--
create user sungjukmgmt
identified by sungjukmgmt
default tablespace users
temporary tablespace temp;
--
alter user sungjukmgmt default tablespace users
quota unlimited on users;
--
grant resource,connect to sungjukmgmt;
--


create table  Student
(
    hakbun char(4),
    irum varchar(20) not null,
    kor number(3) not null,
    eng  number(3) not null,
    mat  number(3) not null,
    edp  number(3) not null,
    sum  number(3),
    avg number(5,2),
    grade char(1),
    constraint student_hakbun_pk primary key (hakbun),
    constraint student_grade_ck check (grade in ('A','B','C','D','F'))
);

drop table Student;
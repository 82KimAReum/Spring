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

--------------
CREATE OR REPLACE PROCEDURE  sp_students
(
    v_students    OUT   SYS_REFCURSOR
)
AS
BEGIN
    OPEN v_students FOR
    SELECT hakbun, irum, kor, eng, mat, edp, sum, avg, grade
    FROM Student
    ORDER BY sum DESC;
END;
/


CREATE OR REPLACE PROCEDURE sp_student_select_one
(
    v_hakbun      IN    Student.hakbun%TYPE,
    v_student     OUT   SYS_REFCURSOR
)
AS
BEGIN
    OPEN v_student FOR
    SELECT hakbun, irum, kor, eng, mat, edp, sum, avg, grade
    FROM Student
    WHERE hakbun = v_hakbun;
END;
/

CREATE OR REPLACE PROCEDURE  sp_student_insert
(
    v_hakbun    IN      Student.hakbun%TYPE,
    v_irum    IN      Student.irum%TYPE,
    v_kor    IN      Student.kor%TYPE,
    v_eng    IN      Student.eng%TYPE,
    v_mat    IN      Student.mat%TYPE,
    v_edp    IN      Student.edp%TYPE,
    v_sum    IN      Student.sum%TYPE,
    v_avg    IN      Student.avg%TYPE,
    v_grade    IN      Student.grade%TYPE
)
IS
BEGIN
    INSERT INTO Student(hakbun, irum, kor, eng, mat, edp, sum, avg, grade)
    VALUES(v_hakbun, v_irum, v_kor, v_eng, v_mat, v_edp, v_sum, v_avg, v_grade);
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE sp_student_update
(
    v_kor      IN    Student.kor%TYPE,
    v_eng      IN    Student.eng%TYPE,
    v_mat      IN    Student.mat%TYPE,
    v_edp      IN    Student.edp%TYPE,
    v_sum      IN    Student.sum%TYPE,
    v_avg      IN    Student.avg%TYPE,
    v_grade      IN    Student.grade%TYPE,
    v_hakbun      IN    Student.hakbun%TYPE
)
IS
BEGIN
    UPDATE Student SET kor = v_kor, eng = v_eng, mat = v_mat, edp = v_edp,
    sum = v_sum, avg = v_avg, grade = v_grade
    WHERE hakbun = v_hakbun;
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE  sp_student_delete
(
    v_hakbun    IN     Student.hakbun%TYPE
)
IS
BEGIN
    DELETE FROM Student
    WHERE hakbun = v_hakbun;
    COMMIT;
END;
/



alter session set "_ORACLE_SCRIPT"=true;

create user chimi_bbs
identified by 1234
default tablespace users
temporary tablespace temp;

alter user chimi_bbs default tablespace users
quota unlimited on users;

grant resource,connect to chimi_bbs;

create sequence seq_board_idx
maxvalue 9999;

create table Board
(
    idx number(4),
    name VARCHAR2(20) NOT NULL  ,
    email varchar2(100) ,
    title varchar2(100) not null,
    contents varchar2(2000) not null,
    writedate date default sysdate,
    readnum number(4) default 0,
    grp number(4) not null,
    lev number(2) default 0,
    step number(2) default 0,
    constraint board_idx_pk primary key(idx)
);

create or replace procedure sp_board_insert
(
    v_name in board.name%type  ,
    v_email in board.email%type  ,
    v_title in board.title%type  ,
    v_contents in board.contents%type  
)
is
begin 
    insert into Board(idx,name,email,title,contents,grp)
    values(seq_board_idx.nextval,v_name,v_email,v_title,v_contents,seq_board_idx.currval);
    commit;
end;
/
create or replace procedure sp_board_select
(
 v_bbs out sys_refcursor
)
as
begin
    open v_bbs for
    select idx,grp,name,email,title,writedate,readnum,lev,step
    from board order by grp desc, step asc;
end;
/
select * from board;



create or replace procedure sp_board_select_byidx
(
v_idx in board.idx%type, 
v_record out sys_refcursor
)
as
begin
    open v_record for 
     select idx,grp,name,email,title,writedate,contents,readnum,lev,step
    from board where idx= v_idx;
    
    update board set readnum= readnum+1
    where idx= v_idx;
    commit;
end;
/

truncate table Board;

create or replace procedure sp_board_delete
(
v_idx in board.idx%type
)
is
begin
delete from board
where idx=v_idx;
commit;
end;
/



create or replace procedure sp_board_update
(
v_title in board.title%type,
v_contents in board.contents%type,
v_idx in board.idx%type
)
is
begin
    update board set title=v_title,contents=v_contents
    where idx=v_idx;
    commit;
end;
/
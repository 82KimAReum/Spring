create sequence seq_board_bbs_idx
maxvalue 9999;

create table Board_bbs
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
    constraint board_bbs_idx_pk primary key(idx)
);

create or replace procedure sp_board_bbs_insert
(
    v_name in board_bbs.name%type  ,
    v_email in board_bbs.email%type  ,
    v_title in board_bbs.title%type  ,
    v_contents in board_bbs.contents%type  
)
is
begin 
    insert into Board_bbs(idx,name,email,title,contents,grp)
    values(seq_board_bbs_idx.nextval,v_name,v_email,v_title,v_contents,seq_board_bbs_idx.currval);
    commit;
end;
/
create or replace procedure sp_board_bbs_select
(
 v_bbs out sys_refcursor
)
as
begin
    open v_bbs for
    select idx,grp,name,title,writedate,readnum,lev,step
    from board_bbs order by grp desc, step asc;
end;
/



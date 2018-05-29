Create table Membership
(
    userid  varchar2(14) ,
    irum    varchar2(20) not null,
    gender  char(1) not null,
    city    varchar2(20),
    CONSTRAINT membership_userid_pk primary key (userid),
    constraint membership_gender_ck check (gender in (1,0))
);
drop table Membership;

insert into Membership values('chimi','วัม๖นฮ',0,'Seoul');
commit;

create or replace procedure sp_membership_insert
(
    v_userid  in membership.userid%type,
    v_irum in membership.irum%type,
    v_gender in membership.gender%type,
    v_city in membership.city%type
)
is 
begin
    insert into membership values (v_userid,v_irum,v_gender,v_city);
    commit;
end;
/

create or replace procedure sp_membership_selectall
(
    v_membership out SYS_REFCURSOR
)
as
begin
    open v_membership for 
    select * 
    from membership;
end;
/


create or replace procedure sp_membership_delete
(
    v_userid in membership.userid%type
)
is
begin
    delete
    from membership
    where userid=v_userid;
    commit;
end;
/

create or replace procedure sp_membership_update
(
    v_userid in membership.userid%type,
    v_irum in  membership.irum%type,
    v_city in  membership.city%type
)
is
begin
    update membership
    set irum=v_irum, city=v_city
    where userid= v_userid;
    commit;
end;
/







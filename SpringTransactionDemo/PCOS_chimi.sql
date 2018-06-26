create table Card
(
consumerId varchar2(20),
amount number(2),
constraint card_cosumerid_pk primary key (consumerId)
);
 create table Ticket
 (
consumerId varchar2(20),
countnum number (2),
constraint ticket_consumerid_pk primary key (consumerId),
CONSTRAINT ticket_consumerid_fk foreign key (consumerId) REFERENCES Card(consumerId),
CONSTRAINT ticket_countnum_ck CHECK(countnum<5)
 );
 
 insert into Card values('aaa',5);
 insert into Ticket values('aaa',5);
 
 TRUNCATE table ticket;
 TRUNCATE table card;
 drop table card;
 drop table ticket;
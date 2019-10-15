use projectdb

create table vendor(
id int PRIMARY KEY,
code varchar(20),
name varchar(20),
type varchar(20),
email varchar(20),
phone varchar(20),
address varchar(20)
)

select * from vendor

drop table vendor
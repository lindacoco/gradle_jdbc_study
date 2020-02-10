select  user(), database ();
use gradle_jdbc;

select  * from title;
select  * from department d ;

select  * from employee e ;


select title_no,title_name from title;
select title_no, title_name from title where title_no=3;
select title_no, title_name from title where title_no=3;

insert title values(6,'낙하산');
delete from title where title_no = 6;

update title set title_name='음' where title_no =6;
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

-- 조민희가 로그인을 하려고할때
-- 비밀번호가 같은지 아닌지 여부  
select emp_no, emp_name,title, manager,salary dept, hire_date
   from employee 
   where emp_no = 1003 and passwd = password('1234567');
   
  select emp_no, emp_name, title, manager, salary, dept, hire_date, pic from employee where emp_no=1003;
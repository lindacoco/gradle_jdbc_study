select  user(), database ();
use gradle_jdbc;

select  * from title;
select  * from department d ;

select  * from employee e;


select title_no,title_name from title;
select title_no, title_name from title where title_no=3;
select title_no, title_name from title where title_no=3;

insert title values(6,'낙하산');
delete from title where title_no = 6;

update title set title_name='음' where title_no =6;

update employee  set passwd = password('1234567') where emp_no =1003;

-- 조민희가 로그인을 하려고할때
-- 비밀번호가 같은지 아닌지 여부  
select emp_no, emp_name,title, manager,salary dept, hire_date
   from employee 
   where emp_no = 1003 and passwd = password('1234567');
   
select emp_no, emp_name, title, manager, salary, dept, passwd, pic ,hire_date from employee where emp_no=1003;
  
insert into employee(emp_no,emp_name,title,manager,salary,dept,passwd,hire_date) values(2020,'장현서',3,1003,5000000,1,'1234567','2020-01-01');
 delete  from employee  where emp_no =2020;
 
insert into employee(emp_no,emp_name,title,manager,salary,dept,passwd,hire_date,pic) values(2020,'장현서',2,1003,2000000,2,password(1111),'2000-01-01',null);

select emp_no,emp_name,manager,salary,dept,hire_date,title from employee where title =1;

select emp_no, emp_name , t.title_name 
from employee e left join title t on e.title = t.title_no 
where dept = 2; 

select e.emp_no, e.emp_name, t.title_name ,t.title_no , m.emp_name, m.emp_no , e.salary, d.dept_name,d.dept_no , e.hire_date 
from employee e join employee m on e.manager = m.emp_no join department d on e.dept =d.dept_no  join title t on e.title  = t.title_no ;


select emp_no, emp_name, title, manager, salary, dept,  hire_date from employee e ;
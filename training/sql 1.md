password of mysql is : nani or root



TO CREATE DATABSE:

=>create database databasename;

create database ideal;



TO VIEW DATABASES:

show databases;



TO USE DATABASES:

=>use databasename;

use ideal;



TO CREATE TABLE:(WE MUST DECLARE AT LEAST ONE COLUMN WITH DATATYPE)

=>create table tablename(colunmname datatype);

create  table students(id int,name varchar(30),dob date);



TO DESCRIBE:

desc students;

or

describe students;



TO INSERT VALUES:

insert into students values(45,"nani","2006-01-16");



TO STORE MULTIPLE VALUE:

insert into students values(3,"mahadev","2023-07-13"),(30,"nagur","1997-01-01");

insert into students values(25,"maha","2004-02-03"),(47,"srinu","1979-01-06");





TO VIEW:

select \* from students;

select id,name from students;





TO ALTER TABLE :(TO ADD COLUMNS)

alter table students add age int;

alter table students add branch varchar(20);



TO ALTET MULTIPLE COLUMNS AT A TIME:

alter table students add marks int,add country varchar(30);



TO REMOVE COLUMN OF TABLE:

alter table students drop marks;



TO REMOVE COLUMNs OF TABLE:

alter table students drop branch, drop country;



//null and 0 are different null means empty, 0 is value



TO UPDATE ALL COLUMN VALUES:

update students set age = 20;





//when we use alter : alter table tablename(syntax)

//when we use update : update tablename set(syntax)



&#x20;update students set age = 10 where id = 3;



select curdate();



select curtime();



select now();



select year(curdate());



select month(curdate());



select day(curdate());



TO FIND AGE FROM DOB IN YEARS:

update students set age=timestampdiff(year,dob,curdate());



WE MAY ALSO GIVE NULL:

insert into students values(25,"maha","2004-02-03",NULL),(47,"srinu","1979-01-06",NULL);



delete from students where age <= 18;



delete from students;

or

truncate from students;

//delete or truncate do the same thing

but if delete take 1 sec truncate delete in 0.1 sec

//data will be remove but table is there





drop table students;

//to remove table



DELETE TABLE

drop database ideal;



TO VIEW TABLES:

show tables;



TO VIEW DATABASES:

show databases;



TO MODIFY TABLE COLUMNNAME:

alter table student rename column id to empno;

//this will work only above MySQL 8th version



TO MODIFY TABLE COLUMNNAME:

alter table students change id user-id int;

alter table students change dob dateOfBirth date;

alter table students change name firstname varchar(30);

//this works for all versions it is mandatary to mention datatype



=>CREATE ONE EMPLOYEES TABLE WITH 10 EMPLOYEES WITH THE REQUIRED COLUMNS ARE EMPID EMPNAME              EMPSALARY DEPARTMENT TIMEOFJOINING EMAIL

=>FIND OUT THE EXPERIENCE BASED ON TIME OF JOINING



TYPES OF OPERATORS:

1.Arithematic	+,-,\*,%,/

2.Relational	>=,<=,==,!=

3.logical       \&\&,||,!

4.Assignment	+=,-+,\*=,%=,/=

5.Bit wise	\&,|,^,\~,<<,>>



FILTERING USING RANGE(BETWEEN or NOT BETWEEN):

//when we are working with numeric both values in the range included

//But when we are working with string first letter is included and second letter is excluded



select \* from employee where salary between 50000 and 100000;



select first\_name from employee where salary not between 50000 and 100000;



select \* from employee where salary between 40000 and 65000;



select \* from employee where salary not between 70000 and 100000;



select  first\_name from employee where first\_name between "a" and "r" ;

//But when we are working with string first letter is included and second letter is excluded



select  first\_name from employee where first\_name not between "a" and "r" ;



LIKE:(LIKE USE PATTERN RECOGNIZATION)

LIKE / WILD CHARACTER

like operations and wild character operations both are same



//in like we use modulo % and underscore

Modulo(%): to fetch data Starting or ending with particular letter

//staring with

select \* from employee where first\_name like "s%";

select \* from employee where first\_name like "A%";

select \* from employee where city like "d%";

//ending with

select city from employee where city like "d%";

select last\_name from employee where last\_name "%l";

select city from employee where city like "%i";

//letter present

select first\_name from employee where first\_name like "%a%";

select city from employee where city like "%r%";



Underscore(\_):

one underscore means one character

find three character name

select first\_name from employee where first\_name like "\_\_\_\_\_";

select city from employee where city like "\_\_\_\_";



//6 letters city ending with i

select city from employee where city like "\_\_\_\_\_i";



//starting with h and 3rd character is d and ending with d

select city from employee where city like "h\_d%d";



select \* from employee where city="vijayawada";

select \* from employee where department="EEE";



IN:(TO FILTER BULK DATA WE USE)

select \* from employee where city in ("chennai","delhi","mumbai","vijayawada");

select \* from employee where department in ("eee","finance","sales");

select department from employee where department in ("AI","hr","sales");

select joining\_year from employee where joining\_year  in (2015,2022);





NOT IN:

DISPLAY DEPARTMENTS EXCEPT AI,hr,sales:

select department from employee where department not in ("AI","hr","sales");

select joining\_year from employee where joining\_year not in (2015,2022);

select joining\_year from employee where joining\_year not in (2015,2022) group by joining\_year;



IS NULL:



select city from employee where city is null;



IS NOT NULL:



select city from employee where city is not null;



DISPLAY THE JOINING YEARS WITH DESC TO ASC ORDER:

select joining\_year from employee order by joining\_year desc;



LIMIT:



TO PRINT FIRST 10 ROWS:(LIMIT ALWAYS START FROM FIRST ROW)

select \* from employee limit 10;



OFFSET:

TO PRINT 16,17,18TH ROWS:(WE HAVE TO SKIP 15 ROWS TO SKIP LIKE THIS WE USE OFFSET)

select \* from employee limit 3 offset 15;



TO PRINT FROM 22 TO 28 ROWS:

select \* from employee limit 7 offset 21;



ORDER BY:

This sort data ascending to descending or desc to asc

if we dont mention any thing it consider as desc to asc



select age from employee order by age asc;



select \* from employee order by age asc;

or

select \* from employee order by age ;



select salary from employee order by salary desc;

&#x20;select \* from employee order by age, salary desc, department desc,emp\_id;



select salary from employee group by salary;



AGGRIGATE FUNCTIONS:

1\. COUNT()

2\. MAX()

3\. MIN()

4\. SUM()

5\. AVG()



GROUP BY:

to remove duplicates from particular column



select department from employee group by department;

//selected column and group by column must be same



select department,age from employee group by department,age;





TO FIND HIGHEST SALARY OF EACH DEPARTMENT:

select department,max(salary) from employee group by department;



TO FIND AVERAGE SALARY OF EACH DEPARTMENT:

select department,avg(salary) from employee group by department;

select department,count(salary) from employee group by department;



select department,max(salary) from employee group by department;

select department,count(salary) from employee group by department;

select department,age,count(salary) from employee group by department,age;

select department,max(salary) from employee group by department having(max(salary))>100000;

//when we are using group by to give condition we must use having not where

select department, max(salary) from employee where max(salary)>100000 group by department;

ERROR 1111 (HY000): Invalid use of group function



DISPLAY EACH DEPARTMENT MINIMUM SALARY WHEN LESSTHAN 50000 IF THIS CONDITION TRUE THEN SALARY ASC TO DESC:

//here we should apply conditions on min(salary) not salary because we have changed column

select department,min(salary) from employee group by department having(min(salary))<50000 order by min(salary) asc;



&#x20;select department,min(salary) from employee group by department;





SUBQUERY:

query inside another query is called subquery or nested-query

//These are 2 types

1\. correlated

2\. non correlated



select max(salary) from employee;



//if we want complete details of emp who has max salary

&#x20;select \* from employee where salary = (select max(salary) from employee);



TO FIND SECOND MAX SALARY:

select max(salary) from employee where salary < (select max(salary) from employee);



TO FIND SECOND MAX SALARY EMP FULL DETAILS:

select \* from employee where salary= (select max(salary) from employee where salary < (select max(salary) from employee));





ALL:



WILL RETURN DATA WHEN ALL ONE CONDITION TRUE



DISPLAY WHO EARN MORE THAN HR SALARIES:

select salary from employee where department ="hr";

+--------+

| salary |

+--------+

|  42000 |

|  50000 |

|  47000 |

|  53000 |

|  48000 |

+--------+

&#x20;select \* from employee where salary >ALL(select salary from employee where department ="hr");

//HERE ALL IN MANDATORY BECAUSE WE NEED TO COMPARE WITH EACH AND EVERYTHING

select \* from employee where salary >(select salary from employee where department ="hr");

ERROR 1242 (21000): Subquery returns more than 1 row



OR

select \* from employee where salary > (select max(salary) from employee where department ="hr");



DISPLAY EMPLOYEEE LIST WHERE SALARIES MORE THAN EEE DEPARTMENT:



select \* from employee where salary > all(select salary from employee where department = "eee");



ANY / SOME:



ANY / SOME  WILL RETURN DATA WHEN ATLEAST ONE CONDITION TRUE



select \* from employee where salary > any(select salary from employee where department = "eee");



JOINS:



displays matching data from table



JOINS ARE 4 TYPES:

INNERJOIN

OUTERJOIN

SELFJOIN

CROSSJOIN



innerjoin or join same



outerjoin types:



1.leftouterjoin ==>display complete leftside table with matching rightside data

2.rightouterjoin==>display complete rightside table with matching

3.fullouterjoin ==>display all data from table



crossjoin:



cartesian product possibility of data



//DISPLAY EMPLOYEE NAME  DEPARTMENT SLARY DEPARTMENT SALARY

select employee.emp\_name;employee.department, employee.salary, departments.dept\_id from employee join departments on employee.e\_id= departments.dept\_id;



display unit\_price,quantity from the related schema

unit\_price->product table

quantity -> order\_item



select product.unit\_price, order\_item.quantity from product join order\_item on order\_item.order\_item\_id = product.product\_id;





DISPLAY THE UNIT\_PRICE, QUANTITY, TRACK\_NUMBER FROM SCHEMA

select product.unit\_price, order\_name.quantity,order\_delivery.tracking\_no from product join order\_item on product.product\_id = order\_item.product\_id join order\_deliver on order\_itemorder\_delivery\_id= order\_delivery.order\_delivery\_id;



select P.unit\_price, order\_item.quantity,OD.tracking\_no from product AS P join order\_item on product.product\_id = order\_item.product\_id join order\_deliver AS OD on order\_item.order\_delivery\_id= OD.order\_delivery\_id;





AS is not mandatary



select P.unit\_price, order\_item.quantity,OD.tracking\_no from product  P join order\_item on product.product\_id = order\_item.product\_id join order\_deliver OD on order\_item.order\_delivery\_id= OD.order\_delivery\_id;



select \* employee as student;



LEFT JOIN



FROM LEFT\_TABLE JOIN RIGHT\_TABLE



select employee.\*,departments.dept\_id from departments left join employee on employee.e\_id = departments.dept\_id;



RIGHT JOIN:



select employee.\*,departments.dept\_id from departments RIGHT join employee on employee.e\_id = departments.dept\_id;





**SET OPERATIONS:**



1\. UNION: ==> display unique values from the table not dublicates



2\. UNION ALL: ==> display all data from the table with duplicates

&#x20;

//in SQL we use select employee.\*,departments.dept\_id from departments full join employee on employee.e\_id = departments.dept\_id;



//but in MYSQL we use set operator for full join by using both leftjoin and rightjoin



select employee.\*,departments.\* from departments left join employee on employee.e\_id = departments.dept\_id UNION select employee.\*,departments.\* from departments right join employee on employee.e\_id = departments.dept\_id;



//if we want duplicates ALSO



select employee.\*,departments.\* from departments left join employee on employee.e\_id = departments.dept\_id UNION ALL select employee.\*,departments.\* from departments right join employee on employee.e\_id = departments.dept\_id;





**CROSS JOIN:**



cratesian product displaying possibilities rows \* columns



select employee.\* , departments.\* from employee CROSS join departments;





W



window functions are 3 types

1. window ranking functions    ==> 1.row\_number() 2.rank() 3.dense\_rank() 4.ntile(n)
2. window analytical functions ==> 1.lead() 	  2.leg()  3.first\_value() 4.last\_value()
3. window aggregate functions  ==> 1.sum() 	  2.avg()  3.max()         4.count()

//by using over class we execute window functions



ROW\_NUMBER() :

ASSIGN UNIQUE VALUES ONLY



select \*, row\_number() over() as uniqueid from employee;

select \*, row\_number() over() as abc from employee;

select \*, row\_number() over(order by salary desc) as ranks from employee;

select emp\_id, salary, city, rank() over(order by salary desc, city desc) from employee;



RANK():

with same values it give same rank

but it skip next ranks in rank()

select emp\_id, salary, city, dense\_rank() over(order by salary desc, city desc) from employee;



DENSE\_RANK():

with same values it give same rank

but it does not skip next ranks in dense\_rank()



selec \*,ntile(3) over(order by salary desc) as rank from employee;

here we give 3 so it divide all rows into 3 ranks



**PARTITION BY:**

IF WE WANT TO GIVE RANKING ACCORDING TO DEPARTMENT

select emp\_id, salary, city, dense\_rank() over(partition by department order by salary desc, city desc) from employee;



DISPLAY UNIQUE RANK FOR EACH ROW BASED ON THE CITIES

select \*,row\_number() over(partition by city order by city) from employee;



LEAD:



BASED ON WHAT EVER COLUMN WE GIVE IT DISPLAY NEXT VALUE For last value it display NULL



select \*, lead(city) over(order by age desc) AS ABC from employee;

select \*, lead(city) over(partition by city order by age desc) AS ABC from employee;



LAG:



BASED ON WHAT EVER COLUMN WE GIVE IT DISPLAY previous VALUE For first value it display NULL



select \*, lag(city) over(order by age desc) AS ABC from employee;

select \*, lag(city) over(partition by city order by age desc) AS ABC from employee;



FIRST\_VALUE:

select \*, first\_value(city) over() as xyz from employee;



LAST\_VALUE:



(ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING)



select \*, LAST\_value(city) over() as xyz from employee;  //but it will not work properly so we must use ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING



select \*,last\_value(department) over(order by salary desc ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) as abc from employee;



select \*, last\_value(age) over(partition by department) as abc from employee;



select \*,sum(salary) over(order by emp\_id desc) As abc from employee;



select \*,sum(salary) over(order by emp\_id desc ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) As abc from employee;



select \*,sum(salary) over(partition by department order by emp\_id desc ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) As abc from employee;



DISPLAY TOP 5 COURSES BASED ON CREDITS:

select \* from courses order by credits desc limit 5;



FIND STUDENTS NOT HAVING GMAIL EMAIL:

&#x20;select \* from students where email not like "%@gmail.com";



FIND INSTRUCTORS ORDERED BY DEPARTMENT THEN FIRST\_NA

select \* from instructors order by department,first\_name;



FIND THE STUDENT LIST WHO BORN BEFORE 2002 01 01

select \* from students where date\_of\_birth > "2002-01-01";


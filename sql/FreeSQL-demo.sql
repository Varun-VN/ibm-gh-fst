select round(avg(sal)) from scott.emp;

select deptno, round(avg(sal)) from scott.emp group by deptno order by deptno;

select * from scott.emp a where sal >= (select round(avg(sal)) from scott.emp b where a.deptno = b.deptno);

select deptno, count(*) from scott.emp group by deptno order by deptno desc;
-- department has max employees
select deptno, count(*) emp_count from scott.emp group by deptno order by emp_count desc FETCH FIRST 1 ROW ONLY;
-- department has max salary expenses
select deptno, sum(sal) salary from scott.emp group by deptno order by salary desc FETCH FIRST 1 ROW ONLY;

select deptno, min(sal), max(sal) from scott.emp group by deptno;

select e1.empno,e1.ename, e2.empno, e2.ename, e3.empno, e3.ename
from scott.emp e1, scott.emp e2, scott.emp e3
where e1.mgr = e2.EMPNO and e2.mgr=e3.EMPNO;

select e1.empno,e1.ename, e2.empno, e2.ename, e3.empno, e3.ename
from scott.emp e1 left join scott.emp e2 on e1.mgr = e2.EMPNO 
left join scott.emp e3 on e2.mgr=e3.EMPNO;

select c.country_name, l.city, d.DEPARTMENT_NAME, e1.EMPLOYEE_ID, e1.first_name, e1.last_name,
e2.first_name mgr_first,e2.last_name mgr_last,e2.MANAGER_ID
from hr.countries c full join hr.REGIONS r on c.REGION_ID = r.REGION_ID
full join hr.locations l on c.COUNTRY_ID = l.country_id
full join hr.departments d on d.location_id = l.location_id
full join hr.employees e1 on e1.department_id = d.department_id
left join hr.employees e2 on e1.MANAGER_ID = e2.EMPLOYEE_ID
order by e1.EMPLOYEE_ID;
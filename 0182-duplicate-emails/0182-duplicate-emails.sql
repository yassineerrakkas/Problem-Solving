-- Write your PostgreSQL query statement below
select distinct x.email
from Person x 
join Person y
on x.email = y.email 
where x.id != y.id

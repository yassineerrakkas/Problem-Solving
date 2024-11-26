-- Write your PostgreSQL query statement below
with count_view as (
    select email, count(*) as count
    from Person 
    group by email
)
select email 
from count_view
where count > 1;
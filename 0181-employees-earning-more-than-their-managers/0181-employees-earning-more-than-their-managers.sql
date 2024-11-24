-- Write your PostgreSQL query statement below
SELECT x.name as Employee
FROM Employee x
LEFT JOIN Employee y
ON x.managerId = y.id
WHERE x.salary > y.salary;

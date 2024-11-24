-- Write your PostgreSQL query statement below
SELECT name Employee
FROM Employee x
WHERE salary > (SELECT salary
                FROM Employee y
                WHERE x.managerId = y.id)

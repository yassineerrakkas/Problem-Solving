CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) 
RETURNS TABLE (Salary INT) 
LANGUAGE plpgsql
AS $$
BEGIN
  RETURN QUERY (
    WITH RankedEmployeeSalaries AS (
        SELECT e1.salary,
               DENSE_RANK() OVER (ORDER BY e1.salary DESC) AS drk_sal
        FROM Employee e1
    )
    SELECT distinct res.salary
    FROM RankedEmployeeSalaries res
    WHERE res.drk_sal = N
  );
END;
$$;

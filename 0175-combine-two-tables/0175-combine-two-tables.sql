SELECT P.firstName, P.lastName, A.city, A.state
FROM Person AS P LEFT JOIN Address AS A USING (personId)
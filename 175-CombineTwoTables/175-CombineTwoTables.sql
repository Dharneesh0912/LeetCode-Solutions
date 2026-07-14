-- Last updated: 7/14/2026, 2:14:22 PM
SELECT p.firstName,
       p.lastName,
       a.city,
       a.state
FROM Person p
LEFT JOIN Address a
ON p.personID = a.personID;
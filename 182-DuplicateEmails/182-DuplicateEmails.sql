-- Last updated: 7/14/2026, 2:14:19 PM
# Write your MySQL query statement below
SELECT email Email FROM Person GROUP BY email HAVING COUNT(*)>1 ;
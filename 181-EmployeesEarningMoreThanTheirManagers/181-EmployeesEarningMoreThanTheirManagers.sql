-- Last updated: 7/24/2026, 1:34:09 PM
# Write your MySQL query statement below
SELECT e.name  AS Employee FROM Employee e JOIN Employee m ON e.managerId=m.id WHERE e.salary>m.salary; 
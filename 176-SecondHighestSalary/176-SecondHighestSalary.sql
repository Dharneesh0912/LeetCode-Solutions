-- Last updated: 8/6/2026, 12:06:44 PM
# Write your MySQL query statement below
SELECT MAX(Salary) as SecondHighestSalary FROM Employee WHERE Salary<(SELECT MAX(Salary) FROM Employee);
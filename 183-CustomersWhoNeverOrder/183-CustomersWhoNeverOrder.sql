-- Last updated: 8/6/2026, 12:06:32 PM
# Write your MySQL query statement below
SELECT name AS Customers FROM Customers c LEFT JOIN Orders o ON c.id=o.customerID WHERE o.customerID IS NULL;  
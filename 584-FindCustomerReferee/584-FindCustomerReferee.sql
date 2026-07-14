-- Last updated: 7/14/2026, 2:12:50 PM
# Write your MySQL query statement below
SELECT c.name FROM Customer c WHERE referee_id!=2 OR c.referee_id IS NULL;
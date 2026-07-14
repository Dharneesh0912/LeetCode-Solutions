-- Last updated: 7/14/2026, 2:12:48 PM
# Write your MySQL query statement below
SELECT w.name,w.population,w.area FROM World w WHERE w.area>=3000000 OR w.population>=25000000;
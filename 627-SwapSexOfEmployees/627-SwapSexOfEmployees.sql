-- Last updated: 7/27/2026, 11:09:56 AM
UPDATE Salary SET sex = CASE WHEN sex = 'm' THEN 'f' WHEN sex = 'f' THEN 'm' END;
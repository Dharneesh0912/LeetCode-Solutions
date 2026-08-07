-- Last updated: 8/7/2026, 11:17:33 AM
SELECT patient_id, patient_name, conditions FROM Patients WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%';
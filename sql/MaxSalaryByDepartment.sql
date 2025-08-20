-- Get the department name and maximum salary per department

/*
You are given two tables:

### Table: `emp` (Employee)
| Column   | Type    |
|----------|---------|
| empid    | int     |
| name     | varchar |
| sal      | int     |
| deptid   | int     |

### Table: `dept` (Department)
| Column   | Type    |
|----------|---------|
| deptid   | int     |
| name     | varchar |

*/

SELECT d.name AS deptname, MAX(e.sal) AS maxsal
FROM emp e
JOIN dept d ON e.deptid = d.deptid
GROUP BY d.name;

/*
You are given one table:

### Table: `marks`
| Column        | Type    |
|---------------|---------|
| student_name  | varchar |
| sub           | varchar |
| mark          | int     |

You need to find the total marks for each student.

### Output:
| name | total |
|------|-------|
| A    | 255   |
| B    | 180   |
*/

SELECT student_name AS name, SUM(mark) AS total
FROM marks
GROUP BY student_name;

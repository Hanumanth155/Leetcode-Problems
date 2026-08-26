# Write your MySQL query statement below
select ei.unique_id ,e.name from EmployeeUNI ei right outer join Employees e on ei.id = e.id ;
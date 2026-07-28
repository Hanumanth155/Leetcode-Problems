# Write your MySQL query statement below
select name as customers
from Customers
left join Orders
on Customers.id=Orders.customerId
where Orders.customerId is null;
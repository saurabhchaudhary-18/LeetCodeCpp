# Write your MySQL query statement below
#Left Outer Join ka Question
select name as Customers from Customers
LEFT JOIN Orders on Customers.id = Orders.customerId
where Orders.customerId is null;
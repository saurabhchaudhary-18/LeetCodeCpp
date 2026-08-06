# Write your MySQL query statement below
select distinct(p2.Email)
from Person p2
inner join Person p1 on p1.email = p2.email and p1.id != p2.id
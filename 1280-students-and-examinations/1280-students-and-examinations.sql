# Write your MySQL query statement below
select s.student_id,
s.student_name,
sub.subject_name,
count(exam.subject_name) as attended_exams
from Students as s
cross join Subjects sub
left join Examinations exam
on s.student_id = exam.student_id
and exam.subject_name = sub.subject_name
group by s.student_id, s.student_name, sub.subject_name
order by s.student_id, s.student_name;
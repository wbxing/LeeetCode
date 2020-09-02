# 176. 第二高的薪水
# Write your MySQL query statement below
SELECT (
           SELECT DISTINCT `salary`
           FROM `Employee`
           ORDER BY `Salary` DESC
           LIMIT 1, 1
       ) AS SecondHighestSalary;

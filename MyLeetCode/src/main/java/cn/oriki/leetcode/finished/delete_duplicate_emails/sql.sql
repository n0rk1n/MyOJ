-- site: <a href="https://leetcode.cn/problems/delete-duplicate-emails/">196. 删除重复的电子邮箱</a>}
-- rating: ⭐️⭐️⭐️
-- tags: 数据库
delete
from Person
where id not in (select id from (select min(id) id from Person group by email) p)

-- 1. 先按照 email 分组并获取分组的每个 email 的最小 id；
--    select min(id) id from Person group by email
-- 2. 因为不支持在查询表中直接做删除操作（You can't specify target table 'Person' for update in FROM clause），对其做嵌套
--    select id from (select min(id) id from Person group by email) p
-- 3. 从 Person 表中删除 id 非最小的数据
--    delete from Person where id not in (select id from (select min(id) id from Person group by email) p)


******Mysql中的锁*****

概念一：表级锁——>  锁整个表，加锁快，不出现死锁，发生锁冲突较高    并发度低
概念二：行级锁——>  锁具体行，加锁慢，会出现死锁，发生锁冲突较低    并发度高
概念三：页面锁——>  开销和加锁时间界于表锁和行锁之间，全部介于表行锁之间


一：表锁
两种模式：
1、表共享读锁
    ：lock table 表名 read
    注意：锁表后不可加别名查询
2、表共享写锁
    ：lock table 表名 write
    注意：



MyISAM的表锁
总结：
    1、读操作，不会阻塞其他用户对<同一表>的读请求；
    2、读操作，不会阻塞当前session对表读，当进行修改时会报错；
    3、一个session给某表读锁，这个session可以查询锁定表的记录，单是更新或访问其他都会报错。


   4、写操作，会阻塞其他用户对同一表的读写操作；
   5、写操作，当前session对本表进行CRUD，其他表报错。

   ****读写互斥，读读相同，写写不存****
二：行锁
两种模式：BEGIN<开启事务>  ROLLBACK<事务回滚> COMMIT<事务提交>
1、共享锁（读锁）
    ：上读锁，允许其他进行读，不允许写，允许上读锁不允许上排它锁。
2、排它锁（写锁）
    ：不允许其他写，但允许读，不允许上锁，包括写锁。

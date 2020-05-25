


Mysql逻辑架构-SQL处理层
** 查询——>缓存内是否拥有（cache）有——>返回结果   无——>解析查询——>优化——>执行查询（优化过的查询语句）
** sql 处理 Mysql逻辑架构   实例(进程)——>database——>schema(此为相等关系在mysql内 database=schema)——>table

-- MySql存储引擎
**# 查询本版本内Mysql所提供的存储什么存储引擎？
答：show engines;
**# 查询Mysql当前默认的存储引擎？
答：show variables like '%storage_engine%'

**# show variables like 'datadir'？展示的是什么？
答：展示的为数据的数据库，存文件夹 跟数据库的名字是一样的

**# 堆表，索引组织表是什么？
答：堆表：将索引和数据分开、索引组织表：将索引和数据放在一起





****存储引擎解析****

1、存储引擎-MyISAM（非聚集索引）
mysql5.5之前的默认存储引擎

组成：myisam存储引擎由MYD和MYI组成
文件：myi(index)和myd(data)组成
支持：支持表压缩，语法：myisampack -b -f /xx/xx/xx/testmysam.myi
缺点：压缩后，数据不可插入（只读）
适用：非事务型应用（数据仓库，报表，日志数据）、只读类应用、空间类应用（空间函数、坐标）

2、存储引擎-Innodb
mysql5.5以及以后版本默认存储引擎

组成：
文件：
支持：
特点：1、系统表空间无法简单的收缩文件
     2、系统表空间可以通过optimize table 收缩系统文件
     3、系统表空间会产生IO瓶颈
     4、独立表空间可以同时向多个文件刷新数据
建议：innodb使用独立表空间



3、存储引擎-CSV
特点：
    1、以CSV的文件格式进行存储
    2、所有列都不能为null
    3、不支持索引（不适合大表，不适合在线处理）
    4、可以对数据文件直接编辑（保存文本文件内容）

4、存储引擎-Archive
组成：以zlib对表数据进行压缩，磁盘I/O更少数据存储在ARZ为后缀文件
特点：
    1、只支持inster和select操作
    2、只允许在自增ID上加索引



5、存储引擎-Ferderated
特点：
    1、提供了访问远程Mysql服务器上表的方法
    2、本地不存储数据，数据全部放到远程服务器上
    3、本地需要保存表结构和远程服务器的连接信息
使用场景:偶尔的统计分析及手工查询（跨库跨表查询）


*** 存储引擎-MyISAM 和 Innodb 的比对 ***

对比项         MyISAM      Innodb

主外键         不支持         支持
事务           不支持        支持
行表锁         表锁          行锁
缓存    只缓存索引不缓存数据   不仅缓存索引还缓存数据
表空间         小            大
关注性能       性能           事务
默认安装       Y             Y










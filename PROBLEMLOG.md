20200519
springboot集成时报:'hibernate.dialect' not set
问题原因:在配置集成pom文件时没有注意数据库连接选项，造成默认JPA连接，
而JPA连接要设置Hibernate SQL方言.
配置参数:spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
常用数据库方言记录:
DB2=org.hibernate.dialect.DB2Dialect
MySQL=org.hibernate.dialect.MySQLDialect
Oracle (any version)=org.hibernate.dialect.OracleDialect
Oracle 9i/10g=org.hibernate.dialect.Oracle9Dialect
解决方案:
更换springBoot-pom文件配置将JPA改为JDBC
vue 打包后要修改index.html中应用CSS文件和JS文件的路径，不然会报404
vue相关安装步骤参考:https://segmentfault.com/a/1190000014211773#comment-area
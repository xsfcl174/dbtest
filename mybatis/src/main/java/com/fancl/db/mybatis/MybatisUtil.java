package com.fancl.db.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.fancl.db.mybatis.dao.UrUsersDao;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;

import javax.sql.DataSource;

public class MybatisUtil {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/user";
    private static final String NAME = "root";
    private static final String PASS = "123456";

    public static DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(URL);
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUsername(NAME);
        dataSource.setPassword(PASS);
        return dataSource;
    }

    public static SqlSessionFactory buildSqlSessionFactory() {
        JdbcTransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("fancl", transactionFactory, getDataSource());
        Configuration configuration = new Configuration();
        configuration.addMappers("com.fancl.db.mybatis");
        configuration.setEnvironment(environment);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        return builder.build(configuration);
    }
}

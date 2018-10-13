package com.fancl.db;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

public class DbUtils {

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

}

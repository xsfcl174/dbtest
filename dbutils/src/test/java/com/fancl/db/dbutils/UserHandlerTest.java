package com.fancl.db.dbutils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.sql.DataSource;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserHandlerTest {

    private static QueryRunner runner;
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

    @BeforeClass
    public static void setup() {
        runner = new QueryRunner(getDataSource());
    }

    @Test
    public void testQuery() {
        String sql = " select\n" +
                "        user0_.USER_ID as userId,\n" +
                "        user0_.USER_ACTIVE as active,\n" +
                "        user0_.USER_ADDRESS as address,\n" +
                "        user0_.USER_AREA as area,\n" +
                "        user0_.USER_BIRTHDAY as birthday,\n" +
                "        user0_.USER_CREATE_DATE as createDate,\n" +
                "        user0_.USER_CREATE_ID as createId,\n" +
                "        user0_.USER_EDUCATION as education,\n" +
                "        user0_.USER_EMAIL as email,\n" +
                "        user0_.USER_IDENT_NO as identNo,\n" +
                "        user0_.USER_IN_DATE as inDate,\n" +
                "        user0_.USER_LOGIN_DATE as loginDate,\n" +
                "        user0_.USER_MOBILE as mobile,\n" +
                "        user0_.USER_NAME as name,\n" +
                "        user0_.USER_NOTE as note,\n" +
                "        user0_.USER_ORG_ID as orgId,\n" +
                "        user0_.USER_ORIGIN as origin,\n" +
                "        user0_.USER_OUT as `out`,\n" +
                "        user0_.USER_OUT_DATE as outDate,\n" +
                "        user0_.USER_LOGIN_PASSWD as password,\n" +
                "        user0_.USER_PHONE as phone,\n" +
                "        user0_.USER_POSTAL as postal,\n" +
                "        user0_.USER_SEX as sex,\n" +
                "        user0_.USER_TITLE as title,\n" +
                "        user0_.USER_UPDATE_DATE as updateDate,\n" +
                "        user0_.USER_UPDATE_ID as updateId,\n" +
                "        user0_.USER_LOGIN_NAME as username,\n" +
                "        user0_.USER_WORK_LIMIT as workLimit,\n" +
                "        user0_.USER_WORK_NO as workNo,\n" +
                "        user0_.USER_WORKED as worked \n" +
                "    from\n" +
                "        user.ur_users user0_ \n" +
                "    where\n" +
                "        user0_.USER_ID=?";
        try {
            User user = runner.query(sql, new UserHandler(), 3);
            assertNotNull(user);
            //good:
            //超级轻量级的api
            //对于指定数据库下sql的查询操作具有较强便利性
            // bad：
            //查询时出现的用户信息中Date是TimeStamp类型的数据，对于修改和删除支持的较少
            //针对某些特殊类型以及用户自定义类型需要实现自己的Handler，或者重新集成实现原有的BeanHandler或者实现自己的ResultSetHandle


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
package com.fancl.db.mybatis;

import com.fancl.db.mybatis.bean.UrUsers;
import com.fancl.db.mybatis.dao.UrUsersDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.*;

import java.util.Date;

import static org.junit.Assert.*;

public class MybatisUtilTest {
    private static SqlSessionFactory sessionFactory;

    @BeforeClass
    public static void setUp() throws Exception {
        sessionFactory = MybatisUtil.buildSqlSessionFactory();
    }
    @Test
    public void testInsert(){
        SqlSession session = sessionFactory.openSession();
        UrUsersDao mapper = session.getMapper(UrUsersDao.class);
        UrUsers user = new UrUsers();
        user.setUserId(998);
        user.setUserName("test998");
        user.setUserLoginName("test998");
        user.setUserLoginDate(new Date());
        user.setUserCreateDate(new Date());
        user.setUserCreateId("123");
        user.setUserUpdateDate(new Date());
        user.setUserUpdateId("123");
        mapper.insert(user);
    }

    @AfterClass
    public static void tearDown() throws Exception {
    }
}
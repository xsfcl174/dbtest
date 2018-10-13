package com.fancl.db.hibernate;

import com.fancl.db.hibernate.entity.User;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class HibernateManagerTest {

    @BeforeClass
    public static void setUp() throws Exception {
        HibernateManager.getInstance();
    }

    @Test
    public void testInsert() {
        Session session = HibernateManager.getInstance().openSession();
        User user = new User();
        user.setName("fancl");
        user.setUsername("fancl2");
        user.setActive(true);
        user.setCreateDate(new Date());
        user.setCreateId("test1");
        user.setUpdateDate(new Date());
        user.setUpdateId("test1");
        try {
            session.beginTransaction();
            session.saveOrUpdate(user);
            session.getTransaction().commit();
            System.out.println("新增的用户ID：" + user.getUserId());
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryAndUpdate() {
        Session session = HibernateManager.getInstance().openSession();
        //直接通过主键获取
        User user = session.get(User.class, 3);
        assertNotNull(user);
        //通过hql获取
        Query query = session.createQuery("from User where userId = ?");
        query.setParameter(0, 3);
        user = (User) query.uniqueResult();
        assertNotNull(user);
        //通过criteria查找
        user = (User) session.createCriteria(User.class).add(Restrictions.eq("userId", 3)).uniqueResult();
        assertNotNull(user);

        user.setUpdateId("test2");
        user.setUpdateDate(new Date());
        try {
            session.beginTransaction();
            session.saveOrUpdate(user);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryBySql() {
        Session session = HibernateManager.getInstance().openSession();
        SQLQuery sqlQuery = session.createSQLQuery("select * from ur_users").addEntity(User.class);
        User user = (User) sqlQuery.setMaxResults(1).uniqueResult();
        assertNotNull(user);
    }

    @Test
    public void testDelete() {
        Session session = HibernateManager.getInstance().openSession();
        User user = new User();
        user.setName("deleteme");
        user.setUsername("deleteme");
        user.setActive(true);
        user.setCreateDate(new Date());
        user.setCreateId("test1");
        user.setUpdateDate(new Date());
        user.setUpdateId("test1");
        try {
            session.beginTransaction();
            session.saveOrUpdate(user);
            session.getTransaction().commit();
            int count = session.createSQLQuery("delete from ur_users where user_id = ?").setParameter(0, user.getUserId()).executeUpdate();
            assertEquals(1, count);
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @AfterClass
    public static void tearDown() throws Exception {
        HibernateManager.getInstance().destory();
    }
}
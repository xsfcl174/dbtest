package com.fancl.db.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {
    private SessionFactory sessionFactory;
    private static HibernateManager instance;
    private static Object lock = new Object();

    public static HibernateManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                //防止重入
                if (instance == null)
                    instance = new HibernateManager();
            }
        }
        return instance;
    }

    private HibernateManager() {
        createSessionFactory();
    }

    private void createSessionFactory() {
        if (sessionFactory != null)
            return;
        Configuration hibernateConfig = createHibernateConfig();
        sessionFactory = hibernateConfig.buildSessionFactory();
    }

    public Session openSession() {
        if (sessionFactory == null)
            createSessionFactory();
        return sessionFactory.openSession();
    }


    public void destory() {
        if (sessionFactory != null)
            synchronized (lock) {
                //防止重入
                if (sessionFactory != null) {
                    sessionFactory.close();
                    sessionFactory = null;
                }
            }
    }

    private Configuration createHibernateConfig() {
        Configuration config = new Configuration().configure();
        return config;
    }


}

package com.fancl.db.dbutils;

import org.apache.commons.dbutils.handlers.BeanHandler;


public class UserHandler extends BeanHandler<User> {

    public UserHandler() {
        super(User.class);
    }
}

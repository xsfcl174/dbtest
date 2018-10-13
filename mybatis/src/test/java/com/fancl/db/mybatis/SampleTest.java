package com.fancl.db.mybatis;

import com.fancl.db.mybatis.plus.user.entity.UrUsers;
import com.fancl.db.mybatis.plus.user.mapper.UrUsersMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class SampleTest {

    @Autowired
    private UrUsersMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UrUsers> urUsers = userMapper.selectList(null);
        System.out.println("find user count:" + urUsers.size());
    }

}
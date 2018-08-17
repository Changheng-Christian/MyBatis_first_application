package com.hand.spring;

import com.hand.mapper.UserMapper;
import com.hand.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringMyBatisTest {
    @Test
    public void test01() {
        //初始化容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicaitonContext.xml");
        //获得bean
        UserMapper userMapper= (UserMapper) ctx.getBean("SQLTableMapper");
        //访问数据库
        List<User> userList=userMapper.getAll();
        for (User user:userList
             ) {
            System.out.println(user.getUserName());

        }
    }
}

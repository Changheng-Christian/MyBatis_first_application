package com.hand.user;

import com.hand.mapper.UserMapper;
import com.hand.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMethodTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserMapper userMapper = (UserMapper) applicationContext.getBean("userBean");



}

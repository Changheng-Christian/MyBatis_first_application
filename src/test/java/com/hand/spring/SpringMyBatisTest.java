package com.hand.spring;

import com.hand.mapper.UserMapper;
import com.hand.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class SpringMyBatisTest {
    @Test
    public void test() {
        //初始化容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获得bean
        UserMapper userMapper= (UserMapper) ctx.getBean("userMapper");
        //访问数据库

/*        List<User> userList=userMapper.getAll();
        for (User user:userList
             ) {
            System.out.println(user.getUserName());

        }*/
/*        User user = (User) ctx.getBean("user");
        int id = 1;
        String name = "Jack";
        String address = "Shanghai";
        int age = 22;

        user.setId(id);
        user.setUserName(name);
        user.setUserAge(age);
        user.setUserAddress(address);

        userMapper.updateUser(user);*/

        //userMapper.deleteUser(8);

        int id = 20;
        String name = "Jack";
        String address = "Shanghai";
        int age = 22;
        int id2 = 21;
        String name2 = "Rose";
        String address2 = "Chengdu";
        int age2 = 23;
        int id3 = 21;
        String name3 = "Candy";
        String address3 = "Guangzhou";
        int age3 = 19;

        User user1 = (User) ctx.getBean("user");
        user1.setId(id);
        user1.setUserName(name);
        user1.setUserAge(age);
        user1.setUserAddress(address);

        User user2 = (User) ctx.getBean("user");
        user2.setId(id2);
        user2.setUserName(name2);
        user2.setUserAge(age2);
        user2.setUserAddress(address2);

        User user3 = (User) ctx.getBean("user");
        user3.setId(id3);
        user3.setUserName(name3);
        user3.setUserAge(age3);
        user3.setUserAddress(address3);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        userMapper.insertUserList(userList);



    }
}

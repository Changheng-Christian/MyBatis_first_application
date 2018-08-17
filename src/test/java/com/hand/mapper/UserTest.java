package com.hand.mapper;

import com.hand.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UserTest {


    public static void main(String[] args) {
        //MyBatis配置文件
        String resource="mybatisConfiguration.xml";
        //得到配置文件流
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            //创建会话工厂，传入MyBatis的配置文件信息
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            //通过工厂得到SqlSession
            SqlSession sqlSession=sqlSessionFactory.openSession();

            UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
            User user = userMapper.findUserById(1);
            if (user!=null){
                System.out.println(user.getUserName());
            }else {
                System.out.println("查询失败，找不到ID为 "+user.getId()+" 的数据。");
            }
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
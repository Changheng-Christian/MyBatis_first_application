package com.hand.mapper;

import com.hand.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public User findUserById(int id);
    public void insertUser(User user);
    public List<User> getAll();
    public void updateUser(@Param("user") User user);
    public void insertUserList(List<User> userList);
    public void deleteUser(int id);

}

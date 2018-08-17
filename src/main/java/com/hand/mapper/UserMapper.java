package com.hand.mapper;

import com.hand.model.User;

import java.util.List;

public interface UserMapper {
    public User findUserById(int id);
    public void insertUser(User user);
    public List<User> getAll();

}

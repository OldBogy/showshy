package com.showshy.services.impl;

import com.showshy.mapper.UserMapper;
import com.showshy.models.User;
import com.showshy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-03-28.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getUserList() {
        List<User> list = userMapper.getUserList();
        return list;
    }

    public User getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    public void updateUserEmailById(String userId, String sex) {
        userMapper.updateUserEmailById(userId, sex);
    }

    public void deleteUserById(String userId) {
        userMapper.deleteUserById(userId);
    }

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}

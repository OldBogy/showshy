package com.showshy.services;

import com.showshy.models.User;

import java.util.List;

/**
 * Created by Administrator on 2017-03-28.
 */
public interface UserService {
    List<User> getUserList();

    User getUserById(String userId);

    void updateUserEmailById(String userId, String sex);

    void deleteUserById(String userId);

    void insertUser(User user);
}

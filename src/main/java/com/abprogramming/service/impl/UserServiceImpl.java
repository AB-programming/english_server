package com.abprogramming.service.impl;

import com.abprogramming.mapper.UserMapper;
import com.abprogramming.model.User;
import com.abprogramming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public Integer updateUserById(User user) {
        return userMapper.updateById(user);
    }
}

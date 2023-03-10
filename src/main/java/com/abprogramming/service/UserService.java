package com.abprogramming.service;

import com.abprogramming.model.Login;
import com.abprogramming.model.User;

public interface UserService {
    User selectUserById(String id);

    Integer updateUserById(User user);
}

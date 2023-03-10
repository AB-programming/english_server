package com.abprogramming.service.impl;

import com.abprogramming.mapper.LoginMapper;
import com.abprogramming.mapper.UserMapper;
import com.abprogramming.model.Login;
import com.abprogramming.model.User;
import com.abprogramming.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    Environment environment;
    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public Integer createLogin(Login login) {
        int loginResult = loginMapper.insert(login);
        if (loginResult == 1) {
            User user = new User();
            user.setId(login.getLid());
            try {
                user.setImage("http://" + InetAddress.getLocalHost().getHostAddress() +
                        ":" + environment.getProperty("local.server.port") +
                        "/static/images/" + user.getId() + ".jpg");
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
            userMapper.insert(user);
            return loginResult;
        }
        return 0;
    }

    @Override
    public Login selectLoginByUsernameAndPassword(Login login) {
        Login result = loginMapper.selectById(login.getUsername());
        if (result != null) {
            return result.getPassword().equals(login.getPassword()) ? result : null;
        }
        return null;
    }
}

package com.abprogramming.controller;

import com.abprogramming.model.Login;
import com.abprogramming.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/selectLoginByUsernameAndPassword")
    public Login selectLoginByUsernameAndPassword(Login login){;
        return loginService.selectLoginByUsernameAndPassword(login);
    }

    @PostMapping("/createLogin")
    public Integer createLogin(Login login){
        return loginService.createLogin(login);
    }

}

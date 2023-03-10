package com.abprogramming.service;

import com.abprogramming.model.Login;

public interface LoginService {
    Login selectLoginByUsernameAndPassword(Login login);

    Integer createLogin(Login login);

}

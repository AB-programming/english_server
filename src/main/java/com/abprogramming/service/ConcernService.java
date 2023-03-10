package com.abprogramming.service;

import com.abprogramming.model.Concern;
import com.abprogramming.model.User;

import java.util.List;

public interface ConcernService {

    List<User> selectTargetByFan(String fan);

}

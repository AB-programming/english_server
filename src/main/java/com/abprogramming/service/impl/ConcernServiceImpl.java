package com.abprogramming.service.impl;

import com.abprogramming.mapper.ConcernMapper;
import com.abprogramming.mapper.UserMapper;
import com.abprogramming.model.Concern;
import com.abprogramming.model.User;
import com.abprogramming.service.ConcernService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConcernServiceImpl implements ConcernService {

    @Autowired
    private ConcernMapper concernMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectTargetByFan(String fan) {
        List<User> users = new ArrayList<>();
        concernMapper.selectList(new QueryWrapper<Concern>().eq("fan", fan))
                .forEach(concern -> users.add(userMapper.selectById(concern.getTarget())));
        return users;
    }
}

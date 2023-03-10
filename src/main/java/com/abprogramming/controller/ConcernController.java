package com.abprogramming.controller;

import com.abprogramming.model.User;
import com.abprogramming.service.ConcernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/concern")
public class ConcernController {

    @Autowired
    private ConcernService concernService;

    @PostMapping("/selectTargetByFan")
    public List<User> selectTargetByFan(String fan) {
        return concernService.selectTargetByFan(fan);
    }
}

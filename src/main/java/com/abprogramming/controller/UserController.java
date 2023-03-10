package com.abprogramming.controller;

import com.abprogramming.model.User;
import com.abprogramming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/selectUserById")
    public User selectUserById(String id){
        return userService.selectUserById(id);
    }

    @PostMapping("/updateUserById")
    public Integer updateUserById(User user){
        return userService.updateUserById(user);
    }

    @PostMapping("/uploadPic")
    public Integer uploadPic(MultipartFile img, String id) {
        if (!img.isEmpty()) {
            try {
                img.transferTo(new File("/Users/wfb/Desktop/images/" + id + ".jpg"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return 1;
    }
}

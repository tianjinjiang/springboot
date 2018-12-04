package com.springboot.controller;

import com.springboot.domain.User;
import com.springboot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Helloworld Controller
 *
 * @author kimtian
 **/
@RestController
public class UserController {
    @RequestMapping("/getUsers")
    public User getUsers() {
        User user = new User();
        user.setName("kimtian");
        user.setAge(18);
        return user;
    }

    @Resource
    private UserService userService;

    @GetMapping("/users")
    public List<User> users () {
        return userService.getUser();
    }
}


package com.springboot.controller;

import com.springboot.domain.User;
import com.springboot.service.UserService;
import com.springboot.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @Resource
    private UserService userService;

    @RequestMapping("/getUsers")
    public User getUsers() {
        User user = new User();
        user.setName("kimtian");
        user.setAge(18);
        return user;
    }

    @GetMapping("/getUserById")
    public User getUserById() {
        Long id = 2L;
        return userService.getOne(id);
    }

    @PostMapping("/addUser")
    public int addUser() {
        User user = new User();
        user.setName("田江江");
        user.setAge(17);
        return userService.addUser(user);
    }

    @PostMapping("/updateUser")
    public int updateUser() {
        User user = new User();
        user.setName("田美女");
        user.setAge(16);
        return userService.updateUser(user);
    }

    @PostMapping("/deleteUser")
    public List<User> deleteUser() {
        Long id = 4L;
        userService.deleteUser(id);
        return userService.getUser();
    }

    @GetMapping("/users")
    public List<User> users() {
        return userService.getUser();
    }


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        List<User> userList = userService.getUser();
        for (User user : userList) {
            System.out.println(user.getId() + "," + user.getName() + "," + user.getAge());
        }
        System.out.println(userList.size());
    }


}


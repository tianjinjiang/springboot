package com.springboot.User;

import com.springboot.domain.User;
import com.springboot.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 这是用户逻辑测试类
 *
 * @author kimtian
 **/
@Component
public class UserTest {
    @Resource
    UserServiceImpl userService;

    @Test
    public void testGetUser() {
        List<User> userList = userService.getUser();
        for (User user : userList) {
            System.out.println(user.getId() + "," + user.getName() + "," + user.getAge());
        }
        Assert.assertNotNull(userList);
    }
}

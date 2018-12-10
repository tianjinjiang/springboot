package com.springboot.service.impl;

import com.springboot.domain.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务实现类
 *
 * @author kimtian
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        List<User> userList = userMapper.getAll();
        System.out.println(userList.size());
        return userMapper.getAll();
    }

    @Override
    public User getOne(Long id) {
        return userMapper.getOne(id);
    }

    @Override
    public int addUser(User user) {
        userMapper.insert(user);
        User user1 = userMapper.getOne(user.getId());
        System.out.println(user1.getId() + user1.getName() + "!!!!");
        if (userMapper.getOne(user.getId()) != null) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int updateUser(User user) {
        userMapper.update(user);
        if (userMapper.getOne(user.getId()) != null) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.delete(id);
    }


}

package com.springboot.service.impl;

import com.springboot.domain.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务实现类
 *
 * @author kimtian
 **/
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getAll();
    }
}

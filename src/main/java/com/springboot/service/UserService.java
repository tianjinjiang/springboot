package com.springboot.service;

import com.springboot.domain.User;

import java.util.List;

/**
 * 用户服务类
 *
 * @author kimtian
 **/
public interface UserService {
    /**
     * 获取全部用户
     *
     * @return List<User>用户列表
     **/
    public List<User> getUser();
}


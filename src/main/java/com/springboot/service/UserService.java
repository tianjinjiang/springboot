package com.springboot.service;

import com.springboot.domain.User;

import java.util.List;

/**
 * 用户服务类
 *
 * @author kimtian
 **/
public interface UserService {
    public List<User> getUser();
}


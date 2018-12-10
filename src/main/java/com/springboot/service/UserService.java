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
    List<User> getUser();

    /**
     * 获取指定用户
     *
     * @param id 用户id
     * @return User 用户
     **/
    User getOne(Long id);

    /**
     * 增加指定用户
     *
     * @param user 用户
     * @return int
     **/
    int addUser(User user);

    /**
     * 更新指定用户
     *
     * @param user 用户
     * @return int
     **/
    int updateUser(User user);

    /**
     * 删除指定用户
     *
     * @param id 用户id
     **/
    void deleteUser(Long id);
}


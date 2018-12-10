package com.springboot.domain;

import java.io.Serializable;

/**
 * 用户类
 *
 * @author kimtian
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户编号
     **/
    private Long id;
    /**
     * 用户姓名
     **/
    private String name;
    /**
     * 用户年龄
     **/
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

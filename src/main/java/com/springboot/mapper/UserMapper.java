package com.springboot.mapper;

import com.springboot.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * UserMapper
 *
 * @author kimtian
 **/
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    /**
     * 获取全部用户
     * @return List<User>用户列表
     **/
    List<User> getAll();

    @Select("SELECT * FROM USER WHERE id = #{id}")
    /**
     * 根据id获取用户
     * @param id 用户id
     * @return User 用户
     **/
    User getOne(Long id);

    /**
     * 增加用户
     *
     * @param user 用户
     **/
    @Insert("INSERT INTO USER(name,age) VALUES(${name},${age})")
    void insert(User user);

    /**
     * 更新用户
     *
     * @param user 用户
     **/
    @Update("UPDATE USER SET name=#{name},age=#{age} WHERE id =#{id}")
    void update(User user);

    /**
     * 删除用户
     *
     * @param id 用户Id
     **/
    @Delete("DELETE FROM USER WHERE id =#{id}")
    void delete(Long id);

}

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

//    @Select("SELECT * FROM USER WHERE id = #{id}")
//    @Results({
//            @Result(property = "id",  column = "id"),
//            @Result(property = "name", column = "name")
//    })
//    User getOne(Long id);
//
//    @Insert("INSERT INTO USER(userName) VALUES(${userName})")
//    void insert(User user);
//
//    @Update("UPDATE USER SET userName=${userName} WHERE id =#{id}")
//    void update(User user);
//
//    @Delete("DELETE FROM USER WHERE id =#{id}")
//    void delete(Long id);

}

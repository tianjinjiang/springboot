package com.springboot.mapper;

import com.springboot.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER")
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

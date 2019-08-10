package com.example.demo.dao;

import com.example.demo.entity.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    // 1. 实现查询所有用户
    @Select("select * from user")
    public List<User> getAllUser();
    // 2. 根据用户id查询用户
    @Select("select * from user where user.id=#{userId}")
    public User getUserById(long userId);
    // 3. 添加新用户
    @Insert("insert into user(id, name) values(#{id}, #{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void addUser(User user);
    // 4. 根据用户id删除用户
    @Delete("delete from user where id = #{id}")
    public void deleteUserById(long id);
    // 5. 根据用户id更新用户
    @Update("update user set id = #{id}, name = #{name} where id = #{id}")
    public void updateUserById(User user, long id);
}

package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    // 1. 实现查询所有用户
    @Select("select * from user")
    public List<User> getAllUser();
    // 2. 根据用户id查询用户
    public User getUserById(long id);
    // 3. 添加新用户
    public void addUser(User user);
    // 4. 根据用户id删除用户
    public void deleteUserById(long id);
    // 5. 根据用户id更新用户
    public void updateUserById(long id);
}

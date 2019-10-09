package com.qf.user_demo.mapper;

import com.qf.user_demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    List<User> findAll();
    User findUserByName(String username);
    int updateUserByUser(User user);
    int addUser(User user);
    int delUser(int id);

}

package com.qf.user_demo.serverice;

import com.qf.user_demo.entity.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/8
 * @Version V1.0
 **/
public interface UserService {
    List<User> findAll();
    User findUserByName(String username);
    int updateUserByUser(User user);
    int addUser(User user);
    int delUser(int id);
}

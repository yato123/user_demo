package com.qf.user_demo.serverice.impl;

import com.qf.user_demo.entity.User;
import com.qf.user_demo.mapper.UserMapper;
import com.qf.user_demo.serverice.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/8
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUserByName(String username) {
        if (username != null){
            return userMapper.findUserByName(username);
        }
        else {
            return null;}
    }

    @Override
    public int updateUserByUser(User user) {
        if (user != null){
           return userMapper.updateUserByUser(user);
        }
        return -1;
    }

    @Override
    public int addUser( User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        if (username != null && password != null){
            User user1 = userMapper.findUserByName(username);
            if (user1 == null ){
                return userMapper.addUser(user);

            }else {
                return  -1;
            }
        }else {
            return -1;}
    }

    @Override
    public int delUser(int id) {
        if (id >0){
            return userMapper.delUser(id);
        }
        else {
            return -1;
        }
    }
}

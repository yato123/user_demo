package com.qf.userserver.service.impl;

import com.qf.userserver.dao.UserMapper;

import com.qf.userserver.service.IUserService;
import entity.User;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(User user) {
            if (userMapper.findUser(user) !=null ){
                return userMapper.findUser(user);
            }else {
                return null;
            }

    }

    @Override
    public User checkLogin(User user) {
        if (user.getUsername() !=null  && user.getPassword() != null){
            if (userMapper.checkLogin(user) != null ){
                return userMapper.checkLogin(user);
            }else {
                return null;
            }
        }else {
            return null;}
    }

    @Override
    public int registerUser(User user) {
        if (user.getUsername() !=null  && user.getPassword() != null) {
            if (userMapper.findUser(user) == null){
                System.out.println("聂宇恒");
             return userMapper.registerUser(user);

            }
            else {
                return -1;
            }
        }else {
            return -1;
        }
    }
}

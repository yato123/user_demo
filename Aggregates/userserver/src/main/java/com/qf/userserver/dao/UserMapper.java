package com.qf.userserver.dao;

import com.qf.userserver.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findUser(@Param("user") User user);
    User checkLogin(@Param("user") User user);
    int registerUser(@Param("user") User user);
}

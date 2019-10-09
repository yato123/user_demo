package com.qf.user_demo.controller;

import com.qf.user_demo.entity.User;
import com.qf.user_demo.serverice.UserService;
import com.qf.user_demo.serverice.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/8
 * @Version V1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServiceImpl userService;

    @GetMapping("/fa")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/fubn")
    public User findUserByName(@RequestParam String username){
        return userService.findUserByName(username);
    }
    @PostMapping("/uubu")
    public int updateUserByUser(User user){
        return userService.updateUserByUser(user);
    }
    @PostMapping("/au")
    public String addUser(@RequestBody User user){
        if (userService.addUser(user) >0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
    @GetMapping("/du")
    public String delUser(@RequestParam int id){
        if (userService.delUser(id) >0){
            return "删除成功";
        }
        return "删除失败";
    }
}

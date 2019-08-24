package com.qf.userserver;

import com.qf.userserver.entity.User;
import com.qf.userserver.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserserverApplicationTests {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("xy");
        user.setPassword("777732");
        Integer result = userService.registerUser(user);
        if (result >0){
        System.out.println(result);
        }else {
            System.out.println("添加失败");
        }
    }

}

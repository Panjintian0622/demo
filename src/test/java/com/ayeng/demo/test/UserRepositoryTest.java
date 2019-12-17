package com.ayeng.demo.test;

import com.ayeng.demo.DemoApplicationTests;
import com.ayeng.demo.entity.User;
import com.ayeng.demo.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends DemoApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void userFindOne(){
        User user = userRepository.findOne(1L);
        if(user != null ){
            System.out.println("用户信息不存在啊！");
        }

    }
}

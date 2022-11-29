package com.songshu.mybatisplus;

import com.songshu.mybatisplus.entity.User;
import com.songshu.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
       // List<User> users = userMapper.selectList(null);
       // System.out.println(users);
        User user = new User();
        user.setId(7l);
        user.setName("Tony");
        user.setAge(21);
        user.setEmail("sadasdas@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);


    }

}

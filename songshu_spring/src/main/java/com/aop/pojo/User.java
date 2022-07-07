package com.aop.pojo;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class User {

    public User() {
        System.out.println("通过无参构造创建User对象");
    }

    public void add() {
        //int i = 10/0;
        System.out.println("执行了user的add方法");
    }
}

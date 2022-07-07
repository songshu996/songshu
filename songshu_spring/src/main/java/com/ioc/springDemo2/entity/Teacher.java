package com.ioc.springDemo2.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

    @Value("李老师")
    private String username;

    @Value("123456")
    private String password;

    public Teacher() {
    }

    public Teacher(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

package com.ioc.springDemo2.entity;


import org.springframework.stereotype.Component;

@Component
public class Student {

    private String username;

    private String password;

    private String sex;

    private Teacher teacher;

    public Student() {
    }

    public Student(String username, String password, String sex, Teacher teacher) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}

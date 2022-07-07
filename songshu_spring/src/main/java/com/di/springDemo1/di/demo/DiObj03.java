package com.di.springDemo1.di.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiObj03 {

    @Autowired
    private DiObj02 diObj02;

    @Value("admin")
    private String username;

    @Value("666666")
    private String password;

    public DiObj03() {
    }

    public DiObj03(DiObj02 diObj02, String username, String password) {
        this.diObj02 = diObj02;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DiObj03{" +
                "diObj02=" + diObj02 +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

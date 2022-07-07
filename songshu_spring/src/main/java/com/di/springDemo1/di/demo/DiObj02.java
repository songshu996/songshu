package com.di.springDemo1.di.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class DiObj02 {

    @Value("root")
    private String username;

    @Value("123456")
    private String password;

    public DiObj02() {
    }

    public DiObj02(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DiObj02{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

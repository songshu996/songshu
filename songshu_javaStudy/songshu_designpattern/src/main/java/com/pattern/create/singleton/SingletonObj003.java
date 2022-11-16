package com.pattern.create.singleton;

public class SingletonObj003 {
    //类加载时就获得实例对象
    private static final SingletonObj003 instance = new SingletonObj003();
    private SingletonObj003 (){}

    public static SingletonObj003 getInstance() {
        return instance;
    }
}
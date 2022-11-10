package com.create.singleton;

/**
 * 静态代码块
 */
public class SingletonObj004 {
    //类加载时就获得实例对象
    private static final SingletonObj004 instance ;
    static{
        instance = new SingletonObj004();
    }
    private SingletonObj004 (){}
    public static SingletonObj004 getInstance() {
        return instance;
    }
}
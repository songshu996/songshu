package com.pattern.create.singleton;

/**
 *  登记式/静态内部类
 */
public class SingletonObj006 {
    private static class SingletonHolder {
        private static final SingletonObj006 INSTANCE = new SingletonObj006();
    }

    private SingletonObj006() {
    }

    public static final SingletonObj006 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
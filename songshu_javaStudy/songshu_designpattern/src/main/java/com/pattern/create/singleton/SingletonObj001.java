package com.pattern.create.singleton;

/**
 * 懒汉式单例-非线程安全
 * 这种方式是最基本的实现方式，也是最简单的单例模式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式起到了lazy loading(懒加载)的效果，不要求线程安全，在多线程不能正常工作。
 * 在该实现方式中，构造方法是私有的，别人不能访问你的实例，提供一个static方法以供他人获取你的实例对象。
 */
public class SingletonObj001 {

    private static SingletonObj001 instance;

    private SingletonObj001() {
    }
    public static SingletonObj001 getInstance(){
        if (instance == null){
            instance = new SingletonObj001();
        }
        return  instance;
    }
}

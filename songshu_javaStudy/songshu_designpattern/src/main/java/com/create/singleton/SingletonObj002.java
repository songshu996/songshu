package com.create.singleton;

/**
 * 懒加载-线程安全
 * 这种方式具备很好的懒加载，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 第一种懒汉式中加入了一个关键字synchronized, 使用synchronized保证线程同步，保证同时只有一个进程进入此方法。从而保证并发安全。
 *  getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 *  优点：第一次调用才初始化，避免内存浪费。
 *  缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
public class SingletonObj002 {

    private static SingletonObj002 instance;

    private SingletonObj002() {
    }

    public synchronized static SingletonObj002 getInstance() {
        if (instance == null) {
            instance = new SingletonObj002();
        }
        return instance;
    }
}

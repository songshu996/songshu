package com.create.singleton;

/**
 * 双检锁
 */
public class SingletonObj005 {
    private volatile static SingletonObj005 instance;
    private SingletonObj005 (){}
    public static SingletonObj005 getSingleton() {
        //多线程直接访问，不做控制，不影响性能
        if (instance == null) {
            //如果有多个线程进入，则进入同步块，其余线程等待
            synchronized (SingletonObj005.class) {
                //此时第一个线程判断为空，第二个进来时就不为空
                if (instance == null) {
                    //第一个线程实例化此对象
                    instance = new SingletonObj005();
                }
            }
        }
        return instance;
    }
}
package com.aop.JdkProxy;

public class JdkDaoImpl implements JdkDao {
    public int add(int a, int b) {
        System.out.println("执行了JdkProxyDaoImp的add方法");
        return a+b;
    }

    public String update(String id) {
        System.out.println("执行了JdkProxyDaoImp的update方法");
        return id;
    }

    @Override
    public String toString() {
        return "JdkProxyDaoImpl{}";
    }
}

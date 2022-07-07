package com.aop.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JdkProxy {

    public static void main(String[] args) {
        Class[] interfaces = {JdkDao.class};
        JdkDaoImpl jdkDaoImpl = new JdkDaoImpl();
        JdkDao jdkDao = (JdkDao) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new JdkDaoProxy(jdkDaoImpl));
        int add = jdkDao.add(2, 3);
        System.out.println(add);

    }

}

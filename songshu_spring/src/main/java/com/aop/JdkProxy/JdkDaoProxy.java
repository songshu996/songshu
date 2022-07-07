package com.aop.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JdkDaoProxy implements InvocationHandler {
    private Object object;

    public JdkDaoProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //被增强的方法执行之前
        System.out.println("被增强的方法执行之前的处理逻辑:" + method.getName() + "的参数为"+ Arrays.toString(args));

        //要被增强的方法执行
        Object invoke = method.invoke(object, args);

        //被增强的方法执行之后
        System.out.println("被增强的方法执行之后的处理逻辑:"+ method.getName()+ "的参数为"+ Arrays.toString(args));
        return invoke;
    }
}

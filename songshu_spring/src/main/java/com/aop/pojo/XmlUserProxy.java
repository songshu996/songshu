package com.aop.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class XmlUserProxy {

    /**
     * 前置通知
     */
    public void beforeAdvice() {
        System.out.println("XMLUserProxy前置通知");
    }

    /**
     * 后置通知
     * 在方法执行之后执行,无论是否发生异常
     */
    public void afterAdvice() {
        System.out.println("XMLUserProxy后置通知");
    }

    /**
     * 环绕通知
     */
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("XMLUserProxy环绕通知");
        System.out.println("XMLUserProxy环绕之前");

        //执行被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("XMLUserProxy环绕之后");
    }

    /**
     * 异常通知
     */
    public void exceptionAdvice() {
        System.out.println("XMLUserProxy异常通知");
    }


    /**
     * 最终通知
     * 在方法返回结果之后执行
     */
    public void finallyAdvice() {
        System.out.println("XMLUserProxy最终通知");
    }

}

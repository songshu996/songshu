package com.aop.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1)
public class UserProxy02 {


    /**
     * 多个增强类对同一个方法进行增强，设置增强类的优先级
     *  @Order(value = 2) 值越小优先级越高
     */

    //把相同的切入点进行抽取
    @Pointcut(value = "execution(* com.aop.pojo.User.add())")
    private void pointCut(){}


    /**
     * 前置通知
     */
    @Before(value = "pointCut()")
    public void beforeAdvice() {
        System.out.println("UserProxy02前置通知");
    }

}

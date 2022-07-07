package com.aop.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 2)
public class UserProxy {

    //把相同的切入点进行抽取
    @Pointcut(value = "execution(* com.aop.pojo.User.add())")
    private void pointCut(){}


    /**
     * 前置通知
     */
    @Before(value = "pointCut()")
    public void beforeAdvice() {
        System.out.println("UserProxy前置通知");
    }

    /**
     * 后置通知
     * 在方法执行之后执行,无论是否发生异常
     */
    @After(value = "pointCut()")
    public void afterAdvice() {
        System.out.println("UserProxy后置通知");
    }

    /**
     * 环绕通知
     */
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("UserProxy环绕通知");
        System.out.println("UserProxy环绕之前");

        //执行被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("UserProxy环绕之后");
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "pointCut()")
    public void exceptionAdvice() {
        System.out.println("UserProxy异常通知");
    }


    /**
     * 最终通知
     * 在方法返回结果之后执行
     */
    @AfterReturning(value = "pointCut()")
    public void finallyAdvice() {
        System.out.println("UserProxy最终通知");
    }

}

package com.ioc.springDemo2;

import com.common.config.SpringConfig;
import com.ioc.springDemo2.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo02 {

    private static ApplicationContext context;

    static{
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    public static void main(String[] args) {
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);

    }
}

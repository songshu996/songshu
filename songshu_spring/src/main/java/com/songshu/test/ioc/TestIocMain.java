package com.songshu.test.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIocMain {
    public static void main(String[] args) {

        //创建spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForIoc.xml");
        TestIocObj testIoc = context.getBean("testIocObj", TestIocObj.class);
        testIoc.fun1();
        System.out.println(testIoc);

    }
}

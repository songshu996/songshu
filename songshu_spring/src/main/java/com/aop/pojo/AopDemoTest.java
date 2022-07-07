package com.aop.pojo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemoTest {

    private static ClassPathXmlApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("applicationContextAop.xml");
    }

    public static void main(String[] args) {
        User user = context.getBean("user", User.class);
        user.add();

        XmlUser xmlUser = context.getBean("xmlUser", XmlUser.class);
        xmlUser.add();

    }
}

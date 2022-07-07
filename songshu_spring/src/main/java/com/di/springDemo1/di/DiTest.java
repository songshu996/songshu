package com.di.springDemo1.di;

import com.di.springDemo1.di.demo.DiObj;
import com.di.springDemo1.di.demo.DiObj02;
import com.di.springDemo1.di.demo.DiObj03;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDi.xml");

        DiObj diObj = context.getBean("diObj", DiObj.class);
        System.out.println(diObj);

        DiObj diObj2 = context.getBean("diObj2", DiObj.class);
        System.out.println(diObj2);

        DiObj diObj3 = context.getBean("diObj3", DiObj.class);
        System.out.println(diObj3);

        DiObj02 diObj02 = context.getBean("diObj02", DiObj02.class);
        System.out.println(diObj02);

        DiObj03 diObj03 = context.getBean("diObj03", DiObj03.class);
        System.out.println(diObj03);


    }
}

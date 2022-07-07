package com.aop.pojo;

import org.springframework.stereotype.Component;

/**
 * 采用xml方式进行开发
 */
public class XmlUser {

    public XmlUser() {
        System.out.println("通过无参构造创建XMLUser对象");
    }

    public void add() {
        //int i = 10/0;
        System.out.println("执行了XMLuser的add方法");
    }
}

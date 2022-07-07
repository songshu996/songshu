package com.ioc.springDemo1.ioc;

import com.ioc.springDemo1.ioc.dome.IocObj01;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {


    public static void createIocObjByNoneCon(){

        /*将对象注入到容器*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextIOC.xml");

        /*根据属性id从容器中获取对象*/
//        IocObj iocObj = context.getBean("iocObj", IocObj.class);
//        iocObj.fun("iocObj");

        /*利用别名从容器中获取对象*/
//        IocObj iocObjAlias = context.getBean("iocObj2Alias", IocObj.class);
//        iocObjAlias.fun("iocObj2Alias");

        /*利用静态工厂类创建对象*/
//        IocObj iocObjByStaticFactory = context.getBean("iocObjByStaticFactory", IocObj.class);
//        iocObjByStaticFactory.fun("iocObjByStaticFactory");


//        IocObj iocObjByFactory = context.getBean("iocObjByFactory", IocObj.class);
//        iocObjByFactory.fun("iocObjByFactory");

//        SpringLifeCycle springLife = context.getBean("springLife", SpringLifeCycle.class);
//        springLife.sayHello();
//        context.close();

        IocObj01 iocObj001 = context.getBean("iocObj01", IocObj01.class);
        iocObj001.fun("iocObj001");


    }

    public static void main(String[] args) {
        createIocObjByNoneCon();
    }
}

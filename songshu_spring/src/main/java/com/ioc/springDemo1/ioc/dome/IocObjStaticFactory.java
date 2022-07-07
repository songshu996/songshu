package com.ioc.springDemo1.ioc.dome;

/**
 * IocObj工厂类
 */
public class IocObjStaticFactory {

    public IocObjStaticFactory() {
        System.out.println("通过无参构造方法创建IocObjFactory对象");
    }

    public static IocObj getInstant(){
        return new IocObj();
    }
}

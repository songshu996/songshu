package com.ioc.springDemo1.ioc.dome;

public class IocObjFactory {

    public IocObjFactory() {
        System.out.println("实例工厂类无参构造创建实例工厂对象");
    }

    public IocObj getInstant(){
        return new IocObj();
    }
}

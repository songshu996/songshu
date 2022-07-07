package com.ioc.springDemo1.ioc.dome;

import java.util.List;

public class IocObj {

    private String id;

    private String name;

    private Integer age;

    private List<String> cardList;

    public IocObj() {
        System.out.println("通过无参构造方法创建对象IocObj");
    }

    public IocObj(String id, String name, Integer age) {
        System.out.println("利用有参构造器创建对象");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public IocObj(String id, String name, Integer age, List<String> cardList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cardList = cardList;
    }

    public void fun(String name){
        System.out.println("调用IocObj对象的fun方法 --->" + name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getCardList() {
        return cardList;
    }

    public void setCardList(List<String> cardList) {
        this.cardList = cardList;
    }
}

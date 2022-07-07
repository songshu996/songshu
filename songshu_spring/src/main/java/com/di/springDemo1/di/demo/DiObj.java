package com.di.springDemo1.di.demo;

public class DiObj {

    private String id;

    private String name;

    private String sex;

    public DiObj() {
        System.out.println("通过无参构造函数创建DiObj实例对象");
    }

    public DiObj(String id, String name, String sex) {
        System.out.println("通过有参构造函数创建DiObj实例对象");
        this.id = id;
        this.name = name;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "DiObj{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

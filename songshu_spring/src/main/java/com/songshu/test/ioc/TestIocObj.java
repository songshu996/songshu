package com.songshu.test.ioc;

public class TestIocObj {

    private String userName;

    private String sex;

    private String mail;

    public TestIocObj() {
    }

    public TestIocObj(String userName, String sex, String mail) {
        this.userName = userName;
        this.sex = sex;
        this.mail = mail;
    }

    public void fun1(){
        System.out.println("对象创建成功------------->>>>>>  TestObj");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "TestIocObj{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}

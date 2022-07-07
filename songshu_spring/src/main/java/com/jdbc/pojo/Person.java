package com.jdbc.pojo;

public class Person {

    private String id;
    private String rName;
    private String age;
    private String sex;
    private String idNo;
    private String idType;
    private String bPlace;
    private String queryString;
    private String sort;
    private String birthday;

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getbPlace() {
        return bPlace;
    }

    public void setbPlace(String bPlace) {
        this.bPlace = bPlace;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", rName='" + rName + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", idNo='" + idNo + '\'' +
                ", idType='" + idType + '\'' +
                ", bPlace='" + bPlace + '\'' +
                ", queryString='" + queryString + '\'' +
                ", sort='" + sort + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

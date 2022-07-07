package com.jdbc.service;


import com.jdbc.dao.PersonDao;
import com.jdbc.pojo.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public void addPersion(){
        Person person = new Person();
        person.setId("AXtamq1fgpreNtWiOa87");
        person.setrName("骆路峰");
        person.setAge("26");
        person.setSex("男");
        person.setIdNo("330183199512062613");
        person.setIdType("01");
        person.setbPlace("浙江省杭州市富阳区大源镇骆村村秦骆661号");
        person.setQueryString("浙江省杭州市富阳市  杭州市富阳区大源镇骆村村秦骆661号 26 95 1995 上海市上海市青浦区香花桥街道久远路1660弄24号102室");
        person.setSort("6754190");
        person.setBirthday("19951206");

        personDao.insert(person);
    }
}

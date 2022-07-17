package com.jdbc.service;


import com.jdbc.dao.PersonDao;
import com.jdbc.pojo.Person;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private static Logger logger = Logger.getLogger(PersonService.class);

    @Autowired
    private PersonDao personDao;

    public void addPersion(){
        Person person = new Person();
        person.setId("AXtaJ3qPy8Qm8bx7JyV5");
        person.setrName("卿波");
        person.setAge("54");
        person.setSex("男");
        person.setIdNo("512902196708170058");
        person.setIdType("01");
        person.setbPlace("四川省南充地区华蓥市");
        person.setQueryString("  四川省南充地区华蓥市   54 67 1967 ");
        person.setSort("6754190");
        person.setBirthday("9670817");
        personDao.insert(person);
    }

    public void updatePerson(){
        Person person = new Person();
        person.setId("AXtaJ3qPy8Qm8bx7JyV5");
        person.setSex("0");
        int i = personDao.updatePerson(person);
        logger.info("update info successi，result row ：" + i);
    }
}

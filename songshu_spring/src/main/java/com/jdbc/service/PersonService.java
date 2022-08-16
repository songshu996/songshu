package com.jdbc.service;


import com.jdbc.dao.PersonDao;
import com.jdbc.pojo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    //private static Logger logger = Logger.getLogger(PersonService.class);

    @Autowired
    private PersonDao personDao;

    public void updatePerson(){
        Person person = new Person();
        person.setId("AXtaJ3qPy8Qm8bx7JyV5");
        person.setSex("0");
        int i = personDao.updatePerson(person);
        //logger.info("update info success，result row ：" + i);
    }

    public void deletePerson(){
        int i = personDao.deletePerson("AXtaJ3qPy8Qm8bx7JyV5");
        //logger.info("删除成功，删除记录数" + i);
    }

    public void queryPersons(){
        List<Person> allPerson = personDao.getAllPerson();
        for (Person person : allPerson) {
            System.out.println(person);
        }
    }

    public void queryPersonNameForId(){
        String name = personDao.getUserNameForId("AXtapGbijcEAuoI0lDsp");
       // logger.info("成功查询到客户姓名： " + name);
    }

    public void queryPersonForId(){
        Person person = personDao.getPersonById("AXtamq1fgpreNtWiOa87");
        //logger.info("成功查询到客户： " + person);
    }

    public void batchAddPersons(){
        //id, name, age, sex, birthday, idno, idtype, place, query_string, sort
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"AXtap_NkMo41myuBt4m9","卿波","54","0","19670817","512902196708170058","01","四川省南充地区华蓥市","四川省南充地区华蓥市   54 67 1967 ","6754190"};
        Object[] o2 = {"AXtapFH4dfH-9WxV_Chm","杨越铭","20","0","20010331","211282200103310418","01","辽宁省铁岭市开原市","辽宁省铁岭市开原市   20 01 2001 ","6754190"};
        Object[] o3 = {"AXtao8LkdHWXWNpzUybb","莫绍杨","25","0","19961012","452122199610121214","01","广西壮族自治区南宁地区横县   25 96 1996 ","6754190"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        int[] ints = personDao.batchAddPersons(batchArgs);
        System.out.println(Arrays.toString(ints));
    }


    @Transactional
    public void addPersion(Person person){
        personDao.insert(person);
    }

    @Transactional
    public void addPersionException(Person person){
        personDao.insert(person);
        throw new RuntimeException();

    }
}

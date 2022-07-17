package com.jdbc.dao;

import com.jdbc.pojo.Person;

import java.util.List;

public interface PersonDao {

    void insert(Person person);

    int updatePerson(Person person);

    int deletePerson(String id);

    List<Person> getAllPerson();

    Person getPersonById(String id);

    String getUserNameForId(String id);

    int[]  batchAddPersons(List<Object[]> batchArgs);
}

package com.jdbc.dao;

import com.jdbc.pojo.Person;

import java.util.List;

public interface PersonDao {

    void insert(Person person);

    List<Person> getAllPerson();

    int updatePerson(Person person);

    int deletePerson(String id);
}

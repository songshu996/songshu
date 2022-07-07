package com.jdbc.dao.impl;

import com.jdbc.dao.PersonDao;
import com.jdbc.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Person person) {
        String sql = "insert into person_info(ID, RNAME, AGE, SEX, IDNO, IDTYPE, BPLACE, QUERY_STRING, SORT, birthday) values(?,?,?,?,?,?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, person.getId(), person.getrName(), person.getAge(), person.getSex(), person.getIdNo(),
                person.getIdType(), person.getbPlace(), person.getQueryString(), person.getSort(), person.getBirthday());
        System.out.println(update);

    }
}

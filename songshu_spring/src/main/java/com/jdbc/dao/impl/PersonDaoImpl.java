package com.jdbc.dao.impl;

import com.jdbc.dao.PersonDao;
import com.jdbc.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Person person) {
        String sql = "insert into person_info(id, rname, age, sex, birthday, idno, idtype, place, query_string, sort) values(?,?,?,?,?,?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, person.getId(), person.getrName(), person.getAge(), person.getSex(), person.getBirthday(), person.getIdNo(),
                person.getIdType(), person.getbPlace(), person.getQueryString(), person.getSort());
        System.out.println(update);

    }

    @Override
    public List<Person> getAllPerson() {
        String sql = "select id, rname, age, sex, birthday, idno, idtype, place, query_string, sort from person_info";
        return null;
    }

    @Override
    public int updatePerson(Person person) {

        String sql = "update person_info set sex=? where id = ?";
        int update = jdbcTemplate.update(sql, person.getSex(), person.getId());
        return update;
    }

    @Override
    public int deletePerson(String id) {
        String sql = "delete from person_info where id = ?";
        int delete = jdbcTemplate.update(sql, id);
        return delete;
    }


}

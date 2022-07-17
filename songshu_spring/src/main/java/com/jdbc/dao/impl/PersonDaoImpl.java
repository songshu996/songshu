package com.jdbc.dao.impl;

import com.jdbc.dao.PersonDao;
import com.jdbc.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        String sql = "insert into person_info(id, name, age, sex, birthday, idno, idtype, place, query_string, sort) values(?,?,?,?,?,?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, person.getId(), person.getName(), person.getAge(), person.getSex(), person.getBirthday(), person.getIdNo(),
                person.getIdType(), person.getbPlace(), person.getQueryString(), person.getSort());
        System.out.println(update);

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

    /**
     * 查询所有person数据
     *
     * @return
     */
    @Override
    public List<Person> getAllPerson() {
        String sql = "select id, name, age, sex, birthday, idno, idtype, place, query_string, sort from person_info";
        List<Person> persons = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Person>(Person.class));
        return persons;
    }

    /**
     * 根据id查询某一条数据，返回一个对象
     *
     * @param id
     * @return
     */
    @Override
    public Person getPersonById(String id) {
        String sql = "select id, name, age, sex, birthday, idno, idtype, place, query_string, sort from person_info where id = ?";
        Person person = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Person>(Person.class), id);
        return person;
    }

    /**
     * 查询某一字段
     *
     * @param id
     * @return
     */
    @Override
    public String getUserNameForId(String id) {
        String sql = "select name from person_info where id = ?";
        String personName = jdbcTemplate.queryForObject(sql, String.class, id);
        return personName;
    }

    /**
     * 批量添加数据
     * @param batchArgs
     * @return
     */
    @Override
    public int[] batchAddPersons(List<Object[]> batchArgs) {
        String sql = "insert into person_info(id, name, age, sex, birthday, idno, idtype, place, query_string, sort) values(?,?,?,?,?,?,?,?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }


}

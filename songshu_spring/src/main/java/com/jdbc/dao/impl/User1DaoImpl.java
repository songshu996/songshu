package com.jdbc.dao.impl;

import com.jdbc.dao.User1Dao;
import com.jdbc.pojo.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class User1DaoImpl implements User1Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User1 user1) {
        String sql = "insert into user2(id, name) values(?,?)";
        int update = jdbcTemplate.update(sql, user1.getId(), user1.getName());
        return update;
    }

    @Override
    public User1 selectByPrimaryKey(Integer id) {
        return null;
    }
}

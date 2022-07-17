package com.jdbc.dao.impl;

import com.jdbc.dao.User2Dao;
import com.jdbc.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class User2DaoImpl implements User2Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User2 user2) {

        String sql = "insert into user1(id, name) values(?,?)";
        int update = jdbcTemplate.update(sql, user2.getId(), user2.getName());
        return update;
    }

    @Override
    public User2 selectByPrimaryKey(Integer id) {
        return null;
    }
}

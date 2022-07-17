package com.jdbc.dao;

import com.jdbc.pojo.User1;

public interface User1Dao {
    int insert(User1 record);
    User1 selectByPrimaryKey(Integer id);
}

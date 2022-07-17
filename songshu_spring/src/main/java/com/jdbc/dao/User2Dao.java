package com.jdbc.dao;

import com.jdbc.pojo.User2;

public interface User2Dao {
    int insert(User2 record);
    User2 selectByPrimaryKey(Integer id);
}

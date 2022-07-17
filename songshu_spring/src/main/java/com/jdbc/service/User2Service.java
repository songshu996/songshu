package com.jdbc.service;

import com.jdbc.dao.User1Dao;
import com.jdbc.dao.User2Dao;
import com.jdbc.pojo.User1;
import com.jdbc.pojo.User2;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class User2Service {

    private static Logger logger = Logger.getLogger(User2Service.class);

    @Autowired
    private User2Dao user2Dao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User2 user) {
        user2Dao.insert(user);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequiredException(User2 user) {
        user2Dao.insert(user);
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiredNew(User2 user) {
        user2Dao.insert(user);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiredNewException(User2 user) {
        user2Dao.insert(user);
        throw new RuntimeException();
    }
}

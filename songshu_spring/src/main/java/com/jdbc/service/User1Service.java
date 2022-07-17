package com.jdbc.service;

import com.jdbc.dao.User1Dao;
import com.jdbc.pojo.User1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class User1Service {

    private static Logger logger = Logger.getLogger(User1Service.class);

    @Autowired
    private User1Dao user1Dao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User1 user){
        user1Dao.insert(user);
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiredNew(User1 user){
        user1Dao.insert(user);
    }
}

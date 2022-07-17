package com.jdbctemplate.service;

import com.jdbctemplate.dao.AccuntDao;
import com.jdbctemplate.dao.UserAccuntDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserAccountService {

    private static Logger logger = Logger.getLogger(UserAccountService.class);

    @Autowired
    private UserAccuntDao userAccuntDao;

    public void transcationMoneyA() {
        //lucy 少100
        userAccuntDao.reduceMoney("2001", 200.00f);
        //mary 多100
       // int a = 100 / 0;
        userAccuntDao.addMoney("2002", 200.00f);
        logger.info("转账成功");

    }

}

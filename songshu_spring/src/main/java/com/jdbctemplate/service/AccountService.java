package com.jdbctemplate.service;

import com.jdbctemplate.dao.AccuntDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;


@Service
public class AccountService {

    private static Logger logger = Logger.getLogger(AccountService.class);

    @Autowired
    private AccuntDao accuntDao;

    /**
     * 事务的注解，加在类上面，则类中所有的方法都开启了事务，如果加在方法上面，则该方法开启事务
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, rollbackFor = {Exception.class}, timeout = 120)
    public void transcationMoneyA() {
        //lucy 少100
        accuntDao.reduceMoney("2001", 100.00f);
        //mary 多100
        int a = 100 / 0;
        accuntDao.addMoney("2002", 100.00f);
        logger.info("转账成功");


    }

    public void transcationMoneyB() {
        //lucy 少100
        accuntDao.reduceMoney("2001", 50.00f);
        //mary 多100
        int a = 100 / 0;
        accuntDao.addMoney("2002", 50.00f);
        logger.info("转账成功");
    }

}

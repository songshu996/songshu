package com.springTransaction.service;

import com.springTransaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    //private static Logger logger = Logger.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public void transcationMoneyA() {
        //lucy 少100
        userDao.reduceMoney("2001", 200.00f);
        //mary 多100
       // int a = 100 / 0;
        userDao.addMoney("2002", 200.00f);
        //logger.info("转账成功");

    }

}

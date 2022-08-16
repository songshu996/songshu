package com.springTransaction.dao.impl;

import com.springTransaction.dao.AccountDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    private static Logger logger = Logger.getLogger(AccountDaoImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney(String pid, Float money) {
        String sql = "update tb_account set money = money+? where pid = ?";
        int update = jdbcTemplate.update(sql, money, pid);
        logger.info("资金转入成功");
    }

    @Override
    public void reduceMoney(String pid, Float money) {
        String sql = "update tb_account set money = money-? where pid = ?";
        int update = jdbcTemplate.update(sql, money, pid);
        logger.info("资金转出成功");
    }
}

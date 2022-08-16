package com.jdbctemplate.dao;

public interface AccountDao {

    /**
     * 转入资金
     * @param pid
     * @param money
     */
    void addMoney(String pid, Float money);

    /**
     * 转出资金
     * @param pid
     * @param money
     */
    void reduceMoney(String pid, Float money);
}

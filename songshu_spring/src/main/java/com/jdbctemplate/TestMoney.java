package com.jdbctemplate;

import com.jdbctemplate.service.AccountService;
import com.jdbctemplate.service.UserAccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestMoney {


    private static ClassPathXmlApplicationContext context;

    private static ClassPathXmlApplicationContext context2;

    static {
        //context = new ClassPathXmlApplicationContext("applicationContextJdbc.xml");
        context2 = new ClassPathXmlApplicationContext("applicationContextTransaction.xml");
    }

    @Test
    public void test_PROPAGATION_REQUIRED(){
//        AccountService accountService = context.getBean("accountService", AccountService.class);
//        accountService.transcationMoneyA();


    }

    @Test
    public void test_PROPAGATION_REQUIRED2(){
        UserAccountService userAccountService = context2.getBean("userAccountService", UserAccountService.class);
        userAccountService.transcationMoneyA();


    }


    public static void main(String[] args) {

    }
}

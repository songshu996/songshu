package com.jdbctemplate;

import com.jdbctemplate.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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
        UserService userService = context2.getBean("userService", UserService.class);
        userService.transcationMoneyA();


    }


    public static void main(String[] args) {

    }
}

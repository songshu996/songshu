package com.springTransaction;

import com.springTransaction.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestMoney {

    private static Logger logger = LoggerFactory.getLogger(TestMoney.class);

    private static ClassPathXmlApplicationContext context;

    private static ClassPathXmlApplicationContext context2;

    static {
        //context = new ClassPathXmlApplicationContext("applicationContextJdbc.xml");
        context2 = new ClassPathXmlApplicationContext("applicationContextTransaction.xml");
    }

    @Test
    public void test_PROPAGATION_REQUIRED() {
//        AccountService accountService = context.getBean("accountService", AccountService.class);
//        accountService.transcationMoneyA();
    }

    @Test
    public void test_PROPAGATION_REQUIRED2() {
        logger.info("-------------------start");
        UserService userService = context2.getBean("userService", UserService.class);
        userService.transcationMoneyA();
    }

    public static void main(String[] args) {
        UserService userService = context2.getBean("userService", UserService.class);
        userService.transcationMoneyA();
    }


}

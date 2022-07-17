package com.jdbc;

import com.jdbc.pojo.User1;
import com.jdbc.pojo.User2;
import com.jdbc.service.PersonService;
import com.jdbc.service.User1Service;
import com.jdbc.service.User2Service;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Component
public class JdbcDemoTest {

    private static ClassPathXmlApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("applicationContextJdbc.xml");
    }

    /**
     * 外围方法没有开启事务， user1Service.addRequired和 user2Service.addRequired均开启了事务
     * 外围方法未开启事务，插入“张三”、“李四”方法在自己的事务中独立运行，外围方法异常不影响内部插入“张三”、“李四”方法独立的事务。【外围方法出现异常】
     * 外围方法未开启事务，插入“张三”、“李四”方法都在自己的事务中独立运行,所以插入“李四”方法抛出异常只会回滚插入“李四”方法，插入“张三”方法不受影响。【外围方法正常】
     */
    @Test
    @Transactional(propagation = Propagation.REQUIRED)
    public void notransaction_exception_required_required() {

        User1Service user1Service = context.getBean("user1Service", User1Service.class);
        User2Service user2Service = context.getBean("user2Service", User2Service.class);

        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiredNew(user2);

        user2 = new User2();
        user2.setName("王五");
        user2Service.addRequiredNew(user2);

//        user2=new User2();
//        user2.setName("王五");
//        user2Service.addRequiredNewException(user2);

        throw new RuntimeException();
    }


    public static void main(String[] args) throws Exception {
        PersonService personService = context.getBean("personService", PersonService.class);
        //personService.addPersion();
        //personService.updatePerson();
        //personService.deletePerson();
        // personService.queryPersons();
        //personService.queryPersonNameForId();
        // personService.queryPersonForId();
        personService.batchAddPersons();
    }
}

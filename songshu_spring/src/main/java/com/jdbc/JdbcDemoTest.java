package com.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.aop.pojo.User;
import com.aop.pojo.XmlUser;
import com.jdbc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class JdbcDemoTest {

    private static ClassPathXmlApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("applicationContextJdbc.xml");
    }


    public static void main(String[] args) throws Exception {
        PersonService personService = context.getBean("personService", PersonService.class);
        personService.addPersion();
    }
}

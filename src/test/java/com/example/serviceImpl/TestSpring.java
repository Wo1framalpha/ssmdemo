package com.example.serviceImpl;

import com.example.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssmtest1
 * @description: test ASImpl
 * @author: Bob
 * @create: 2021-03-23 12:23
 **/
public class TestSpring {
    @Test
    public void testFindAll(){
        ApplicationContext app = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        AccountService as = (AccountService) app.getBean("accountService");
        as.findAll();

    }
}

package com.qinsheng.spring;

import com.qinsheng.spring.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

}

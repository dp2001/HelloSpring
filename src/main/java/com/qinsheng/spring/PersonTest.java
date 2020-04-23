package com.qinsheng.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qinsheng on 2020/4/23.
 */
public class PersonTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person o = (Person)classPathXmlApplicationContext.getBean("person");
        System.out.println(o.getAge());

    }

}

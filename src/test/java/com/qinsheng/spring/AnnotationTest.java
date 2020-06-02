package com.qinsheng.spring;

import com.qinsheng.spring.controller.PersonController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test() {
        PersonController personController = context.getBean("personController", PersonController.class);
        personController.getPerson();
    }

}

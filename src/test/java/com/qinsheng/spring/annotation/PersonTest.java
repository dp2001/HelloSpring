package com.qinsheng.spring.annotation;

import com.qinsheng.spring.annotation.controller.PersonController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 21:29
 */
public class PersonTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("IOCPart2.xml");

    @Test
    public void testAnnotationBean() {
        PersonController controller = context.getBean("personController", PersonController.class);
        controller.getPerson();
    }
}

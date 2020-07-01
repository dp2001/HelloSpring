package com.qinsheng.spring.processor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 01:06
 */
public class MyBeanProcessorTest {

    @Test
    public void testMyBeanProcessor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        MyBeanPostProcessor myBeanPostProcessor = context.getBean("myBeanPostProcessor", MyBeanPostProcessor.class);
        System.out.println(myBeanPostProcessor);
    }

}

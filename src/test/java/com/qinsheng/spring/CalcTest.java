package com.qinsheng.spring;

import com.qinsheng.spring.util.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {

    @Test
    public void calcTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.add(1,1);
    }

}

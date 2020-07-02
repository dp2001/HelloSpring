package com.qinsheng.spring.aop;

import com.qinsheng.spring.aop.inter.Calculator;
import com.qinsheng.spring.aop.inter.CalculatorProxy;
import com.qinsheng.spring.aop.inter.MyCalculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 23:25
 */
public class AOPTest {

    @Test
    public void test() throws NoSuchMethodException {
        Calculator calculator = CalculatorProxy.getProxy(new MyCalculator());
        System.out.println(calculator.add(1, 1));
        calculator.sub(1, 1);
        calculator.mul(1, 1);
        calculator.div(1, 1);
        System.out.println(calculator.getClass());
    }

    @Test
    public void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.add(1, 1);
        System.out.println(bean);
        System.out.println(bean.getClass());
    }

}

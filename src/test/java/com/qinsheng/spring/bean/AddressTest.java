package com.qinsheng.spring.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 00:54
 * 以Address为例，测试对象初始化，创建，销毁
 */
public class AddressTest {

    @Test
    public void testInitAndDestroy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Address address = context.getBean("address2", Address.class);
        ((ClassPathXmlApplicationContext)context).close();
    }

}

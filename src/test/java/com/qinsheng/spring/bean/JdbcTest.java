package com.qinsheng.spring.bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 01:17
 */
public class JdbcTest {

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("IOCPart2.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
    }

}

package com.qinsheng.spring.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 21:25
 */
@Repository
public class PersonDao {

    public void getPerson() {
        System.out.println("personDao:getPerson");
    }

}

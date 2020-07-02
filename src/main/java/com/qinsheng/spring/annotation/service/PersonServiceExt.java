package com.qinsheng.spring.annotation.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 22:00
 */
@Service
//@Qualifier("personServiceExt")
public class PersonServiceExt extends PersonService{

    @Override
    public void getPerson() {
        System.out.println("person service ext");
    }
}

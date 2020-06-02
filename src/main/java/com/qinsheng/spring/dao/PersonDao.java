package com.qinsheng.spring.dao;

import com.qinsheng.spring.bean.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {


    public Person getPerson() {
        return new Person();
    }
}

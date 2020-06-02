package com.qinsheng.spring.service;

import com.qinsheng.spring.bean.Person;
import com.qinsheng.spring.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Person getPerson() {
        return personDao.getPerson();
    }
}

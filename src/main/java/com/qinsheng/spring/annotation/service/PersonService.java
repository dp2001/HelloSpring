package com.qinsheng.spring.annotation.service;

import com.qinsheng.spring.annotation.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 21:22
 */
@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public void getPerson() {
        personDao.getPerson();
    }

}

package com.qinsheng.spring.factory;

import com.qinsheng.spring.bean.Person;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 00:41
 */
public class PersonInstanceFactory {

    public Person getPerson(String name) {
        Person person = new Person();
        person.setName(name);
        person.setId(010);
        return person;
    }

}

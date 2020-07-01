package com.qinsheng.spring.factory;

import com.qinsheng.spring.bean.Person;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 00:32
 */
public class PersonStaticFactory {

    public static Person getPerson(String name) {
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }

}

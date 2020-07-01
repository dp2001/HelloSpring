package com.qinsheng.spring.factory;

import com.qinsheng.spring.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 00:47
 */
public class MyFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setName("daichen");
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

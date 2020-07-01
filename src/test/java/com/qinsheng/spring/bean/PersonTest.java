package com.qinsheng.spring.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qinsheng
 * @Date: 2020/6/29 23:31
 */
public class PersonTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml ");

    @Test
    public void testGetBean() {
        // 通过id获取对象
        Person person = (Person)context.getBean("person");
        // 通过id加bean类型，不需要强制转型
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person == person1);
        // 通过bean类型获取对象，如果有多个就会报异常，不知道选择哪一个
        // Person person2 = context.getBean(Person.class);
        // System.out.println(person == person2);
    }

    @Test
    public void testConstructor() {
        Person person3 = context.getBean("person3", Person.class);
        System.out.println(person3);

        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);

        Person person5 = context.getBean("person5", Person.class);
        System.out.println(person5);
    }

    @Test
    public void testSchemaP() {
        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person6);
    }

    @Test
    public void testComplexPerson() {
        ComplexPerson complexPerson = context.getBean("complexPerson", ComplexPerson.class);
        System.out.println(complexPerson);
    }

    @Test
    public void testExtend() {
        Person parent = context.getBean("parent", Person.class);
        System.out.println(parent);
        Person son = context.getBean("son", Person.class);
        System.out.println(son);
    }

    @Test
    public void testAbstract() {
        //  抽象类，不能实例化，但是可以继承
        //  Person abstractPerson = context.getBean("abstractPerson", Person.class);
        //  System.out.println(abstractPerson);
        Person instance = context.getBean("instance", Person.class);
        System.out.println(instance);
    }

    @Test
    public void testDependOn() {
        Book book = context.getBean("dependTestBook", Book.class);
    }

    @Test
    public void testStaticFactory() {
        Person person = context.getBean("personStatic", Person.class);
        System.out.println(person);
    }

    @Test
    public void testInstanceFactory() {
        Person person = context.getBean("personInstance", Person.class);
        System.out.println(person);
    }

    @Test
    public void testMyFactoryBean() {
        Person person = context.getBean("myFactoryBean", Person.class);
        System.out.println(person);
    }

}

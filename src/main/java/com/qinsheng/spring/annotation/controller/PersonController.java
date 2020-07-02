package com.qinsheng.spring.annotation.controller;

import com.qinsheng.spring.annotation.dao.PersonDao;
import com.qinsheng.spring.annotation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 21:21
 */
@Controller
public class PersonController {

    @Autowired
    PersonService personServiceExt;

    public PersonController() {
        System.out.println("person controller created");
    }

    public void getPerson() {
        personServiceExt.getPerson();
    }

    /*
    * 当方法上有Autowired时，
    * 1， 此方法在bean创建时就会被调用
    * 2， 此方法的每一个参数都会自动注入值
    */
    @Autowired
    public void testAutowiredOnMethod(PersonDao personDao) {
        System.out.println("此方法被调用" + personDao);
    }

    /*
    * @Qualifier 注解也可以作用在属性上，用来被当作id去匹配容器里的对象，如果没有此注解
    * 直接按照类型进行匹配
    */
    @Autowired
    public void testQualifire(@Qualifier("personServiceExt") PersonService personService) {
        System.out.println("此方法被调用" + personService);
    }
}

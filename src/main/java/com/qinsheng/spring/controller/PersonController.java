package com.qinsheng.spring.controller;

import com.qinsheng.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;


    public PersonController() {
        System.out.println("创建对象");
    }

    public void getPerson(){
        System.out.println(personService.getPerson());
    }

}

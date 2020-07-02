package com.qinsheng.spring.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 21:25
 */
@Component
public class Person {

    private int id;
    private int age;
    private String name;
    private String gender;

    public Person(){
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, int age, String name, String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

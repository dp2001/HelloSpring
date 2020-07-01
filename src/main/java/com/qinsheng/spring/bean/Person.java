package com.qinsheng.spring.bean;

/**
 * @Author: qinsheng
 * @Date: 2020/6/29 23:26
 */
public class Person {

    private int id;
    private int age;
    private String name;
    private String gender;

    public Person(){
//        System.out.println("person init");   // 测试对象创建时间
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

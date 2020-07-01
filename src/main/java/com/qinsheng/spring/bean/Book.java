package com.qinsheng.spring.bean;

/**
 * @Author: qinsheng
 * @Date: 2020/6/30 01:26
 */
public class Book {

    private String name;
    private String author;
    private double price;

    public Book() {
//        System.out.println("book init");
    }

    public Book(String name, String author, double price) {
//        System.out.println("book init 2");
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

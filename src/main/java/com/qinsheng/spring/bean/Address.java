package com.qinsheng.spring.bean;

/**
 * @Author: qinsheng
 * @Date: 2020/6/30 01:24
 */
public class Address {

    private String province;
    private String city;
    private String town;

    public Address() {
        System.out.println("address created");
    }

    public Address(String province, String city, String town) {
//        System.out.println("address init 2");
        this.province = province;
        this.city = city;
        this.town = town;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    public void init() {
        System.out.println("address init");
    }

    public void destroy() {
        System.out.println("address destroy");
    }
}

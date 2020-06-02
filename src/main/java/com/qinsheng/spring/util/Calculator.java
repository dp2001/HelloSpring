package com.qinsheng.spring.util;

import org.springframework.stereotype.Component;

@Component
public interface Calculator {

    public int add(int i,int j);

    public int sub(int i,int j);

    public int mult(int i,int j);

    public int div(int i,int j);
}
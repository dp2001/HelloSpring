package com.qinsheng.spring.aop.inter;

import org.springframework.stereotype.Service;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 23:19
 */
@Service
public class MyCalculator implements Calculator{
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}

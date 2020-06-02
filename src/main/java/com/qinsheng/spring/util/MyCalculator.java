package com.qinsheng.spring.util;

import org.springframework.stereotype.Service;

@Service
public class MyCalculator implements Calculator {
    public int add(int i, int j) {
        LogUtil.start(i,j);
        int result = i + j;
        LogUtil.stop(result);
        return result;
    }

    public int sub(int i, int j) {
        LogUtil.start(i,j);
        int result = i - j;
        LogUtil.stop(result);
        return result;
    }

    public int mult(int i, int j) {
        LogUtil.start(i,j);
        int result = i * j;
        LogUtil.stop(result);
        return result;
    }

    public int div(int i, int j) {
        LogUtil.start(i,j);
        int result = i / j;
        LogUtil.stop(result);
        return result;
    }
}
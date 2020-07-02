package com.qinsheng.spring.aop.inter;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 23:33
 */
@Component
@Aspect
public class LogUtil {

    @Before("execution(public int com.qinsheng.spring.aop.inter.MyCalculator.*(int, int))")
    public static void start() {
        System.out.println("方法开始执行， 参数是：");
    }
    @After("execution(public int com.qinsheng.spring.aop.inter.MyCalculator.*(int, int))")
    public static void end() {
        System.out.println("方法执行结束了");
    }
    @AfterReturning("execution(public int com.qinsheng.spring.aop.inter.MyCalculator.*(int, int))")
    public static void stop() {
        System.out.println("方法执行完成，结果是：");
    }
    @AfterThrowing("execution(public int com.qinsheng.spring.aop.inter.MyCalculator.*(int, int))")
    public static void logException() {
        System.out.println("方法出现异常");
    }
}

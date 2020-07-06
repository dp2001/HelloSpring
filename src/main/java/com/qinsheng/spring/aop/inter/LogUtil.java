package com.qinsheng.spring.aop.inter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 23:33
 */
@Component
@Aspect
public class LogUtil {

    @Pointcut("execution(public int com.qinsheng.spring.aop.inter.MyCalculator.*(int, int))")
    public void myPoint(){}

    @Before("myPoint()")
    public static void start(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("方法开始执行， 参数是：" + Arrays.asList(args));
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

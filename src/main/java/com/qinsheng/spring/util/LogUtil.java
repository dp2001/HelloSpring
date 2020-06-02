package com.qinsheng.spring.util;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogUtil {

    public static void start(Object ... objects){
        System.out.println("XXX方法开始执行，使用的参数是："+ Arrays.asList(objects));
    }

    public static void stop(Object ... objects){
        System.out.println("XXX方法执行结束，结果是："+ Arrays.asList(objects));
    }

}

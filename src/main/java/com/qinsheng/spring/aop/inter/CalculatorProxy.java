package com.qinsheng.spring.aop.inter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 23:20
 */
public class CalculatorProxy {

    public static Calculator getProxy(final Calculator calculator) {
        ClassLoader loader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                System.out.println(method.getName() + "方法开始执行，参数是" + Arrays.asList(args));
                result = method.invoke(calculator, args);
                System.out.println(method.getName() + "方法执行结束，结果是" + result);

                return result;
            }
        };
        Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
        return (Calculator)proxy;
    }

}

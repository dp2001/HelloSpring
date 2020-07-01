package com.qinsheng.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: qinsheng
 * @Date: 2020/7/2 01:03
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessorBeforeInitialization:" + beanName + "调用初始化前置方法");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessorBeforeInitialization:" + beanName + "调用初始化后置方法");
        return bean;
    }
}

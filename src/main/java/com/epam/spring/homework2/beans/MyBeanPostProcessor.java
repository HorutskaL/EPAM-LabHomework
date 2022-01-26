package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof MyValidator) {
            ((MyValidator) bean).validate();
        }
        return bean;
    }
}

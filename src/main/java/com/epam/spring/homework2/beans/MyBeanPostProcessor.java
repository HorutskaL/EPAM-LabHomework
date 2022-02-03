package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof Validatable) {
            ((Validatable) bean).validate();
        }
        return bean;
    }
}

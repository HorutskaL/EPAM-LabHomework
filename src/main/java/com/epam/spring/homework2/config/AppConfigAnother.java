package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanA;
import com.epam.spring.homework2.beans.BeanE;
import com.epam.spring.homework2.beans.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfigAnother {

    private String beanAName;
    private int beanAValue;

    private String beanEName;
    private int beanEValue;

    private String beanFName;
    private int beanFValue;

    @Bean
    public BeanA beanA() {
        return new BeanA(beanAName, beanAValue);
    }

    @Bean
    public BeanE beanE() {
        return new BeanE(beanEName, beanEValue);
    }

    @Bean
    @Lazy
    public BeanF beanF() {
        return new BeanF(beanFName, beanFValue);
    }
}

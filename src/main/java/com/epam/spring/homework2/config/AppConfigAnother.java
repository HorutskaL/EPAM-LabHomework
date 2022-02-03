package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanA;
import com.epam.spring.homework2.beans.BeanE;
import com.epam.spring.homework2.beans.BeanF;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfigAnother {
    @Value("beanAbyDefault")
    private String beanAName;
    @Value("10")
    private int beanAValue;

    @Value("beanEbyDefault")
    private String beanEName;
    @Value("15")
    private int beanEValue;

    @Value("beanFbyDefault")
    private String beanFName;
    @Value("20")
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

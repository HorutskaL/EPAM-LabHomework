package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@PropertySource("my.properties")
@Import(AppConfigAnother.class)
public class AppConfig {

    @Value("${beanD.name}")
    private String beanDName;
    @Value("${beanD.value}")
    private int beanDValue;

    @Value("${beanB.name}")
    private String beanBName;
    @Value("${beanB.value}")
    private int beanBValue;

    @Value("${beanC.name}")
    private String beanCName;
    @Value("${beanC.value}")
    private int beanCValue;

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    @Order(1)
    public BeanD beanD() {
        return new BeanD(beanDName, beanDValue);
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    @Order(2)
    public BeanB beanB() {
        return new BeanB(beanBName, beanBValue);
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    @Order(3)
    public BeanC beanC() {
        return new BeanC(beanCName, beanCValue);
    }
}

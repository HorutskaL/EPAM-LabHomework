package com.epam.spring.homework2;

import com.epam.spring.homework2.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(context.getBean(beanName));
        }
        context.close();
    }
}

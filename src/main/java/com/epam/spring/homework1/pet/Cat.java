package com.epam.spring.homework1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class Cat implements Animal {
    @Override
    public String getAnimal() {
        return "Cat";
    }
}

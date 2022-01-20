package com.epam.spring.homework1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class Cheetah implements Animal{
    @Override
    public String getAnimal() {
        return "Cheetah";
    }
}

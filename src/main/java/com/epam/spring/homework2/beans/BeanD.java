package com.epam.spring.homework2.beans;

public class BeanD extends MyBean {

    public BeanD(String name, int value) {
        super(name, value);
    }

    private void customInitMethod() {
        System.out.println("Inside " + name + " customInitMethod()");
    }

    private void customDestroyMethod() {
        System.out.println("Inside " + name + " customDestroyMethod()");
    }
}

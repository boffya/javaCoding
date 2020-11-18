package com.suncor.coding.design.decorator.test;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-17 14:38
 **/
public class Decorator implements Person {
    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void operation() {
        person.operation();
    }
}

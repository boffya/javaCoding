package com.suncor.coding.design.decorator.test;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-17 14:39
 **/
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Person person) {
        super(person);
    }
    @Override
    public void operation(){
        super.operation();
        addedFunction();
    }
    public void addedFunction()
    {
        System.out.println("穿上衣服");
    }
}

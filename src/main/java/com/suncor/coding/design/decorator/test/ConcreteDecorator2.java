package com.suncor.coding.design.decorator.test;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-17 14:39
 **/
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Person person) {
        super(person);
    }
    @Override
    public void operation(){
        super.operation();
        addedFunction();
    }
    public void addedFunction()
    {
        System.out.println("穿上鞋子");
    }


    public static void main(String[] args) {
        Person a = new Female();
        Person b =new ConcreteDecorator(a);
        Person c = new ConcreteDecorator1(b);
        Person d = new ConcreteDecorator2(c);
        d.operation();
    }
}

package com.suncor.coding.design.factory;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-12 13:28
 **/
public class ConcreteFactory1 implements AbstratFactory {
    @Override
    public Product1 newProduct1() {
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        return new ConcreteProduct21();
    }
}

package com.suncor.coding.design.builder;

import java.sql.SQLOutput;

/**
 * 指挥者 Director
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-12 15:30
 **/
public class Enginner {
    private AbstractBuilder builder;

    public Enginner(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product decorate(){
        builder.setCpu();
        builder.setRam();
        builder.setRom();
        return builder.getProduct();
    }

    public static void main(String[] args) {
        AbstractBuilder builder =new ConcreteBuilder2();
        Enginner enginner1 = new Enginner(builder);
        Product product = enginner1.decorate();
        System.out.println(product);
    }
}

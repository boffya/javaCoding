package com.suncor.coding.design.builder;

/**
 * @program: coding
 * @description: 抽象建造者（Builder）
 * @author: sunc
 * @create: 2020-11-12 15:34
 **/
public abstract class AbstractBuilder {
    protected Product product = new Product();

    abstract void setCpu();

    abstract void setRam();

    abstract void setRom();

    public Product getProduct() {
        return product;
    }
}

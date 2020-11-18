package com.suncor.coding.design.builder;

/**
 * @program: coding
 * @description: 具体建造者(Concrete Builder ）
 * @author: sunc
 * @create: 2020-11-12 15:37
 **/
public class ConcreteBuilder1 extends AbstractBuilder {
    @Override
    void setCpu() {
        product.setCpu("inter");
    }

    @Override
    void setRam() {
        product.setRam("sanxing");
    }

    @Override
    void setRom() {
        product.setRom("haikang");
    }

}

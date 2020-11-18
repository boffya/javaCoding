package com.suncor.coding.design.builder;

/**
 * @program: coding
 * @description: 具体建造者(Concrete Builder ）
 * @author: sunc
 * @create: 2020-11-12 15:37
 **/
public class ConcreteBuilder2 extends AbstractBuilder {
    @Override
    void setCpu() {
        product.setCpu("amd");
    }

    @Override
    void setRam() {
        product.setRam("huipu");
    }

    @Override
    void setRom() {
        product.setRom("xunjie");
    }

}

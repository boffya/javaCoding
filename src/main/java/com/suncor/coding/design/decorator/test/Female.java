package com.suncor.coding.design.decorator.test;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-17 14:35
 **/
public class Female implements Person {

    public Female() {
        System.out.println("我是女孩");
    }

    @Override
    public void operation() {
        System.out.println("我要开始穿衣服了");
    }
}

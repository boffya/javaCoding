package com.suncor.coding.interfaces.impl;

import com.suncor.coding.interfaces.InterfaceWithDefault;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.interfaces.impl Son 2020/3/14 14:55
 */
public class Son implements InterfaceWithDefault {
    @Override
    public void firstMethod() {
        System.out.println(1);
    }

    @Override
    public void secondMethod() {
        newMethod();
    }

    public static void main(String[] args){
        InterfaceWithDefault a = new Son();
        a.newMethod();
    }
}

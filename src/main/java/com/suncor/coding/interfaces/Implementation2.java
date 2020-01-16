package com.suncor.coding.interfaces;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.interfaces Implementation2 2020/1/16 13:47
 */
public class Implementation2 implements InterfaceWithDefault {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args){
         InterfaceWithDefault i = new Implementation2();
         i.firstMethod();
         i.secondMethod();
         i.newMethod();
    }
}

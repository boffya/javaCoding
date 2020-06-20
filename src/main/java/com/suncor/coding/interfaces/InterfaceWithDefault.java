package com.suncor.coding.interfaces;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.interfaces InterfaceWithDefault 2020/1/16 13:47
 */
public interface InterfaceWithDefault {
    int i= 111;
    void firstMethod();

    void secondMethod();

    default void newMethod() {
        System.out.println(i);
    }

}

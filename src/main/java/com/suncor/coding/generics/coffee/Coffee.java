package com.suncor.coding.generics.coffee;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.generics.coffee Coffee 2020/4/20 15:47
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

package com.suncor.coding.polymorphic.upTransformation;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.polymorphic.upTransformation Shared 2020/1/15 13:04
 */
public class Shared {

    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

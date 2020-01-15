package com.suncor.coding.polymorphic.upTransformation.shape;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.polymorphic.upTransformation.shape Square 2020/1/15 9:44
 */
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

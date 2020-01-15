package com.suncor.coding.polymorphic.upTransformation.shape;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.polymorphic.upTransformation.shape Triangle 2020/1/15 9:44
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

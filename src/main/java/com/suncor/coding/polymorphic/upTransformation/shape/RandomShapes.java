package com.suncor.coding.polymorphic.upTransformation.shape;

import java.util.Random;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.polymorphic.upTransformation.shape RandomShapes 2020/1/15 9:56
 */
public class RandomShapes {

    private Random rand = new Random(47);

    public Shape get() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public Shape[] array(int size){
        Shape[] shapes = new Shape[size];
        for (int i=0;i<shapes.length;i++){
            shapes[i] = get();
        }
        return shapes;
    }

//    public static void main(String[] args){
//        Shape[] shapes = RandomShapes.array(99);
//        for (Shape shape : shapes) {
//            shape.draw();
//        }
//    }
}

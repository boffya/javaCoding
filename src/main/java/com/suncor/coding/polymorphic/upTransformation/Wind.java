package com.suncor.coding.polymorphic.upTransformation;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.polymorphic.upTransformation Wind 2020/1/15 9:19
 */
public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

}

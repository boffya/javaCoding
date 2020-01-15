package com.suncor.coding.polymorphic.upTransformation;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.polymorphic.upTransformation Music 2020/1/15 9:20
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute);
    }
}

package com.suncor.coding.enums;

import java.util.Random;
import java.util.function.Supplier;

public enum CartoonCharater implements Supplier<CartoonCharater> {
    SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;

    static void  pg(){
        System.out.println(1111);
    }
    private Random rand = new Random(47);
    @Override
    public CartoonCharater get() {
        return values()[rand.nextInt(values().length)];
    }

    public static void main(String[] args) {
        CartoonCharater cc = CartoonCharater.BOB;
        for (int i = 0; i < 100; i++) {
            System.out.print(cc.get()+", ");
        }
    }
}

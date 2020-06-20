package com.suncor.coding.stream;

import static com.suncor.coding.stream.RandInts.rands;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream ForEach 2020/5/16 14:27
 */
public class ForEach {
    static final int SZ = 14;
    public static void main(String[] args) {
        rands().limit(SZ)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEachOrdered(n -> System.out.format("%d ", n));
    }
}

package com.suncor.coding.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream RandInts 2020/5/16 14:27
 */
public class RandInts {
    private static int[] rints = new Random(47).ints(0, 1000).limit(100).toArray();

    public static IntStream rands() {
        return Arrays.stream(rints);
    }
}

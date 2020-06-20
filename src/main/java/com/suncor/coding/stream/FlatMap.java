package com.suncor.coding.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream FlatMap 2020/5/15 9:17
 */
public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Gonzo", "Fozzie", "Beaker"))
                .forEach(System.out::println);



        Stream.of(1, 2, 3)
                .map(i -> Arrays.asList("Gonzo", "Fozzie", "Beaker"))
                .forEach(System.out::println);
    }
}

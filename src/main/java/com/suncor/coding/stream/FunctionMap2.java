package com.suncor.coding.stream;

import java.util.stream.Stream;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream FunctionMap2 2020/5/15 8:52
 */
public class FunctionMap2 {
    public static void main(String[] args) {
        Stream.of(1, 5, 7, 9, 11, 13)
                .map(Numbered::new)
                .forEach(System.out::println);
    }
}

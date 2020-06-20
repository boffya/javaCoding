package com.suncor.coding.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream Fibonacci 2020/5/14 16:24
 */
public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        int c = new Fibonacci().numbers()
                // 过滤前 20 个
                .limit(10) // 然后取 10 个
                .max((a, b) -> a > b ? b : a).get();

//                .forEach(System.out::println);
        System.out.println(c);
        System.out.println(IntStream.range(0, 999).limit(100).sum());
    }
}

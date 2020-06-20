package com.suncor.coding.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream Matching 2020/5/16 15:03
 */
public class Matching {
    static void show(Matcher match, int val) {
        System.out.println(
                match.test(
                        Stream.empty(),
                        n -> n < val));
    }
    public static void main(String[] args) {
        show(Stream::allMatch, 10);
        show(Stream::allMatch, 4);
        show(Stream::anyMatch, 2);
        show(Stream::anyMatch, 0);
        show(Stream::noneMatch, 5);
        show(Stream::noneMatch, 0);

        List<Integer> list = Arrays.asList(1,null,3,4,5,6,7);
//        List<Integer> list = Arrays.asList(null);
        Optional<Integer> opts =  list.stream().findAny();
        System.out.println(opts);
    }
}

package com.suncor.coding.stream;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream Matcher 2020/5/16 15:04
 */
public interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>> {
}

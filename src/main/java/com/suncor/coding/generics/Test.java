package com.suncor.coding.generics;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.generics Test 2020/4/21 10:16
 */
public class Test {

    public static void main(String[] args) {
        //定义第一个Consumer
        Consumer<Integer> consumer1 = (param) -> {
            System.out.println(param);
        };

        //定义第二个Consumer
        Consumer<Integer> consumer2 = (param) -> {
            System.out.println(param * param);
        };

        //consumer1可以连续的调用自己
        consumer1.andThen(consumer1).andThen(consumer1);
        //打印出 3 3 3

        //consumer1可以调用自己后调用consumer2
        consumer1.andThen(consumer1).andThen(consumer2).accept(3);
        //打印出3 3 9


        Function<Integer, Integer> fun = res -> res + 1;
        Integer i = fun.apply(2);
        System.out.println(i);

        Function<Integer, Integer> fun2 = res -> res + 1;
        Function<Integer, Integer> fun3 = res -> res * 10;
        Integer i1 = (Integer) fun2.compose(fun3).apply(2);
        System.out.println(i1);

    }

}

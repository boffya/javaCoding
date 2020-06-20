package com.suncor.coding.FunctionalProgramming.transformFunction;

import cn.hutool.core.lang.func.Func;

import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.FunctionalProgramming.transformFunction TransformFunction 2020/4/23 16:23
 */
public class TransformFunction {
    static int count = 0;

    static Function<I, O> transform(Function<I, O> in) {
        return in.andThen(o -> {
            System.out.println(o);
            return o;
        });
    }

    public static void main(String[] args) {
//        Function<I,O> f2 = transform(i -> {
//            System.out.println(i);
//            return new O();
//        });
//
//        O o = f2.apply(new I());
        Function<Integer, String> func1 = x -> x.toString();
        Function<String, Integer> func2 = a -> Integer.valueOf(a);
        Integer num = func1.andThen(func2).apply(11);
        System.out.println(num);


        Function<String, Integer> func3 = x -> Integer.valueOf(x);
        Function<Integer, String> func4 = a -> a.toString();
        Integer aaa = func3.compose(func4).apply(11);
        System.out.println(num);
        System.out.println(count);
        changeNum();
        System.out.println(count);

//        IntFunction<Integer>

    }

    static void changeNum() {
        ++count;
    }
}

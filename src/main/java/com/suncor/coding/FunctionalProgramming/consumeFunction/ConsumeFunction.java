package com.suncor.coding.FunctionalProgramming.consumeFunction;

import java.util.function.Function;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.FunctionalProgramming.consumeFunction ConsumeFunction 2020/4/23 16:09
 */
public class ConsumeFunction {
    static Two consume(Function<One, Two> func) {
        return func.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(x -> new Two());
    }
}

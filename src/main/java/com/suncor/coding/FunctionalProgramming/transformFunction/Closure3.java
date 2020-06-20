package com.suncor.coding.FunctionalProgramming.transformFunction;

import java.util.function.IntSupplier;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.FunctionalProgramming.transformFunction Closure3 2020/4/23 18:28
 */
public class Closure3 {
    IntSupplier makeFun(int x) {
        Integer i = 0;
//        i = i + 1;
        return () -> x + i;
    }
}

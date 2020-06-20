package com.suncor.coding.FunctionalProgramming.methodConversion;

import com.suncor.coding.FunctionalProgramming.FunctionVariants.IBaz;

import java.util.Comparator;
import java.util.function.BiConsumer;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.FunctionalProgramming.methodConversion MethodConversion 2020/4/23 14:38
 */
public class MethodConversion {


    public static void main(String[] args) {
        BiConsumer<In1, String> aa = In1::a;
        aa.accept(new In1(), "handsome");


        Comparator<Integer> c = (a, b) -> a > b ? 1 : 0;
        System.out.println(c.compare(1, 2));

        Comparator<IBaz> ii = (a, b) -> a.getI() > b.getI() ? 1 : 0;
        System.out.println(ii.compare(new IBaz(3), new IBaz(1)));
    }
}

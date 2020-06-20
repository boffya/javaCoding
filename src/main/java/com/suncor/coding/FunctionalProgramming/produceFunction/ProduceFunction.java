package com.suncor.coding.FunctionalProgramming.produceFunction;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.FunctionalProgramming.produceFunction ProduceFunction 2020/4/23 15:52
 */
public class ProduceFunction {

    public static void main(String[] args) {
        FuncSS f = x-> x + " sunce";
        System.out.format("%s",f.apply("hello"));
    }
}

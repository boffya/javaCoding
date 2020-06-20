package com.suncor.coding.FunctionalProgramming;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.FunctionalProgramming Test 2020/4/21 20:34
 */
public class Test {
    public static void main(String[] args) {
        Strategy strategy = msg -> msg.toUpperCase();
        System.out.println(strategy.approach("abcdefg"));
        Strategy strategy1 = new Strategy() {
            @Override
            public String approach(String msg) {
                return msg.toLowerCase();
            }
        };
        System.out.println(strategy1.approach("HIJKLMN"));

        new Thread(
                ()->System.out.println("xxxxx")
        );

    }
}

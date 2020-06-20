package com.suncor.coding.stream;

import static com.suncor.coding.stream.RandInts.rands;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream Informational 2020/5/18 13:35
 */
public class Informational {

        public static void main(String[] args) {
            System.out.println(rands().average().getAsDouble());
            System.out.println(rands().max().getAsInt());
            System.out.println(rands().min().getAsInt());
            System.out.println(rands().sum());
            System.out.println(rands().summaryStatistics());
        }
}

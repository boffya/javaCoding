package com.suncor.coding.stream;

//import static com.suncor.coding.stream.RandInts.rands;

import static com.suncor.coding.stream.RandInts.rands;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.stream SelectElement 2020/5/18 13:24
 */
public class SelectElement {
    public static void main(String[] args) {
        System.out.println(rands().findFirst().getAsInt());
        System.out.println(
                rands().parallel().findFirst().getAsInt());
        System.out.println(rands().findAny().getAsInt());
        System.out.println(
                rands().parallel().findAny().getAsInt());
    }
}

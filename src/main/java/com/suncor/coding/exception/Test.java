package com.suncor.coding.exception;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.exception Test 2020/3/16 9:02
 */
public class Test {

    public static void main(String[] args) {
        try {
           throw  new NullPointerException();
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace(System.out);
            e.fillInStackTrace();
        }

    }
}

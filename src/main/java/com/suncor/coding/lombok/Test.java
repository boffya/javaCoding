package com.suncor.coding.lombok;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-09-24 16:08
 **/
public class Test {
    public static void main(String[] args) {
        Integer cnt = 1;
        change(cnt);
        System.out.println(cnt);
    }
    public static void change(Integer cnt){
        cnt =2;
    }
}

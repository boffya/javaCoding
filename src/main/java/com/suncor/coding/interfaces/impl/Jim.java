package com.suncor.coding.interfaces.impl;

import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Validator;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.interfaces.impl Jim 2020/1/16 14:02
 */
public class Jim implements Jim1,Jim2 {
    @Override
    public void jim() {
        Jim2.super.jim();
    }
    public static void main(String[] args) {
        new Jim().jim();
//        Console.log(Validator.("","1","不一样"));

    }
}

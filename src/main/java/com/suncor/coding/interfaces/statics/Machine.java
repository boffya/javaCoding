package com.suncor.coding.interfaces.statics;

import cn.hutool.core.lang.Console;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.interfaces.statics Machine 2020/1/16 14:19
 */
public class Machine {

    public static void main(String[] args) {
        Operations.runOps(new Bing(), new Crack(), new Twist());
        String[] parms = {"1","2","3"};
        for (String parm : parms) {
            Console.log(parm);
            Console.error(parm);
        }
    }
}

package com.suncor.coding.interfaces.statics;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.interfaces.statics Operations 2020/1/16 14:16
 */
public interface Operations {
    void execute();

    static void runOps(Operations... ops) {
        for (Operations op : ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}

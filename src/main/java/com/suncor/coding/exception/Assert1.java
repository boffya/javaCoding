package com.suncor.coding.exception;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.exception Assert1 2020/3/16 15:17
 */
public class Assert1 {
    public static void main(String[] args) {
        boolean assertionsEnabled = false;
        // Note intentional side effect of assignment:
        assert assertionsEnabled = true;
        if(!assertionsEnabled)
            throw new RuntimeException("Assertions disabled");
    }
}

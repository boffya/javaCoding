package com.suncor.coding.FunctionalProgramming.unboundMethodReference;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.FunctionalProgramming.unboundMethodReference UnboundMethodReference 2020/4/22 10:40
 */
public class UnboundMethodReference {
    public static void main(String[] args) {
//        MakeString ms = X::f; // [1]
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x)); // [2]
        System.out.println(x.f()); // 同等效果



        TwoArgs<This> a = This::two;
        This b = new This();
        a.call(b,2,3D);
    }
}

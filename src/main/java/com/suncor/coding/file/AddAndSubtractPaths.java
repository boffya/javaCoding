package com.suncor.coding.file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.file AddAndSubtractPaths 2020/3/16 16:23
 */
public class AddAndSubtractPaths {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
//        System.out.println(base);
        Path p = Paths.get("AddAndSubtractPaths.java").toAbsolutePath();
        Path p1 = p.relativize(Paths.get("idea"));
        Path p2 = p.resolve(Paths.get("AddAndSubtractPaths.java"));
        System.out.println(p1);
        System.out.println(p2);
    }
}

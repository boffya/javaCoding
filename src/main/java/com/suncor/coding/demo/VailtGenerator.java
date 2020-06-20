package com.suncor.coding.demo;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.demo VailtGenerator 2020/5/14 10:21
 */
public class VailtGenerator implements Supplier<String> {

    private static VailtGenerator instance = new VailtGenerator();

    private VailtGenerator() {
    }

    private Random rand = new Random();

    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    /**
     * Gets a result.
     *
     * @return a result
     */
    @Override
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static VailtGenerator getInstance() {
        return instance;
    }

    public static String generateVerification(Integer length) {
        return Stream.generate(getInstance()).distinct().limit(length).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(x -> System.out.println(VailtGenerator.generateVerification(10)));
    }
}

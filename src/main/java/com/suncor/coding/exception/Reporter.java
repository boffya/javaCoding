package com.suncor.coding.exception;

import java.io.Closeable;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.exception Reporter 2020/3/16 14:57
 */
class Reporter implements AutoCloseable {
    String name = getClass().getSimpleName();

    Reporter() {
        System.out.println("Creating " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing " + name);
    }
}

class First extends Reporter {
}

class Second extends Reporter {
}

class AutoCloseableDetails {
    public static void main(String[] args) {
        try (
                First f = new First();
                Second s = new Second()
        ) {
        }
    }
}
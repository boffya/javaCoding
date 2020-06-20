package com.suncor.coding.string;

import java.util.Formatter;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.string ReceiptBuilder 2020/5/18 16:36
 */
public class ReceiptBuilder {

    private double total = 0;

    private Formatter f = new Formatter(new StringBuilder());

    public ReceiptBuilder() {
        f.format("%-15s %5s %10s%n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s%n", "----", "---", "----");
    }

    public void add(String name, int qty, double price) {
        f.format("%15.15s %5d %10.2f%n", name, qty, price);
        total += price * qty;
    }

    public String build() {
        f.format("%-15s %5s %10s%n", "", "", "----");
        f.format("%-15s %5s %10.2f%n", "Total", "", total);
        return f.toString();
    }

    public static void main(String[] args) {
        ReceiptBuilder rb = new ReceiptBuilder();
        rb.add("Jack's Magic Beans", 4, 4.25);
        rb.add("Princess Peas", 3, 5.1);
        rb.add(
                "Three Bears Porridge", 1, 14.29);
        System.out.println(rb.build());
    }
}

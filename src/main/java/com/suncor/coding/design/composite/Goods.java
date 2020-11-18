package com.suncor.coding.design.composite;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-18 15:55
 **/
public class Goods implements Articles {
    private String name;
    private int quantity;
    private float unitPrice;

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

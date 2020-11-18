package com.suncor.coding.design.builder;

/**
 * @program: coding
 * @description: 产品角色（Product）
 * @author: sunc
 * @create: 2020-11-12 15:30
 **/
public class Product {

    private String cpu;
    private String ram;
    private String rom;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                '}';
    }
}

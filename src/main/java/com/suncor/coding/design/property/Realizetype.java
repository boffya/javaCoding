package com.suncor.coding.design.property;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-11 09:01
 **/
public class Realizetype implements Cloneable {
    private Integer cnt;

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public String toString() {
        return "Realizetype{" +
                "cnt=" + cnt +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }

    public static void main(String[] args)throws CloneNotSupportedException
    {
        Realizetype obj1=new Realizetype();
        obj1.setCnt(1);
        Realizetype obj2=(Realizetype)obj1.clone();
        obj2.setCnt(2);
        System.out.println("obj1==obj2?"+(obj1==obj2));
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

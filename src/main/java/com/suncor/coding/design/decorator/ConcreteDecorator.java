package com.suncor.coding.design.decorator;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-16 16:40
 **/
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }

    public static void main(String[] args) {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d=new ConcreteDecorator(p);
        d.operation();
        System.out.println("---------------------------------");
        Component y =new ConcreteDecorator(d);
        y.operation();
    }
}

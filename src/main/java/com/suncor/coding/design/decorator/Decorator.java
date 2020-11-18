package com.suncor.coding.design.decorator;

/**
 * @program: coding
 * @description:
 * @author: sunc
 * @create: 2020-11-16 16:39
 **/
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

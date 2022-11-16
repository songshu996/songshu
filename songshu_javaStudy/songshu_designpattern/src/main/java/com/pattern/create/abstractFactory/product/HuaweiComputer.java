package com.pattern.create.abstractFactory.product;

public class HuaweiComputer implements Computer{
    @Override
    public void show() {
        System.out.println("这是一台华为电脑");
    }
}

package com.pattern.create.abstractFactory.product;

public class HuaweiPhone implements Phone{
    @Override
    public void show() {
        System.out.println("这是一部华为手机");
    }
}

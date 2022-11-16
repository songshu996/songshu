package com.pattern.create.abstractFactory.product;

public class ApplePhone implements Phone{
    @Override
    public void show() {
        System.out.println("这是一部苹果手机");
    }
}

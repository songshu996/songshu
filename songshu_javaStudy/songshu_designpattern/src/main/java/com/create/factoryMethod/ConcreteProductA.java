package com.create.factoryMethod;

/**
 * 具体产品A
 */
public class ConcreteProductA implements Product{
    @Override
    public void show() {
        System.out.println("这是具体产品A");
    }
}

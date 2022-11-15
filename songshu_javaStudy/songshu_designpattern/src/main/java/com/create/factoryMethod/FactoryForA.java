package com.create.factoryMethod;

public class FactoryForA implements  Factory{
    @Override
    public Product createNewProduct() {
        System.out.println("A工厂生产产品A");
        return new ConcreteProductA();
    }
}

package com.pattern.create.factoryMethod;

public class FactoryForB implements Factory {
    @Override
    public Product createNewProduct() {
        System.out.println("B工厂生产产品B");
        return new ConcreteProductB();
    }
}

package com.pattern.create.factoryMethod;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public Product createProduct(int kind) {
        switch (kind) {
            case 1:
                return new ConcreteProductA();
            case 2:
                return new ConcreteProductB();
            default:
                break;
        }
        return null;
    }
}

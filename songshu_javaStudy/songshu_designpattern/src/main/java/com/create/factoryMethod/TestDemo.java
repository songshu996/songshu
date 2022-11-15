package com.create.factoryMethod;

public class TestDemo {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createProduct(1).show();

        Factory factory = new FactoryForA();
        factory.createNewProduct().show();

        Factory factoryForB = new FactoryForB();
        factoryForB.createNewProduct().show();

    }
}

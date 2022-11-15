package com.create.abstractFactory;

import com.create.abstractFactory.factory.AppleFactory;
import com.create.abstractFactory.factory.HuaweiFactory;
import com.create.abstractFactory.product.Computer;

public class TestDemo {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        appleFactory.createNewComputer().show();
        appleFactory.createNewPhone().show();

        HuaweiFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.createNewComputer().show();
        huaweiFactory.createNewPhone().show();

    }
}

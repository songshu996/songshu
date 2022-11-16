package com.pattern.create.abstractFactory;

import com.pattern.create.abstractFactory.factory.AppleFactory;
import com.pattern.create.abstractFactory.factory.HuaweiFactory;

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

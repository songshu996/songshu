package com.pattern.create.abstractFactory.factory;

import com.pattern.create.abstractFactory.product.AppleComputer;
import com.pattern.create.abstractFactory.product.ApplePhone;
import com.pattern.create.abstractFactory.product.Computer;
import com.pattern.create.abstractFactory.product.Phone;

/**
 * 具体工厂类 - 苹果公司
 */
public class AppleFactory implements Factory{
    @Override
    public Computer createNewComputer() {
        System.out.println("生产一台苹果电脑");
        return new AppleComputer();
    }

    @Override
    public Phone createNewPhone() {
        System.out.println("生产一部苹果手机");
        return new ApplePhone();
    }
}

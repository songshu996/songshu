package com.create.abstractFactory.factory;

import com.create.abstractFactory.product.*;

public class HuaweiFactory implements Factory {

    @Override
    public Computer createNewComputer() {
        System.out.println("生产一台华为电脑");
        return new HuaweiComputer();
    }

    @Override
    public Phone createNewPhone() {
        System.out.println("生产一部华为手机");
        return new HuaweiPhone();
    }
}

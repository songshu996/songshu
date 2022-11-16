package com.pattern.create.abstractFactory.factory;

import com.pattern.create.abstractFactory.product.*;
import com.pattern.create.abstractFactory.product.Computer;
import com.pattern.create.abstractFactory.product.HuaweiComputer;
import com.pattern.create.abstractFactory.product.HuaweiPhone;
import com.pattern.create.abstractFactory.product.Phone;

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

package com.create.abstractFactory.factory;

import com.create.abstractFactory.product.Computer;
import com.create.abstractFactory.product.Phone;

/**
 * 抽象工厂类
 */
public interface Factory {

    Computer createNewComputer();

    Phone createNewPhone();

}

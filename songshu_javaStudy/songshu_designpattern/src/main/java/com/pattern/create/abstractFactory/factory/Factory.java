package com.pattern.create.abstractFactory.factory;

import com.pattern.create.abstractFactory.product.Computer;
import com.pattern.create.abstractFactory.product.Phone;

/**
 * 抽象工厂类
 */
public interface Factory {

    Computer createNewComputer();

    Phone createNewPhone();

}

package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bar {

    public static final Logger logger = LogManager.getLogger(Bar.class);

    public  boolean doIt() {
        // 打印日志
        logger.trace("entry");
        logger.error("Did it again!");
        logger.trace("exit");
        // 日志结束
        return false;
    }

}

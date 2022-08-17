package com.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Demo {

    private static Logger logger = LoggerFactory.getLogger(Log4j2Demo.class);

    public static void main(String[] args) {
        logger.info("info *********************");
    }
}

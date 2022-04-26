package com.songshu.log4j;

import org.apache.log4j.Logger;

public class Log4jDemo {

    private static Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        logger.info("info -----------> info");
        logger.debug("debug -----------> debug");
        logger.warn("warn -----------> warn");
        logger.error("error -----------> error");
    }
}

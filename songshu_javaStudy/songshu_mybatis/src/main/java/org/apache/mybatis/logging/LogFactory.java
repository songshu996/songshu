package org.apache.mybatis.logging;

import org.apache.mybatis.logging.commons.JakartaCommonsLoggingImpl;
import org.apache.mybatis.logging.jdbc.jdk14.Jdk14LoggingImpl;
import org.apache.mybatis.logging.log4j.Log4jImpl;
import org.apache.mybatis.logging.log4j2.Log4j2Impl;
import org.apache.mybatis.logging.nologging.NoLoggingImpl;
import org.apache.mybatis.logging.slf4j.Slf4jImpl;
import org.apache.mybatis.logging.stdout.StdOutImpl;

import java.lang.reflect.Constructor;

public final class LogFactory {

  /**
   * Marker to be used by logging implementations that support markers.
   */
  public static final String MARKER = "MYBATIS";

  private static Constructor<? extends Log> logConstructor;

  static {
    //以下为日志的优先顺序
    tryImplementation(LogFactory::useSlf4jLogging);
    tryImplementation(LogFactory::useCommonsLogging);
    tryImplementation(LogFactory::useLog4J2Logging);
    tryImplementation(LogFactory::useLog4JLogging);
    tryImplementation(LogFactory::useJdkLogging);
    tryImplementation(LogFactory::useNoLogging);
  }

  private LogFactory() {
    // disable construction
  }

  public static Log getLog(Class<?> clazz) {
    return getLog(clazz.getName());
  }

  public static Log getLog(String logger) {
    try {
      return logConstructor.newInstance(logger);
    } catch (Throwable t) {
      throw new LogException("Error creating logger for logger " + logger + ".  Cause: " + t, t);
    }
  }

  public static synchronized void useCustomLogging(Class<? extends Log> clazz) {
    setImplementation(clazz);
  }

  /**
   * 禁用日志功能，不做任何日志输出
   */
  public static synchronized void useNoLogging() {
    setImplementation(NoLoggingImpl.class);
  }

  /**
   * 采用jdk原生API输出日志
   */
  public static synchronized void useStdOutLogging() {
    setImplementation(StdOutImpl.class);
  }

  /**
   * 采用jdk原生API输出日志的另一种方式，对JUI做了一层封装
   */
  public static synchronized void useJdkLogging() {
    setImplementation(Jdk14LoggingImpl.class);
  }

  /**
   * 使用log4j作为日志输出框架
   */
  @Deprecated
  public static synchronized void useLog4JLogging() {
    setImplementation(Log4jImpl.class);
  }

  /**
   * 使用log4j2作为日志输出框架
   */
  public static synchronized void useLog4J2Logging() {
    setImplementation(Log4j2Impl.class);
  }

  /**
   * Slf4j 也是一种日志门面，它提供了和很多日志关联的适配器
   */
  public static synchronized void useSlf4jLogging() {
    setImplementation(Slf4jImpl.class);
  }

  /**
   *  实现对commons-logging的封装
   */
  public static synchronized void useCommonsLogging() {
    setImplementation(JakartaCommonsLoggingImpl.class);
  }

  private static void tryImplementation(Runnable runnable) {
    if (logConstructor == null) {
      try {
        runnable.run();
      } catch (Throwable t) {
        // ignore
      }
    }
  }

  /**
   * 根据参数类对象，获取指定的构造方法，然后创建实例
   * @param implClass
   */
  private static void setImplementation(Class<? extends Log> implClass) {
    try {
      Constructor<? extends Log> candidate = implClass.getConstructor(String.class);
      Log log = candidate.newInstance(LogFactory.class.getName());
      if (log.isDebugEnabled()) {
        log.debug("Logging initialized using '" + implClass + "' adapter.");
      }
      logConstructor = candidate;
    } catch (Throwable t) {
      throw new LogException("Error setting Log implementation.  Cause: " + t, t);
    }
  }

}

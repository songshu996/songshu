package org.apache.mybatis.logging.commons;

import org.apache.mybatis.logging.Log;
import org.apache.mybatis.logging.LogFactory;

/**
 * 这种实现方式是对 commons-logging 的封装
 * commons-logging 也叫 JCL 它是一种日志的门面，所谓门面就是它提供了统一的接口，底层适配了各个日志接口的实现，然后根据规则调用各个日志实现，返回 Log 对象。
 * <li>commons-logging 的适配规则是：</li>
 *  org.apache.commons.logging.impl.Log4JLogger(Log4j)<br/>
 *  org.apache.commons.logging.impl.Jdk14Logger(Jul,Jdk1.4之后)<br/>
 *  org.apache.commons.logging.impl.Jdk13LumberjackLogger(Jul,Jdk1.4之前)<br/>
 *  org.apache.commons.logging.impl.SimpleLog(System.err.println)<br/>
 *  但是当所有规则都不能匹配的情况下，它会自己实现一个简单的日志 SimpleLog 但是从匹配规则来看，如果项目依赖中没有 Log4j 那么应该匹配 Jul 这个肯定是存在的，毕竟它是在 JDK 自带的包中。
 */
public class JakartaCommonsLoggingImpl implements org.apache.mybatis.logging.Log {

  private final Log log;

  public JakartaCommonsLoggingImpl(String clazz) {
    log = LogFactory.getLog(clazz);
  }

  @Override
  public boolean isDebugEnabled() {
    return log.isDebugEnabled();
  }

  @Override
  public boolean isTraceEnabled() {
    return log.isTraceEnabled();
  }

  @Override
  public void error(String s, Throwable e) {
    log.error(s, e);
  }

  @Override
  public void error(String s) {
    log.error(s);
  }

  @Override
  public void debug(String s) {
    log.debug(s);
  }

  @Override
  public void trace(String s) {
    log.trace(s);
  }

  @Override
  public void warn(String s) {
    log.warn(s);
  }
}

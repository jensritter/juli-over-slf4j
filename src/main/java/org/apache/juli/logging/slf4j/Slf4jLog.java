package org.apache.juli.logging.slf4j;

import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Stepan Koltsov
 */
public class Slf4jLog implements Log {

    private final Logger logger;

    public Slf4jLog(Logger logger) {
        this.logger = logger;
    }

    public static Slf4jLog getLogger(Class<?> clazz) {
        return new Slf4jLog(LoggerFactory.getLogger(clazz));
    }

    public static Slf4jLog getLogger(String name) {
        return new Slf4jLog(LoggerFactory.getLogger(name));
    }

    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    public boolean isFatalEnabled() {
        return false;
    }

    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    private String nullCheck(Object o) {
        if(o == null)
            return "null";
        else
            return o.toString();
    }

    public void trace(Object message) {
        logger.trace(nullCheck(message));
    }

    public void trace(Object message, Throwable t) {
        logger.trace(nullCheck(message), t);
    }

    public void debug(Object message) {
        logger.debug(nullCheck(message));
    }

    public void debug(Object message, Throwable t) {
        logger.debug(nullCheck(message), t);
    }

    public void info(Object message) {
        logger.info(nullCheck(message));
    }

    public void info(Object message, Throwable t) {
        logger.info(nullCheck(message), t);
    }

    public void warn(Object message) {
        logger.warn(nullCheck(message));
    }

    public void warn(Object message, Throwable t) {
        logger.warn(nullCheck(message), t);
    }

    public void error(Object message) {
        logger.error(nullCheck(message));
    }

    public void error(Object message, Throwable t) {
        logger.error(nullCheck(message), t);
    }

    public void fatal(Object message) {
        logger.error(nullCheck(message));
    }

    public void fatal(Object message, Throwable t) {
        logger.error(nullCheck(message), t);
    }

} //~

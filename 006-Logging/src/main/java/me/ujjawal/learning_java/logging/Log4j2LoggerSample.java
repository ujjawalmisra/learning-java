package me.ujjawal.learning_java.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Resources:<br>
 * <ol>
 *     <li>{@link https://logging.apache.org/log4j/2.x/}</li>
 *     <li>{@link https://logging.apache.org/log4j/2.x/manual/configuration.html}</li>
 * </ol>
 * Additivity feature can control log event bubbling from child to parent logger.
 */
public class Log4j2LoggerSample {

    private static final Logger LOGGER = LogManager.getLogger(Log4j2LoggerSample.class);

    public static void main(String[] args) {
        // message/log-data --> Logger --> Filter --> Formatter --> Appender
        LOGGER.fatal("This is a message from logger.fatal");
        LOGGER.warn("This is a message from logger.warn");
        LOGGER.info("This is a message from logger.info");
        LOGGER.debug("This is a message from logger.debug");
        LOGGER.trace("This is a message from logger.trace");
    }
}

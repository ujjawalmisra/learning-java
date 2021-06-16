package me.ujjawal.learning_java.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultLoggerSample {

    private static final Logger logger = Logger.getLogger(DefaultLoggerSample.class.getName());

    public static void main(String[] args) {
        System.out.println("This is a message from System.out");
        logger.info("This is a message from logger.info");
        for(Level level : new Level[] {Level.OFF, Level.SEVERE, Level.WARNING, Level.INFO, Level.CONFIG, Level.FINE,
                Level.FINER, Level.FINEST, Level.ALL}) {

            logger.info(String.format("Level --> %s, %d, %b", level.getName(), level.intValue(),
                    logger.isLoggable(level)));
        }

    }
}

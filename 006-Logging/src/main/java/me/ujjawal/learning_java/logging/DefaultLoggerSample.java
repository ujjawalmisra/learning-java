package me.ujjawal.learning_java.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultLoggerSample {

    private static final Logger LOGGER = Logger.getLogger(DefaultLoggerSample.class.getName());

    public static void main(String[] args) {
        System.out.println("This is a message from System.out");
        LOGGER.info("This is a message from logger.info");
        LOGGER.warning("This is a message from logger.warning");
        LOGGER.setLevel(Level.ALL);
        for (Level level : new Level[]{Level.OFF, Level.SEVERE, Level.WARNING, Level.INFO, Level.CONFIG, Level.FINE,
                Level.FINER, Level.FINEST, Level.ALL}) {

            LOGGER.info(String.format("Level --> %s, %d, %b", level.getName(), level.intValue(),
                    LOGGER.isLoggable(level)));
        }
        LOGGER.severe("This is a message from logger.severe");
        LOGGER.info("level: " + LOGGER.getLevel().getName());
        int sum = sum(1, 2);
        LOGGER.info("sum:" + sum);

    }

    private static int sum(int x, int y) {
        LOGGER.finest("x:" + x);
        LOGGER.info("y:" + y);
        int result = x + y;
        LOGGER.info("result:" + result);
        return result;
    }
}

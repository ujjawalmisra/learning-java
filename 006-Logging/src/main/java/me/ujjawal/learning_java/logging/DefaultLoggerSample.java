package me.ujjawal.learning_java.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultLoggerSample {

    private static final Logger logger = Logger.getLogger(DefaultLoggerSample.class.getName());

    public static void main(String[] args) {
        System.out.println("This is a message from System.out");
        logger.info("This is a message from logger.info");
        logger.warning("This is a message from logger.warning");
        logger.setLevel(Level.ALL);
        for (Level level : new Level[]{Level.OFF, Level.SEVERE, Level.WARNING, Level.INFO, Level.CONFIG, Level.FINE,
                Level.FINER, Level.FINEST, Level.ALL}) {

            logger.info(String.format("Level --> %s, %d, %b", level.getName(), level.intValue(),
                    logger.isLoggable(level)));
        }
        logger.severe("This is a message from logger.severe");
        logger.info("level: " + logger.getLevel().getName());
        int sum = sum(1, 2);
        logger.info("sum:" + sum);

    }

    private static int sum(int x, int y) {
        logger.finest("x:" + x);
        logger.info("y:" + y);
        int result = x + y;
        logger.info("result:" + result);
        return result;
    }
}

package me.ujjawal.learning_java.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * JUnit is vast and feature rich. It has evolved a lot over time. Here we will get introduced to the basics on line
 * of the non-framework approach of testing we discussed earlier. It would be good to read and explore JUnit on need
 * basis.<br>
 * <br>
 * References:
 * <ol>
 *     <li>{@link https://junit.org/junit5/docs/current/user-guide/#overview}</li>
 * </ol>
 */
public class UsingJUnit {

    /**
     * Project --> Deploy --> Application | Service
     *
     * Service (MY) --> Used by other services (A,B,C)
     * A -- calling --> MY
     * B -- calling --> MY
     * C -- calling --> MY
     * A,B,C ==> Downstream services, in context of MY
     * Service (MY) --> Calls other services (D,E)
     * MY -- calling --> D
     * MY -- calling --> E
     * D,E ==> Upstream services, in context of MY
     * Downstream -- call --> MY -- calls --> Upstream services
     *
     * Project -- made up of multiple modules --> packages --> classes --> functions --> lines-of-code
     * We write tests to ensure that whatever we have written is as per specifications.
     * functions --> Our functions should be as per the definition of the function. Definition of the function is
     * something which should be appropriately captured in the documentation of  the function.
     * classes --> In a way they get tested if we have tested our functions.
     * Smallest unit which we can test is functions. Because we can call them.
     * This type of testing, where we try to ensure a function behaves the way it is supposed to behave is called
     * Unit Testing.
     *
     * When we test with actual upstream services or resources it is called Integration Testing.
     */

    private static final Logger LOGGER = LogManager.getLogger(UsingJUnit.class);

    public static void main(String[] args) {
        SampleCalculator calculator = new SampleCalculator();
        try {
            LOGGER.info("sum(%d,%d): %d", 1, 2, calculator.sum(1,2));
            LOGGER.info("sub(%d,%d): %d", 1, 2, calculator.sub(1,2));
        } catch (CalculatorException e) {
            e.printStackTrace();
        }
    }

    static class SampleCalculator {

        private static final Logger LOGGER = LogManager.getLogger(SampleCalculator.class);

        Integer sum(Integer x, Integer y) throws CalculatorException {
            if (null == x) {
                throw new CalculatorException("x is invalid, shouldn't be null");
            }
            if (null == y) {
                throw new CalculatorException("y is invalid, shouldn't be null");
            }
            LOGGER.debug("x: " + x + ", y: " + y);
            Integer result = x + y;
            LOGGER.debug("result: " + result);
            return result;
        }

        Integer sub(Integer x, Integer y) throws CalculatorException {
            if (null == x) {
                throw new CalculatorException("x is invalid, shouldn't be null");
            }
            if (null == y) {
                throw new CalculatorException("y is invalid, shouldn't be null");
            }
            LOGGER.debug("x: " + x + ", y: " + y);
            Integer result = x - y;
            LOGGER.debug("result: " + result);
            return result;
        }
    }

    static class CalculatorException extends Exception {
        CalculatorException(String message) {
            super(message);
        }
    }

}

package me.ujjawal.learning_java.exceptions;

import java.util.Arrays;

/**
 * We can define our own exceptions based on the application logic. For a checked-exception extend {@link Exception},
 * for an unchecked-exception extend {@link RuntimeException}.<br>
 * <ol>
 *     <li>To create an exception object use the <code>new</code> operator.</li>
 *     <li>To raise/throw an exception use the <code>throw</code> keyword.</li>
 *     <li>To specify that a method generates/throws an exception use the <code>throws</code> keyword.</li>
 * </ol>
 * A method can generate or throw more than one exceptions as well.
 */
public class Throws {

    public static void main(String[] args) {
        NaturalNumberCalculator calculator = new NaturalNumberCalculator();
        try {
            System.out.println(String.format("%d + %d --> %d", 2, 3, calculator.add(2, 3)));
            System.out.println(String.format("%d - %d --> %d", 2, 3, calculator.sub(2, 3)));
            System.out.println(String.format("%d * %d --> %d", 2, 3, calculator.mul(2, 3)));
            System.out.println(String.format("%d / %d --> %d", 2, 3, calculator.div(-2, 3)));
        } catch (CalculatorException e) {
            e.printStackTrace();
        }
    }

    private static class NaturalNumberCalculator {

        public int add(int x, int y) throws CalculatorException {
            validate(x, y);
            return x + y;
        }

        public int sub(int x, int y) throws CalculatorException {
            validate(x, y);
            return x - y;
        }

        public int mul(int x, int y) throws CalculatorException {
            validate(x, y);
            return x * y;
        }

        public int div(int x, int y) throws CalculatorException {
            validate(x, y);
            return x / y;
        }

        private void validate(int... numbers) throws CalculatorException {
            int[] invalidNumbers = Arrays.stream(numbers).filter(e -> e < 1).toArray();
            if (0 < invalidNumbers.length) {
                /**
                 * An exception object can be created like any other object using the new operator.
                 * To raise/throw an exception us the throw keyword.
                 */
                throw new CalculatorException("Invalid numbers: " + Arrays.toString(invalidNumbers));
            }
        }
    }

    private static class CalculatorException extends Exception {
        public CalculatorException(String message) {
            super(message);
        }
    }
}

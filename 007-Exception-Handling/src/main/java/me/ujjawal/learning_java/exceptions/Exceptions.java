package me.ujjawal.learning_java.exceptions;

/**
 * An exception is something which is not a norm or not normal or not expected to happen. In the context of
 * programming an exception is something that can disrupt the execution flow of a program.<br>
 * Built-in functionality of java as well as libraries can generate different kind of exceptions indicate something
 * unexpected has happened. In other words an exception is a signal to the caller.<br>
 * Following is the hierarchy of Exceptions with some examples:<br>
 * {@link Throwable}<br>
 * -- {@link Exception}<br>
 * ------ {@link java.io.IOException}<br>
 * ------ {@link ClassNotFoundException}...<br>
 * ------ {@link RuntimeException}<br>
 * ------------ {@link NullPointerException}<br>
 * ------------ {@link IndexOutOfBoundsException}...<br>
 * -- {@link Error}<br>
 * <br>
 * The other classification of exceptions is:<br>
 * <ol>
 *     <li>Checked exceptions -- Can be checked at compile time.</li>
 *     <li>Unchecked exceptions -- Can be checked only at run time.</li>
 *     <li>Error -- They are issues from which the application can't recover. Eg. {@link OutOfMemoryError}</li>
 * </ol>
 */
public class Exceptions {

    public static void main(String[] args) {
        Integer i = null;
        /**
         * The following operation should throw a NullPointerException as we are trying to operate on a null object.
         */
        int result = increment(i, 2);
        System.out.println("result --> " + result);
    }

    private static int increment(Integer base, Integer difference) {
        return base + difference;
    }
}

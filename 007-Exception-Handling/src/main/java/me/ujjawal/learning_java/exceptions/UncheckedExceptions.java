package me.ujjawal.learning_java.exceptions;

public class UncheckedExceptions {
    public static void main(String[] args) {
        /**
         * Example trying to access an element that is not in an array
         */
        int[] arr = {0, 1, 2, 3, 4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(String.format("arr[%d] --> %d", i, arr[i]));
        }
    }
}

package me.ujjawal.learning_java.exceptions;

/**
 * We know that an exception is a signal to the caller to indicate that something unexpected has happened. The
 * mechanism through which the caller can receive the signal is called try-catch.
 */
public class TryCatch {

    public static void main(String[] args) {
        /**
         * If you want to ensure that error stream is redirected to output stream uncomment the following line.
         */
//        System.setErr(System.out);
        Integer i = null;
        try {
            int result = increment(i, 2);
            System.out.println("result --> " + result);
        } catch (NullPointerException e) {
            System.err.println("Couldn't increment because of --> " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("In finally");
        }
    }

    private static int increment(Integer base, Integer difference) {
        return base + difference;
    }
}

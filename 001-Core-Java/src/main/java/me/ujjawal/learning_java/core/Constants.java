package me.ujjawal.learning_java.core;

/**
 * By definition constants are those values that would not change. In other words they are those literals that we
 * want to use in our code as a fixed value.<br>
 * Constants are defined by using the keyword <code>final</code>.<br>
 * Note that constants are named using UPPER_SNAKE_CASE, by convention while coding in Java.
 */
public class Constants {

    /**
     * For constants which need to be shared across all objects of the class we mark them with the keyword and access
     * specifier <code>static</code>.
     */
    private static final String PROJECT_NAME = "learning-java";

    public static void main(String[] args) {
        /**
         * It's okay to have local constants in a block as well.
         */
        final double PI = 3.14;

        System.out.println("project name --> " + PROJECT_NAME);
        System.out.println("pi --> " + PI);

        float radius = 2.0f;
        double area = PI * Math.pow(radius, 2);

        System.out.println(String.format("area of circle of radius %.1fcm --> %.2fcm^2", radius, area));
    }
}

package me.ujjawal.learning_java.annotations;

import java.util.Arrays;

/**
 * Some of the predefined annotations are:
 * <ol>
 *     <li>{@link Deprecated} -- Mark the method as obsolete</li>
 *     <li>{@link SuppressWarnings} -- Indicate to the compiler that specific warnings can be suppressed</li>
 *     <li>{@link SafeVarargs} -- Mark that the code only uses variadic arguments in a safe fashion</li>
 *     <li>{@link FunctionalInterface} -- Check the example on Basic Unit Testing</li>
 * </ol>
 * There are some annotations that can be applied to other annotations. In other words when we define custom
 * annotations we may use these pre-defined annotations for annotation the newly defined custom annotation.
 * <ol>
 *     <li>{@link java.lang.annotation.Retention} -- SOURCE (dev-time) or CLASS (compile-time) or RUNTIME (runtime)</li>
 *     <li>{@link java.lang.annotation.Documented} -- Document the elements when custom annotation is used</li>
 *     <li>{@link java.lang.annotation.Target} -- What kind of Java elements can the custom annotation be used with</li>
 *     <li>{@link java.lang.annotation.Inherited} -- Marks custom annotation inheritable from a super class</li>
 *     <li>{@link java.lang.annotation.Repeatable} -- Can be applied multiple times to the same element</li>
 * </ol>
 */
public class PredefinedAnnotations {

    public static void main(String[] args) {
        System.out.println("sum --> " + sum(1, 2, 3, 4));
    }

    @SafeVarargs
    private static int sum(int... x) {
        return Arrays.stream(x).sum();
    }

    private static class Animal {

        @Deprecated
        private String getSound() {
            return "argh";
        }

        @SuppressWarnings("deprecation")
        private void oldMakeSound() {
            System.out.println(getSound());
        }

        @Override
        public String toString() {
            return "Animal{}";
        }
    }

}

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
 * Some of the scenarios that can be suppressed are:
 * <ol>
 *     <li>deprecation -- Ignores when we’re using a deprecated(no longer important) method or type</li>
 *     <li>divzero -- Suppresses division by zero warning</li>
 *     <li>empty -- Ignores warning of a statement with an empty body</li>
 *     <li>unchecked -- It doesn’t check if the data type is Object or primitive</li>
 *     <li>fallthrough -- Ignores fall-through on switch statements usually (if <code>break</code> is missing)</li>
 *     <li>hiding -- It suppresses warnings relative to locals that hide variable</li>
 *     <li>serial -- It makes the compiler shut up about a missing serialVersionUID</li>
 *     <li>finally -- Avoids warnings relative to finally block that doesn’t return</li>
 *     <li>unused -- To suppress warnings relative to unused code.</li>
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

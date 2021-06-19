package me.ujjawal.learning_java.annotations;

/**
 * Annotations provided added details or metadata about a class / interface / function etc. These details or
 * information might be relevant for:<br>
 * <ol>
 *     <li>Compiler -- Compile-time validation or suppression of errors.</li>
 *     <li>Runtime -- Runtime validations.</li>
 *     <li>Source-generation -- Compile-time or Runtime generation of code or files etc.</li>
 * </ol>
 */
public class AnnotationBasics {

    public static void main(String[] args) {
        /*
         * One of the most common annotation which we use is @Override
         */
        Animal animal = new Dog();
        animal.makeSound();

        Dog dog = (Dog) animal;
    }

    private static abstract class Animal {
        abstract void makeSound();
    }

    private static class Dog extends Animal {

        @Override
        void makeSound() {
            System.out.println("bark");
        }
    }
}

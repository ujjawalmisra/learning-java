package me.ujjawal.learning_java.oop;

import java.util.Arrays;

/**
 * Polymorphism is an OOP concept which specifies that the functionality depends on the context.<br>
 * In Java Polymorphism can be achieved by:<br>
 * <ol>
 *     <li>Method overloading - also referred to as Compile-time Polymorphism</li>
 *     <li>Method overriding - also referred to as Runtime Polymorphism or Dynamic Method Dispatch</li>
 * </ol>
 */
public class Polymorphism {
    public static void main(String[] args) {
        /**
         * ~~ Compile-time Polymorphism ~~
         * ~~ Method overloading ~~
         */
        System.out.println("~~~~ Compile-time Polymorphism : Method overloading ~~~~");
        AdditionOperator operator = new AdditionOperator();
        System.out.println(String.format("%d + %d --> %d", 1, 2, operator.sum(1, 2)));
        System.out.println(String.format("%d + %d + %d --> %d", 1, 2, 3, operator.sum(1, 2, 3)));
        System.out.println(String.format("%d + %d + %d + %d + %d --> %d", 1, 2, 3, 4, 5, operator.sum(1, 2, 3, 4, 5)));

        /**
         * ~~ Constructor overloading ~~
         */
        System.out.println("~~~~ Compile-time Polymorphism : Constructor overloading ~~~~");
        Person personA = new Person("Pallavi", 20);
        Person personB = new Person("Sunand");
        System.out.println("personA --> " + personA);
        System.out.println("personB --> " + personB);

        /**
         * ~~ Runtime Polymorphism or Dynamic Method Dispatch ~~
         * In case of an overridden method the call to it is decided at the runtime based on what is the type of the
         * object referred to by the variable.
         */
        System.out.println("~~~~ Runtime Polymorphism : Method overriding ~~~~");
        Animal dog = new Dog(); //upcasting
        Animal wolf = new Wolf(); //upcasting
        System.out.println("dog.makeASound() --> " + dog.makeASound());
        // dog.playWith(); --> Error
        System.out.println("wolf.makeASound() --> " + wolf.makeASound());
        // wolf.playWith(); --> Error

        /**
         * ~~ Covariant return types - Method overriding ~~
         * The get method in Dog and Wolf classes are overrides of the get method in Animal class. The point to be
         * noted is that the return types in the Base-class and Sub-class are different. This is allowed because the
         * return types refer to covariants of the same type.
         * Reference: https://www.javatpoint.com/covariant-return-type
         */
        System.out.println("dog.get().makeASound() --> " + dog.get().makeASound());
        System.out.println("wolf.get().makeASound() --> " + wolf.get().makeASound());
    }

    private static class AdditionOperator {

        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return sum(sum(a, b), c);
        }

        public int sum(int... x) {
            return Arrays.stream(x).sum();
        }

        public float sum(float a, float b) {
            return a + b;
        }

        public float sum(float a, float b, float c) {
            return sum(sum(a, b), c);
        }

        public float sum(float... x) {
            float s = 0.0f;
            for (float f : x) {
                s += f;
            }
            return s;
        }
    }

    private static class Person {
        private final String name;
        private final Integer age;

        public Person(String name) {
            this(name, 0);
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    private static class Animal {
        public String makeASound() {
            return "what what";
        }

        public Animal get() {
            return this;
        }
    }

    private static class Dog extends Animal {
        @Override
        public String makeASound() {
            return "bark bark";
        }

        @Override
        public Dog get() {
            return this;
        }

        public void playWith() {
            System.out.println("playing with the dog");
        }
    }

    private static class Wolf extends Animal {

        @Override
        public String makeASound() {
            return "howl howl";
        }

        @Override
        public Wolf get() {
            return this;
        }

        public void playWith() {
            System.out.println("playing with the wolf and running for my life");
        }
    }
}

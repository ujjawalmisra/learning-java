package me.ujjawal.learning_java.oop;

/**
 * Inheritance is a concept of OOP which specifies that a Class can have multiple child classes that have specific
 * behaviour or functionality. The Class may be called a Base-Class and a child class may be called a Sub-Class. The
 * Base-Class can be seen as a parent. A child can inherit many traits of the parent. A child may have many traits of
 * their own. A child may also have some traits that match the parent but have a flavour of their own.<br>
 * In Java Inheritance can be achieve by:<br>
 * <ol>
 *     <li>Extending another class</li>
 *     <li>Implementing an interface</li>
 * </ol>
 * As you would have understood or would notice going forward, Inheritance is a powerful aspect allowing reuse of code.
 */
public class Inheritance {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Hero Honda", "Karizma", "black");
        System.out.println(motorcycle);
        motorcycle.start();

        Car car = new Car("Maruti Suzuki", "Ciaz", "white");
        System.out.println(car);
        car.start();
    }

    private interface Rideable {
        void ride();
    }

    private interface Driveable {
        void drive();
    }

    private static abstract class Vehicle {
        private final String brand;
        private final String model;
        private final String color;

        protected Vehicle(String brand, String model, String color) {
            this.brand = brand;
            this.model = model;
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        protected abstract int getNumberOfWheels();

        public abstract void start();

        @Override
        public String toString() {
            return "Vehicle{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    private static class Motorcycle extends Vehicle implements Rideable {

        protected Motorcycle(String brand, String model, String color) {
            super(brand, model, color);
        }

        @Override
        public void ride() {
            System.out.println("riding ");
        }

        @Override
        protected int getNumberOfWheels() {
            return 2;
        }

        @Override
        public void start() {
            System.out.println("started motorcycle");
            ride();
        }
    }

    private static class Car extends Vehicle implements Driveable {

        protected Car(String brand, String model, String color) {
            super(brand, model, color);
        }

        @Override
        public void drive() {
            System.out.println("driving");
        }

        @Override
        protected int getNumberOfWheels() {
            return 4;
        }

        @Override
        public void start() {
            System.out.println("started car");
            drive();
        }
    }
}
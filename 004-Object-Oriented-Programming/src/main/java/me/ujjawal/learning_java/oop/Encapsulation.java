package me.ujjawal.learning_java.oop;

/**
 * Encapsulation is an OOP concept which specifies that higher data and code safety can be achieved by keeping
 * properties private to the class, and allowing their use in the form of functionalities through functions. For
 * example, in order to start a car we just turn the key on or press the start button. Internally this might lead to
 * opening the fuel supply to the engine, creating a spark using the batteries and causing the engine to start with
 * the transmission active. As a driver of the car we are not required to change these specific properties of the
 * engine, battery, fuel-tank etc. manually.<br>
 * In Java we achieve encapsulation by keeping the properties and methods of the class private, and exposing only
 * those methods that need to be used by other on the class. Access specifiers play a very important role in
 * encapsulation.
 */
public class Encapsulation {

    public static void main(String[] args) {
        Person personA = new Person();
        personA.setName("Pallavi");
        personA.setGender("female"); //Female, female, FEMALE
        personA.setAge(20);

        System.out.println("personA --> " + personA);
    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private String name;
        private int age;
        private Gender gender;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = Gender.valueOf(gender.toUpperCase());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }
}

package me.ujjawal.learning_java.oop;

/**
 * Abstraction is an OOP concept which specifies that complex details should get hidden or abstracted away from the
 * user of a functionality. For example, in order to drive a car we don't need to know how the car internally
 * connects all its parts and transmits energy or signals.<br>
 * In Java we achieve Abstraction by creating Class that may have hidden properties and functionalities and only
 * exposes those functionalities that are important for the user of that Class.<br>
 */
public class Abstraction {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog(),
                new Wolf()
        };
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getName() + " --> " + animal.makeASound());
            System.out.println(animal.getClass().getName() + " instanceof Animal --> " + (animal instanceof Animal));
            System.out.println(animal.getClass().getName() + " instanceof Dog --> " + (animal instanceof Dog));
            System.out.println(animal.getClass().getName() + " instanceof Wolf --> " + (animal instanceof Wolf));
        }
    }

    enum DomesticationType {
        DOMESTIC, WILD
    }

    static abstract class Animal {
        //~~ Properties of Animal ~~
        private final DomesticationType domesticationType;

        protected Animal(DomesticationType domesticationType) {
            this.domesticationType = domesticationType;
        }

        //~~ Methods of Animal ~~

        // ~~ setters ==> Also called Mutators ~~
//        public void setDomesticationType(DomesticationType domesticationType) {
//            this.domesticationType = domesticationType;
//        }

        // ~~ getters ==> Also called Accessors ~~
        public DomesticationType getDomesticationType() {
            return domesticationType;
        }

        public abstract String getSound();

        public String makeASound() {
            String sound = getSound();
            return new StringBuilder()
                    .append(sound)
                    .append(" ")
                    .append(sound)
                    .append(" ")
                    .append(sound)
                    .append("!")
                    .toString();
        }
    }

    static class Dog extends Animal {
        Dog() {
            super(DomesticationType.DOMESTIC);
        }

        @Override
        public String getSound() {
            return "bark";
        }
    }

    static class Wolf extends Animal {
        Wolf() {
            super(DomesticationType.WILD);
        }

        @Override
        public String getSound() {
            return "howl";
        }
    }
}

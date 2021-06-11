package me.ujjawal.learning_java.oop;

public class Abstraction {

    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Dog(),
                new Wolf()
        };
        for(Animal animal : animals) {
            System.out.println(animal.getClass().getName() + " --> " + animal.makeASound());
            System.out.println(animal.getClass().getName() + " instanceof Animal --> " + (animal instanceof Animal));
            System.out.println(animal.getClass().getName() + " instanceof Dog --> " + (animal instanceof Dog));
            System.out.println(animal.getClass().getName() + " instanceof Wolf --> " + (animal instanceof Wolf));
        }
    }

    enum DomesticationType {
        DOMESTIC, WILD;
    }

    static abstract class Animal {
        //~~ Properties of Animal ~~
        private DomesticationType domesticationType;

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

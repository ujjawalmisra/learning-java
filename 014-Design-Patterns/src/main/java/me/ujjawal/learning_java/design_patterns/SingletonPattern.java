package me.ujjawal.learning_java.design_patterns;

public class SingletonPattern {

    public static void main(String[] args) {
        Kohinoor kohinoor = Kohinoor.getInstance();
        System.out.println("~~ Kohinoor ~~");
        System.out.println("weight (in carats) --> " + kohinoor.getWeightKarats());
        System.out.println("country of origin --> " + kohinoor.getCountryOfOrigin());
        System.out.println("present owner --> " + kohinoor.getPresentOwner());
    }

    public static class Kohinoor {
        private static Kohinoor INSTANCE;

        private final float weightKarats;
        private final String countryOfOrigin;
        private String presentOwner;

        private Kohinoor() {
            weightKarats = 105.602f;
            countryOfOrigin = "India";
        }

        public static Kohinoor getInstance() {
            if (null == INSTANCE) {
                synchronized (Kohinoor.class) {
                    if (null == INSTANCE) {
                        INSTANCE = new Kohinoor();
                    }
                }
            }
            return INSTANCE;
        }

        public float getWeightKarats() {
            return weightKarats;
        }

        public String getCountryOfOrigin() {
            return countryOfOrigin;
        }

        public String getPresentOwner() {
            return "Queen Elizabeth II";
        }
    }
}

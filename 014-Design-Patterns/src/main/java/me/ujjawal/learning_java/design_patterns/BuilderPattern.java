package me.ujjawal.learning_java.design_patterns;

import java.util.Arrays;

public class BuilderPattern {

    public static void main(String[] args) {
        Pizza.Builder pizzaBuilder = new Pizza.Builder();
        pizzaBuilder.setSize(PizzaSize.REGULAR)
                .setCrust("Hand Tossed")
                .setExtraCheese(true)
                .setToppings("Mushrooms", "Onions", "Capsicum");
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza);
    }

    private static enum PizzaSize {
        REGULAR, MEDIUM, LARGE
    }

    private static class Pizza {
        private PizzaSize size;
        private String crust;
        private boolean extraCheese;
        private String[] toppings;

        public Pizza(PizzaSize size, String crust, boolean extraCheese, String[] toppings) {
            this.size = size;
            this.crust = crust;
            this.extraCheese = extraCheese;
            this.toppings = toppings;
        }

        public PizzaSize getSize() {
            return size;
        }

        public String getCrust() {
            return crust;
        }

        public boolean isExtraCheese() {
            return extraCheese;
        }

        public String[] getToppings() {
            return toppings;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "size=" + size +
                    ", crust='" + crust + '\'' +
                    ", extraCheese=" + extraCheese +
                    ", toppings=" + Arrays.toString(toppings) +
                    '}';
        }

        static class Builder {
            private PizzaSize size;
            private String crust;
            private boolean extraCheese;
            private String[] toppings;

            private Pizza pizza;

            public Builder setSize(PizzaSize size) {
                this.size = size;
                return this;
            }

            public Builder setCrust(String crust) {
                this.crust = crust;
                return this;
            }

            public Builder setExtraCheese(boolean extraCheese) {
                this.extraCheese = extraCheese;
                return this;
            }

            public Builder setToppings(String... toppings) {
                this.toppings = toppings;
                return this;
            }

            Pizza build() {
                if (null != pizza) {
                    return null;
                }
                pizza = new Pizza(size, crust, extraCheese, toppings);
                return pizza;
            }
        }
    }
}

package me.ujjawal.learning_java.oop;

/**
 * In very simple words, just do what you are named to do.
 * Otherwise, functionally things might work, but structurally things might be broken.
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        AdditionOperator additionOperator = new AdditionOperator();
        System.out.println(String.format("%d + %d --> %d", 3, 2, additionOperator.sum(3, 2)));
        System.out.println(String.format("%d * %d --> %d", 3, 2, additionOperator.multiply(3, 2)));
        System.out.println("The above is wrong as it breaks the Single Responsibility principle");

        MultiplicationOperator multiplicationOperator = new MultiplicationOperator();
        System.out.println(String.format("%d * %d --> %d", 3, 2, multiplicationOperator.multiply(3, 2)));

    }

    private static class AdditionOperator {
        public int sum(int a, int b) {
            return a + b;
        }

        /**
         * This method is not supposed to be a part of AdditionOperator, because the class is named as something
         * which is supposed only to deal with addition type of functionality.
         *
         * @param a
         * @param b
         * @return
         */
        public int multiply(int a, int b) {
            return a * b;
        }
    }

    private static class MultiplicationOperator {
        public int multiply(int a, int b) {
            return a * b;
        }
    }

    private static class Person {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
            /**
             * Following part is beyond the responsibility of a method named setName and hence, it should not be
             * doing this modification.
             */
            if (null == age) {
                age = 0;
            }
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

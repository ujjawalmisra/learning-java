package me.ujjawal.learning_java.core;

public class ForLoop {
    public static void main(String[] args) {
        /**
         * ~~ Simple for-loop ~~
         * It has 3 parts:
         * a. Initialization - where we set the base variable(s) before starting the loop
         * b. Condition - where we check whether the iteration of the loop should be run based on a boolean expression
         * c. Modulation - where we change the value of the variable(s) to affect the next run of the loop
         * Note that all of these 3 parts are optional.
         */
        System.out.println("~~~~ simple for-loop (with block of statements) ~~~~");
        for(int i = 1; i <= 5; i++) {
            /**
             * This is the body of the for-loop and contains the set of statements that should be run as a part of
             * the loop. As you would have noticed, its in a block.
             */
            System.out.println(i);
        }

        /**
         * ~~ Simple for-loop with single statement ~~
         * If there is a single statement in a for-loop you may exclude the curly braces.
         */
        System.out.println("~~~~ simple for-loop (with single statement) ~~~~");
        for(int i = 3; i >= 1; i--)
            System.out.println(i);

        /**
         * ~~ Nested for-loops ~~
         */
        System.out.println("~~~~ nested for-loop ~~~~");
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 2; j++) {
                System.out.println(String.format("%d + %d = %d", i, j, i + j));
            }
        }

        /**
         * ~~ For-Each loop ~~
         * This is a simplification of a for-loop used for iterating over an array or collection. Normally when we
         * iterate over an array we do so using index of the array which we keep incrementing in the loop. The
         * for-each loop allows us to iterate over the array element-by-element without using an index.
         */
        System.out.println("~~~~ for-each-loop ~~~~");
        int [] x = {1,2,3,5,7};
        for(int i : x) {
            System.out.println(i);
        }

        /**
         * ~~ Labelled for-loop ~~
         * Labels in Java are specified using the syntax name:, i.e. name of the label followed by colon. You would
         * seldom find any good code making use of labels. One of the reasons why this is not considered a good
         * programming practice is because it allows distant jumps of code, sometimes making it difficult to have a
         * consistent executable logic, like in case of goto label.
         */
        System.out.println("~~~~ labelled for-loop ~~~~");
        outer:
        for(int i = 1; i <= 3; i++) {
            inner:
            for(int j = 1; j <= 2; j++) {
                if(2 == i && 2 == j) {
                    break inner;
                }
                System.out.println(String.format("%d + %d = %d", i, j, i + j));
            }
        }

        /**
         * ~~ Infinite for-loop ~~
         * The simplest way to have an infinite loop is to have a condition that is always true OR have no condition
         * at all.
         * Normally people write infinite loops by omitting all the 3 parts.
         */
        System.out.println("~~~~ infinite for-loop ~~~~");
        for(int i = 1;;i++) {
            System.out.println(i);
            if(12 == i) {
                break;
            }
        }

    }
}

package me.ujjawal.learning_java.core;

public class WhileLoop {
    public static void main(String[] args) {
        /**
         * ~~ Simple while-loop ~~
         * It has 2 parts:
         * a. Condition - where we check whether the iteration of the loop should be run based on a boolean expression
         * b. Statement(s) -- where we define the logic or set of statements to be executed for each iteration of the
         * loop
         */
        System.out.println("~~~~ simple while-loop (with block of statements) ~~~~");
        int i = 0;
        while(++i <= 5) {
            /**
             * This is the body of the while-loop and contains the set of statements that should be run as a part of
             * the loop. As you would have noticed, its in a block.
             */
            System.out.println(i);
        }

        /**
         * ~~ Simple while-loop with single statement ~~
         * If there is a single statement in a while-loop you may exclude the curly braces.
         */
        System.out.println("~~~~ simple while-loop (with single statement) ~~~~");
        int j = 0;
        while(++j <= 5)
            System.out.println(j);

        /**
         * As you might have noticed, if there are 2 for-loops in a code we may reuse the same variable as it has the
         * scope of the block of the for-loop. However, in case of while, since it doesn't have the Initialization
         * part like for-loop, reuse of a condition variable with same name might not be possible. One may
         * reinitialize the control variable(s) though for the second while-loop. In Java code normally reuse of
         * variables isn't a preferred approach as variables are supposed to be declared around and be closely
         * associated with the context where they act or get used.
         */

        /**
         * ~~ Nested while-loops ~~
         */
        System.out.println("~~~~ nested while-loop ~~~~");
        int k = 1;
        while(k <= 3) {
            int l = 1;
            while(l <=2) {
                System.out.println(String.format("%d + %d = %d", k, l, k + l));
                l++;
            }
            k++;
        }

        /**
         * ~~ Infinite while-loop ~~
         * The simplest way to have an infinite loop is to have a condition that is always true OR have no condition
         * at all.
         */
        System.out.println("~~~~ infinite while-loop ~~~~");
        int m = 1;
        while(true) {
            System.out.println(m++);
            if(12 == m) {
                break;
            }
        }

    }
}

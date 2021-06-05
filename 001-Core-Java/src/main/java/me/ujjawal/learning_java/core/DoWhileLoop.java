package me.ujjawal.learning_java.core;

/**
 * The only difference between a while-loop and a do-while-loop is that in while-loop the condition gets checked
 * before the execution of statement(s) however, in do-while-loop the execution of statement(s) happens before the
 * condition gets checked. This means in do-while-loop the statements get executed at least once.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        /**
         * ~~ Simple do-while-loop ~~
         */
        System.out.println("~~~~ simple do-while-loop (with block of statements) ~~~~");
        int i = 0;
        do {
            System.out.println(i);
        } while (++i <= 5);

        /**
         * ~~ Simple do-while-loop with single statement ~~
         * If there is a single statement in a do-while-loop you may exclude the curly braces.
         */
        System.out.println("~~~~ simple do-while-loop (with single statement) ~~~~");
        int j = 0;
        do
            System.out.println(j);
        while (++j <= 5);

        /**
         * ~~ Nested do-while-loops ~~
         */
        System.out.println("~~~~ nested do-while-loop ~~~~");
        int k = 1;
        do {
            int l = 1;
            do {
                System.out.println(String.format("%d + %d = %d", k, l, k + l));
                l++;
            } while (l <= 2);
            k++;
        } while (k <= 3);

        /**
         * ~~ Infinite do-while-loop ~~
         * The simplest way to have an infinite loop is to have a condition that is always true OR have no condition
         * at all.
         */
        System.out.println("~~~~ infinite do-while-loop ~~~~");
        int m = 1;
        do {
            System.out.println(m++);
            if (12 == m) {
                break;
            }
        } while (true);
    }
}

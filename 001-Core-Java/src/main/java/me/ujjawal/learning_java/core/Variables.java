package me.ujjawal.learning_java.core;

/**
 * Lets see how JAVA allows declaration of variables, one of the most critical building blocks of any piece of code.
 */
public class Variables {

    /**
     * Available to all parts of this class.
     */
    private static int nonLocalVariable;

    public static void main(String[] args) {

        System.out.println("nonLocalVariable --> " + nonLocalVariable);

        /**
         * Available to this block of code.
         */
        int localVariable = 7;
        System.out.println("localVariable --> " + localVariable);


        /**
         * Declare first, define later.
         */
        int declaredFirstDefinedLater;
        declaredFirstDefinedLater = 10;
        System.out.println("declaredFirstDefinedLater --> " + declaredFirstDefinedLater);

        /**
         * Declared and defined together.
         */
        int declaredAndDefinedTogether = 11;
        System.out.println("declaredAndDefinedTogether --> " + declaredAndDefinedTogether);

        /**
         * Multiple variable declaration.
         */
        int x,y;
        x = 1;
        y = 2;
        System.out.println("x --> " + x);
        System.out.println("y --> " + y);

        /**
         * Multiple variable declaration and definition
         */
        int a,b = 4,c = 5;
        a = 3;
        System.out.println("a --> " + a);
        System.out.println("b --> " + b);
        System.out.println("c --> " + c);

        /**
         * The preferred approach is to declare variables near to where they get used, not in advance like C.
         * Also, for the sake of readability and clarity we use single variable declaration.
         */
    }
}

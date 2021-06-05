package me.ujjawal.learning_java.core;

/**
 * if-else are the most basic control structure of Java, like many other languages.
 */
public class IfElse {
    public static void main(String[] args) {
        /**
         * ~~ if statement ~~
         * It has 2 parts:
         * a. Condition - where we check based on a boolean expression whether the statement(s) should be executed
         * b. Statement(s) - where we define the logic or set of statements to be executed
         * Statements are enclosed in curly-braces {} which is also called block-of-statements. If there is a single
         * statement the curly-braces may be omitted.
         */
        int age = 1;
        if(18 <= age) {
            System.out.println("The age is that of an adult");
        }

        /**
         * ~~ if-else statement ~~
         * When the condition is false the execution of statements of if-block is skipped and the execution of
         * statements of else-block happens.
         */
        String gender = "male";
        if("male" == gender) {
            System.out.println("Gender is male");
        } else {
            System.out.println("Gender is female");
        }

        /**
         * ~~ if-else-if-else (ladder) statement ~~
         * There might be cases where we want to check multiple conditions and based on the truthfulness of those
         * conditions we might want to execute a statement-block. The conditions are evaluated in order. The first
         * condition that is true, the statement-block corresponding to it gets executed.
         */
        String aashram;
        if(25 > age)
            aashram = "brahmacharya";
        else if(48 > age)
            aashram = "grihastha";
        else if(72 > age)
            aashram = "vaanprastha";
        else
            aashram = "sanyaas";
        System.out.println("aashram --> " + aashram);
        /**
         * If interested you may read about aashrams at:
         * https://en.wikipedia.org/wiki/Ashrama_(stage)
         */

        /**
         * ~~ nested if-... statements ~~
         */
        boolean tookDrivingTest = false;
        boolean qualifiedDrivingTest = false;
        if(tookDrivingTest) {
            if(qualifiedDrivingTest) {
                System.out.println("You are eligible to drive");
            } else {
                System.out.println("You need to take the drive test again after learning under an instructor");
            }
        } else {
            System.out.println("First take a driving test");
        }
    }
}

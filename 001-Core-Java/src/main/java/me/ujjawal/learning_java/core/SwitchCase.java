package me.ujjawal.learning_java.core;

/**
 * switch-case is the second control structure besides if-else. It also works on the concept of evaluating an
 * expression. The difference is in switch-case this expression is expected to have a number of values. If you
 * remember in case of if-else the expression evaluated to boolean. Here, in switch-case, it can evaluate to one of
 * the possible N values.<br>
 * If we were to use-if else to evaluate an expression to one of possible N values we would have used a
 * if-else-if-else-.. ladder. switch-case is another way to do that.<br>
 * The evaluation of the switch-expression must be byte (or Byte), short (or Short), int (or Integer), long (or Long)
 * , char (or Character), enum or String. The evaluated value must always be a literal or constant. Variables can't be
 * used as the evaluated value.
 */
public class SwitchCase {
    public static void main(String[] args) {
        /**
         * ~~ switch-case ~~
         * The main components of a switch-case are:
         * a. Expression - which is evaluated and matched against the values of the cases in order. This is written
         * with switch keyword.
         * b. Case-Value - which is the literal or constant value of a case. There can be N cases. If the expression
         * evaluation matches case number k, it means the statements following that case will be executed.
         * c. Case-Statements -  which are the statements that should be evaluated if the expression evaluates to the
         * case value.
         * d. break - This is a JAVA keyword which is used to send the control out of a block of execution. It is
         * used with switch-case and loops. With switch case its normally used as the last statement of the
         * case-statements. This sends the control out of the switch-case block. Otherwise the control would have
         * moved to the next case/default in the switch-case.
         * e. default - It designates a special block of statements. It acts much like the else part of a
         * if-else-if-else ladder. This block is supposed to be executed if the evaluation of the switch-expression
         * matches none of the case-values.
         */
        System.out.println("~~~~ switch-case ~~~~");
        int weekdayNum = 2;
        switch (weekdayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.err.println("Unknown day");
        }

        /**
         * ~~ switch-case-fall-through ~~
         * If we don't use a break statement the control continues through the next set of case-statements till it
         * arrives at a break or the swithc-case ends.
         */
        System.out.println("~~~~ switch-case-fall-through ~~~~");
        String vehicle = "car";
        switch (vehicle) {
            case "car":
                System.out.println("4 wheeler, runs on fuel");
            case "motorcycle":
                System.out.println("2 wheeler, runs on fuel");
            case "bicycle":
                System.out.println("2 wheeler, runs manually");
            default:
                System.out.println("don't know what it is or how it runs");
        }

        /**
         * ~~ switch-case-multi-match ~~
         */
        System.out.println("~~~~ switch-case-multi-match ~~~~");
        char someChar = 'e';
        switch (someChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(someChar + " --> vowel");
                break;
            default:
                System.out.println(someChar + " --> consonant");
        }
    }

}

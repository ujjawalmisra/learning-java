package me.ujjawal.learning_java.core;

/**
 * A function (or method) is one of the most used constructs of any programming language. One of the reasons why we
 * code something is to be able to do that over and over again, in other words have a <i>reusable</i> solution. This
 * is one of the main objectives of a function, to allow a set of statements or a piece of logic to be reusable.
 * Hence, functions can also be called named, focussed pieces of reusable logic. By focussed we mean that the
 * function should do one task and precisely one task. The task that a function performs should be evident from the
 * name of the function, the context (class and package) it is present in.<br>
 * Once we start writing focussed pieces of reusable logic as functions, it also starts making our code more readable
 * . The name of the function plays a very important role in readability. So is also the case with classes, variables
 * . Hence, as a general practice we must name all parts of our code appropriately to reflect what they do or are
 * intended to do.<br>
 * <u>Functions Types</u><br>
 * <ol>
 *     <li>Pre-defined - These are functions that are provided by the language, like {@link Math#pow(double, double)},
 *     {@link String#format(String, Object...)} etc.</li>
 *     <li>User-defined - These are functions that we write as developers by making use of the language constructs,
 *     pre-defined functions of the language or other libraries, user-defined function in various parts of our code.
 *     </li>
 * </ol>
 * Just like a variable, a function must be declared and defined. So a function has a declaration part and a
 * definition part.<br>
 * <u>Function Declaration</u><br>
 * Following are the parts of function declaration
 * <ol>
 *     <li>Access Specifiers - public, protected, private or default. They define the visibility and scope of usage
 *     of a function. <code>static</code> would mean the function can be accessed on the class its a part of,
 *     otherwise an instance of the class would be required. <code>final</code> would mean the function definition
 *     cannot be overridden in a child class. We would discuss <code>static</code> and <code>final</code> more when we
 *     arrive at OOP.</li>
 *     <li>Return Type - A function can return just one value or object. This defines the data-type of the value or
 *     object returned by this function.</li>
 *     <li>Function Name - Its obvious. But as explained earlier the name of the function should be a reflection of
 *     what the function (logic) does. Also, it must be named in camelCase as per norms of Java coding.</li>
 *     <li>Argument List - The ordered list of arguments with data-type and name of each argument. Additionally,
 *     the <code>final</code> keyword may be used to mark any argument value immutable.</li>
 * </ol>
 * <u>Function Signature</u><br>
 * The Function Name and Argument List are together called Method Signature. Method Signature helps the compiler
 * understand clashes in declaration and definitions of methods. In simple words, Method Signature is a sort of an
 * identification mechanism of the functions that helps the language systems.
 */
public class Functions {
    /**
     * If you notice, main itself is a function.
     * Its public, so it can be called from any other package or class. Normally main gets called as a part of the
     * application start through Java systems.
     * Its static, so it can get called without creating an instance of this class.
     * Its return type is void, so its not going to return anything. void is a keyword in Java to tell the compiler
     * that this function is not supposed to return anything. Note that its different from null, which represents
     * absence of value for an object.
     * main is the name of the function.
     *
     * @param args - An array of String where each element represent one value passed as an argument to this
     *             application.
     */
    public static void main(String[] args) {
        System.out.println("~~~~ functions ~~~~");
        System.out.println(String.format("sum(%d,%d) --> %d", 1, 5, sum(1, 5)));
        System.out.println(String.format("sum(%d,%d) --> %d", -1, 5, sum(-1, 5)));

        System.out.println(String.format("factorial(%d) --> %d", 0, factorial(0)));
        System.out.println(String.format("factorial(%d) --> %d", 1, factorial(1)));
        System.out.println(String.format("factorial(%d) --> %d", 5, factorial(5)));

        System.out.println("~~~~ functions with varargs ~~~~");
        System.out.println(String.format("sum(%d,%d,%d,%d) --> %d", 1, 2, 3, 4, sum(1, 2, 3, 4)));
        System.out.println(String.format("sum(%d,%d,%d,%d,%d,%d) --> %d", 1, 2, 3, 4, -2, -1,
                sum(1, 2, 3, 4, -2, -1)));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int factorial(int n) {
        if (0 == n) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int sum(int... x) {
        int sum = 0;
        for (int y : x) {
            sum += y;
        }
        return sum;
    }
}

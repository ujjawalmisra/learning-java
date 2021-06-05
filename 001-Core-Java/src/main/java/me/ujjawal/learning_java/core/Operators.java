package me.ujjawal.learning_java.core;

/**
 * Operators act on operands to produce a result. The combination of operands and operator is called an expression.
 */
public class Operators {
    public static void main(String[] args) {
        /**
         * Unary - postfix
         */
        short a = 1;
        System.out.println(String.format("%d++ --> %d", a, a++));
        System.out.println(String.format("%d-- --> %d", a, a--));

        /**
         * Unary - prefix
         */
        short b = 2;
        boolean c = false;
        System.out.println(String.format("++%d --> %d", b, ++b));
        System.out.println(String.format("--%d --> %d", b, --b));
        System.out.println(String.format("+%d --> %d", b, +b));
        System.out.println(String.format("-%d --> %d", b, -b));
        System.out.println(String.format("~%d --> %d", b, ~b));
        System.out.println(String.format("!%b --> %b", c, !c));

        /**
         * Arithmetic - multiplicative
         */
        short d = 5, e = 2;
        System.out.println(String.format("%d * %d --> %d", d, e, d * e));
        System.out.println(String.format("%d / %d --> %d", d, e, d / e));
        System.out.println(String.format("%d %% %d --> %d", d, e, d % e));

        /**
         * Arithmetic - additive
         */
        System.out.println(String.format("%d + %d --> %d", d, e, d + e));
        System.out.println(String.format("%d - %d --> %d", d, e, d - e));

        /**
         * Shift - shift
         */
        short f = 3, g = 1;
        System.out.println(String.format("%d << %d --> %d, %s", f, g, f << g, Integer.toBinaryString(f << g)));
        System.out.println(String.format("%d >> %d --> %d, %s", f, g, f >> g, Integer.toBinaryString(f >> g)));
        System.out.println(String.format("%d >>> %d --> %d, %s", f, g, f >>> g, Integer.toBinaryString(f >>> g)));
        System.out.println(String.format("%d >>> %d --> %d, %s", -f, g, -f >>> g, Integer.toBinaryString(-f >>> g)));

        /**
         * Relational - comparison
         */
        System.out.println(String.format("%d < %d --> %b", f, g, f < g));
        System.out.println(String.format("%d > %d --> %b", f, g, f > g));
        System.out.println(String.format("%d <= %d --> %b", f, g, f <= g));
        System.out.println(String.format("%d >= %d --> %b", f, g, f >= g));
        Short h = f;
        System.out.println(String.format("%d instanceof %s --> %b", h, Number.class, h instanceof Number));

        /**
         * Relational - equality
         */
        System.out.println(String.format("%d == %d --> %b", f, g, f == g));
        System.out.println(String.format("%d != %d --> %b", f, g, f != g));

        /**
         * Bitwise - bitwise
         */
        System.out.println(String.format("%d & %d --> %d", f, g, f & g));
        System.out.println(String.format("%d | %d --> %d", f, g, f | g));
        System.out.println(String.format("%d ^ %d --> %d", f, g, f ^ g));

        /**
         * Logical - logical
         */
        boolean i = true, j = false;
        System.out.println(String.format("%b && %b --> %b", i, j, i && j));
        System.out.println(String.format("%b || %b --> %b", i, j, i || j));

        /**
         * Ternary - ternary
         */
        short k = 1, l = 2;
        short m = (k > l) ? k : l;
        System.out.println(String.format("(%d > %d) ? %d : %d --> %d", k, l, k, l, m));

        /**
         * Assignment - assignment
         */
        short init = 3;
        short n, p = 1;
        n = init;
        n += p;
        System.out.println(String.format("%d += %d --> %d", init, p, n));
        n = init;
        n -= p;
        System.out.println(String.format("%d -= %d --> %d", init, p, n));
        n = init;
        n *= p;
        System.out.println(String.format("%d *= %d --> %d", init, p, n));
        n = init;
        n /= p;
        System.out.println(String.format("%d /= %d --> %d", init, p, n));
        n = init;
        n %= p;
        System.out.println(String.format("%d %%= %d --> %d", init, p, n));
        n = init;
        n &= p;
        System.out.println(String.format("%d &= %d --> %d", init, p, n));
        n = init;
        n |= p;
        System.out.println(String.format("%d |= %d --> %d", init, p, n));
        n = init;
        n ^= p;
        System.out.println(String.format("%d ^= %d --> %d", init, p, n));
        n = init;
        n <<= p;
        System.out.println(String.format("%d <<= %d --> %d", init, p, n));
        n = init;
        n >>= p;
        System.out.println(String.format("%d >>= %d --> %d", init, p, n));
        n = init;
        n >>>= p;
        System.out.println(String.format("%d >>>= %d --> %d", init, p, n));

    }
}

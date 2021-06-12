package me.ujjawal.learning_java.collections;

/**
 * The automatic conversion done by Java from a wrapper type to its primitive type.
 */
public class Unboxing {
    public static void main(String[] args) {
        Byte bObj = 1;
        byte b = bObj;
        System.out.println("bObj --> " + bObj);
        System.out.println("b --> " + b);

        Integer x = 1, y = 2;
        int sum = sum(x, y);
        System.out.println(String.format("sum(%d,%d) --> %d", x, y, sum));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}

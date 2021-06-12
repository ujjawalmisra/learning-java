package me.ujjawal.learning_java.collections;

/**
 * The automatic conversion done by Java from a primitive type to its wrapper type.
 */
public class Autoboxing {
    public static void main(String[] args) {
        byte b = 1;
        Byte bObj = b;
        System.out.println("b --> " + b);
        System.out.println("bObj --> " + bObj);

        int x = 1, y = 2;
        Integer sum = sum(x, y);
        System.out.println(String.format("sum(%d,%d) --> %d", x, y, sum));
    }

    private static Integer sum(Integer a, Integer b) {
        Integer sum = 0;
        sum += (null != a) ? a : 0;
        sum += (null != b) ? b : 0;
        return sum;
    }
}

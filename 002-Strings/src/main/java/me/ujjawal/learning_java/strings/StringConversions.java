package me.ujjawal.learning_java.strings;

/**
 * Take a look at the following classes for supported conversion methods:
 * <ol>
 *     <li>{@link Number}</li>
 *     <li>{@link Byte}</li>
 *     <li>{@link Short}</li>
 *     <li>{@link Integer}</li>
 *     <li>{@link Long}</li>
 *     <li>{@link Float}</li>
 *     <li>{@link Double}</li>
 *     <li>{@link String}</li>
 * </ol>
 */
public class StringConversions {
    public static void main(String[] args) {
        /**
         * ~~ Converting String to Number ~~
         * Number has the following subclasses:
         * 1. Byte
         * 2. Short
         * 3. Integer
         * 4. Long
         * 5. Float
         * 6. Double
         * The valueOf method parses the String and returns the corresponding numeric value in appropriate type.
         */
        System.out.println("~~~~ string to number ~~~~");
        Integer i = Integer.valueOf("123");
        System.out.println("i --> " + ++i);
        Integer j = Integer.parseInt("99", 11);
        System.out.println("j --> " + j);

        Float k = Float.valueOf("3.14");
        System.out.println("k --> " + (1.2f+k));


        /**
         * ~~ Converting Number to String ~~
         */
        System.out.println("~~~~ number to string ~~~~");
        String strI1 = Integer.toString(i);
        System.out.println("strI1 --> " + strI1);
        String strI2 = String.valueOf(i);
        System.out.println("strI2 --> " + strI2);

        String strK = Float.toString(k);
        int indexOfDot = strK.indexOf('.');
        String strKDecimal = strK.substring(0,indexOfDot);//[0,indexOfDot)
        String strKPrecision = strK.substring(indexOfDot+1);
        System.out.println(String.format("In %s the decimal is %s and precision is %s", strK, strKDecimal,
                strKPrecision));

    }
}

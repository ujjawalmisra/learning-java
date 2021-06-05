package me.ujjawal.learning_java.core;

import java.nio.charset.Charset;

/**
 * References:
 * <ol>
 *     <li>{@link https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html}</li>
 *     <li>{@link https://en.wikipedia.org/wiki/UTF-8}</li>
 *     <li>{@link https://en.wikipedia.org/wiki/UTF-16}</li>
 *     <li>{@link https://www.baeldung.com/java-size-of-object}</li>
 * </ol>
 */
public class Types {

    static byte someByte;
    static short someShort;
    static int someInt;
    static long someLong;
    static float someFloat;
    static double someDouble;
    static char someChar;
    static String someString;
    static boolean someBoolean;

    public static void main(String[] args) {
        /**
         * Default values are assigned to non-local variables. In case of local variables the compiler complaints if
         * no value is assigned.
         * There are 8 primitive types.
         * String is a special type supported by Java. Its a class used to reference a group of characters (or a
         * String as we commonly call it).
         */
        System.out.println("~~~~~~~~ Default values ~~~~~~~~");
        System.out.println("byte --> " + someByte);
        System.out.println("short --> " + someShort);
        System.out.println("int --> " + someInt);
        System.out.println("long --> " + someLong);
        System.out.println("float --> " + someFloat);
        System.out.println("double --> " + someDouble);
        System.out.println("char --> " + someChar);
        System.out.println("String --> " + someString);
        System.out.println("boolean --> " + someBoolean);

        /**
         * Local variables need to be defined (assigned) before use.
         */
        byte localByte = 127;
        short localShort = 10000;
        int localInt = 1000000000;
        long localLong = 1000000000000000000L;
        float localFloat = 1.23f;
        double localDouble = 1.23456e2;
        char localChar = 'C';
        String localString = "This is a string";
        boolean localBoolean = true;

        System.out.println("~~~~~~~~ Local values ~~~~~~~~");
        System.out.println("local byte --> " + localByte);
        System.out.println("local short --> " + localShort);
        System.out.println("local int --> " + localInt);
        System.out.println("local long --> " + localLong);
        System.out.println("local float --> " + localFloat);
        System.out.println("local double --> " + localDouble);
        System.out.println("local char --> " + localChar);
        System.out.println("local String --> " + localString);
        System.out.println("local boolean --> " + localBoolean);

        /**
         * As you can see, the above primitive variables are not given an explicit memory allocation call. They are
         * assigned a value directly using the assignment operator (=). These values are called Literals.
         */

        /**
         * Integer Literals.
         * They can be decimal (default), hexadecimal or binary and are specified accordingly.
         */
        int decimalInt = 10;
        int hexadecimalInt = 0x100;
        int binaryInt = 0b1101;

        System.out.println("~~~~~~~~ Integer Literals ~~~~~~~~");
        System.out.println("decimal int --> " + decimalInt);
        System.out.println("hexadecimal int --> " + hexadecimalInt);
        System.out.println("binary int --> " + binaryInt);

        /**
         * Floating point Literals.
         * They can be double (d or D, default), floating point (f or F).
         * They can also be represented in scientific notation (e or E).
         */
        double doubleVal = 123.4;
        double scientificVal = 1.234e2;
        float floatVal = 123.4f;

        System.out.println("~~~~~~~~ Floating point Literals ~~~~~~~~");
        System.out.println("doubleVal --> " + doubleVal);
        System.out.println("scientificVal --> " + scientificVal);
        System.out.println("floatVal --> " + floatVal);

        /**
         * Character and String Literals.
         * Characters are enclosed in single quotes, Strings in double quotes.
         * They may contain UTF-16 characters.
         */
        char euroChar = '\u20AC';
        char dollarChar = '\u0024';
        String siSenor = "S\u00ED Se\u00F1or";

        /**
         * Read more:
         * https://docs.oracle.com/javase/tutorial/i18n/text/terminology.html
         * https://docs.oracle.com/javase/tutorial/i18n/text/supplementaryChars.html
         */
        char hanForEast = '\u6711';
        String supplementaryCharacterSurrogateForDesertLong = "\uD801\uDC00";

        System.out.println("~~~~~~~~ Character and String Literals ~~~~~~~~");
        System.out.println(Charset.defaultCharset().name());
        System.out.println("euroChar --> " + euroChar);
        System.out.println("dollarChar --> " + dollarChar);
        System.out.println("siSenor --> " + siSenor);
        System.out.println("Han for East --> " + hanForEast);
        System.out.println("Desert Long --> " + supplementaryCharacterSurrogateForDesertLong);

        /**
         * null is a Literal. It can be assigned to any variable, except of primitive types. Its a marker for non
         * availability of a variable.
         */
        String s = null;
        System.out.println("~~~~~~~~ null Literal ~~~~~~~~");
        System.out.println("null String --> " + s);

        /**
         * Underscore (_) can be used as a separator in numeric literals. This was introduced in Java 7 for enhancing
         * readability of numeric values.
         */
        long aadhaarNumber = 1234_5678_9012_3456L;
        float pi = 3.14_15f;
        long populationOfIndia = 138_____00_____00________000;
        System.out.println("~~~~~~~~ Underscore in numeric Literals ~~~~~~~~");
        System.out.println("aadhaarNumber --> " + aadhaarNumber);
        System.out.println("pi --> " + pi);
        System.out.println("populationOfIndia --> " + populationOfIndia);

        /**
         * For each of the primitive types, there is a corresponding wrapper data-type supported by Java. This is to
         * allow these data-types to be treated as objects and allow them to have a null literal value which is not
         * possible in case of primitive data-types.
         * The wrapper data-types also have some additional utility methods for type conversion, like parsing a value
         * from String or converting it to String etc.
         */
        Byte byteObj = 127;
        Short shortObj = 10000;
        Integer intObj = 1000000000;
        Long longObj = 1000000000000000000L;
        Float floatObj = 1.23f;
        Double doubleObj = 1.23456e2;
        Character charObj = 'C';
        Boolean booleanObj = true;

        System.out.println("~~~~~~~~ Wrapper types ~~~~~~~~");
        System.out.println("obj byte --> " + byteObj + ", (primitive == object): " + (localByte == byteObj));
        System.out.println("obj short --> " + shortObj + ", (primitive == object): " + (localShort == shortObj));
        System.out.println("obj int --> " + intObj + ", (primitive == object): " + (localInt == intObj));
        System.out.println("obj long --> " + longObj + ", (primitive == object): " + (localLong == longObj));
        System.out.println("obj float --> " + floatObj + ", (primitive == object): " + (localFloat == floatObj));
        System.out.println("obj double --> " + doubleObj + ", (primitive == object): " + (localDouble == doubleObj));
        System.out.println("obj char --> " + charObj + ", (primitive == object): " + (localChar == charObj));
        System.out.println("obj boolean --> " + booleanObj + ", (primitive == object): " + (localBoolean == booleanObj));

        System.out.println("~~~~~~~~ Parsed from String ~~~~~~~~");
        Byte byteFromString = Byte.parseByte("123");
        Boolean booleanFromString = Boolean.parseBoolean("false");
        System.out.println("byteFromString --> " + byteFromString);
        System.out.println("booleanFromString --> " + (!booleanFromString));

        System.out.println("~~~~~~~~ Max & Min values ~~~~~~~~");
        System.out.println("byte --> [" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + "]");
        System.out.println("short --> [" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + "]");
        System.out.println("int --> [" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");
        System.out.println("long --> [" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + "]");
        System.out.println("float --> [" + Float.MIN_VALUE + ", " + Float.MAX_VALUE + "]");
        System.out.println("double --> [" + Double.MIN_VALUE + ", " + Double.MAX_VALUE + "]");
        System.out.println("char --> [" + (int) Character.MIN_VALUE + ", " + (int) Character.MAX_VALUE + "]");

        /**
         * Some memory details:
         * 64-bit JDK
         * -- 12-byte header, padded to 16-bytes
         * -- References = 4 bytes (for heap <=32G), 8 bytes (for heap > 32G)
         * 32-bit JDK
         * -- 8-byte header, padded to 8-bytes itself
         * -- References = 4 bytes
         */

    }
}

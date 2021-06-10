package me.ujjawal.learning_java.strings;

/**
 * {@link String} in Java is a class specially designed to represent a sequence of characters. Its one of the most
 * used data-types in Java.<br>
 * References:
 * <ol>
 *     <li>{@link https://docs.oracle.com/javase/tutorial/java/data/strings.html}</li>
 * </ol>
 */
public class StringBasics {
    public static void main(String[] args) {
        char [] charArrayHello = {'H', 'e', 'l', 'l', 'o'};

        /**
         * Following is the approach of creating a String object using a literal. The literal itself is a part of
         * String (internal / intern) pool. Java maintains the String pool to optimize memory that may bloat if the
         * same String value keeps getting created multiple times.
         */
        String strHello = "Hello";

        System.out.println(charArrayHello);
        System.out.println(strHello);

        /**
         * String equals method, like equals methods in general, first checks whether the passed object is instanceof
         * String or not. Since we are trying to compare a char array with String here, so it will return false.
         */
        System.out.println("strHello equals charArrayHello --> " + strHello.equals(charArrayHello));

        System.out.println("~~~~ reference and values ~~~~");
        String a = "World";
        String b = "World";
        System.out.println("a == b --> " + (a == b));
        String c = new String("World");
        System.out.println("a == c --> " + (a == c));
        System.out.println("~~~~ /reference and values ~~~~");


        /**
         * One of the ways to construct a String is to use another String object or sequence of characters to
         * construct using the new keyword.
         */
        String strHelloFromCharArr = new String(charArrayHello);
        System.out.println("strHelloFromCharArr --> " + strHelloFromCharArr);
        System.out.println("strHello equals strHelloFromCharArr --> " + strHello.equals(strHelloFromCharArr));

        /**
         * Let's check the length of the strings.
         */
        System.out.println("length of charArrayHello: " + charArrayHello.length);
        System.out.println("length of strHello: " + strHello.length());

        /**
         * Few interesting things when dealing with Unicode Strings...
         */
        String hanForEast = "\u6711";
        String supplementaryCharacterSurrogateForDesertLong = "\uD801\uDC00";
        System.out.println("Han for East --> " + hanForEast);
        System.out.println("Desert Long --> " + supplementaryCharacterSurrogateForDesertLong);
        System.out.println("length of (Han for East) --> " + hanForEast.length());
        System.out.println("length of (Desert Long) --> " + supplementaryCharacterSurrogateForDesertLong.length());
        System.out.println("codePoints in (Han for East) --> " + hanForEast.codePointCount(0,hanForEast.length()));
        System.out.println("codePoints in (Desert Long) --> " +
                supplementaryCharacterSurrogateForDesertLong.codePointCount(0,
                        supplementaryCharacterSurrogateForDesertLong.length()));
    }
}

package me.ujjawal.learning_java.strings;

public class StringComparisons {
    public static void main(String[] args) {
        /**
         * ~~ Prefix and suffix match ~~
         */
        System.out.println(String.format("%s.endsWith(%s) --> %b", "India", "dia", "India".endsWith("dia")));
        System.out.println(String.format("%s.startsWith(%s) --> %b", "India", "In", "India".startsWith("In")));
        System.out.println(String.format("%s.startsWith(%s, %d) --> %b", "India", "di", 2, "India".startsWith("di", 2)));

        /**
         * ~~ Lexical comparison ~~
         * compareTo returns the difference in the integer value of the first non-matching character when this string
         * is compared with another string.
         * a. Less than 0 ==> this will come before the other string
         * b. 0 ==> both are equal
         * c. Greater than 0 ==> this will come after the other string
         */
        System.out.println(String.format("%s.compareTo(%s) --> %d", "money", "monitor", "money".compareTo("monitor")));
        System.out.println(String.format("%s.compareToIgnoreCase(%s) --> %d", "Monitor", "money",
                "Monitor".compareToIgnoreCase("money")));
        System.out.println(String.format("%s.equals(%s) --> %b", "Money", "money", "Money".equals("money")));
        System.out.println(String.format("%s.equalsIgnoreCase(%s) --> %b", "Money", "money",
                "Money".equalsIgnoreCase("money")));

        /**
         * ~~ Regional matches ~~
         */
        System.out.println(String.format("%s.regionMatches(%d,%s,%d,%d) --> %b", "monitor", 0, "money", 0, 3,
                "monitor".regionMatches(0, "money", 0, 3)));
        System.out.println(String.format("%s.regionMatches(%b,%d,%s,%d,%d) --> %b", "monitor", true, 0, "Money", 0, 3,
                "monitor".regionMatches(true, 0, "Money", 0, 3)));

        /**
         * ~~ Regex matches ~~
         */
        String s = "India is a diverse country";
        String regex = "([\\w]+\\s){4}[\\w]+";
        System.out.println(String.format("%s.matches(%s) --> %b", s, regex, s.matches(regex)));

    }
}

package me.ujjawal.learning_java.strings;

/**
 * Strings are immutable. When we write a {@link String} an immutable String is created or referred. When we do String
 * manipulations an immutable String is created or referred.<br>
 * {@link StringBuilder} maintains a variable length array to manage a sequence of characters. In other words it
 * allows us to deal with scenarios where String mutation is required.<br>
 * When we use StringBuilder, the code looks simpler; more importantly the code has better performance.
 */
public class StringBuilders {
    public static void main(String[] args) {
        /**
         * StringBuilder can be created with:
         * 1. empty (defaults to capacity = 16)
         * 2. CharSequence / String
         * 3. initial capacity
         */
        StringBuilder sb = new StringBuilder();

        String name = "Nitin";
        sb.append("Hi! My name is ").append(name).append(". ");
        String s1 = sb.toString();
        System.out.println(s1);

        int age = 22;
        sb.append("I am ").append(age).append(" years old. ");
        String s2 = sb.toString();
        System.out.println(s2);

        String[] hobbies = {"swimming", "travelling"};
        sb.append("My hobbies are ").append(String.join(", ", hobbies)).append(".");
        String s3 = sb.toString();
        System.out.println(s3);

        /**
         * Length and capacity
         */
        System.out.println("length() --> " + sb.length());
        sb.setLength(sb.length() + 10);
        System.out.println(sb);
        sb.setLength(sb.length() - 46);
        System.out.println(sb);
        System.out.println("capacity() --> " + sb.capacity());
        sb.ensureCapacity(256);
        System.out.println("capacity() --> " + sb.capacity());

        /**
         * Mutation
         * 1. append
         * 2. insert
         * 3. delete
         * 4. change
         */
        sb.insert(3, " -- ");
        System.out.println("insert() --> " + sb);
        sb.delete(3, 7);
        System.out.println("delete() --> " + sb);
        sb.setCharAt(2, ',');
        System.out.println("setCharAt() --> " + sb);
        sb.replace(0, 2, "Hello");
        System.out.println("replace() --> " + sb);
        System.out.println("reverse() --> " + sb.reverse());
        System.out.println("reverse() --> " + sb.reverse());

    }
}

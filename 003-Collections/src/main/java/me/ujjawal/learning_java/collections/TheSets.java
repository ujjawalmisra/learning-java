package me.ujjawal.learning_java.collections;

import java.util.*;
import java.util.stream.Collectors;

/**
 * {@link java.util.Set} is subclass of {@link java.util.Collection}. Both are interfaces. There are some specific
 * implementations of Set like {@link java.util.HashSet} and {@link TreeSet}.
 */
public class TheSets {

    public static void main(String[] args) {

        /**
         * ~~ Construct ~~
         * Any collection can be constructed from another collection using the Conversion Constructors of the
         * specific implementations.
         */
        System.out.println("~~~~ elementary operations ~~~~");
        Set<Integer> set = new HashSet<>();
        seed(set);
        System.out.println("set --> " + set);

        System.out.println("size() --> " + set.size());
        System.out.println("contains(2) --> " + set.contains(2));
        System.out.println("remove(2) --> " + set.remove(2));
        System.out.println("set --> " + set);
        System.out.println("isEmpty() --> " + set.isEmpty());


        List<Integer> oddList = Arrays.asList(3,5,1);
        System.out.println("oddList --> " + oddList);

        /**
         * ~~ Bulk operations ~~
         */
        System.out.println("~~~~ bulk operations ~~~~");
        System.out.println("set.containsAll(oddList) --> " + set.containsAll(oddList));
        System.out.println("set.addAll(oddList) --> " + set.addAll(oddList));
        System.out.println("set --> " + set);

        List<Integer> t1 = Arrays.asList(3,5);
        System.out.println("set.removeAll(t1) --> " + set.removeAll(t1));
        System.out.println("set --> " + set);

        List<Integer> t2 = Arrays.asList(4,1);
        System.out.println("set.retainAll(t2) --> " + set.retainAll(t2));
        System.out.println("set --> " + set);

        set.clear();
        System.out.println("set (after clear) --> " + set);

        /**
         * ~~ Iterating ~~
         */
        System.out.println("~~~~ iterations ~~~~");
        seed(set);
        System.out.println("usingIterator --> " + usingIterator(set));
        System.out.println("usingForEach --> " + usingForEach(set));

        /**
         * ~~ Aggregations ~~
         */
        System.out.println("sum --> " + sum(set));
        System.out.println("min --> " + min(set));
        System.out.println("max --> " + max(set));
        System.out.println("sumOnlyOdd --> " + sumOnlyOdd(set));
        System.out.println("getOnlyOdd --> " + getOnlyOdd(set));
    }

    private static void seed(Set<Integer> set) {
        set.clear();
        for(int i = 0; i <=5; i++) {
            set.add(i);
        }
    }

    private static <T> String usingIterator(Set<T> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            if(0 < sb.length()) {
                sb.append(", ");
            }
            T element = iterator.next();
            sb.append(element);
        }
        return sb.toString();
    }

    private static <T> String usingForEach(Set<T> set) {
        StringBuilder sb = new StringBuilder();
        for(T element : set) {
            if(0 < sb.length()) {
                sb.append(", ");
            }
            sb.append(element);
        }
        return sb.toString();
    }

    private static int sum(Set<Integer> set) {
        return set.stream().mapToInt(e -> e).sum();
    }

    private static int min(Set<Integer> set) {
        OptionalInt optionalInt = set.stream().mapToInt(e -> e).min();
        return optionalInt.getAsInt();
    }

    private static int max(Set<Integer> set) {
        OptionalInt optionalInt = set.stream().mapToInt(e -> e).max();
        return optionalInt.getAsInt();
    }

    private static int sumOnlyOdd(Set<Integer> set) {
        return set.stream().mapToInt(e -> e).filter(e -> 0 != e%2).sum();
    }

    private static Set<Integer> getOnlyOdd(Set<Integer> set) {
        return set.stream().filter(e -> 0 != e%2).collect(Collectors.toSet());
    }
}

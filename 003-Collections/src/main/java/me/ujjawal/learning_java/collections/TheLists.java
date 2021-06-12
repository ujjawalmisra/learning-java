package me.ujjawal.learning_java.collections;

import java.util.*;
import java.util.stream.Collectors;

/**
 * {@link java.util.List} is subclass of {@link java.util.Collection}. Both are interfaces. There are some specific
 * implementations of List like {@link java.util.ArrayList}.
 */
public class TheLists {

    public static void main(String[] args) {

        /**
         * ~~ Construct ~~
         * Any collection can be constructed from another collection using the Conversion Constructors of the
         * specific implementations.
         */
        System.out.println("~~~~ elementary operations ~~~~");
        List<Integer> list = new ArrayList<>();
        seed(list);
        System.out.println("list --> " + list);

        System.out.println("size() --> " + list.size());
        System.out.println("contains(2) --> " + list.contains(2));
        System.out.println("remove(2) --> " + list.remove(2));
        System.out.println("list --> " + list);
        System.out.println("isEmpty() --> " + list.isEmpty());

        /**
         * ~~ Converting to and from arrays ~~
         */
        System.out.println("~~~~ convert to/from arrays ~~~~");
        List<Integer> oddList = Arrays.asList(3,5,1);
        System.out.println("oddList --> " + oddList);
        Integer[] oddArr = oddList.toArray(new Integer[0]);
        System.out.println("oddArr --> " + Arrays.toString(oddArr));

        /**
         * ~~ Bulk operations ~~
         */
        System.out.println("~~~~ bulk operations ~~~~");
        System.out.println("list.containsAll(oddList) --> " + list.containsAll(oddList));
        System.out.println("list.addAll(oddList) --> " + list.addAll(oddList));
        System.out.println("list --> " + list);

        List<Integer> t1 = Arrays.asList(3,5);
        System.out.println("list.removeAll(t1) --> " + list.removeAll(t1));
        System.out.println("list --> " + list);

        List<Integer> t2 = Arrays.asList(4,1);
        System.out.println("list.retainAll(t2) --> " + list.retainAll(t2));
        System.out.println("list --> " + list);

        list.clear();
        System.out.println("list (after clear) --> " + list);

        /**
         * ~~ Iterating ~~
         */
        System.out.println("~~~~ iterations ~~~~");
        seed(list);
        Collections.shuffle(list);
        System.out.println("usingIterator --> " + usingIterator(list));
        System.out.println("usingForEach --> " + usingForEach(list));

        /**
         * ~~ Aggregations ~~
         */
        System.out.println("sum --> " + sum(list));
        System.out.println("min --> " + min(list));
        System.out.println("max --> " + max(list));
        System.out.println("sumOnlyOdd --> " + sumOnlyOdd(list));
        System.out.println("getOnlyOdd --> " + getOnlyOdd(list));
    }

    private static void seed(List<Integer> list) {
        list.clear();
        for(int i = 0; i <=5; i++) {
            list.add(i);
        }
    }

    private static <T> String usingIterator(List<T> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(0 < sb.length()) {
                sb.append(", ");
            }
            T element = iterator.next();
            sb.append(element);
        }
        return sb.toString();
    }

    private static <T> String usingForEach(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for(T element : list) {
            if(0 < sb.length()) {
                sb.append(", ");
            }
            sb.append(element);
        }
        return sb.toString();
    }

    private static int sum(List<Integer> list) {
        return list.stream().mapToInt(e -> e).sum();
    }

    private static int min(List<Integer> list) {
        OptionalInt optionalInt = list.stream().mapToInt(e -> e).min();
        return optionalInt.getAsInt();
    }

    private static int max(List<Integer> list) {
        OptionalInt optionalInt = list.stream().mapToInt(e -> e).max();
        return optionalInt.getAsInt();
    }

    private static int sumOnlyOdd(List<Integer> list) {
        return list.stream().mapToInt(e -> e).filter(e -> 0 != e%2).sum();
    }

    private static List<Integer> getOnlyOdd(List<Integer> list) {
        return list.stream().filter(e -> 0 != e%2).collect(Collectors.toList());
    }
}

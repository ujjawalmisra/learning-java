package me.ujjawal.learning_java.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * {@link Collections} is a utility class with some very useful methods that you and I need frequently as developers
 * while working with a Collection or Map.
 * References:<br>
 * <ol>
 *     <li>{@link https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html}</li>
 * </ol>
 */
public class TheCollectionsUtil {

    public static void main(String[] args) {

        System.out.println("~~~~ Collections utility methods for list ~~~~");
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("list --> " + list);
        Collections.reverse(list);
        System.out.println("list (after reverse) --> " + list);
        Collections.shuffle(list);
        System.out.println("list (after shuffle) --> " + list);
        Collections.sort(list);
        System.out.println("list (after sort) --> " + list);
        System.out.println("Collections.binarySearch(list, 2) --> " + Collections.binarySearch(list, 2));
        Collections.rotate(list, 2);
        System.out.println("list (after rotation) --> " + list);
        Collections.swap(list, 1, 3);
        System.out.println("list (after swap) --> " + list);
        Collections.fill(list, -1);
        System.out.println("list (after fill) --> " + list);
    }
}

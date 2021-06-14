package me.ujjawal.learning_java.collections;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};//Integer
        for(int n : numbers) {
            System.out.println(n);
        }

        System.out.println(Arrays.stream(numbers).sum());
        System.out.println(Arrays.stream(numbers).min().getAsInt());
        System.out.println(Arrays.stream(numbers).max().getAsInt());

        /**
         * Data-Structures
         * 1. Linked-List -- add, remove, insert, next
         * 2. Stack -- pop, push
         * 3. Queue -- enqueue, dequeue
         * 4. Tree
         * 5. Heap
         * 6. Hash
         * 7. Graphs
         * 8. Simple Array
         *
         * Operations:
         * 1. Modifying the data-structure -- adding, removing
         * 2. Search -- find
         * 3. Traverse -- iterate
         */

    }
}

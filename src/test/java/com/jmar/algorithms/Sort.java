package com.jmar.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Sort {

    @Test
    public void bubbleSortTest() {
        System.out.println("Reverse ordered array, 10 elements");
        int [] integers = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};    // 10 iterations through list
        bubbleSort(integers);

        integers = new int[] {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};           // 2 iterations through list
        bubbleSort(integers);

    }

    /**
     * Walks the largest values from left to right.
     * @param integers
     */
    public void bubbleSort(int [] integers) {
        System.out.println("---------------- Bubble Sort -----------------------");
        System.out.printf("integers (before) = %s%n", Arrays.toString(integers));
        int numberOfIterations = 0;
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < integers.length - 1; i++) {
                if(integers[i] > integers[i + 1]) {
                    swapped = true;
                    int temp = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = temp;
                }
            }
            numberOfIterations++;
            System.out.printf("integers: iteration %d: %s%n",numberOfIterations, Arrays.toString(integers));
        }
        System.out.printf("numberOfIterations = %d%n", numberOfIterations);
        System.out.printf("integers (after) = %s%n", Arrays.toString(integers));
    }

    @Test
    public void test_SelectionSort() {
        System.out.println("Reverse ordered array, 10 elements");
        int [] integers = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};    // 10 iterations through list
        selectionSort(integers);

        System.out.println("From the Selection Sort web page where I learned about selection sort.");
        integers = new int[] {14, 33, 27, 10, 35, 19, 42, 44};          // 8 iterations through list
        selectionSort(integers);
    }

    /**
     * Selection Sort
     *
     * 1) Find the minimum value in the list and swap with the one at index = 0.
     * 2) Repeat step "1" but swap with index 1.
     * 3) Repeat step "2" for the remaining elements incrementing the index by 1 each time until the end of the list.
     *
     * The list should now be sorted.
     *
     * @param integers
     */
    private void selectionSort(int [] integers) {

        System.out.println("---------------- Select Sort -----------------------");
        System.out.printf("integers (before) = %s%n", Arrays.toString(integers));

        // 3, 2, 1
        // 1, 2, 3

        for(int i = 0; i < integers.length; i++) {
            int smallest = i;
            for(int j = i + 1; j < integers.length; j++) {
                if(integers[j] < integers[smallest]) {
                    smallest = j;
                }
            }
            // Optimization:
            // If smallest = i, then there's no need to swap the element at i
            // with itself.
            if(smallest != i) {
                int temp = integers[i];
                integers[i] = integers[smallest];
                integers[smallest] = temp;
            }
        }
        System.out.printf("integers (after) = %s%n", Arrays.toString(integers));
    }

    /**
     * The merge sort algorithm recursively splits up the array into left and right sub-arrays
     * until there is only one element per sub-array. It then merges each sub-array and sorts the
     * merge list. It continues merging and sorting the sub-arrays into the main array until the
     * merging is complete.
     * Seems rather complicated. Holding off on the implementation until I have more time to understand it.
     *
     * @param integers
     */
    public void mergeSort(int [] integers) {
        System.out.println("---------------- Merge Sort -----------------------");
        System.out.printf("integers (before) = %s%n", Arrays.toString(integers));

        System.out.printf("integers (after) = %s%n", Arrays.toString(integers));
    }

    public void quickSort(int [] integers) {
        System.out.println("---------------- Quick Sort -----------------------");
        System.out.printf("integers (before) = %s%n", Arrays.toString(integers));

        System.out.printf("integers (after) = %s%n", Arrays.toString(integers));
    }
}

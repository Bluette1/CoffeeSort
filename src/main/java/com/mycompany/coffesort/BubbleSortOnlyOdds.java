package com.mycompany.coffesort;

import java.util.Arrays;

/**
 * Implementation of a variant of the Bubble Sort Algorithm which sorts only odd
 * numbers. This has O(n^2) time complexity in the average and worst case; and
 * O(n) running time in the best case.Space Complexity is constant.
 *
 * @author marylene
 * @see https://www.interviewbit.com/tutorial/bubble-sort-algorithm/
 * @see https://repl.it/@MaryleneSawyer/BubbleSort
 * @since 11 April 2019
 */
public class BubbleSortOnlyOdds {

    /**
     * The main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int array[] = {12, 11, 13, 5, 6};
        int array[] = {5, 3, 2, 8, 1, 4};
//        int arrayCopy[] = {12, 11, 13, 5, 6};
        int arrayCopy[] = {5, 3, 2, 8, 1, 4};

        bubbleSortConceptOne(array);
        bubbleSortConceptTwo(arrayCopy);

        System.out.println("BubbleSort Concept One result: " + Arrays.toString(array));
        System.out.println("BubbleSort Concept two result: " + Arrays.toString(arrayCopy));
    }

    /**
     * This will sort only the odd elements (even numbers should retain their 
     * positions) of an array of integers using Bubble Sort. The array is 
     * traversed while comparing adjacent odd elements and swapping their 
     * positions where necessary. After each traversal we decrement the position
     * of the last index.
     *
     * @param array an array of integers
     */
    public static void bubbleSortConceptOne(int[] array) {
        int n = array.length;

        while (n > 0) {

            int j = 0;
            // initialise the index of the last odd number sorted
            int lastOddIndex = -1;
            for (int k = 1; k < n; k++) {
                if (array[j] % 2 != 0) {
                    // keep track of the index of the last odd number sorted
                    lastOddIndex = j;
                }

                if (array[k] % 2 != 0 && lastOddIndex >= 0) {

                    if (array[lastOddIndex] > array[k]) {// Swap these two values
                        int store = array[lastOddIndex];
                        array[lastOddIndex] = array[k];
                        array[k] = store;
                    }      
                }
                j++;
            }

            n--; // last element is now sorted
        }
    }

    /**
     * This will sort only the odd elements (even numbers should retain their 
     * positions) of an array of integers using Bubble Sort. The array is 
     * traversed while comparing adjacent odd elements and swapping their 
     * positions where necessary. In this method we repeat the procedure until
     * there are no more swaps.
     *
     * @param array an array of integers
     */
    public static void bubbleSortConceptTwo(int[] array) {
        int n = array.length;

        boolean swaps;

        do {

            swaps = false; // initialise swaps flags as false

            int j = 0;
            // initialise the index of the last odd number sorted
            int lastOddIndex = -1;
            for (int k = 1; k < n; k++) {
                if (array[j] % 2 != 0) {
                    // keep track of the index of the last odd number sorted
                    lastOddIndex = j;
                }
                if (array[k] % 2 != 0 && lastOddIndex >= 0) {

                    if (array[lastOddIndex] > array[k]) {// Swap these two values
                        int store = array[lastOddIndex];
                        array[lastOddIndex] = array[k];
                        array[k] = store;
                        swaps = true;
                    }

                }
                j++;
            }
        } while (swaps);// reapeat process for as long as there are still swaps
    }
}

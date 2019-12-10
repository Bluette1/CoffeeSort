package com.mycompany.coffesort;

import java.util.Arrays;

/**
 * Implementation for the Insertion Sort Algorithm
 * This has O(n^2) time complexity in the average and worst case; and 
 * O(n) running time in the best case.Space Complexity is constant.
 *
 * @author marylene
 * @see https://www.interviewbit.com/tutorial/insertion-sort-algorithm/
 * @see https://repl.it/@MaryleneSawyer/InsertionSort
 * @since 11 April 2019
 */
public class InsertionSort {

    /**
     * The main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int array[] = {12, 11, 13, 5, 6};
       int arrayCopy[] = {12, 11, 13, 5, 6};

        insertionSortSwapping(array);
        insertionSortShifting(arrayCopy);
        System.out.println("insertionSortSwapping result: " + Arrays.toString(array));
        System.out.println("insertionSortShifting result: " + Arrays.toString(arrayCopy));
    }

    /**
     * This will sort the elements of an array of integers using Insertion Sort
     * This will work by swapping values at adjacent positions
     *
     * @param array an array of integers
     */
    public static void insertionSortSwapping(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    //swap these two adjacent values
                    int store = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = store;   
                }
            }
        }
    }
    
    /**
     * This will sort the elements of an array of integers using Insertion Sort
     * This will work by shifting values that are greater to to one position ahead
     * 
     * @param array an array of integers
     */
    public static void insertionSortShifting(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            // we'll compare this value "key" with the preceeding values
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                // Move elements that are greater than key to one position ahead
                // of their current position
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }
}

package com.mycompany.coffesort;

import java.util.Arrays;

/**
 * Implementation for the Selection Sort Algorithm
 * This has O(n^2) time complexity in the average, best case and worst case; and 
 * Space Complexity is constant.
 *
 * @author marylene
 * @see https://repl.it/@MaryleneSawyer/SelectionSort
 * @since 12 July 2020
 */
public class SelectionSort {

    /**
     * The main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int array[] = {12, 11, 13, 5, 6};

        selectionSort(array);
        System.out.println("selectionSort result: " + Arrays.toString(array));
    }

    /**
     * This will sort the elements of an array of integers using Selection Sort
     * This will work by find the index of the smallest element starting at each position of
     * the array and swapping values at the index of the minimum value found and the starting
     * position
     *
     * @param array an array of integers
     */
    public static void selectionSort(int[] array) {
        int n = array.length;

        for(int i = 0; i < n; i++) {
            int minValue = array[i];
            int minIndex = i;
        
            for(int j = minIndex + 1; j < n; j++) {
                if(array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
            } 

            // Swap values at positions i and minIndex;
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
   
}

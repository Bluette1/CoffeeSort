package com.mycompany.coffesort;

import java.util.Arrays;

/**
 * Implementation for the Quick Sort Algorithm. This has O(nlogn) time
 * complexity in the average case and O(n^2) in the worst case; and space
 * complexity is constant.
 *
 * @author marylene
 * @see https://www.interviewbit.com/tutorial/quick-sort-algorithm/
 * @see https://repl.it/@MaryleneSawyer/QuickSort
 * @since 11 April 2019
 */
public class QuickSort {

    /**
     * The main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {14, 7, 3, 12, 9, 11, 6, 2};

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * This will sort the elements of an array of integers using Quick Sort.
     *
     * @param array an array of integers
     * @param lowestIndex the lowest index
     * @param highestIndex the highest index
     */
    public static void quickSort(
        int[] array, int lowestIndex, int highestIndex
    ) {
        if (lowestIndex < highestIndex) {
            int pivotIndex = partition(array, lowestIndex, highestIndex);
            quickSort(array, lowestIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, highestIndex);
        }
    }
    
    /** 
     * This will sort the elements of an array of integers using Quick Sort.
     *
     * @param array an array of integers
     * @param lowestIndex the lowest index
     * @param highestIndex the highest index
     * @return pivot the pivot
     */
    public static int partition(int[] array, int lowestIndex, int highestIndex) {
        int i = lowestIndex;
        int pivot = highestIndex;
        for (int j = lowestIndex; j < pivot; j++) {
            if (array[j] <= array[pivot]) {
                //swap these two values
                int store = array[j];
                array[j] = array[i]; 
                array[i] = store; 
                i++;
            }
        }
                                                                                                 
            //swap these two values
              int store = array[pivot];
              array[pivot] = array[i]; 
              array[i] = store;
              pivot = i;
            
        return pivot;
    }	
}

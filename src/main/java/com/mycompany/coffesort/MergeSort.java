package com.mycompany.coffesort;

import java.util.Arrays;

/**
 * Implementation for the Merge Sort Algorithm
 * This has O(nlogn) time complexity in the worst case, and O(n) space complexity
 * 
 * @author marylene
 * @see https://www.interviewbit.com/tutorial/merge-sort-algorithm/
 * @see https://repl.it/@MaryleneSawyer/MergeSort
 * @since 13 April 2019
 */
public class MergeSort {

    /**
     * The main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {14, 7, 3, 12, 9, 11, 6, 2};

        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * This will sort the elements of an array of integers using Merge Sort This
     * method will work by first dividing the array into sub-arrays, and then
     * merging the subarrays. This is the Bottom Up approach.
     *
     * @param array an array of integers
     * @param startIndex the index at the beginning of the list
     * @param endIndex the index at the end of the list
     */
    public static void mergeSort(int[] array, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            int midIndex = (startIndex + endIndex) / 2;

            //Do recursive calls to divide list into sublists
            mergeSort(array, startIndex, midIndex);
            mergeSort(array, midIndex + 1, endIndex);

            //Sort and merge the sublists
            merge(array, startIndex, midIndex, endIndex);
        }
    }

    /*
     * This will do the merging and sorting of two subarrays.
     * 
     * @param array an array of integers
     * @param startIndex the index at the beginning of the list
     * @param midIndex the index at the middle of the list
     * @param endIndex the index at the end of the list
     * @return array the sorted array
     */
    public static void merge(int[] array, int startIndex, int midIndex, int endIndex) {
        // Crawlers for both sublists and temp
        int i = startIndex;// Crawler for first sublist
        int j = midIndex + 1;// Crawler for second sublist
        int k = 0;// Crawler for temp

        int[] temp = new int[endIndex - startIndex + 1];

        while (i <= midIndex && j <= endIndex) {

            if (array[i] < array[j]) {
                temp[k] = array[i];
                k++;
                i++;
            } else {

                temp[k] = array[j];
                k++;
                j++;
            }
        }

        // Move the remaining elements in the left sublist
        while (i <= midIndex) {
            temp[k] = array[i];
            i++;
            k++;
        }

        // Move the remaining elements in the left sublist
        while (j <= endIndex) {
            temp[k] = array[j];
            j++;
            k++;
        }

        // Copy elements from temp back into original array  
        for (int l = 0; l < temp.length; l++) {
            array[startIndex + l] = temp[l];
        }
    }
}

package com.mycompany.coffesort;

import java.io.*;
import java.util.*;

/**
 * Implementation for the algorithm to sort consecutive numbers
 *
 * @author marylene
 * @see https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_r=profile
 * @since 8 Jan 2020
 */
public class ConsecutivesSort {
    
   /**
    * Implementation for the algorithm to sort consecutive numbers
    * 
    * @param array
    * 
    * @return minSwaps the minimum number of swaps done during the swapping process 
    */

    static int doSort(int[] array) {
        int n = array.length;
        int minSwaps = 0;
        if (n == 0) {
            return minSwaps;
        }
        
        
       for (int i = 0; i < n; i++) {
           // Loop through array putting values in the rightful places by swapping
           while (array[i] != i + 1){// do the swap
               int temp = array[array[i] - 1];
           
               array[array[i] - 1] = array[i];
               array[i] = temp;
               minSwaps++;
           };
           
       }

        return minSwaps;

    }

    private static final Scanner scanner = new Scanner(System.in);
    
    
    /**
     * The main method
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = doSort(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}

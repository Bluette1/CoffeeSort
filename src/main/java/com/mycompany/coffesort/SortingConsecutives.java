/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffesort;

import java.io.*;
import java.util.*;

/**
 *
 * @author mary
 */
public class SortingConsecutives {
      // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] array) {
        int n = array.length;
        int minSwaps = 0;
        
       for (int i = 0; i < array.length; i++) {
//           Loop through array putting values in the rightful places by swapping
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

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}

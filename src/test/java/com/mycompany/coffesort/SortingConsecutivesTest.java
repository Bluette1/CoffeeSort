package com.mycompany.coffesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test class for the SortingConsecutives class.
 *
 * @author marylene
 * @since 9 January 2020
 */
public class SortingConsecutivesTest {

    @Test
    /**
     * This will test that the given array is sorted correctly using insertion
     * sort by shifting the elements
     *
     * @covers package com.mycompany.coffesort.SortingConsecutives.minimumSwaps()
     */
    public void testMinimumSwaps() {
        System.out.println("minimumSwaps");

        List<int[][]> testScenarios = new ArrayList(); //a list of test scenarios

        testScenarios.add(new int[][]{{}, {0}});// empty
        testScenarios.add(new int[][]{{1}, {0}});// one element
        testScenarios.add(new int[][]{{1, 2}, {0}});// two elements; sorted
        testScenarios.add(new int[][]{{3, 1, 2}, {2}});// three elements
        // simple test
        testScenarios.add(new int[][]{{2, 3, 4, 1, 5}, {3}});

        // another simple test
        testScenarios.add(new int[][]{{4, 3, 1, 2}, {3}});
        // another simple test
        testScenarios.add(new int[][]{{7, 1, 3, 2, 4, 5, 6}, {5}});

        // Random tests
        for(int i = 0; i < 10; i++) {
           
            int[] randArray = shuffle();
            // Create 'deepCopy' of array
            int[] testArray = Arrays.copyOf(randArray, randArray.length);
            testScenarios.add(new int[][]{randArray,{minimumSwaps(testArray)}});
        }
        
        Iterator<int[][]> scenarios = testScenarios.iterator();

        while (scenarios.hasNext()) {
            int[][] scenario = scenarios.next();

            int expResult = scenario[1][0];
            int[] array = scenario[0];

            assertEquals(
                    "The consecutive sorting result was expected to equal the expected result",
                    expResult,
                    SortingConsecutives.minimumSwaps(array)
            );
        }
    }

    int[] shuffle() {
        
        int n = (int)(Math.random() * ((100 - 0) + 1));
        // First create an array with consecutive values
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }
        
        // Shuffle the values in the array
        int count = 0;
        while (count <= 3 * n) {
            // Generate two random indices between 0...n
            int idx1 = 0 + (int)(Math.random() * ((n-1 - 0) + 1));
            int idx2 = 0 + (int)(Math.random() * ((n-1 - 0) + 1));
            
            // Swap the elements at indices 1 and 2
            int temp = result[idx1];
            result[idx1] = result[idx2];
            result[idx2] = temp;
            count++;
        }
        
        return result;

    }
    
    int minimumSwaps(int[] array) {
        int minSwaps = 0;
        
       for (int i = 0; i < array.length; i++) {
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
}

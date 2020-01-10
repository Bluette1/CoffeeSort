package com.mycompany.coffesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for the ConsecutivesSort class.
 *
 * @author marylene
 * @since 9 January 2020
 */
public class ConsecutivesSortTest {

    @Test
    /**
     * This will test that the given array is sorted correctly using insertion
     * sort by shifting the elements
     *
     * @covers com.mycompany.coffesort.ConsecutivesSort.doSort()
     */
    public void testDoSort() {
        System.out.println("doSort");

        List<int[][]> testScenarios = new ArrayList(); //a list of test scenarios

        testScenarios.add(new int[][]{{}, {}});// empty
        testScenarios.add(new int[][]{{1}, {1}});// one element
        testScenarios.add(new int[][]{{1, 2}, {1, 2}});// two elements; sorted
        testScenarios.add(new int[][]{{3, 1, 2}, {1, 2, 3}});// three elements
        // simple test
        testScenarios.add(new int[][]{{2, 3, 4, 1, 5}, {1, 2, 3, 4, 5}});

        // another simple test
        testScenarios.add(new int[][]{{4, 3, 1, 2}, {1, 2, 3, 4}});
        
        // another simple test
        testScenarios.add(new int[][]{{7, 1, 3, 2, 4, 5, 6}, {1, 2, 3, 4, 5, 6, 7}});

        // Random tests
        for(int i = 0; i < 10; i++) {
           
            int[] randArray = createRandArray();
            // Create 'deepCopy' of array
            int[] testArray = Arrays.copyOf(randArray, randArray.length);
            shuffle(testArray);
            testScenarios.add(new int[][]{testArray, randArray});
        }
        
        Iterator<int[][]> scenarios = testScenarios.iterator();

        while (scenarios.hasNext()) {
            int[][] scenario = scenarios.next();

            int[] expResult = scenario[1];
            int[] array = scenario[0];
            ConsecutivesSort.doSort(array);

            Assert.assertArrayEquals(
                    "The consecutive sorting result was expected to equal the expected result",
                    expResult,
                    array
            );
        }
    }
    
    int[] createRandArray() {
    
         int n = (int)(Math.random() * ((100 - 0) + 1));
        // First create an array with consecutive values
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }
        
        return result;
    
    }

    void shuffle(int[] array) {
        
        int n = array.length;
        
        // Shuffle the values in the array
        int count = 0;
        while (count <= 3 * n) {
            // Generate two random indices between 0...n
            int idx1 = 0 + (int)(Math.random() * ((n-1 - 0) + 1));
            int idx2 = 0 + (int)(Math.random() * ((n-1 - 0) + 1));
            
            // Swap the elements at indices 1 and 2
            int temp = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = temp;
            count++;
        }
    }
}

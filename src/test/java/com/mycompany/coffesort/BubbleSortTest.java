package com.mycompany.coffesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for the BubbleSort class.
 *
 * @author marylene
 * @since 11 April 2019
 */
public class BubbleSortTest {

    @Test
    /**
     * This will test that the given array is sorted correctly using Bubble sort
     * concept one
     *
     * @covers coffeesort.BubbleSort.bubbleSortConceptOne()
     */
    public void testBubbleSortConceptOne() {
        System.out.println("bubbleSortConceptOne");

        List<int[][]> testScenarios = new ArrayList(); //a list of test scenarios

        testScenarios.add(new int[][]{{}, {}});// empty
        testScenarios.add(new int[][]{{1}, {1}});// one element
        testScenarios.add(new int[][]{{0, 1}, {1, 0}});// two elements
        testScenarios.add(new int[][]{{0, 1, 2}, {2, 1, 0}});// three elements
        // simple test
        testScenarios.add(new int[][]{{5, 6, 11, 12, 13}, {12, 11, 13, 5, 6}});
        // another simple test
        testScenarios.add(new int[][]{{2, 13, 17, 25, 31}, {25, 17, 31, 13, 2}});

        //Third simple test 
        testScenarios.add(new int[][]{
            {2, 3, 6, 7, 9, 11, 12, 14},
            {14, 7, 3, 12, 9, 11, 6, 2}
        });

        // Already sorted list
        testScenarios.add(new int[][]{
            {2, 13, 17, 25, 31},
            {2, 13, 17, 25, 31}
        });

        testScenarios.add(new int[][]{// large numbers
            {2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019},
            {2019, 2014, 2018, 2016, 2012, 2015, 2013, 2017}
        });

        Iterator<int[][]> scenarios = testScenarios.iterator();

        while (scenarios.hasNext()) {
            int[][] scenario = scenarios.next();
            int[] expResult = scenario[0];
            int[] array = scenario[1];
            BubbleSort.bubbleSortConceptOne(array);

            Assert.assertArrayEquals(
                    "The bubble sort concept one result was expected to equal the expected result",
                    expResult,
                    array
            );
        }
    }

    @Test
    /**
     * This will test that the given array is sorted correctly using insertion
     * sort by shifting the elements
     *
     * coffeesort.BubbleSort.bubbleSortConceptTwo()
     */
    public void testBubbleSortConceptTwo() {
        System.out.println("bubbleSortConceptTwo");

        List<int[][]> testScenarios = new ArrayList(); //a list of test scenarios

        testScenarios.add(new int[][]{{}, {}});// empty
        testScenarios.add(new int[][]{{1}, {1}});// one element
        testScenarios.add(new int[][]{{0, 1}, {1, 0}});// two elements
        testScenarios.add(new int[][]{{0, 1, 2}, {2, 1, 0}});// three elements
        // simple test
        testScenarios.add(new int[][]{{5, 6, 11, 12, 13}, {12, 11, 13, 5, 6}});
        // another simple test
        testScenarios.add(new int[][]{{2, 13, 17, 25, 31}, {25, 17, 31, 13, 2}});

        //Third simple test 
        testScenarios.add(new int[][]{
            {2, 3, 6, 7, 9, 11, 12, 14},
            {14, 7, 3, 12, 9, 11, 6, 2}
        });

        // Already sorted list
        testScenarios.add(new int[][]{
            {2, 13, 17, 25, 31},
            {2, 13, 17, 25, 31}
        });

        testScenarios.add(new int[][]{// large numbers
            {2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019},
            {2019, 2014, 2018, 2016, 2012, 2015, 2013, 2017}
        });

        Iterator<int[][]> scenarios = testScenarios.iterator();

        while (scenarios.hasNext()) {
            int[][] scenario = scenarios.next();
            int[] expResult = scenario[0];
            int[] array = scenario[1];
            BubbleSort.bubbleSortConceptTwo(array);

            Assert.assertArrayEquals(
                    "The bubble sort concept two result was expected to equal the expected result",
                    expResult,
                    array
            );
        }
    }
}

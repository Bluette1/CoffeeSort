package com.mycompany.coffesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author mary
 */
public class BubbleSortOnlyOddsTest {
 
    /**
     * Test of bubbleSortConceptOne method, of class BubbleSortOnlyOdds.
     */
    @Test
    public void testBubbleSortConceptOne() {
        System.out.println("bubbleSortConceptOne");
        List<int[][]> testScenarios = new ArrayList(); //a list of test scenarios

        testScenarios.add(new int[][]{{}, {}});// empty
        testScenarios.add(new int[][]{{1}, {1}});// one element
        testScenarios.add(new int[][]{{1, 0}, {1, 0}});// two elements; odd and even
        testScenarios.add(new int[][]{{1, 3}, {3, 1}});
        testScenarios.add(new int[][]{{2, 1, 0}, {2, 1, 0}});// three elements
        // simple test
        testScenarios.add(new int[][]{{12, 5, 11, 13, 6}, {12, 11, 13, 5, 6}});
        // another simple test
        testScenarios.add(new int[][]{ {28, 13, 26, 17, 22, 25, 20, 31, 2}, {28, 31, 26, 25, 22, 17, 20, 13, 2}});

        //Third simple test 
        testScenarios.add(new int[][]{
            {2, 3, 6, 7, 9, 11, 12, 14},
            {2, 9, 6, 3, 11, 7, 12, 14}
        });
        
        // Fourth simple test
        testScenarios.add(new int[][]{
            {1, 3, 2, 8, 5, 4},
            {5, 3, 2, 8, 1, 4}
        });
        
        // Fifth simple test
        testScenarios.add(new int[][]{
            {12, 5, 11, 13, 6},
            {12, 11, 13, 5, 6}
        });

        // Already sorted list
        testScenarios.add(new int[][]{
            {2, 13, 17, 25, 31},
            {2, 13, 17, 25, 31}
        });
        

        testScenarios.add(new int[][]{// large numbers
            {2013, 2018, 2014, 2015, 2012, 2017, 2019},
            {2019, 2018, 2014, 2015, 2012, 2013, 2017}
        });

        Iterator<int[][]> scenarios = testScenarios.iterator();

        while (scenarios.hasNext()) {
            int[][] scenario = scenarios.next();
            int[] expResult = scenario[0];
            int[] array = scenario[1];
            BubbleSortOnlyOdds.bubbleSortConceptOne(array);

            Assert.assertArrayEquals(
                    "The bubble sort concept one result was expected to equal the expected result",
                    expResult,
                    array
            );
        }
    }

    /**
     * Test of bubbleSortConceptTwo method, of class BubbleSortOnlyOdds.
     */
    @Test
    public void testBubbleSortConceptTwo() {
        System.out.println("bubbleSortConceptTwo");
        List<int[][]> testScenarios = new ArrayList(); //a list of test scenarios

        testScenarios.add(new int[][]{{}, {}});// empty
        testScenarios.add(new int[][]{{1}, {1}});// one element
        testScenarios.add(new int[][]{{1, 0}, {1, 0}});// two elements; odd and even
        testScenarios.add(new int[][]{{1, 3}, {3, 1}});
        testScenarios.add(new int[][]{{2, 1, 0}, {2, 1, 0}});// three elements
        // Simple test
        testScenarios.add(new int[][]{{12, 5, 11, 13, 6}, {12, 11, 13, 5, 6}});
        // another simple test
        testScenarios.add(new int[][]{ {28, 13, 26, 17, 22, 25, 20, 31, 2}, {28, 31, 26, 25, 22, 17, 20, 13, 2}});

        // Third simple test 
        testScenarios.add(new int[][]{
            {2, 3, 6, 7, 9, 11, 12, 14},
            {2, 9, 6, 3, 11, 7, 12, 14}
        });
        
        // Fourth simple test
        testScenarios.add(new int[][]{
            {1, 3, 2, 8, 5, 4},
            {5, 3, 2, 8, 1, 4}
        });
        
        // Fifth simple test
        testScenarios.add(new int[][]{
            {12, 5, 11, 13, 6},
            {12, 11, 13, 5, 6}
        });

        // Already sorted list
        testScenarios.add(new int[][]{
            {2, 13, 17, 25, 31},
            {2, 13, 17, 25, 31}
        });
        

        testScenarios.add(new int[][]{// large numbers
            {2013, 2018, 2014, 2015, 2012, 2017, 2019},
            {2019, 2018, 2014, 2015, 2012, 2013, 2017}
        });

        Iterator<int[][]> scenarios = testScenarios.iterator();

        while (scenarios.hasNext()) {
            int[][] scenario = scenarios.next();
            int[] expResult = scenario[0];
            int[] array = scenario[1];
            BubbleSortOnlyOdds.bubbleSortConceptTwo(array);

            Assert.assertArrayEquals(
                    "The bubble sort concept one result was expected to equal the expected result",
                    expResult,
                    array
            );
        }
        
        
    }
    
}

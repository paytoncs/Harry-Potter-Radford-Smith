/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paytonsmith & Connor Radford
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcStepsRemaining method, of class MapControl.
     */
    @Test
    public void testCalcStepsRemaining() {
        System.out.println("Test Case 1");
        double totalMapColumns = 5;
        double totalMapRows = 5;
        double totalStepsTaken = 15;
        double expResult = 10;
        double result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);
        
    
        System.out.println("Test Case 2");
        totalMapColumns = 5;
        totalMapRows = 5;
        totalStepsTaken = 25;
        expResult = 0;
        result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);

        
        System.out.println("Test Case 3");
        totalMapColumns = 2;
        totalMapRows = 5;
        totalStepsTaken = 10;
        expResult = -1;
        result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);

        
        System.out.println("Test Case 4");
        totalMapColumns = 4;
        totalMapRows = 2;
        totalStepsTaken = 5;
        expResult = -1;
        result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);

        
        System.out.println("Test Case 5");
        totalMapColumns = 3;
        totalMapRows = 3;
        totalStepsTaken = 13;
        expResult = -1;
        result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);

        System.out.println("Test Case 6");
        totalMapColumns = 3;
        totalMapRows = 3;
        totalStepsTaken = 0;
        expResult = -1;
        result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);

        
          System.out.println("Test Case 7");
        totalMapColumns = 3;
        totalMapRows = 3;
        totalStepsTaken = 1;
        expResult = 8;
        result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);

        
        System.out.println("Test Case 8");
        totalMapColumns = 3;
        totalMapRows = 3;
        totalStepsTaken = 9;
        expResult = 0;
        result = MapControl.calcStepsRemaining(totalMapColumns, totalMapRows, totalStepsTaken);
        assertEquals(expResult, result, 0.0);

    }
    
}

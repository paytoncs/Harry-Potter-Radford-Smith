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
 * @author paytonsmith
 */
public class ActorControlTest {
    
    public ActorControlTest() {
    }

    /**
     * Test of addHealthItemsToHealth method, of class ActorControl.
     */
    @Test
    public void testAddHealthItemsToHealth() {
        System.out.println("Test 1");
        double healthItemQuantity = 2;
        double currentHealth = 60;
        double expResult = 80;
        double result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("Test 2");
        healthItemQuantity = 0;
        currentHealth = 40;
        expResult = -1;
        result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test 3");
        healthItemQuantity = 1;
        currentHealth = 100;
        expResult = -1;
        result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test 4");
        healthItemQuantity = 2;
        currentHealth = 0;
        expResult = -1;
        result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("Test 5");
        healthItemQuantity = 1;
        currentHealth = 10;
        expResult = 20;
        result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("Test 6");
        healthItemQuantity = 9;
        currentHealth = 10;
        expResult = 100;
        result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("Test 2");
        healthItemQuantity = 1;
        currentHealth = 90;
        expResult = 100;
        result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        assertEquals(expResult, result, 0.0);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import byui.cit260.harrypotter.exception.ActorControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        double result = 0;
        try {
            result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("Test 2");
        healthItemQuantity = 0;
        currentHealth = 40;
        expResult = -1;
        try {
            result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test 3");
        healthItemQuantity = 1;
        currentHealth = 100;
        expResult = -1;
        try {
            result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test 4");
        healthItemQuantity = 2;
        currentHealth = 0;
        expResult = -1;
        try {
            result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("Test 5");
        healthItemQuantity = 1;
        currentHealth = 10;
        expResult = 20;
        try {
            result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("Test 6");
        healthItemQuantity = 9;
        currentHealth = 10;
        expResult = 100;
        try {
            result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        
         System.out.println("Test 7");
        healthItemQuantity = 1;
        currentHealth = 90;
        expResult = 100;
        try {
            result = ActorControl.addHealthItemsToHealth(healthItemQuantity, currentHealth);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
    }
   
    /**
*
* @author Radford
*/
   
 
    /**
     * Test of totalHealthRemaining method, of class ActorControl.
     */
    @Test
    public void testTotalHealthRemaining() {
        System.out.println("Test Case 1");
        double currentHealth = 60;
        double hitsTaken = 2;
        double expResult = 40;
        double result = 0;
        try {
            result = ActorControl.totalHealthRemaining(currentHealth, hitsTaken);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
       
        System.out.println("Test Case 2");
        currentHealth = 101;
        hitsTaken = 0;
        expResult = -1;
        try {
            result = ActorControl.totalHealthRemaining(currentHealth, hitsTaken);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
       
        System.out.println("Test Case 3");
        currentHealth = 100;
        hitsTaken = 4;
        expResult = -1;
        try {
            result = ActorControl.totalHealthRemaining(currentHealth, hitsTaken);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
       
        System.out.println("Test Case 4");
        currentHealth = 100;
        hitsTaken = 3;
        expResult = 70;
        try {
            result = ActorControl.totalHealthRemaining(currentHealth, hitsTaken);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
       
        System.out.println("Test Case 5");
        currentHealth = 10;
        hitsTaken = 1;
        expResult = 0;
        try {
            result = ActorControl.totalHealthRemaining(currentHealth, hitsTaken);
        } catch (ActorControlException ex) {
            Logger.getLogger(ActorControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
}
}
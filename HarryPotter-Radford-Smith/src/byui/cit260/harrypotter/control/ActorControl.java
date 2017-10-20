/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

/**
 *
 * @author paytonsmith
 */
public class ActorControl {

    public static double addHealthItemsToHealth(double healthItemQuantity, double currentHealth) {

        if (healthItemQuantity < 1) {
            return -1;
        }

        if (currentHealth > 90) {
            return -1;
        }

        if (currentHealth < 10) {
            return -1;
        }

        double healthRecieved;
        healthRecieved = healthItemQuantity * 10;
        double totalHealth = currentHealth + healthRecieved;
        return totalHealth;
  
    
    }

    private static double currentHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
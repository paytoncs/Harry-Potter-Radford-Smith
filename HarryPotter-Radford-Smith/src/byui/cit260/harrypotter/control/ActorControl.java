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


    public static double totalHealthRemaining(double currentHealth, double hitsTaken) {
 
        if (currentHealth > 100) { //Greater than 100
            return -1;
        }
 
        if (hitsTaken > 3) { //Greater than 3
            return -1;
        }
        double hitDamage = 10;
        double totalDamageTaken = hitsTaken * hitDamage;
        currentHealth = currentHealth - totalDamageTaken;
        return currentHealth;   
    }
}
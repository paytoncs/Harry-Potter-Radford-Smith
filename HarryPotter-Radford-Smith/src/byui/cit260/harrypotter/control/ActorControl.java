/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import byui.cit260.harrypotter.exception.ActorControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import modelbyui.cit260.model.Player;

/**
 *
 * @author paytonsmith
 */
public class ActorControl {
    public static double addHealthItemsToHealth(double healthItemQuantity, double currentHealth)
            throws ActorControlException {
        long currenthealth = HarryPotterRadfordSmith.getPlayer().getActor().getHealthItemQuantity();
        if (healthItemQuantity < 1) {
            throw new ActorControlException("You must have at least one health item.");
        }

        if (currentHealth > 90) {
            throw new ActorControlException("You're already full health.");
        }

        if (currentHealth < 10) {
            throw new ActorControlException("You're already dead.");
        }

        double healthRecieved;
        healthRecieved = healthItemQuantity * 10;
        double totalHealth = currentHealth + healthRecieved;
        return totalHealth;
    }

    // Connor Radford
    public static double totalHealthRemaining(double currentHealth, double hitsTaken) 
        throws ActorControlException {
        if (currentHealth > 100) { //Greater than 100
            throw new ActorControlException("You're already full health");
        }

        if (hitsTaken > 3) { //Greater than 3
            throw new ActorControlException("You lost the encounter");
        }
        double hitDamage = 10;
        double totalDamageTaken = hitsTaken * hitDamage;
        currentHealth = currentHealth - totalDamageTaken;
        return currentHealth;
    }

 
}
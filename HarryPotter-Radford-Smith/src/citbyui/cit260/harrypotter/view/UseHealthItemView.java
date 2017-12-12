/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paytonsmith and Connorradford
 */
class UseHealthItemView extends View{

    private static void addHealthItemsToHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayHealthItemView() {

        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }


    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Would you like to use your health items? *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Y - Yes");
            System.out.println("N - No, Return to game menu.");
            System.out.println("W - How do health items work? ");
            System.out.println("D - How much would this item help my health?");
            try {
                inputs[0] = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(UseHealthItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
            inputs[0].trim();
            if (inputs.length < 1) {
                System.out.println("**** You must enter a value. ***");
                continue;
            }
            valid = true;

        }

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String totalHealth = inputs[0];
        totalHealth.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "Y":
                addHealthItemsToHealth();
                 long actorHealth= HarryPotterRadfordSmith.getPlayer().getActor().getTotalHealth();
                System.out.println("Your new health is " + actorHealth + ".");
                return true;
            case "N":
                return false;
            case "W":
                System.out.println("Health items will replenish your health once you have been damaged from encounters. Each health item provides 10 health points. ");
                return true;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }}

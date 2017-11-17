/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.ActorControl;
import static byui.cit260.harrypotter.control.ActorControl.addHealthItemsToHealth;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.util.Scanner;

/**
 *
 * @author paytonsmith and Connorradford
 */
class UseHealthItemView {

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
            Scanner keyboard = new Scanner(System.in);
            inputs[0] = keyboard.nextLine();
            inputs[0].trim();
            if (inputs.length < 1) {
                System.out.println("**** You must enter a value. ***");
                continue;
            }
            valid = true;

        }

        return inputs;

    }

    static boolean doAction(String[] inputs) {
        String totalHealth = inputs[0];
        totalHealth.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "Y":
                addHealthItemsToHealth();
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

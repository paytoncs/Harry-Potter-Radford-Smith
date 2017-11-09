/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import java.util.Scanner;

/**
 *
 * @author Radford
 */
class SelectItemView {

    void displaySelectItemView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    private String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Item List *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("* Invisibility Cloak - Helps to sneak past enemies  *");
            System.out.println("* Chocolate Frog - Recovers health *");
            // Will be used later to display total amount of frogs in inventory
            
            System.out.println("* Broomstick - Helps avoid obsticles *");
            System.out.println("*************************************"
                    + "\n* E - Exit Items List *"
                    + "\n*************************************");
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

    boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "E":
                GameMenuView gameMenuView = new GameMenuView();
                return true;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }
}

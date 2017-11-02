/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import java.util.Scanner;

/**
 *
 * @author paytonsmith
 */
class HelpMenuView {

    void displayHelpMenuView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs[0].toUpperCase().equals("E")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    private String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Please select a help menu item. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("G - What is the goal of the game?");
            System.out.println("M - How to move");
            System.out.println("E - Exit");
            Scanner keyboard = new Scanner(System.in);
            inputs[0] = keyboard.nextLine();
            inputs[0].trim();
            if (inputs.length < 1) {
                System.out.println("**** You must enter a valid Command. ***");
                continue;
            }
            valid = true;

        }

        return inputs;

    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "G":
                System.out.println("The goal of this game is to collect the items to heal Hagrid from his injury.");
                return true;
            case "M":
                System.out.println("You will need to press a command key to choose the direciton in which you will move.");
                return true;
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                MainMenuView.doAction(inputs);
                return true;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

}



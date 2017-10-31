/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import static byui.cit260.harrypotter.control.GameControl.savePlayer;
import static java.lang.Compiler.command;
import java.util.Scanner;
import modelbyui.cit260.model.Player;

/**
 *
 * @author paytonsmith and Connor
 */
public class StartProgramView {

    public void displayStartProgramView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String[] getInputs() {
        String playerName = null;
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Welcome to The Harry Potter Game. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter the player's name:");
            playerName = in.nextLine();

            playerName = playerName.trim();
            if (playerName.length() < 2) {
                System.out.println("**** You must enter a value. ***");
                continue;
            }
            inputs[0] = playerName;
            valid = true;

        }

        return inputs;

    }

    private boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        Player player = GameControl.savePlayer(playerName);
        if (player == null) {
            System.out.println("Could not create player. " + "Enter a different name.");
            return false;
        }

        System.out.println("================================================="
                + "\nWelcome to the game " + playerName + ". \nWe hope you have a lot of fun!"
                + "\n=================================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();

        return true;
    }

}

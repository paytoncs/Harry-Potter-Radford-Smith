/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import byui.cit260.harrypotter.exception.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelbyui.cit260.model.Player;

/**
 *
 * @author paytonsmith and Connor
 */
public class StartProgramView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[2];

        System.out.println("*************************************"
                + "\n* Welcome to The Harry Potter Game! *"
                + "\n*************************************");
        String playerName = this.getInput("\nPlease enter your name:");
        inputs[0] = playerName;

        String playerAge = this.getInput("\nPlease enter your age:");
        inputs[1] = playerAge;
        
        return inputs;

    }

    public boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        Player player = null;
        
        try {
            int age = Integer.parseInt(inputs[1]);
            player = GameControl.savePlayer(playerName);
        } catch (NumberFormatException e) {
            System.out.println("It needs to be a number");
            return false;   
        } catch (GameControlException gce) {
            System.out.println(gce.getMessage());
            return false;
        }

        if (player == null) {
            System.out.println("Could not create player. " + "Enter a different name.");
            return false;
        }

        System.out.println("================================================="
                + "\nWelcome " + playerName + ". \nWe hope you have a lot of fun!"
                + "\n=================================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;
    }

}

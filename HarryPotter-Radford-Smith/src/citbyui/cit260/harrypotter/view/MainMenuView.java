/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author paytonsmith
 */
class MainMenuView {

    public void displayMainMenuView() {

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
                + "\n* Please select a menu item. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("G - Start Game");
            System.out.println("H - Get Help");
            System.out.println("S -Save Game");
            System.out.println("E - Exit");
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

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0]) {
            case "G":
                startNewGame();
                return true;
            case "H":
                getHelp();
                return true;
           
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

    public static void startNewGame() {
        GameControl.createNewGame(HarryPotterRadfordSmith.getPlayer());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    public static void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();

    }

    public static void getHelp() {
    HelpMenuView helpMenuView = new HelpMenuView();
    helpMenuView.displayHelpMenuView();
}
    }


